/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import message.ActivityMsg;
import message.ArenaMsg;
import message.UnionMsg;

import com.mingJiang.util.FileUtil;
import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;
import com.mingJiang.util.json.JsonArray;

import component.User;
import component.item.ItemInfo;
import component.item.ItemVo;
import component.item.SpecialWeapon;
import component.item.Weapon;
import component.warrior.WarriorCfg;
import component.warrior.WarriorInfo;
import data.server.QQServer;

/**
 *
 * @author Ming Jiang
 */
public class Analyzer {
                                    //name  id    score   force  con   agi   str     vigour
    private static String format = "%-5s\t%-10d\t%-10d\t%-6d\t%-6d\t%-6d\t%-6d\t%-10d";
    public static void parseArena(User user, int... ids) throws JSONException, IOException{
        for(int id:ids){
            System.out.println(id);
            String data = ArenaMsg.getGroup(user, id);
         //  System.out.println(data);
            try{
            Json j = new Json(data).getJson("data").getArray("arrArenausers").getJson(0);
            for(Object o: j.getArray("groupinfo").getItems()){
                Json jj = (Json)o;
                String name = jj.getString("name");
                int score = jj.getInt("score");
                int con = jj.getInt("con");
                int force = jj.getInt("force");
                int agi = jj.getInt("agi");
                int str = jj.getInt("str");
                int totalvigour = jj.getInt("totalvigour");
                int idss = jj.getInt("id");
                System.out.println(String.format(format,name,idss,score,force,con,agi,str,totalvigour));
            }
            }catch(Exception e){
                System.out.println(data);
            }
        }
        
        
    }
    public static void parseFateAgi(User user, int... ids) throws JSONException, IOException{
        for(int id:ids){
            System.out.println(id);
            String data = ArenaMsg.getGroup(user, id);
         //  System.out.println(data);
            try{
            Json j = new Json(data).getJson("data").getArray("arrArenausers").getJson(0);
            Map<Integer,Integer> agiList = new HashMap<>();
            for(Object o: j.getArray("groupinfo").getItems()){
                Json jj = (Json)o;
                String name = jj.getString("name");
                String equip = jj.getString("equipedItem");
                String agi = jj.getString("artiItem");
                Json agiJson = jj.getJson("artiItem");
                for(int i=1;i<=4;i++){
                	int key = agiJson.getInt(i+"");
                	if(key>0){
                		if(agiList.containsKey(key)){
                			agiList.put(key, agiList.get(key)+1);
                		}else
                			agiList.put(key, 1);
                	}
                }
                String fate = jj.getString("fateItem");
                int idss = jj.getInt("id");
                System.out.println(name+"\t"+idss+
                		//"\t"+equip+
                		"\t"+agi//+
                		//"\t"+fate
                		);
            }
            for(int key:agiList.keySet()){
            	if(agiList.get(key)>1)
            		System.out.println("重复 -"+key+"  = "+agiList.get(key));
            }
            }catch(Exception e){
                System.out.println(data);
            }
        }
        
        
    }
    
    public static void parsePrior(User user, int... ids) throws JSONException, IOException{
        for(int id:ids){
            System.out.println(id);
            String data = ArenaMsg.getGroup(user, id);
         //  System.out.println(data);
            try{
            Json j = new Json(data).getJson("data").getArray("arrArenausers").getJson(0);
            for(Object o: j.getArray("groupinfo").getItems()){
                Json jj = (Json)o;
                String name = jj.getString("name");
                int p= jj.getInt("attackprior");
                int idss = jj.getInt("id");
                for(Object oo: jj.getArray("equipedItemInfo").getItems()){
                	Json weapon = (Json)oo;
                	if(weapon.getInt("num")!=1){
                		System.out.println(weapon);
                	}
                	p-=weapon.getInt("attackprior");
                }
                System.out.println(name+"\t"+idss+"\t"+p);
            }
            }catch(Exception e){
                System.out.println(data);
            }
        }
        
        
    }
    
    public static int[] getTopTen(User user){
    	List<Integer> list = new ArrayList<>();
    	try {
			for(Object o : new Json(ArenaMsg.getTop10(user)).getJson("data").getArray("list").getItems()){
				Json tmp = (Json)o;
				list.add(tmp.getInt("id"));
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	int[] re = new int[list.size()];
    	for(int i=0; i< re.length;i++){
    		re[i]= list.get(i);
    	}
    	
    	return re;
    }
    
    public static int[] getUnionUser(User user, int gid){
    	List<Integer> list = new ArrayList<>();
    	try {
			for(Object o : new Json(UnionMsg.getUnionInfo(user, gid)).getJson("data").getArray("memlist").getItems()){
				Json tmp = (Json)o;
				list.add(tmp.getInt("rid"));
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	int[] re = new int[list.size()];
    	for(int i=0; i< re.length;i++){
    		re[i]= list.get(i);
    	}
    	
    	return re;
    }
    
    public static void parseJSON(String f){
        try {
            FileUtil.writeTo(f, new Json(FileUtil.readToLine(f)).toFormatString());
        } catch (IOException ex) {
            Logger.getLogger(Analyzer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(Analyzer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void parseSelfWeapon(User user){
    	user.setNeedData(true);
    	user.setNeedSocket(false);
    	user.login();
      for(Weapon w: user.getItems().getWeapon()){
    	  System.out.println(w+"  "+w.getId()+"  "+w.getWarriorId());
      }
        
        
    }
    
    public static void parseSelfArti(User user){
    	user.setNeedData(true);
    	user.setNeedSocket(false);
    	user.login();
      for(SpecialWeapon w: user.getItems().getSpecial()){
    	  System.out.println(w+"  "+w.getId()+"  "+(w.isFit()?"已装备":"")+"  "+w.getWarriorId());
      }
        
        
    }
    

    
    public static void analyze(Json data){
    	
    }
    
    /**
     * 
     * @param data
     * @param type
     * 		str	agi	con	force
     * @return
     */
    public static int getStone(Map<Integer,Integer> stone, String type){
    	int val = 0;
    	for(int id: stone.keySet()){
    		ItemVo info = ItemInfo.getItem(id);
    		if(info.getEquipproperty().equals(type)){
    			val+= info.getPropertyvalue()*stone.get(id);
    		}
    	}
    	
    	return val;
    }
    
    /**
     * return  int[]=
     * 				con		生命
     * 				str		力量	
     * 				agi		防御
     * 				force	内力
     * @param stone
     * @return
     */
    public static int[] getStones(Map<Integer,Integer> stone){
    	int[] val = new int[4];
    	
    	val[0]=getStone(stone,"con");
    	val[1]=getStone(stone,"str");
    	val[2]=getStone(stone,"agi");
    	val[3]=getStone(stone,"force");
    	
    	return val;
    }
    
    public static void parseWarrior(Json warrior){
    	System.out.println(warrior.getInt("id")+":  "+warrior.getString("name"));
    	Map<Integer,Integer> stone = new HashMap<>();
    	for(Object o:warrior.getArray("equipedItemInfo").getItems()){
    		Json tmp = (Json)o;
    		
    		if(tmp.getArray("arrEquipedstone")!=null)
	    		for(Object oo: tmp.getArray("arrEquipedstone").getItems()){
	    			Integer i = (Integer)oo;
	    			if(stone.containsKey(i))
	    				stone.put(i, stone.get(i)+1);
	    			else
	    				stone.put(i, 1);
	    		}

    	}

    	int[] property = getStones(stone);
    	for(int i: property)
    		System.out.println(i);
    }

    public static void parseGroup(User user, int... args){
    	for(int id: args){
    		String data = ArenaMsg.getGroup(user, id);
    		try{
                Json j = new Json(data).getJson("data").getArray("arrArenausers").getJson(0);
                for(Object o: j.getArray("groupinfo").getItems()){
                    Json jj = (Json)o;
                    parseWarrior(jj);
                }

                }catch(Exception e){
                    System.out.println("出错: "+e.toString()+"  "+data);
                    e.printStackTrace();
                }
    	}
    }
    
    public static void test(User user, int...args){
    	for(int id: args){
    		String data = ArenaMsg.getGroup(user, id);
    		try{
                Json j = new Json(data).getJson("data").getArray("arrArenausers").getJson(0);
                for(Object o: j.getArray("groupinfo").getItems()){
                    Json jj = (Json)o;
                    System.out.println(jj.getString("name"));
                    UserInfo info = new UserInfo(jj,true);
//                    for(String key: info.getValues().keySet()){
//                    	String first = key.substring(0,1).toUpperCase();
//                    	String second = key.substring(1);
//                    	System.out.println("public int get"+first+second+"(){");
//                    	System.out.println("return getInt(\""+key+"\");");
//                    	System.out.println("}");
//                    }
                    info.analyze(45,60);
                    System.out.println("\n");
                 //   System.exit(0);
                }

                }catch(Exception e){
                    System.out.println("出错: "+e.toString()+"  "+data);
                    e.printStackTrace();
                }
    	}
    }
    
    public static void getFate(User user, int...args){
    	
    	for(int id: args){
    		String data = ArenaMsg.getGroup(user, id);
    		try{
                Json j = new Json(data).getJson("data").getArray("arrArenausers").getJson(0);
                System.out.println("名字"+"\t穿透\t抗性\t格挡\t先攻");
                for(Object o: j.getArray("groupinfo").getItems()){
                    Json jj = (Json)o;
                    int wid = jj.getInt("warriorcfgid");
                    WarriorCfg cf = WarriorInfo.getWarrior(wid);
                    int acc = jj.getInt("accuracy")-cf.getAccuracy();
                    int anti =jj.getInt("antisubattack");
                    int block =jj.getInt("block")-cf.getBlock();
                    String name = jj.getString("name");
                    int p= jj.getInt("attackprior");
                    int idss = jj.getInt("id");
                    for(Object oo: jj.getArray("equipedItemInfo").getItems()){
                    	Json weapon = (Json)oo;
                    	if(weapon.getInt("num")!=1){
                    		System.out.println(weapon);
                    	}
                    	p-=weapon.getInt("attackprior");
                    }
                    System.out.println(jj.getString("name")+"\t"+acc+"\t"+anti+"\t"+block+"\t"+p);
                 //   UserInfo info = new UserInfo(jj,true);
//                    for(String key: info.getValues().keySet()){
//                    	String first = key.substring(0,1).toUpperCase();
//                    	String second = key.substring(1);
//                    	System.out.println("public int get"+first+second+"(){");
//                    	System.out.println("return getInt(\""+key+"\");");
//                    	System.out.println("}");
//                    }
               //     info.analyze(45,60);
              //      System.out.println("\n");
                 //   System.exit(0);
                }

                }catch(Exception e){
                    System.out.println("出错: "+e.toString()+"  "+data);
                    e.printStackTrace();
                }
    	}
    }
    
    private static String formatStr ="rank:%d\tname:%s\tpower:%d\tskin:%d\t%s\tid %d";
    public static void parseBuyer(User user){
    	System.out.println(user.getServer().getServerInfo());
    	try{
    		String result = ArenaMsg.getTop10(user);
    	//	System.out.println(result);
    		Json j = new Json(result).getJson("data");
    		for(Object o: j.getArray("list").getItems()){
    			Json ob = (Json)o;
    			int id = ob.getInt("id");
    			String groupInfo = ArenaMsg.getGroup(user, id);
    			boolean hasDong = false;
    			try{
    				JsonArray list = new Json(groupInfo).getJson("data")
    						.getArray("arrArenausers").getJson(0).getArray("groupinfo");
    				for(Object oo : list.getItems()){
    					Json tmp = (Json)oo;
    					if(tmp.getInt("warriorcfgid")==45){
    						hasDong=true;
    						break;
    								
    					}
    				}
    			}catch(Exception e){
    				
    			}
    			System.out.println(String.format(formatStr,ob.getInt("rank"),ob.getString("uname"),ob.getInt("power"),
    						ob.getInt("skinid"),hasDong?"已有":"未有",id));
    		}
    		System.out.println("\nUnion");
    		UnionMsg.getBetLeader(user,false);
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	System.out.println("\n\n\n");
    }
    
    
    public static void main(String[] args) throws JSONException, IOException{
//        String file = "C://Users/Ming Jiang/Desktop/warrior.json";
        StaticInfo.server = new QQServer(1);
        User user = new User(
        		//"","",
        		"0ueb72njlhao42d8uuvogmi1d5");
        		
      //  user.login();
//        Json json = new Json(ActivityMsg.getEvent(user));
//       // System.out.println(json.toFormatString());
//        List<Json> actJsons  = new ArrayList<>();
//        for(Object j: json.getJson("data").getArray("opctlList").getItems()){
//        	actJsons.add((Json) j);
//        }
//        Collections.sort(actJsons, new Comparator<Json>(){
//
//			@Override
//			public int compare(Json o1, Json o2) {
//				long time1 = o1.getLong("starttime");
//				long time2 = o2.getLong("starttime");
//				if(time1>time2)
//					return -1;
//				if(time1<time2)
//					return 1;
//				return 0;
//			}
//        	
//        });
//        System.out.println(System.currentTimeMillis());
//        for(Json j:actJsons){
//        	System.out.println(j.toFormatString());
//        }
//        System.exit(0);
        	String url =	

        		//	"http://app100645087.qzone.qzoneapp.com/?ctl=index&act=home&openid=6DB4115F712DB36C56BB1AF1CB031A41&openkey=7FFB1AFDE5E0B19E9E70FC72ADA5F000&serid=1&pf=qzone&pfkey=e6cbdedfc7275d8c5d00d9a60cfa0ecb"

        			"http://app100645087.qzone.qzoneapp.com/?ctl=index&act=select&openid=39E5F20CAAEC8034B2E2EA648BBA902D&openkey=8A81B3ECAA12DF674A11E6749B33D2CF&pf=qzone&pfkey=17e8b9ce5e5b3964ff241be1b7c020f3&PHPSESSID=0ueb72njlhao42d8uuvogmi1d5"
        			//"http://app100645087.qzone.qzoneapp.com/?qz_height=1400&openid=6DB4115F712DB36C56BB1AF1CB031A41&openkey=91F1165286B6EFC72F965FD8EAE0DD2F&pf=qzone&pfkey=da113b218efbcc1d088b200abc873955&qz_ver=8&appcanvas=1&qz_style=35&params="
//"http://app100645087.qzone.qzoneapp.com/?qz_height=1400&openid=6DB4115F712DB36C56BB1AF1CB031A41&openkey=430F16045D32F05278B2638DAB0D9C8E&pf=qzone&pfkey=925b86d351c8e7d79ac78e0bcc010cf4&qz_ver=8&appcanvas=1&qz_style=35&params="
        			//"app100645087.qzone.qzoneapp.com/?ctl=index&act=home&openid=6DB4115F712DB36C56BB1AF1CB031A41&openkey=ED088B4E24D9DFD6A583FE8B01D821C2&pf=qzone&pfkey=e9783189e02059b3ace1c710eedbbd56"
//        			"http://app100645087.qzone.qzoneapp.com/?qz_height=1400&openid=6DB4115F712DB36C56BB1AF1CB031A41&openkey=7FFB1AFDE5E0B19E9E70FC72ADA5F000&pf=qzone&pfkey=e6cbdedfc7275d8c5d00d9a60cfa0ecb&qz_ver=8&appcanvas=1&qz_style=35&params="
  //"http://app100645087.qzone.qzoneapp.com/?qz_height=1400&openid=6DB4115F712DB36C56BB1AF1CB031A41&openkey=F914451ABEE10DCAF93A803FF1468834&pf=qzone&pfkey=02d67e6d1b7f806912bd1605b55115bc&qz_ver=8&appcanvas=1&qz_style=35&params="
        			;
        	
       	parseArena(user,1312070
        			);
        	System.exit(0);
        			//"http://app100645087.qzone.qzoneapp.com/?qz_height=1400&openid=6DB4115F712DB36C56BB1AF1CB031A41&openkey=0533DE97EA551B273609406B6B93F377&pf=qzone&pfkey=589efe9396b767c562d1d012d36acfd3&qz_ver=8&appcanvas=1&qz_style=35&params=";
        //		);
        	
        try{
        	for(int i=1;i<=60;i++){
        		if(!(i==1||i==2||i==11||i==21||i==31)&&i<40)
            		continue;
        		
        		StaticInfo.server = new QQServer(i);
        		System.out.println(StaticInfo.server .getServerInfo());
        		User u = new User("","",url);
        		u.login();
        		parseBuyer(u);
        	}
        }catch(Exception e){
        	e.printStackTrace();
        }
        		//"epi0mfk5pnrjcns9cal2uidnt3");
    //    System.out.println(MainMsg.setCamp(user, 19));
      //  System.out.println(MainMsg.setCamp2(user));
        //	getFate(user,424606 );//getTopTen(user));//1135062);//getTopTen(user));//31726,312726,1577468);
   //      parseFateAgi(user, getTopTen(user)); //getUnionUser(user,100116));//getTopTen(user));
      //  FileUtil.wr
      // parseJSON(file);
    }
}
