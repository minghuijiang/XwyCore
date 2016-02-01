package message;

import com.mingJiang.util.json.Json;
import component.User;

public class WarriorMsg {

    /**
     * 招募侠客 wid
     * @param user
     * @param wid
     * @param rela 所需rela
     * @return 
     */
    public static String getWarrior(User user, int wid, int rela) {
        boolean moreBet = true;
        String bet;
        while (moreBet) {
            bet = WarriorMsg.roll(user, wid, 1);
            try {
                Json betJson = new Json(bet);
                if (betJson.getJson("data").getInt("ship") == rela) {
                    moreBet = false;
                }
            } catch (Exception e) {
            	if(bet.contains("home_err_shipisuplimit")||bet.contains("_home_err_warriornotinpub"))
            		break;
            	 user.log("没铜币了 "+bet);
            	 FarmMsg.collectTree(user);
            	 return WarriorMsg.hire(user, wid);
//                 if (!MethodUtil.grc(FarmMsg.collectTree(user)).equals("成功")) {
//                     try {
//                         Thread.sleep(60000);
//                     } catch (InterruptedException e1) {
//                         // TODO Auto-generated catch block
//                         e1.printStackTrace();
//                     }
//                 }
            }

        }
        //hire;
        return WarriorMsg.hire(user, wid);
    }
    
    
    /**
     * 学习侠客技能
     * @param user
     * @param warrior
     * @param skillId
     * @return 
     */
    public static String learn(User user, int warrior, int skillId) {
        return user.send(
                "act=learnskill&ctl=rwarrior",
                "{\"rwskillid\":%d,\"rwarriorid\":%d}", skillId, warrior
        );
    }

    /**
     * 点元气 循环
     * @param user
     * @param warrior
     * @return 
     */
    public static String openNextLoop(User user, int warrior) {
        return user.send(
                "act=uploopinter&ctl=inter",
                "{\"rwarriorid\":%d}", warrior
        );
    }

    /**
     * 点元气
     * @param user
     * @param warrior
     * @return 
     */
    public static String openNext(User user, int warrior) {
        return user.send(
                "act=upinter&ctl=inter",
                "{\"rwarriorid\":%d}", warrior
        );
    }

    /**
     * 传授元气
     * @param user
     * @param from
     * @param to
     * @return 
     */
    public static String passInter(User user, int from, int to) {
        return user.send(
                "act=passinter&ctl=inter",
                "{\"passwid\":%d,\"fromwid\":%d,\"passtype\":1}", to, from
        );
    }

    public static String passInterR(User user, String to, String from) {
        return user.send(
                "act=passinter&ctl=inter",
                "{\"passwid\":%s,\"fromwid\":%s,\"passtype\":1}", to, from
        );
    }

    public static String clearCD(User user, int pos) {
        return user.send(
                "act=cleartraincd&ctl=train",
                "{\"pos\":%d}", pos
        );
    }

    /**
     * 训练侠客
     * @param user
     * @param warriorId
     * @param type  1 普通
     * @param pos
     * @return 
     */
    public static String train(User user, int warriorId, int type, int pos) {
        if(warriorId==-1)
            return "";
        return user.send(
                "act=trainwarrior&ctl=train",
                "{\"rbuildid\":0,\"arrwarriorid\":{\"%d\":%d},\"traintype\":%d}", pos, warriorId, type
        );
    }
    
    
    public static String enterTrain(User user) {
        return user.send(
                "act=getwarriortrain&ctl=train",
                "{}"
        );
    }
    
    public static String hitBubble(User user, int pos) {
        return user.send(
                "ctl=train&act=hitbubble",
                "{\"pos\":%d}",pos
        );
    }

    /**
     * 侠客对话
     * @param user
     * @param talkId
     * @param old //
     * @param qid 
     * @return 
     */
    public static String talk(User user, int talkId, int old, int qid) {
        return user.send(
                "ctl=hotel&act=talkwarrior",
                "{\"oid\":%d,\"qid\":%d,\"rwarriorid\":%d}", old, qid, talkId
        );
    }

    /**
     * 送礼
     * @param user
     * @param warrior
     * @param item
     * @return 
     */
    public static String sendGift(User user, int warrior, int item) {
        return user.send(
                "ctl=hotel&act=sendpresent",
                "{\"rbagitemid\":%d,\"rwarriorid\":%d}", item, warrior
        );
    }

    /**
     * 全部送礼
     * @param user
     * @param warrior
     * @return 
     */
    public static String sendGiftAll(User user, int warrior) {
        return user.send(
                "ctl=hotel&act=batchpresent",
                "{\"rwarriorid\":%d}", warrior
        );
    }

    /**
     * 摇骰子
     * @param user
     * @param id
     * @param type
     * @return 
     */
    public static String roll(User user, int id, int type) {
        return user.send(
                "ctl=inpub&act=playwarrior",
                "{\"wcfgid\":%d,\"ptype\":%d}", id, type
        );
    }

    /**
     * 招聘
     * @param user
     * @param id
     * @return 
     */
    public static String hire(User user, int id) {
        return user.send(
                "ctl=inpub&act=recruitwarrior",
                "{\"wcfgid\":%d}", id
        );
    }

    
    /**
     * 
     * @param user
     * @param wid
     * @param type   0 bug    1   初级碎片    2 时装碎片    3 时装精华
     * @param mode   1  1次  2 一星
     * @return 
     */
    public static String upgradeWarrior(User user,int wid, int type, int mode){
        //ctl=changeskin&PHPSESSID=slkvmfv0is72aqvqijdoig15u5&serid=1&rep=json&act=cultivate 
        return user.send(
                "ctl=changeskin&act=cultivate",
                "{\"type\":%d,\"mode\":%d,\"rwarriorId\":%d}", type,mode,wid
        );
    }
    
    
    public static String inherit(User user,int fromId, int toId){
        //ctl=changeskin&PHPSESSID=slkvmfv0is72aqvqijdoig15u5&serid=1&rep=json&act=cultivate 
        return user.send(
                "ctl=changeskin&act=inherit",
                "{\"fromwid\":%d,\"passwid\":%d}", fromId, toId
        );
    }
    
    public static String initSkin(User user,int wid){
        //ctl=changeskin&PHPSESSID=slkvmfv0is72aqvqijdoig15u5&serid=1&rep=json&act=cultivate 
        return user.send(
                "act=init&ctl=changeskin",
                "{\"rwarriorId\":%d}", wid
        );
    }
}
