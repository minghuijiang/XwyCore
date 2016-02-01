package socket.msg.constant;

public class ChangeType {

    public static final int SpaAddStrength = 0;
    public static final int SpaEnterNotice = 1;

    public static String getMsg(int type) {
        switch (type) {
            case SpaAddStrength:
                return "增加体力";
            case SpaEnterNotice:
                return "进入温泉";
            default:
                return "ChangeType unknown type = " + type;
        }
    }
}
