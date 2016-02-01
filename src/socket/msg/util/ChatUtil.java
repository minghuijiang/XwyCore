package socket.msg.util;

import socket.msg.chat.req.ChatReq;
import socket.msg.constant.ChatType;
import component.User;

public class ChatUtil {

    public static void sendMsg(int type, int targetId, String content, User user) {
        user.getSocket().sendMessage(new ChatReq(type, targetId, content));
    }

    public static void publicTalk(int id, String content, User user) {
        sendMsg(ChatType.PRIVATE, id, content, user);
    }

    public static void unionTalk(int id, String content, User user) {
        sendMsg(ChatType.GUILD, id, content, user);
    }

    public static void groupTalk(int id, String content, User user) {
        sendMsg(ChatType.GROUP, id, content, user);
    }

    public static void warTalk(int id, String content, User user) {
        sendMsg(ChatType.GUILDWAR, id, content, user);
    }

    public static void horn(int id, String content, User user) {
        sendMsg(ChatType.HORN, id, content, user);
    }

    public static void talk(int id, String content, User user) {
        sendMsg(ChatType.WORLD, id, content, user);
    }
}
