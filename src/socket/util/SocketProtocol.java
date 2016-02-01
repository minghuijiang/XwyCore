package socket.util;

public class SocketProtocol {

    public String notification;
    public int type;
    public int subtype;
    public Class<?> msgClass;

    public String toString() {
        return "notification=" + notification + "  type=" + type + "  subtype=" + subtype + " msgClass=" + msgClass;
    }
}
