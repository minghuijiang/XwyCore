package message;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mingJiang.util.EncodeUtil;
import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;
import com.mingJiang.util.json.JsonArray;

import component.User;
import component.Warrior;
import component.item.Weapon;
import data.StaticInfo;
import data.server.QQServer;
import data.server.U17Server;

public class EtcMsg {

    public static String applyFriend(User user, int fid){
        return user.send(
                "act=invitefriend&ctl=friend",
                "{\"frid\":%d}", fid
        );
    }
    
    public static String acceptFriend(User user, int fid){
        return user.send(
                "act=dofriend&ctl=friend",
                "{\"type\":1,\"frid\":%d}", fid
        );
    }
    
    public static String delFriend(User user, int fid){
        return user.send(
                "act=delfriend&ctl=friend",
                "{\"frid\":%d}", fid
        );
    }
    
    
    /**
     * 新用户初始化
     *
     * @param user
     * @param step
     * @return
     */
    public static String saveGuide(User user, int step) {
        return user.send(
                "ctl=game&act=saveguide",
                "{\"step\":%d}", step
        );
    }

    /**
     * 选择性别
     *
     * @param user
     * @param gen 0 女 1=男
     * @return
     */
    public static String selectGender(User user, int gen) {
        return user.send(
                "ctl=game&act=freeselectsex",
                "{\"gender\":%d}", gen
        );
    }

    public static String getItem(User user, int itemConfig) {
        return user.send(
                "ctl=game&act=getitem",
                "{\"itemcfgid\":%d}", itemConfig
        );
    }

    /**
     * 购买体力
     *
     * @param user
     * @return
     */
    public static String buyStamina(User user) {
        return user.send(
                "ctl=game&act=addstamina",
                "{}"
        );
    }

    /**
     * 出战
     *
     * @param user
     * @param groupString
     * @return
     */
    public static String arrGroup(User user, String groupString) {
        String result = user.send(
                "act=saverwgroup&ctl=rwarrior",
                "{\"rwgid\":0,\"grouppos\":%s}", groupString
        );
        if(MethodUtil.grc(result).equalsIgnoreCase("成功")){
            user.setGroup(groupString);
        }
        return result;
    }

    /**
     * 精英
     *
     * @param user
     * @param mapIds 精英 5000 - 5002 5003 - 5005 5006- 5008 5035.
     *
     *
     * @return
     */
    public static String fightElite(User user, String mapIds) {
        return user.send(
                "act=autofighteliteboss&ctl=reliteboss",
                "{\"mapids\":%s}", mapIds
        );
    }

    public static void show(User user){
    	if(user.getMonster()==null){
    		user.setNeedData(true);
    		user.login();
    	}
    	user.log(user.getMoney());
    	int notZero = 0;
    	List<Warrior> warriors = user.getMonster();
    	for(int i= warriors.size()-1;i>=0;i--){
    	//for(int i= warriors.size()-1;i>=0;i--){
    		Warrior w = warriors.get(i);
    		try{
    			Json j  = new Json(WarriorMsg.initSkin(user, w.getId())).getJson("data").getJson("info");
    			int exp = j.getInt("exp");
    			if(exp!=0||notZero++<10)
    				System.out.println(w.getName()+"\t"+w.getId()+"\t"+exp);
    		}catch(Exception e){
    			
    		}
    	}
    	for(int i=0;i<33;i++){
    		try{
    			String result = WarriorMsg.initSkin(user, i);
    			Json j  = new Json(result).getJson("data").getJson("info");
    			int exp = j.getInt("exp");
    			//System.out.println(i);
    			if(exp!=0)
    				System.out.println(i+"  "+exp);
    		}catch(Exception e){
    			
    		}
    	}
    	System.out.println("done");
    	//113
    	//483
    	//1274
    	//2648
    	//3503
    	int[] kkk = {99,100,101,111,999,1000,1001,1111,11300,48300,127400,264800,350300};
    	for(int i:kkk){
    		try{
    			String result = WarriorMsg.initSkin(user, i);
    			Json j  = new Json(result).getJson("data").getJson("info");
    			int exp = j.getInt("exp");
    		//	System.out.println(result);
    			if(exp!=0)
    				System.out.println(i+"  "+exp);
    		}catch(Exception e){
    			
    		}
    	}

    	System.exit(0);
    }
    
    public static void main(String[] args){
//    	System.setProperty("http.proxyHost", "58.68.246.12");
//    	System.setProperty("http.proxyPort", "18080");

     User.setBug();
    // new U17Server(1);
     //cipdi6rg64jrmdnjg30ddks233  27
     //ne6sc97ieib9mv2qqft8m2ar52 58, 删
     //28p60h1fp1eio8qils3a3n4fn3 51 过客
     //datdq90osjkuns6n3ktdj11cr0 56
     //79jdr27aqsrfud9e15tmi781h1 51 
    // User.G_showHttp=true;
        StaticInfo.server = new QQServer(27);
        int suipian = 279615319; 
        int box =279903230;
        final User user = new User(//"",""jr6rfeiu917kvk22eq2qc21vm3 56   ngb4va56dq4qvm4mkcrab7e061  27  datdq90osjkuns6n3ktdj11cr0 56
        "cipdi6rg64jrmdnjg30ddks233"//g5uavkaligccoreko4svigncp0 h2k0h1c73b76irnjm9ep592pm4 9apvuhb172ug8pn8h51be7m7f6
        ); //j7oqgajt5cqsu7debllakhk8s5  1glea6mplcmclegvcv4jae1077
    //    User.G_showHttp=true; 
        boolean show = true;
        if(show){
        	show(user);
        }
    	//113
    	//483
    	//1274
    	//2648
    	//3503
      //  hack(user);
        //http://app100645087.qzone.qzoneapp.com/?qz_height=1400&openid=6DB4115F712DB36C56BB1AF1CB031A41&openkey=D523F8045DBEC59AAE528FBBAAB23F22&pf=qzone&pfkey=b8488ea8862c0df477a232382af97e83&qz_ver=8&appcanvas=1&qz_style=35&params=
     /*
LOG: 203153 : : 49982392
	欧阳锋	3899781	0
        黄药师	2692665	412800
        天山童姥	2563890	412800
        梅超风	3899784	0
        郭靖	3899787	412800
        黄蓉	3899785	0
        乔峰	1886688	412800
done
         */
        
        int c =1886688;//3663304;201034
        int d =3899785;//3637042   3663307
//        int k =d;
//        d= c;
//        c =k;
        final int warrior = c;
        final int warrior2 = d;
        final int stone =116074435;
        final int stone2 =284775427;
        final int weapon = 156775610;
        final int main =1657511;
        final int art=35130946;
        
        final int tail =288668391;
        final int tail2 =288668445;
        boolean sell = true;
        if(!sell){
        //	System.out.println(WeaponMsg.UnequipAllStone(user, weapon));
        	//System.out.println(WarriorMsg.passInter(user, warrior, warrior2));
        	System.out.println( WarriorMsg.upgradeWarrior(user, warrior,1, 1));
        	//System.out.println(WarriorMsg.inherit(user, warrior, warrior2).split("exp")[1]);
        	//System.out.println(WeaponMsg.equipArti(user, main, art));
        	//while(true)        	System.out.println(WarriorMsg.openNext(user, warrior));
        	//System.out.println(WarriorMsg.openNextLoop(user, warrior));
        }
        else{
        //	System.out.println(WeaponMsg.equipArti(user, main, art));
        	for(int i=0;i<10;i++){
    	        new Thread(){
    	        	public void run(){
    	        		while(true){
    	        			String result = "";
    	        		//	try{
    	        		//		result = WarriorMsg.initSkin(user, warrior);
    	        				result = WarriorMsg.upgradeWarrior(user, warrior, 0, 1);
    	        				String[] sp  = result.split("skin_exp");
    	        				if(sp.length>1)
		    	        			System.out.println("==="+
		    	        					//WeaponMsg.equipArti(user, main, art)
		    	        				//	WeaponMsg.equipStone(user, weapon, 0, 0)
		    	        					//result
		    	        				//	WeaponMsg.equipTailman(user, 0, tail, art);
		    	        					//MainMsg.initLogin(user);
		    	        					//.split("exp",2)[1]
		    	        					sp[1]
		    	        							);
    	        				else {
								//	System.out.println("c");
								}
    	        	
    	        		//	}catch(Exception e){
    	        			//	System.out.println("c ");
    	        		//	}
    	        			//System.out.println(WarriorMsg.upgradeWarrior(user, main, 0, 1));
    	        			//System.out.println(WarriorMsg.openNextLoop(user, warrior2));
    	        			//System.out.println(WeaponMsg.equipTailman(user, 0, tail, art));
    	        		}
    	        	}
    	        }.start();


        }
        	 new Thread(){
 	        	public void run(){
 	        		while(true){
 	        			try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}try {
 	        		//System.out.println(WeaponMsg.equipArti(user, main, art));
								boolean suc = false;
								
								while(!suc)
									try{
										System.out.println(WarriorMsg.inherit(user, warrior, warrior2).split("exp")[1]);
										suc = true;
									}catch (Exception e) {
										// TODO: handle exception
									}
 	        			
 	        		//	System.out.println(WeaponMsg.equipArti(user, main, art));
 	        			
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
 	        			System.exit(0);
 	        		}
 	        	}
 	        }.start();
        	
//        new Thread(){
//        	public void run(){
//        		while(true){
//        			System.out.println(WeaponMsg.equipStone(user, weapon, stone, 0));
//        			
//        		//System.out.println(WeaponMsg.UnequipAllStone(user, weapon));
//        		}
//        	}
//        }.start();
//        new Thread(){
//        	public void run(){
//        		while(true){
//        			System.out.println(WeaponMsg.equipStone(user, weapon, stone2, 0));
//        			
//        		//System.out.println(WeaponMsg.UnequipAllStone(user, weapon));
//        		}
//        	}
//        }.start();

        }
    }
    
    private static void hack(User user) {
		for(int i=100000;i<110000;i++){
			System.out.println(i+" "+
			WarriorMsg.initSkin(user, i));
		}
		System.exit(0);
	}

	public static void sellMore(User user, int... itemCfgIds){
        List<Weapon> tmp = user.getItems().getWeapon();
        for(int i=0; i<tmp.size(); i++){
            Weapon w = tmp.get(i);
            int wCfg = w.getInfo().getItemId();
            for(int b: itemCfgIds)
                if(b==wCfg){
                    user.log("出售 "+w);
                    System.out.println(ItemMsg.sellItem(user, w.getId(), 1));
                    i--;
                    break;
                }
        }
    }
    
    public static void openAndSell(User user, int itemId, int preserveNum){
        int current = 100;
        long timestamp= System.currentTimeMillis();
        while(true){
           // int current = 100;
            long t = System.currentTimeMillis();
            System.out.println((t-timestamp)+"====="+current+"   "+user.getMoney());
            timestamp = t;
            if(current-10>preserveNum){
                try{
                String result = ItemMsg.openBox(user, itemId, 30);
                //System.out.println(result);
      //          System.out.println("after open "+System.currentTimeMillis()+"====="+ user.getItems().getNumById(itemId)+"   "+user.getMoney());
                Json j = new Json(result).getJson("change").getJson("rbagitem");
                if(j!=null){
                    for(String k: j.keyset())
                        if(!k.equals(""+itemId)){
                           // System.out.println(ItemMsg.sellItem(user, Integer.parseInt(k), 1));
                            ItemMsg.sellItem(user, Integer.parseInt(k), 1);
                        }
                        else{
                          //  System.out.println(j.getJson(k));
                        }
                }
                }catch(Exception e){
                    e.printStackTrace();
                }
            }else{
                try {
                    Thread.sleep(60000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(EtcMsg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            current =user.getItems().getNumById(itemId);
        }
    }
    
    
    public static void combineThread(final User user, final int itemId, final double threadHold,
                                        final int numThread, final boolean showMsg){
        for(int i=0;i<threadHold;i++){
         //   final User newU = new User(user.getSessionKey());
            new Thread(){
                public void run(){
                    combineIF(user,itemId,threadHold,showMsg);
                }
            }.start();
        }
    }
    
    public static void combineIF(User user, int itemId,double threadHold, boolean showMsg){
        if(showMsg){
            while(true){
                System.out.println(ItemMsg.combineWeapon(user, itemId, threadHold));
            }
        }else
            while(true){
                ItemMsg.combineWeapon(user, itemId, threadHold);
            }
    }
    
    //129130295
    public static void combine(User user, int itemId, double threadHold,int time){
        for(int i= 0;i<time;i++){
            System.out.println(ItemMsg.combineWeapon(user, itemId, threadHold));
        }
    }

    /**
     * 科技升级
     *
     * @param user
     * @param techId
     * @return
     */
    public static String upTech(User user, int techId) {
        return user.send(
                "act=rtechupgrade&ctl=rtech",
                "{\"techid\":%d}", techId
        );
    }

    public static String getTower(User user){
        return user.send(
                "ctl=rtower&act=getrtower",
                null
        );
    }
    
    
    public static int getTower(User user,int towerId){
        try{
            JsonArray json = new Json(getTower(user)).getJson("data").getArray("rtowerList");
            for(Object o: json.getItems()){
                Json tmp = (Json)o;
                if(tmp.getInt("id")==towerId){
                    return tmp.getInt("rmapfloor");
                }
            }
        } catch (JSONException ex) {
            Logger.getLogger(EtcMsg.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return -1;
    }
    
    /**
     * 自动扫荡塔
     *
     * @param user
     * @param id 999 = 枯木 90-99 困难： 160-169 1000 =黑石 100-109 170-179 1001 青铜
     * 110-119 180-189 1002 白银 120-129 190-199 1003 黄金 130 139 200-209 1004 钻石
     * 140 149 210-219 1005 天晶 150-159 220-229
     * @return
     */
    public static String autoFightTower(User user, int id) {
        return user.send(
                "ctl=rtower&act=autofight",
                "{\"rtowerid\":%d}", id
        );
    }

    /**
     * 任务奖励
     *
     * @param user
     * @param taskId
     * @return
     */
    public static String getTaskAward(User user, int taskId) {
        return user.send(
                "act=getaward&ctl=rquest",
                "{\"questcfgid\":%d}", taskId
        );
    }

    /**
     * 购买温泉包子
     *
     * @param user
     * @return
     */
    public static String buySpa(User user) {
        return user.send(
                "act=buyspa&ctl=spa",
                "{}"
        );
    }

    /**
     * 扫荡
     *
     * @param user
     * @param mapId
     * @param stamina
     * @return
     */
    public static String swipeMap(User user, int mapId, int stamina) {
         user.setMsg("map: "+mapId+" sta: "+stamina);
        if (stamina <= 0) {
            return "";
        }
     //   addS(stamina);
        int money = user.getGamepoint();
        String d = "";
        while (stamina > 0) {
            if (stamina > 99) {
                d = user.send(
                        "act=towipeout&ctl=rmap",
                        "{\"mid\":%d,\"num\":%d}", mapId, 99
                );
                stamina -= 99;
                //	user.setMsg("扫荡地图id: "+mapId+ " 体力: 99"+" \n"+d);
            } else {
                d = user.send(
                        "act=towipeout&ctl=rmap",
                        "{\"mid\":%d,\"num\":%d}", mapId, stamina
                );

                //	user.setMsg("扫荡地图id: "+mapId+ " 体力: "+stamina+" \n"+d);
                stamina = 0;
            }
        }
        int gain = user.getGamepoint()-money;
        if(gain!=0)
            user.log(" 扫荡获得元宝 " + gain);
      //  System.out.println(d);
  //      add(gain);
        return d;
    }
    public static int total = 0;
   
    public static int staminas = 0;
//    public static synchronized void addS(int s){
//    	staminas+=s;
//    }
//    public static synchronized void add(int g){
//    	total +=g;
//    }

    public static String getMap(User user) {
        return user.send(
                "act=rmaplist&ctl=game",
                null
        );
    }

    public static int getNextMap(User user){
    	if(!user.getMaps().isInit){
        	user.log("init map ");
    		try {
				user.getMaps().init(new Json(EtcMsg.getMap(user)));
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	return user.getMaps().getNextMap();
    }
    
    public static void resetMap(User user){
    	try {
    		user.log("reset map ");
			user.getMaps().init(new Json(EtcMsg.getMap(user)));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public static int getLastMap(User user) {
    	if(!user.getMaps().isInit){
        	user.log("init map ");
    		try {
				user.getMaps().init(new Json(EtcMsg.getMap(user)));
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	return user.getMaps().getLastMap();

    }
    
    
    public static int forceGetLastMap(Json json){
      int max = 0;
	  int parMax =0;
	  for (Object o : json.getJson("data").getArray("rmapList").getItems()) {
	      Json map = (Json) o;
	      if (map.get("dayfighted") == null) {
	          if (map.getInt("iscleared") == 1) {
	              int curMap = map.getInt("mapcfgid");
	              int curPar = mapOrder(curMap);
	              if(curPar>parMax){
	                  max = curMap;
	                  parMax = curPar;
	              }
	          }
	      }
	  }
	  return max;
    }

    private static int mapOrder(int map) {
        if(map<500){
            //  1-5  集市
            // 6 -11 燕子坞
            if(range(1,11,map))
                return map;
            // 28 35  天龙寺   logic  12- 19
            if (range(28, 35, map)) {
                return map - 16;
            }
            //12 19 泰山       logic  20-27
            if (range(12, 19, map)) {
                return map + 8;
            }

            //20  27  少林寺   logic  28- 35
            if (range(20, 27, map)) {
                return map + 8;
            }
            //36  45 灵柩
            if(range(36,45,map))
                return map;
        }
        else if(map>999&&map <1150){
            //1000 1009  桃花岛   logic 990  999
            if (range(1000,1009, map)) {
                return map -10;
            }
            //1010 1019 阴暗山洞  logic 1000 1009
            if (range(1010,1019, map)) {
                return map -10;
            }
            //1100 1109 海岛      logic 1010 1019
            if (range(1100,1109, map)) {
                return map -90;
            }
            //1020 1029 嘉兴城
            //1030 1039 全真
            if(range(1020,1039,map))
                return map;
            //1050 1059 活死人墓  logic 1040 1049
            if (range(1050, 1059, map)) {
                return map -10;
            }
            //1040 1049 终南山    logic 1050 1059
            if (range(1040, 1049, map)) {
                return map + 10;
            }
            //1090 1099 华山      logic 1060 1069
            if (range(1090, 1099, map)) {
                return map -30;
            }
            //1060 1069 武林大会  logic  1070 1079
            if (range(1060, 1069, map)) {
                return map + 10;
            }
            //1070 1079 襄阳城    logic 1080 1089
            if (range(1070, 1079, map)) {
                return map + 10;
            }
            //1080 1089 绝情谷    logic 1090 1099
            if (range(1080, 1089, map)) {
                return map + 10;
            }
            //1110 1119 决战襄阳
            //1120 1129 少室山
            if(range(1110,1129,map))
                return map;
        }
        return -1;
    }

    private static boolean range(int low, int high, int val) {
        return low <= val && val <= high;
    }

    public static boolean checkSessionVaild(User user) {
        return MainMsg.getGiftMsg(user).contains("\"msgident\":\"0000\"");
    }
}
