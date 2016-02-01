package message;

import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;
import component.User;
import data.Constant;
import data.StaticInfo;
import static data.StaticInfo.debug;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UnionMsg {
    public static boolean useLock = !true;
    private static final Object UnionLock = new Object();
    /**
     * 升级帮派科技
     * @param user
     * @param tech
     * @param kind   个人激活 = 1  帮派开启 = 2
     * @return 
     */
    public static String openSkill(User user, int tech, int kind) {
        return user.send(
                "act=operateguildtech&ctl=guild",
                "{\"techid\":%d,\"kind\":%d}", tech, kind
        );
    }
    
    public static String getUnionInfo(User user, int uid) {
        return user.send(
                "act=checkguildinfo&ctl=guild",
                "{\"gid\":%d}", uid
        );
    }
    
    public static String getBetReward(User user){
    	return user.send(
                "act=getBetRewards&ctl=guildfight",
                null
        );
    }
    
    public static String create(User user, String name) {
        return user.send(
                "ctl=guild&act=createguild",
                "{\"gqq\":\"0123456\",\"gname\":\"%s\",\"gnotice\":\"\",\"typeid\":1}", name
        );
    }
    
    
    /**
     * 押注排行
     * @param user
     * @return 
     */
    public static String getBetInfo(User user){
         return user.send(
                "ctl=guildfight&act=getbetorder",
                "[]"
        );
    }
    
    public static String getList(User user){
        return user.send(
                "act=getfightlist&ctl=guildfight",
                null
        );
    }
    
    public static void getBetLeader(final User user){
    	getBetLeader(user, false);
    }
    
    public static void getBetLeader(final User user,boolean limit){
        StaticInfo.setMsg("=============押注排行============");
        try {
           for(Object o: new Json(getBetInfo(user)).getArray("data").getItems()){
               Json j = (Json)o;
               StaticInfo.setMsg("gid: "+j.getInt("guildid")+"  name: "+j.getString("name")+" 押注令牌： "+j.getInt("gamepoint"));
           }
        } catch (JSONException ex) {
            StaticInfo.setMsg("获取押注排行失败 "+ex.getMessage());
        }
        StaticInfo.setMsg("===========押注排行结束==========");
        if(limit)
        	return;
        StaticInfo.setMsg("=========争霸排行=========");
        try{
            final Json j = new Json(getList(user)).getJson("data").getJson("fightlist");
            final List<Qua> info = new ArrayList<>();
            final Object lock = new Object();
            for(final String key: j.keyset()){
                new Thread(){
                    public void run(){
                        try {
                            Qua q = new Qua(new Json(getUnionInfo(user, Integer.parseInt(key))).getJson("data"));
                            synchronized (lock){
                                info.add(q);
                                if(info.size()==j.keyset().size())
                                    lock.notifyAll();
                            }
                        } catch (JSONException ex) {
                            Logger.getLogger(UnionMsg.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }.start();
            }
            synchronized(lock){
                lock.wait();
            }
        
            Collections.sort(info, new Comparator<Qua>(){

                @Override
                public int compare(Qua o1, Qua o2) {
                    if(o1.highScore>o2.highScore)
                        return -1;
                    else if(o1.highScore<o2.highScore)
                        return +1;
                    return 0;
                }
                
            });
            int high = info.get(0).highScore;
            for(int i = 0; i<info.size();i++){
                Qua q = info.get(i);
                if(q.highScore<high*0.8&&i>5){
                    StaticInfo.setMsg("战力太低 跳过剩下"+(info.size()-i)+"个帮派");
                    break;
                }
                StaticInfo.setMsg(q.toString());
            }
            
        }catch(Exception e){
            StaticInfo.setMsg("获取争霸排行失败 "+e.getMessage());
        }
        
        
        StaticInfo.setMsg("=======争霸排行结束=======");
    }
    
    public static void main(String[] args){
//       for(int i=1;i<=28;i++){
//            System.out.println("server: "+i);
//            
            StaticInfo.registerPlatform(Constant.TENCENT, 4);
            User u = new User("","","http://app100645087.qzone.qzoneapp.com/?qz_height=1400&openid=6DB4115F712DB36C56BB1AF1CB031A41&openkey=DD6B4DBE0A44B7CC7B05FAECA7F180BA&pf=qzone&pfkey=32b04bcf7c7b27a0cd0821c76892d71a&qz_ver=8&appcanvas=1&qz_style=88&params=&via=QZ.MYAPP&serid=1");

            u.login();getBetLeader(u);
       // }
    }
    

    /**
     * 获取帮派
     * @param user
     * @return 
     */
    public static String getUnion(User user) {
        return user.send(
                "act=openguildbase&ctl=guild",
                null
        );
    }

    /**
     * 打开帮派 获取帮派id
     * @param user
     * @return 
     */
    public static int openUnion(User user) {
        String union = "";
        try {
        //	user.log("before send ");
            union = user.send(
                    "act=openguildbase&ctl=guild",
                    null
            );
          //  user.log("before json :"+union);
            Json json = new Json(union);
            if (json.getString("msg").contains("nownoguild")||json.getString("msg").contains("guildnotexist")) {
           // 	  user.log("after json no guild");
                return 0;
            }
         //   user.log("after json ");
            //	System.out.println(union);
            return json.getJson("data").getJson("guildinfo").getInt("gid");
        } catch (JSONException ex) {
            user.log("open union fail  union: "+union);
        }
        return 0;
    }

    /**
     * 获取帮派名字
     * @param user
     * @return 
     */
    public static String getUnionName(User user) {
        try {
            String union = user.send(
                    "act=openguildbase&ctl=guild",
                    null
            );
            Json json = new Json(union);
            if (json.getString("msg").contains("nownoguild")) {
                return "无帮派";
            }
            return json.getJson("data").getJson("guildinfo").getString("gname");
        } catch (JSONException ex) {
            Logger.getLogger(UnionMsg.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "无";
    }

    
    /**
     * 申请帮派
     * @param user
     * @param unionId
     * @return 
     */
    public static String applyUnion(User user, int unionId) {
    	if(useLock)
	    	synchronized(UnionLock){
	    		return user.send(
		                "act=applyguild&ctl=guild",
		                "{\"gid\":%d}", unionId
		        );
	    	}
    	else {
    		return user.send(
	                "act=applyguild&ctl=guild",
	                "{\"gid\":%d}", unionId
	        );
		}
	        
    }

    /**
     * 通过申请
     * @param user
     * @param mem
     * @return 
     */
    public static String acceptMember(User user, int mem) {
    	if(useLock)
	    	synchronized(UnionLock){
		        return user.send(
		                "act=chmoperateapply&ctl=guild",
		                "{\"kind\":1,\"rid\":%d}", mem
		        );
	    	}
    	else {
    		return user.send(
	                "act=chmoperateapply&ctl=guild",
	                "{\"kind\":1,\"rid\":%d}", mem
	        );
		}
    }

    /**
     * 踢掉成员
     * @param user
     * @param mem
     * @return 
     */
    public static String kickMember(User user, int mem) {
        return user.send(
                "act=chmoperatemem&ctl=guild",
                "{\"kind\":1,\"rid\":%d}", mem
        );
    }
    
    
    public static String dismissUnion(User user){
    	return user.send(
                "ctl=guild&act=dismissguild",
                null
        );
    }

    /**
     * type = 3 10令, type= 2 1令， type = 1 金币
     *
     * @param user
     * @param type
     * @return
     */
    public static String contribute(User user, int type) {
        return user.send(
                "act=contribute&ctl=guild",
                "{\"kind\":%d}", type
        );
    }

    /**
     * type = 2 大转盘， 1 小转盘
     *
     * @param user
     * @param type
     * @return
     */
    public static String turntable(User user, int type) {
        return user.send(
                "act=playdial&ctl=guild",
                "{\"kind\":%d}", type
        );
    }
	//act=memoperatemem&ctl=guild

    /**
     * 退出帮派
     * @param user
     * @return 
     */
    public static String exitUnion(User user) {
        return user.send(
                "act=memoperatemem&ctl=guild",
                "{\"kind\":1,\"rid\":0}"
        );
    }
}

class Qua{
    private String unionInfo;
    public int highScore;
    public int total;
    private static String formate = "帮派: %s id:%d 等级: %d 总战力: %d 最高战力: %s 帮主: %s";
    public Qua(Json data){
    	try{
        Json info = data.getJson("guildinfo");
        String name = info.getString("gname");
        int id = info.getInt("gid");
        int lv = info.getInt("glevel");
        total = info.getInt("gpower");
        String leader = info.getString("chairmanrnm");
        String high="";
        highScore= 0;
        for(Object o: data.getArray("memlist").getItems()){
            Json j =(Json)o;
            int sc = j.getInt("power");
            if(sc>highScore){
                highScore = sc;
                high ="等级: "+j.getInt("level")+ " 名字: "+j.getString("nickname")+" 战力: "+highScore;
            }
        }
        unionInfo = String.format(formate, name,id,lv,total,high,leader);
    	}catch(Exception e){
    		System.out.println(data);
    	}
    }
    
    public String toString(){
        return unionInfo;
    }
    
}