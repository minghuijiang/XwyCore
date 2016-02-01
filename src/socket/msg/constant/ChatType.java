package socket.msg.constant;

public class ChatType {

    public static final int WORLD = 0;
    public static final int SYSTEM = 1;
    public static final int ROOM = 2;
    public static final int GUILD = 3;
    public static final int SCENE = 4;
    public static final int GROUP = 5;
    public static final int PRIVATE = 6;
    public static final int HORN = 7;
    public static final int SUBWORLD = 8;
    public static final int ARENA = 9;
    public static final int GUILDWAR = 10;

    public static String getMsg(int type) {
        switch (type) {
            case SYSTEM:
                return "系统";
            case ROOM:
                return "房间";
            case GUILD:
                return "帮派";
            case SCENE:
                return "附近";
            case GROUP:
                return "队伍";
            case PRIVATE:
                return "私聊";
            case HORN:
                return "喇叭";
            case SUBWORLD:
                return "世界";
            case ARENA:
                return "擂台";
            case GUILDWAR:
                return "帮战";
            case WORLD:
                return "unknown world";
            default:
                return "ChatType unknown type =" + type;
        }
    }
}
