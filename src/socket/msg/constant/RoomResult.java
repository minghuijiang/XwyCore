package socket.msg.constant;

public class RoomResult {

    public static final int SUCCESS = 0;
    public static final int NOT_EXIST = 1;
    public static final int FULL = 2;
    public static final int FAIL = 3;

    public static String getMsg(int code) {
        switch (code) {
            case SUCCESS:
                return "成功";
            case NOT_EXIST:
                return "不存在";
            case FULL:
                return "已满";
            case FAIL:
                return "失败";
            default:
                return "RoomResult unknown code = " + code;
        }
    }
}
