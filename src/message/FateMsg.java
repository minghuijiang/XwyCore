package message;

import component.User;

public class FateMsg {

    public static String unequipFate(User user, String fateId, String warrior) {
        return user.send(
                "act=equipfate&ctl=rfate",
                "{\"rbagitemid\":%s,\"rwarriorid\":%s}", fateId, warrior
        );
    }

    public static String equipFate(User user, String fateId, String warrior, int pos) {
        return user.send(
                "act=equipfate&ctl=rfate",
                "{\"rbagitemid\":%s,\"rwarriorid\":%s,\"fateequipid\":%d}", fateId, warrior, pos
        );
    }

    /**
     * batch fate
     *
     * @param user
     * @return
     */
    public static String turn(User user) {
        return user.send(
                "act=startfate&ctl=rfate",
                "{\"handlertype\":\"batch\"}"
        );
    }

    /**
     * single fate
     *
     * @param user
     * @return
     */
    public static String turns(User user) {
        return user.send(
                "act=startfate&ctl=rfate",
                "{\"handlertype\":\"single\"}"
        );
    }
    
    public static String turnSuper(User user) {
        return user.send(
                "act=superFate&ctl=rfate",
                "{}"
        );
    }

    /**
     * pickAll
     *
     * @param user
     * @return
     */
    public static String pick(User user) {
        return user.send(
                "act=pickfate&ctl=rfate",
                "{\"handlertype\":\"batch\"}"
        );
    }

    /**
     * single pick
     *
     * @param user
     * @param index
     * @return
     */
    public static String pick(User user, int index) {
        return user.send(
                "act=pickfate&ctl=rfate",
                "{\"compassid\":%d,\"handlertype\":\"single\"}", index
        );
    }

    /**
     * decompose all
     *
     * @param user
     * @return
     */
    public static String decompose(User user) {
        return user.send(
                "act=decomposefate&ctl=rfate",
                "{\"handlertype\":\"batch\"}"
        );
    }
    
    /**
     * decompose all purple
     *
     * @param user
     * @return
     */
    public static String decomposeSuper(User user) {
        return user.send(
                "act=decomposefate&ctl=rfate",
                "{\"handlertype\":\"super\"}"
        );
    }

    /**
     * single decompose
     *
     * @param user
     * @param id
     * @return
     */
    public static String decompose(User user, String id) {
        return user.send(
                "act=decomposefate&ctl=rfate",
                "{\"handlertype\":\"single\",\"rbagitemid\":%s}", id
        );
    }

    /**
     * upgrade fate
     *
     * @param user
     * @param id
     * @return
     */
    public static String upgrade(User user, String id) {
        return user.send(
                "ctl=rfate&act=upgradefate",
                "{\"rbagitemid\":%s}", id
        );
    }
}
