package socket.msg.constant;

public class Gender {

    public static final int FEMALE = 0;
    public static final int MALE = 1;

    public static String getMsg(int type) {
        switch (type) {
            case FEMALE:
                return "(女)";
            case MALE:
                return "(男)";
            default:
                return "Gender unknown type = " + type;
        }
    }
}
