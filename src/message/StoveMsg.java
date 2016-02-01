package message;

import component.User;

public class StoveMsg {

    /**
     * 初始化
     * @param user
     * @return 
     */
    public static String initStove(User user){
         return user.send(
                "act=init&ctl=stove",
                "{\"type\":1}"
        );
    }
    
    /**
     * type 1 = 铜币   2 = 令牌
     * @param user
     * @param type
     * @return 
     */
    public static String fastExp(User user,int type) {
        return user.send(
                "act=speedup&ctl=stove",
                "{\"type\":%d}",type
        );
    }

    /**
     * 获取经验
     * @param user
     * @return 
     */
    public static String getExp(User user) {
        return user.send(
                "act=gainexp&ctl=stove",
                null
        );
    }
}
