package message;

import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;
import com.mingJiang.util.json.JsonArray;
import component.User;

public class TradeMsg {

    /**
     * 开始跑商
     *
     * @param user
     * @param tradeId
     * @param kind 0 普通跑商 1 - 3小时 2 至尊
     * @return
     */
    public static String begin(User user, int tradeId, int kind) {
        return user.send(
                "act=dotrade&ctl=trade",
                "{\"tradecfgid\":%d,\"kind\":%d}", tradeId, kind
        );
    }

    public static String getTrade(User user) {
        return user.send(
                "act=gettrade&ctl=trade",
                "{}"
        );
    }

    /**
     * 加速完成
     *
     * @param user
     * @return
     */
    public static String speed(User user) {
        return user.send(
                "act=speedtrade&ctl=trade",
                "{}"
        );
    }

    /**
     * 查看跑商结果
     *
     * @param user
     * @param tradeId
     * @return
     */
    public static String view(User user, int tradeId) {
        return user.send(
                "act=viewtrade&ctl=trade",
                "{\"tradecfgid\":%d}", tradeId
        );
    }

    /**
     * 获取跑商奖励
     *
     * @param user
     * @return
     */
    public static String getBack(User user) throws JSONException {

        JsonArray arr = new Json(TradeMsg.getTrade(user)).getJson("data").getArray("rtradeList");

        int route = arr.getItems().size() > 0? arr.getJson(0).getInt("tradecfgid") : 0;
        String re = view(user, route);
        user.send(
                "act=addtradebag&ctl=trade",
                "{\"tradecfgid\":%d}", route
        );
        return re;
    }
}
