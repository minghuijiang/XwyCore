package message;

import com.mingJiang.util.json.Json;
import component.User;
import data.StaticInfo;

public class MainMsg {
    
    /**
     * 使用 openkey 和 pfkey 登陆
     * @param user
     * @return 
     */
    public static String login(User user){
        String result = login(user, user.getInfo().getOpenKey(), user.getInfo().getPfKey());
        try{
            Json j = new Json(result);
            return j.getJson("data").getString("sessionid");
        }catch(Exception e){
            StaticInfo.debug("login error: "+result);
            return "";
        }
    }
    
    public static void getPC(User user){
        loginPC(user);
        getPCAward(user);
    }

    
    public static String loginPC(User user){
        return user.send(
                "ctl=operator&act=clientGetStatus",
                "{\"client\":\"pc\"}"
        );
    }
    
    public static String getPCAward(User user){
        return user.send(
              "ctl=operator&act=clientGetAward",
              null
      );      
    }
    
    /**
     *  1 新手礼包  2 每日礼包
     * @param user
     * @param type
     * @return
     */
    public static String getYellowVip(User user,int type){
        return user.send(
              "&act=sendyellowvipaward&ctl=operator",
              "{\"type\":%d}",type
      );      
    }
    
    private static String login(User user,String open, String pfKey) {
           return user.getSender().connect(StaticInfo.server.gateway+"ctl=index&act=logingame&rep=json", 
                   String.format("{\"platuid\":\"%s\",\"platkey\":\"%s\"}", 
                           open,pfKey), true);
       }
    
    /**
     * 获取资料
     * @param user
     * @return 
     */
    public static String initLogin(User user) {
        return user.send(
                "act=roleinit&ctl=game",
                "{}"
        );
    }

    
    /**
     * 
     * @param user
     * @param channel
     * 			4   bless record
     * @param num
     * @return
     */
    public static String getMsg(User user, int channel, int num){
    	return user.send(
                "act=getrmsglist&ctl=rmsg",
                "{\"num\":%d,\"channel\":%d,\"by\":\"num\"}",num,channel
        );
    }
    
    /**
     * 礼物列表
     * @param user
     * @return 
     */
    public static String getGiftMsg(User user) {
        return user.send(
                "act=rgiftlist&ctl=rgift",
                null
        );
    }

    /**
     * 等级礼包
     * @param user
     * @return 
     */
    public static String getLevelGiftMsg(User user) {
        return user.send(
                "act=getlevelgiftcfg&ctl=rgift",
                null
        );
    }

    /**
     * 领取礼包
     * @param user
     * @param giftId
     * @return 
     */
    public static boolean getGift(User user, int giftId) {
        String d = user.send(
                "act=usergift&ctl=rgift",
                String.format("{\"%s\":%d}", "giftid", giftId)
        );
     //   System.out.println(d);
        return d.contains("msgident\":\"0000");
    }

    /**
     * 领取礼包
     * @param user
     * @param giftId
     * @return 
     */
    public static String getGiftStr(User user, int giftId) {
        return user.send(
                "act=usergift&ctl=rgift",
                String.format("{\"%s\":%d}", "giftid", giftId)
        );
    }

    /**
     * 19 男主角暗器
     * 20 男主角剑士
     * 21 男主角拳师
     * 22 女主角暗器
     * 23 女主角剑士
     * 24 女主角拳师
     * @param user
     * @param campid
     * @return
     */
    public static String setCamp(User user, int campid) {
        return user.send("act=setcamp&ctl=rwarrior",
        		"{\"warriorcfgid\":%d}", campid
        	);
    }
    
    public static String setCamp2(User user){
        return user.send("ctl=rwarrior&act=reincarnate", null);
    }
}
