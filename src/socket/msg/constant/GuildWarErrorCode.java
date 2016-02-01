package socket.msg.constant;

public class GuildWarErrorCode {

    public static final int GuildWar_Succeed = 0;
    public static final int GuildWar_Error_Not_Open = 1;
    public static final int GuildWar_Error_Has_Combat = 2;
    public static final int GuildWar_Error_Not_Sign = 3;
    public static final int GuildWar_Error_Not_Final_Candidate = 4;
    public static final int GuildWar_Error_Duplicate_Enter = 5;
    public static final int GuildWar_Error_Unknown = 6;
    public static final int GuildWar_Error_Too_Few = 7;

    public static String getMsg(int code) {
        switch (code) {
            case GuildWar_Succeed:
                return "Succeed";
            case GuildWar_Error_Not_Open:
                return "Not_Open";
            case GuildWar_Error_Has_Combat:
                return "Has_Combat";
            case GuildWar_Error_Not_Sign:
                return "Not_Sign";
            case GuildWar_Error_Not_Final_Candidate:
                return "Not_Final_Candidate";
            case GuildWar_Error_Duplicate_Enter:
                return "Duplicate_Enter";
            case GuildWar_Error_Unknown:
                return "Unknown";
            case GuildWar_Error_Too_Few:
                return "Too_Few";

            default:
                return "GuildWarErrorCode unknown code =" + code;
        }
    }
}
