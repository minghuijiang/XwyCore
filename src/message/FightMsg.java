package message;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import socket.ClientSocket;
import socket.msg.chat.rsp.Chat;
import socket.msg.combat.req.AIReq;
import socket.msg.combat.req.CombatQuitReq;
import socket.msg.combat.req.EnterDungeonReq;
import socket.msg.combat.req.PerformOkReq;
import socket.msg.combat.req.SkipCombatReq;
import socket.msg.combat.req.StartCombatReq;
import socket.msg.combat.req.YunJiebiaoSurrenderSkipReq;

import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;

import component.User;
import component.item.FateItem;
import component.item.ItemInfo;
import data.StaticInfo;
import data.server.QQServer;

public class FightMsg {

    public static boolean fight(User user, int pkId, int mapId, int fightType) {
        return fight(user,pkId,mapId,fightType,false);
    }
    
    public static String startFight(User user, int pkId,int mapId, int fightType){
    	return	user.send(
                "ctl=cfight&act=startfight",
                "{\"froleid\":%d,\"mapcfgid\":%d,\"fighttype\":%d}", pkId, mapId, fightType
        );
    }
    
    public static boolean fight(final User user, int pkId, int mapId, int fightType,boolean asBoss) {

        String data = startFight(user,pkId, mapId, fightType);
        user.log("fight pk: "+pkId+ " map: "+mapId+" type: "+fightType+" "+data);
     //   System.out.println(data);
        String grc = MethodUtil.grc(data);
        if(!grc.equals("成功")){
            user.log(grc);
            if (grc.contains("mapreqnotverify")) { //体力不足
                user.log("体力不足. - "+grc);
                user.isError();
            }
            return false;
        }
        String fightId="";
        try {
            user.setIsboss( 
            		mapId == 11 || mapId == 35||mapId==44||mapId==45||
            		mapId==1005||mapId == 1014||mapId ==1019||mapId==1108||mapId==1029||
            		asBoss);
            
            
            Json j = new Json(data).getJson("data");
            fightId = j.getString("fightid");
            int fightNum = j.getJson("mapcfgInfo").getJson("arrGroups").size();
            user.log("fight start: "+fightId);
            if(user.isRob()){
            	int f = 0;
            	int[] robIds= user.getRobIds();
                while((f)<robIds.length&&robIds[f]==0){
                    user.log(robIds[fightNum-1]);
                    user.sendMessage(new YunJiebiaoSurrenderSkipReq(fightId,
                    		mapId,f,3,0));
                    f++;
                }
                pkId = robIds[f];
        
            }
            user.initFight(fightId, pkId, mapId, fightType, fightNum);

            user.sendMessage(new EnterDungeonReq(fightId, mapId, fightType));
            user.sendMessage(new StartCombatReq(fightId, mapId, fightNum, fightType, pkId,user));
            user.sendMessage(new AIReq(true));
            if(isCheat){
	            final User user2= user;
	            final String fightId2= fightId;
	            final int mapId2 = mapId;
	            final int fightType2 = fightType;
	            final int pkId2 = pkId;
	            final int fightNum2 = fightNum;
	            new Thread(){
	            	public void run(){
	            		while(true){
	            			try {
								Thread.sleep(500);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
	            	//	user2.sendMessage(new EnterDungeonReq(fightId2, mapId2, fightType2));
	                    user2.sendMessage(new StartCombatReq(fightId2, mapId2, fightNum2, fightType2, pkId2,user2));
	                    user2.sendMessage(new AIReq(true));
	                    user2.sendMessage(new AIReq(true));
	                    user2.sendMessage(new SkipCombatReq());
	            		}
	            	}
	            }.start();

            }
        } catch (JSONException e) {
            user.log("fight json failed "+data);
        } catch (Exception e) {
        	//e.printStackTrace();
            user.log("(User " + user.getUname() + ", int " + pkId + ", int" + mapId + ", int " + fightType + "); "+data);
            e.printStackTrace();
            if (data.contains("mapreqnotverify")) { //体力不足
                user.log("体力不足. ");
                user.setError(true);
            }
            return false;

        }
      //  long st = System.currentTimeMillis();
        synchronized (user.getFightLock()) {
            try {
            	if(isCheat){
            		user.getFightLock().wait();
            	}else
	            	if(asBoss){
	            		user.getFightLock().wait(40000);
	            	}
	            	else
	            		user.getFightLock().wait(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
      //  System.out.println("used time: "+(System.currentTimeMillis()-st));
        user.log("fight finish "+fightId);
        return user.isWin();//&&(user.getFightCount()<user.getFightNum());
    }

    public static String quickAreana(User user, int pkId) {
        return user.send(
                "act=quickarena&ctl=rarena",
                "{\"pkroleid\":%d}", pkId
        );
    }

    public static String startAreana(User user, int pkId) {
        return user.send(
                "act=startarena&ctl=rarena",
                "{\"pkroleid\":%d}", pkId
        );
    }

    public static boolean fightTower(User user, int id) {
        return fight(user, 0, id, 0);
    }
    
    public static void fightBug(final User user, String fightId, int pkId, int bugNum){
        int mapId = 10027;
        int fightType = 12;
        int fightNum = 1;
    	user.log("fight pk: "+pkId+ " map: "+mapId+" type: "+fightType+" "+fightNum);
        //		fightBug(u,"",1704549, 10027, 12,1,1000);//823942_53e7ea51e0bb3

        try {
        	if(fightId.length()==0){
        		   String data = startFight(user,pkId, mapId, fightType);
        		   user.log("Get: "+data);
        	        try {
        	            Json j = new Json(data).getJson("data");
        	            fightId = j.getString("fightid");
        	        }catch(Exception e){
        	        	e.printStackTrace();
        	        	System.exit(0);
        	        }
        	}
        	user.log("Fight:  "+fightId);
            user.setIsboss(false);
            user.init= user.getItems().getNum(894);
            user.end= bugNum ==-1?-1:(user.init+bugNum);
            user.initFight(fightId, pkId, mapId, fightType, fightNum);

            user.sendMessage(new EnterDungeonReq(fightId, mapId, fightType));
            user.sendMessage(new StartCombatReq(fightId, mapId, fightNum, fightType, pkId,user));
            user.sendMessage(new AIReq(true));
            final User user2= user;
            final String fightId2= fightId;
            final int mapId2 = mapId;
            final int fightType2 = fightType;
            final int pkId2 = pkId;
            final int fightNum2 = fightNum;
            new Thread(){
            	public void run(){
            		while(true&&!user.isError()){
            			try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
            	//	user2.sendMessage(new EnterDungeonReq(fightId2, mapId2, fightType2));
                    user2.sendMessage(new StartCombatReq(fightId2, mapId2, fightNum2, fightType2, pkId2,user2));
                    user2.sendMessage(new AIReq(true));
                    user2.sendMessage(new AIReq(true));
                    user2.sendMessage(new SkipCombatReq());
            		}
            	}
            }.start();

        }  catch (Exception e) {

        }
      //  long st = System.currentTimeMillis();
        synchronized (user.getFightLock()) {
            try {
            	if(isCheat){
            		user.getFightLock().wait();
            	}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
      //  System.out.println("used time: "+(System.currentTimeMillis()-st));
        user.log("fight finish "+fightId);
    }
    public static boolean isCheat = false;
    public static boolean doFate = false;
    public static boolean doFight= false;
    public static boolean changeMoney  =false;
    public static int bagCutOff = 500;
    public static int goldCutOff = 1000000;
    public static void doStuff(final String session, final String fight, final int num, final long money, final int fate){
	 	final User u = new User(session);
		u.setNeedData(true);
		u.login();
		if(doFight)
	    	new Thread(){
	    		public void run(){
	    			fightBug(u,fight,
	    					1704548
	    				//	28001455
	    					,num);
	    		}
	    	}.start();
	    	
		if (doFate||changeMoney)
			new Thread() {
				public void run() {
					long gold = money == -1 ? -1 : money + u.getMoney();
					System.out.println(u.getMoney());
					while (!u.isError()) {
						if (doFate && u.getMoney() > goldCutOff) {
							String r1 = (FateMsg.turnSuper(u));
							String r2 = (FateMsg.pick(u));
							FateMsg.decomposeSuper(u);
							u.log("魂值 : " + u.getFatesoul() + "  Gold: "
									+ u.getMoney());
							if (!MethodUtil.grc(r1).equals("成功")
									&& !MethodUtil.grc(r2).equals("成功")) {
								u.log("重置背包");
								u.resetItem();
								Object[] f = u.getItems().getFate().toArray();
								for (Object item : f) {
									if (item instanceof FateItem) {
										FateItem itemF = (FateItem) item;
										if (!(itemF.isFit()))
											// if(itemF.getItemId()!=945)
											FateMsg.decompose(u, ""
													+ ((FateItem) item).getId());
									}
								}
								// doFate=false;
							}
							if (fate != -1 && u.getFatesoul() > fate) {
								JOptionPane.showMessageDialog(null, "完成");
								System.exit(0);
							}
						} else {
							if (changeMoney) {
								if (u.getMoney() < 2 * goldCutOff
										&& (u.getItems().getNum(bag) > bagCutOff || (u
												.getItems().getNum(bag) > 1 && !doFight))) {
									changeMoney(u);
									if (money > 0 && u.getMoney() > gold) {
										u.log("完成");
										System.exit(0);
									}
								} else {
									try {
										Thread.sleep(30000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
							}

						}
					}
				}
			}.start();
	    	
//	    	
//	    	
//	    	if(changeMoney)
//		    	new Thread(){
//		    		public void run(){
//		    			long gold = money==-1?-1: money+u.getMoney();
//		    		 	while (true) {
//							if(u.getMoney()<2*goldCutOff&&(
//									u.getItems().getNum(bag)>bagCutOff||(u.getItems().getNum(bag)>1&&!doFight))){
//								changeMoney(u);
//								if(money >0 &&u.getMoney()>gold){
//									u.log("完成");
//									System.exit(0);
//								}
//							}else{
//								try {
//									Thread.sleep(120000);
//								} catch (InterruptedException e) {
//									// TODO Auto-generated catch block
//									e.printStackTrace();
//								}
//							}
//						}
//		    		}
//		    	}.start();
	    	
	    	
    }
    static int[] word ={
    	880,887,888,889,890,891,892,893
    };
    static int bag = 894;
    public static void changeMoney(final User user){
   // 	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	int totalNum = 0;
//    	for(int wordId: word){
//    		int num = user.getItems().getNum(wordId);
//    		if(num>0){
//    			map.put(wordId, num);
//    			totalNum+=num;
//    		}
//    	}
//    	if(totalNum >100)
//    		totalNum = 99;
    	int bagId = user.getItems().getId(bag);
    	while(user.getItems().getNumById(bagId)-totalNum>999)
    		ItemMsg.openBox(user, bagId, 999);
    	ItemMsg.openBox(user, bagId, user.getItems().getNumById(bagId)-totalNum-1);
    	
    	String result = "成功";
    	for(int i= 0;i<3;i++){
    		new Thread(){
    			public void run(){
    				String result = "成功";
    				while(result.equals("成功")){
    		    		String tmpString =(ActivityMsg.changeWord(user, 1));
    		    	//	System.out.println(tmpString);
    		    		result=MethodUtil.grc(tmpString);
    		    	}
    				user.log("换字 完成");
    			}
    		}.start();
    	}
    	
    	while(result.equals("成功")){
    		String tmpString =(ActivityMsg.changeWord(user, 1));
    	//	System.out.println(tmpString);
    		result=MethodUtil.grc(tmpString);
    		user.log("Gold: "+user.getMoney());
    	}
    	
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	for(int key: word){
    		int sell = user.getItems().getNum(key);
    		if(sell>0){
    			ItemMsg.sellItem(user, user.getItems().getId(key), sell>999?999:sell);
    		}
    	}
    	user.log("完成兑换: "+user.getMoney());
    	//ItemMsg.openBox(user, bagId, totalNum);
    }
    
    
    public static void main(String[] args){
    	//183.207.224.48:80
//    	 System.setProperty("http.proxyHost", "183.207.224.51");
//         System.setProperty("http.proxyPort", "83");
    	
    	ClientSocket.showSocket= true;   
    	isCheat= true;
    	StaticInfo.showLog=!false;

    										//音柱                                                                木木
		StaticInfo.server = new QQServer(1);//u8mfvorp761ccosb9r3v19u024   1baheumf0nb5845r75099ao5n0
	//	changeMoney("ii8da4htgg9a52vguiuvqckq14");
	//	doFate=true;
		doFight = true;
	//	changeMoney = true;
		goldCutOff = -1;
		bagCutOff = 500;
//		doStuff("", "805493_54466a9b15654",-1,-1,-1); // 喂鱼 cipdi6rg64jrmdnjg30ddks233
		doStuff("ijr7nlv09oqnuim3fhgotlkuc7", "805493_54466a9b15654",-1,500000000,-1); // 7月 759a3tk0fc633k478oke3at090

    }
    
    public static String getMonster(User user, int giantId){
    	return user.send(
                "act=startfight&ctl=giant",
                "{\"monsterid\":%d}", giantId
        );
    }
    
    
    /**
     * 2 奇行财富
     * 3 名望普通
     * 
     * @param user
     * @param giantId
     * @return
     */
    public static int getGiantId(User user, int giantId){
    	String init = getMonster(user, giantId);
    	try{
    		Json json = new Json(init).getJson("data");
    		int id = json.getInt("pkroleid");
    		return id;
    	}catch(Exception e){
    		user.log("init Giant Fail: "+e.getMessage()+"  "+init);
    		return 0;
    	}
    }
}
