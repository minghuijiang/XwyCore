package message;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;
import com.mingJiang.util.json.JsonArray;
import component.User;

public class ActivityMsg {
	
	
	public static String changeWord(User user){
		return user.send(
                "act=getchangewords&ctl=operator",
                null
        );
		//act=getchangewords&rep=json&ctl=operator HTTP/1.1
	}
	
	public static String changeWord(User user,int award){
		return user.send(
                "ctl=operator&act=changewordsaward",
                "{\"changeid\":%d}",award
        );
		//act=getchangewords&rep=json&ctl=operator HTTP/1.1
	}
	
	
	//情人节
    public static String sendFlower(User user, int target, int num) {
        return user.send(
                "ctl=operator&act=ValentinesSent",
                "{\"recverId\":%d,\"num\":%d}", target,num
        );//testing
    }
    
    public static String openEgg(User user, int id) {
        return user.send(
                "act=hitegg&ctl=operator",
                "{\"eggid\":%d}", id
        );
    }
    
    /**
     * 
     * @param user
     * @param type 1-   2 -  3-
     * @return 
     */
    public static String addSmallFund(User user, int type){
        return user.send(
                "act=buysmallfund&ctl=operator",
                "{\"buyid\":%d}", type
        );
    }
    
    public static void getSmallFundAward(User user){
        for(int i=0;i<5;i++)
            getSmallFundAward(user,i);
    }
    
    public static String getSmallFundAward(User user,int id){
        return user.send(
                "act=getsmallfundAward&ctl=operator",
                "{\"getid\":%d}",id
        );
    }

    public static void search(final User user) {
        for (final String event : getEventId(user)) {
            new Thread() {
                public void run() {
                    for (int logic : getLogicId(user, event)) {
                        System.out.println(event + " : " + logic + "  -" + getActivity(user, event, logic));
                    }
                }
            }.start();
        }

    }

    public static String getLogic(User user, String event) {
        return user.send(
                "ctl=opconf&act=getcfg",
                "{\"eventid\":\"%s\"}", event
        );
    }

    public static List<String> getEventId(User user) {
        List<String> event = new ArrayList<>();
        try {
            JsonArray tmp = new Json(getEvent(user)).getJson("data").getArray("opctlList");
            for (Object o : tmp.getItems()) {
                Json j = (Json) o;
                if (j.get("activityId") != null) {
                    event.add(j.getString("activityId"));
                }
            }
        } catch (JSONException ex) {
            Logger.getLogger(ActivityMsg.class.getName()).log(Level.SEVERE, null, ex);
        }
        return event;
    }

    public static List<Integer> getLogicId(User user, String event) {
        List<Integer> ids = new ArrayList<>();
        try {
            String data = getLogic(user, event);
            //     System.out.println(data);
            if (!data.contains("gam_suc_getopconfcfgok")) {
                return ids;
            }
            JsonArray json = new Json(data)
                    .getJson("data")
                    .getJson("opconfcfgVo")
                    .getArray("logicList");
            for (Object sub : json.getItems()) {
                Json tmp = (Json) sub;
                ids.add(tmp.getInt("logicid"));
            }
        } catch (JSONException ex) {
            Logger.getLogger(ActivityMsg.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ids;
    }

    public static String getLogicResult(User user, String event) {
        return user.send(
                "ctl=opconf&act=init",
                "{\"eventid\":\"%s\"}", event
        );
    }

    public static String getEvent(User user) {
        return user.send(
                "ctl=index&act=getopctl",
                null
        );
    }

    public static String getActivity(User user, String event, int logic) {
        return user.send(
                "act=getaward&ctl=opconf",
                "{\"eventid\":\"%s\",\"logicid\":%d}", event, logic
        );
    }

    public static String turn(User user, int num) {
        return user.send(
                "ctl=tray&act=lottery",
                "{\"num\":%d,\"typeid\":\"ace\"}", num
        );
    }

    public static String turnNormal(User user, int num) {
        return user.send(
                "ctl=tray&act=lottery",
                "{\"num\":%d,\"typeid\":\"lucky\"}", num
        );
    }

    public static String getYellow(User user, int type) {
        return user.send(
                "act=sendyellowvipaward&ctl=operator",
                "{\"type\":%d}", type
        );
    }

    //hero exchange 2
    public static String change(User user) {
        return user.send(
                "ctl=superior&act=exchange",
                "{\"type\":\"all\"}"
        );
    }

    public static String getEgg(User user, int id) {
        return user.send(
                "act=hitegg&ctl=operator",
                "{\"eggid\":%d}", id
        );
    }

    /**
     * 新服活动 type 1 vip lv type 3 hire
     *
     * @param user
     * @param type
     * @param act
     * @return
     */
    public static String vipLv(User user, int type, int act) {
        return user.send(
                "ctl=sina&act=getactivityaward",
                "{\"type\":%d,\"actid\":%d}", type, act
        );
    }

    public static String buy(User user, int id) {
        return user.send(
                "ctl=shop&act=buygoods",
                "{\"goodstype\":0,\"goodsid\":%d,\"buytype\":2}", id
        );
    }

    public static String confirm(User user, String uid) {
        return user.send(
                "ctl=shop&act=getshopinfo",
                "{\"token\":\"%s\"}", uid
        );
    }

}
