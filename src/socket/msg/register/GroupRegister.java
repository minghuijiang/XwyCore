package socket.msg.register;

import socket.ClientSocket;
import socket.msg.constant.ProtoNotification;
import socket.msg.constant.ProtoType;
import socket.msg.group.req.GroupBroadcastReq;
import socket.msg.group.req.GroupCreateReq;
import socket.msg.group.req.GroupInviteReplyReq;
import socket.msg.group.req.GroupInviteReq;
import socket.msg.group.req.GroupJoinReq;
import socket.msg.group.req.GroupKickReq;
import socket.msg.group.req.GroupLeaveReq;
import socket.msg.group.req.GroupListReq;
import socket.msg.group.req.GroupLoadingCombatFinishedReq;
import socket.msg.group.req.GroupLoadingFinishedReq;
import socket.msg.group.req.GroupPassedMapReq;
import socket.msg.group.req.GroupQuickJoinReq;
import socket.msg.group.req.GroupReadyReq;
import socket.msg.group.req.GroupSelectHero;
import socket.msg.group.req.GroupSetPasswordReq;
import socket.msg.group.req.GroupSetPosReq;
import socket.msg.group.rsp.GroupCountDownRsp;
import socket.msg.group.rsp.GroupCreateRsp;
import socket.msg.group.rsp.GroupErrorCodeRsp;
import socket.msg.group.rsp.GroupInfo;
import socket.msg.group.rsp.GroupInviteDeclineNotifyRsp;
import socket.msg.group.rsp.GroupInviteNotifyRsp;
import socket.msg.group.rsp.GroupKickRsp;
import socket.msg.group.rsp.GroupLeaveRsp;
import socket.msg.group.rsp.GroupListRsp;
import socket.msg.group.rsp.GroupMemberInfoUpdate;
import socket.msg.group.rsp.GroupMemberLoadingStatusRsp;
import socket.msg.group.rsp.GroupPassedMapRsp;
import socket.msg.group.rsp.GroupStartCombatInfoRsp;
import socket.msg.system.NullMessage;

public class GroupRegister {

    public static void register() {
        registerC2SProto();
        registerS2CProto();
    }

    public static void registerC2SProto() {
        ClientSocket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_CREATE, GroupCreateReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_LIST, GroupListReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_INVITE, GroupInviteReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_INVITE_REPLY, GroupInviteReplyReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_SET_PASSWD, GroupSetPasswordReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_SET_POS, GroupSetPosReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_APPLY_JOIN, GroupJoinReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_KICK, GroupKickReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_LEAVE, GroupLeaveReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_SET_HERO, GroupSelectHero.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_QUICK_JOIN, GroupQuickJoinReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_READY, GroupReadyReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_LOADING_FINISHED, GroupLoadingFinishedReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_PASSED_MAP_REQ, GroupPassedMapReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_LOADING_COMBAT_FINISHED_REQ, GroupLoadingCombatFinishedReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_BROADCAST, GroupBroadcastReq.class);
    }

    public static void registerS2CProto() {
        ClientSocket.registS2CProto(ProtoNotification.GROUP_ERROR_CODE, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_ERROR_CODE, GroupErrorCodeRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.GROUP_LIST_ACK, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_LIST_ACK, GroupListRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.GROUP_INVITE_NOTIFY, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_INVITE_NOTIFY, GroupInviteNotifyRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.GROUP_INFO_UPDATE, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_INFO_UPDATE, GroupMemberInfoUpdate.class);
        ClientSocket.registS2CProto(ProtoNotification.GROUP_KICK_NOTIFY, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_KICK_NOTIFY, GroupKickRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.GROUP_SOMEONE_APPLY_LEADER, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_SOMEONE_APPLY_LEADER, NullMessage.class);
        ClientSocket.registS2CProto(ProtoNotification.GROUP_DECLINE_INVITATION_NOTIFY, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_DECLINE_INVITATION_NOTIFY, GroupInviteDeclineNotifyRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.GROUP_KICK_COUNT_DOWN, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_KICK_COUNT_DOWN, GroupCountDownRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.GROUP_START_COMBAT, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_START_COMBAT, GroupStartCombatInfoRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.GROUP_CREATE_RESULT, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_CREATE_RESULT, GroupCreateRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.GROUP_JOIN_SUCCESS, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_JOIN_SUCCESS, GroupInfo.class);
        ClientSocket.registS2CProto(ProtoNotification.GROUP_LEAVE, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_LEAVE, GroupLeaveRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.GROUP_PASSED_MAP, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_PASSED_MAP, GroupPassedMapRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.GROUP_LOADING_STATUS, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_LOADING_STATUS, GroupMemberLoadingStatusRsp.class);
    }
}
