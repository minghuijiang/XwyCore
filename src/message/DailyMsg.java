package message;

import component.User;

public class DailyMsg {

    //拜神
    public static String worship(User user, int type) {
        return user.send(
                "act=arenaworship&ctl=rarena",
                "{\"type\":%d}", type
        );
    }

    //小秘
    public static String secretary(User user) {
        return user.send(
                "act=openbox&ctl=secretary",
                null
        );
    }

    //daily sign in
    public static String dailySign(User user) {
        return user.send(
                "act=getsignaward&ctl=operator",
                null
        );
    }

    //open sign in box
    public static String openBox(User user, int box) {
        return user.send(
                "act=opensignbox&ctl=operator",
                "{\"num\":" + box + "}"
        );
    }

    //连续礼包
    public static String getContinueBox(User user) {
        return user.send(
                "act=getsloginaward&ctl=operator",
                null
        );
    }

    //离线礼包
    public static String getOffLineAward(User user) {
        return user.send(
                "act=getofflineaward&ctl=game",
                null
        );
    }
    
    /**
     * 在线奖励
     * @param user
     * @return
     */
    public static String getOnlineAward(User user) {
        return user.send(
                "act=getonlineaward&ctl=operator",
                null
        );
    }

    /**
     * @param user
     * @return
     */
    public static String addSign(User user) {
        return user.send(
                "act=buysign&ctl=operator",
                null
        );
    }

    // 更换令牌, 
    /**
     *@param user
     * @return
     */
    public static String change(final User user) {
        //	return "";
        return user.send(
                "act=changepoint&ctl=changegamepoint",
                null
        );
    }

}
