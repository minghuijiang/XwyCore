package message;

import component.User;
import data.Constant;
import data.StaticInfo;

public class GuildWarMsg {

    /**
     * type 1 = 铜币, 2 = 令牌
     *
     * @param user
     * @param type
     * @param guildId
     * @return
     */
    public static String bet(User user, int type, int gid) {
        return user.send(
                "act=startbet&ctl=guildfight",
                "{\"type\":%d,\"gid\":%d}", type, gid
        );
    }
}
