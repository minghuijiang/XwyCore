package socket.msg.register;

import socket.ClientSocket;
import socket.msg.chat.req.ChatChangeWorldReq;
import socket.msg.chat.req.ChatPrivateQueryReq;
import socket.msg.chat.req.ChatReq;
import socket.msg.chat.rsp.Chat;
import socket.msg.chat.rsp.ChatChangeWorldRsp;
import socket.msg.chat.rsp.ChatHornRsp;
import socket.msg.chat.rsp.ChatPrivateQueryRsp;
import socket.msg.chat.rsp.ChatWorldInfoRsp;
import socket.msg.constant.ProtoNotification;
import socket.msg.constant.ProtoType;

public class ChatRegister {

    public static void register() {
        registerC2SProto();
        registerS2CProto();
    }

    public static void registerC2SProto() {
        ClientSocket.registC2SProto(ProtoType.TYPE_CHAT, ProtoType.SUB_CHAT_REQ, ChatReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_CHAT, ProtoType.SUB_CHAT_REQ, ChatReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_CHAT, ProtoType.SUB_CHAT_CHANGE_WOLRD, ChatChangeWorldReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_CHAT, ProtoType.SUB_CHAT_PRIVATE_QUERY_REQ, ChatPrivateQueryReq.class);
    }

    public static void registerS2CProto() {
        ClientSocket.registS2CProto(ProtoNotification.CHAT_MSG, ProtoType.TYPE_CHAT, ProtoType.SUB_CHAT, Chat.class);
        ClientSocket.registS2CProto(ProtoNotification.CHAT_FIND_ID_RESULT, ProtoType.TYPE_CHAT, ProtoType.MSG_S2C_SUBTYPE_CHAT_PRIVATE_QUERY_RESULT, ChatPrivateQueryRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.RECEVIE_CHAT_WORLD_INFO, ProtoType.TYPE_CHAT, ProtoType.MSG_S2C_SUBTYPE_CHAT_WORLD_INFO, ChatWorldInfoRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.CHAT_CHANGE_WORLD, ProtoType.TYPE_CHAT, ProtoType.MSG_S2C_SUBTYPE_CHAT_CHANGE_WORLD, ChatChangeWorldRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.CHAT_HORN_INFO, ProtoType.TYPE_CHAT, ProtoType.MSG_S2C_SUBTYPE_CHAT_HORN_COUNTDOWN, ChatHornRsp.class);
    }

}
