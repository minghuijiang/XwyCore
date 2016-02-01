package socket.msg.register;

import socket.ClientSocket;
import socket.msg.constant.ProtoNotification;
import socket.msg.constant.ProtoType;
import socket.msg.spa.req.EnhanceWater;
import socket.msg.spa.req.EnterGuildSpaReq;
import socket.msg.spa.req.EnterRoomReq;
import socket.msg.spa.req.JoinRandomReq;
import socket.msg.spa.req.LeaveRoomReq;
import socket.msg.spa.req.MoveReq;
import socket.msg.spa.req.RoomListReq;
import socket.msg.spa.req.SearchRoomReq;
import socket.msg.spa.rsp.EnterRoomNotice;
import socket.msg.spa.rsp.EnterRoomResult;
import socket.msg.spa.rsp.LeaveRoom;
import socket.msg.spa.rsp.MoveList;
import socket.msg.spa.rsp.Reputation;
import socket.msg.spa.rsp.RoomList;
import socket.msg.spa.rsp.SearchRoomResult;
import socket.msg.spa.rsp.Strength;
import socket.msg.spa.rsp.StrengthReputationChange;
import socket.msg.spa.rsp.WaterEnhanceResult;
import socket.msg.spa.rsp.WaterEnhancedInfo;
import socket.msg.system.NullMessage;

public class SpaRegister {

    public static void register() {
        registerC2SProto();
        registerS2CProto();
    }

    public static void registerC2SProto() {
        ClientSocket.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_ENTER_REQ, EnterRoomReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_LEAVE_REQ, LeaveRoomReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_MOVE_REQ, MoveReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_FASTJOIN_REQ, JoinRandomReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_SEARCH_REQ, SearchRoomReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_LIST_REQ, RoomListReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_ENHANCE_REQ, EnhanceWater.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.SUB_ENTER_GUILD_SPA, EnterGuildSpaReq.class);
    }

    public static void registerS2CProto() {
        ClientSocket.registS2CProto(ProtoNotification.ROOM_ENTER, ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_ENTER, EnterRoomNotice.class);
        ClientSocket.registS2CProto(ProtoNotification.ROOM_LEAVE, ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_LEAVE, LeaveRoom.class);
        ClientSocket.registS2CProto(ProtoNotification.ROOM_MOVE, ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_MOVE, MoveList.class);
        ClientSocket.registS2CProto(ProtoNotification.ROOM_ENTER_RESULT, ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_ENTER_RESULT, EnterRoomResult.class);
        ClientSocket.registS2CProto(ProtoNotification.ROOM_SEARCH, ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_SEARCH_RESULT, SearchRoomResult.class);
        ClientSocket.registS2CProto(ProtoNotification.ROOM_LIST, ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_LIST_RESULT, RoomList.class);
        ClientSocket.registS2CProto(ProtoNotification.ENHANCE_RESULT, ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_ENHANCE_RESULT, WaterEnhanceResult.class);
        ClientSocket.registS2CProto(ProtoNotification.ENHANCE_WATER_BROADCAST, ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_ENHANCE_WATER_BROADCAST, WaterEnhancedInfo.class);
        ClientSocket.registS2CProto(ProtoNotification.ENHANCE_STOP_BROADCAST, ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_ENHANCE_STOP_BROADCAST, NullMessage.class);
        ClientSocket.registS2CProto(ProtoNotification.USER_EN_RESULT, ProtoType.TYPE_ROOM, ProtoType.SUB_USER_EN_RESULT, Strength.class);
        ClientSocket.registS2CProto(ProtoNotification.C_DATA_CHANGE, ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_LEAVE_RESULT, StrengthReputationChange.class);
        ClientSocket.registS2CProto(ProtoNotification.USER_RN_RESULT, ProtoType.TYPE_ROOM, ProtoType.SUB_USER_RN_RESULT, Reputation.class);
    }
}
