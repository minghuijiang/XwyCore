package socket.msg.constant;

public class GroupStatus {

    public static final int GROUP_SUCCEED = 0;
    public static final int GROUP_ERROR_FULL = 1;
    public static final int GROUP_ERROR_ALREADY_IN_GROUP = 2;
    public static final int GROUP_ERROR_PLAYER_OFFLINE = 3;
    public static final int GROUP_ERROR_GROUP_NOT_EXIST = 4;
    public static final int GROUP_ERROR_PASSWD_WRONG = 5;
    public static final int GROUP_ERROR_YOU_ARE_NOT_LEADER = 6;
    public static final int GROUP_ERROR_YOU_ARE_NOT_IN_GROUP = 7;
    public static final int GROUP_ERROR_TARGET_DND = 8;
    public static final int GROUP_ERROR_TARGET_IS_ALREADY_IN_GROUP = 9;
    public static final int GROUP_ERROR_TARGET_BUSY = 10;
    public static final int GROUP_ERROR_DISBAND = 11;
    public static final int GROUP_ERROR_YOU_CANT_DO_THIS_NOW = 12;
    public static final int GROUP_ERROR_YOU_CANT_KICK_YOURSELF = 13;
    public static final int GROUP_ERROR_GROUP_BUSY_CANT_JOIN = 14;
    public static final int GROUP_ERROR_GROUP_YOU_HAS_PASS_TODAY = 15;
    public static final int GROUP_ERROR_GROUP_YOU_HAS_MAX_TIMES = 16;
    public static final int GROUP_ERROR_GROUP_YOU_NOT_UNLOCK = 17;

    public static String getMsg(int status) {
        switch (status) {
            case GROUP_SUCCEED:
                return "SUCCEED";
            case GROUP_ERROR_FULL:
                return "FULL";
            case GROUP_ERROR_ALREADY_IN_GROUP:
                return "ALREADY_IN_GROUP";
            case GROUP_ERROR_PLAYER_OFFLINE:
                return "PLAYER_OFFLINE";
            case GROUP_ERROR_GROUP_NOT_EXIST:
                return "GROUP_NOT_EXIST";
            case GROUP_ERROR_PASSWD_WRONG:
                return "PASSWD_WRONG";
            case GROUP_ERROR_YOU_ARE_NOT_LEADER:
                return "YOU_ARE_NOT_LEADER";
            case GROUP_ERROR_YOU_ARE_NOT_IN_GROUP:
                return "YOU_ARE_NOT_IN_GROUP";
            case GROUP_ERROR_TARGET_DND:
                return "TARGET_DND";
            case GROUP_ERROR_TARGET_IS_ALREADY_IN_GROUP:
                return "TARGET_IS_ALREADY_IN_GROUP";
            case GROUP_ERROR_TARGET_BUSY:
                return "TARGET_BUSY";
            case GROUP_ERROR_DISBAND:
                return "DISBAND";
            case GROUP_ERROR_YOU_CANT_DO_THIS_NOW:
                return "YOU_CANT_DO_THIS_NOW";
            case GROUP_ERROR_YOU_CANT_KICK_YOURSELF:
                return "YOU_CANT_KICK_YOURSELF";
            case GROUP_ERROR_GROUP_BUSY_CANT_JOIN:
                return "GROUP_BUSY_CANT_JOIN";
            case GROUP_ERROR_GROUP_YOU_HAS_PASS_TODAY:
                return "GROUP_YOU_HAS_PASS_TODAY";
            case GROUP_ERROR_GROUP_YOU_HAS_MAX_TIMES:
                return "GROUP_YOU_HAS_MAX_TIMES";
            case GROUP_ERROR_GROUP_YOU_NOT_UNLOCK:
                return "GROUP_YOU_NOT_UNLOCK";

            default:
                return "GroupStatus unknown status =" + status;
        }
    }
}
