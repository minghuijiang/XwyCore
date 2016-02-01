package socket.msg.register;

import socket.ClientSocket;
import socket.msg.constant.ProtoNotification;
import socket.msg.constant.ProtoType;
import socket.msg.system.LoginAck;
import socket.msg.system.LoginReq;
import socket.msg.system.NullMessage;
import socket.msg.system.PingReq;

public class EtcRegister {

    public static void register() {
        registerC2SProto();
        registerS2CProto();
    }

    public static void registerC2SProto() {
        ClientSocket.registC2SProto(ProtoType.TYPE_AUTH, ProtoType.SUB_AUTH_REQ, LoginReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_MISC, ProtoType.SUB_MISC_PING, PingReq.class);
    }

    public static void registerS2CProto() {
        ClientSocket.registS2CProto(ProtoNotification.AUTH_RESULT, ProtoType.TYPE_AUTH, ProtoType.SUB_AUTH, LoginAck.class);
        ClientSocket.registS2CProto(ProtoNotification.OTHER_LOGIN, ProtoType.TYPE_AUTH, ProtoType.SUB_OTHER_LOGIN, NullMessage.class);
        ClientSocket.registS2CProto(ProtoNotification.SPA_OPEN, ProtoType.TYPE_SYSTEM, ProtoType.SUB_SYSTEM_SPA_OPEN, NullMessage.class);
        ClientSocket.registS2CProto(ProtoNotification.SPA_CLOSE, ProtoType.TYPE_SYSTEM, ProtoType.SUB_SYSTEM_SPA_CLOSE, NullMessage.class);

    }
}
