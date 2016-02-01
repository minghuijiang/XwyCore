package socket.msg.constant;

public class Constant {

    public static String changeType(int type) {
        return ChangeType.getMsg(type);
    }

    public static String chatType(int type) {
        return ChatType.getMsg(type);
    }

    public static String gender(int type) {
        return Gender.getMsg(type);
    }

    public static String groupErrorCode(int code) {
        return GroupErrorCode.getMsg(code);
    }

    public static String groupStatus(int status) {
        return GroupStatus.getMsg(status);
    }

    public static String guildWarErrorCode(int code) {
        return GuildWarErrorCode.getMsg(code);
    }

    public static String loginResult(int code) {
        return LoginResult.getMsg(code);
    }

    public static String roomResult(int code) {
        return RoomResult.getMsg(code);
    }

    public static String spellStatus(int status) {
        return SpellStatus.getMsg(status);
    }

    public static String chatStatus(int status) {
        return Status.getMsg(status);
    }

}
