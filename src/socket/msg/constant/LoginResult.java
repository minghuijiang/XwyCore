package socket.msg.constant;

public class LoginResult {

    public static final int SUCCESS = 0;
    public static final int WRONG = 1;
    public static final int DUPLICATE_LOGIN = 2;

    public static String getMsg(int code) {
        switch (code) {
            case SUCCESS:
                return "成功";
            case WRONG:
                return "失败";
            case DUPLICATE_LOGIN:
                return "重复登录";
            default:
                return "LoginResult unknown code = " + code;
        }
    }
}
