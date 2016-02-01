package socket.msg.constant;

public class Status {

    public static final int RIGHT = 0;
    public static final int TOO_FREQUENT = 1;
    public static final int USER_OFFLINE = 2;
    public static final int NOT_IN_ROOM = 3;
    public static final int BANNED = 4;

    public static String getMsg(int status) {
        switch (status) {
            case RIGHT:
                return "成功";
            case TOO_FREQUENT:
                return "发送太频繁";
            case USER_OFFLINE:
                return "用户已掉线";
            case NOT_IN_ROOM:
                return "不在房间内";
            case BANNED:
                return "被禁封";
            default:
                return "Status unknwon status= " + status;
        }
    }
}
