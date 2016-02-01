package socket.msg.register;

import socket.ClientSocket;
import socket.msg.constant.ProtoNotification;
import socket.msg.constant.ProtoType;
import socket.msg.system.NullMessage;
import socket.msg.war.req.GuildMoveReq;
import socket.msg.war.req.GuildReCloseEmpReq;
import socket.msg.war.req.GuildReEncourageAllEmpReq;
import socket.msg.war.req.GuildReEncourageSingleEmpReq;
import socket.msg.war.req.GuildReEnterEmpReq;
import socket.msg.war.req.GuildReFinalListEmpReq;
import socket.msg.war.req.GuildReInfoEmpReq;
import socket.msg.war.req.GuildReLeaveEmpReq;
import socket.msg.war.req.GuildReLoadingCombatFinishedEmpReq;
import socket.msg.war.req.GuildReNextRoundEmpReq;
import socket.msg.war.req.GuildReOppositeEmpReq;
import socket.msg.war.req.GuildReQuerySignEmpReq;
import socket.msg.war.req.GuildReSignEmpReq;
import socket.msg.war.req.GuildWarStartTime;
import socket.msg.war.rsp.GuildWarEncourageInfoRsp;
import socket.msg.war.rsp.GuildWarEndRoundRsp;
import socket.msg.war.rsp.GuildWarErrorRsp;
import socket.msg.war.rsp.GuildWarFightPlayerInfo;
import socket.msg.war.rsp.GuildWarFinalList;
import socket.msg.war.rsp.GuildWarIdRsp;
import socket.msg.war.rsp.GuildWarInfoRsp;
import socket.msg.war.rsp.GuildWarOppositeRsp;
import socket.msg.war.rsp.GuildWarQueryInfoResultRsp;
import socket.msg.war.rsp.GuildWarResultRsp;
import socket.msg.war.rsp.GuildWarRoundResult;
import socket.msg.war.rsp.GuildWarStartRoundRsp;
import socket.msg.war.rsp.GuildWarStatusUpdateRsp;
import socket.msg.war.rsp.MoveInfo;
import socket.msg.war.rsp.WarriorInfo;

public class WarRegister {

    public static void register() {
        registerC2SProto();
        registerS2CProto();
    }

    public static void registerC2SProto() {
        ClientSocket.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_SIGN_REQ, GuildReSignEmpReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_QUERY_SIGN_REQ, GuildReQuerySignEmpReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_ENTER_REQ, GuildReEnterEmpReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_LEAVE_REQ, GuildReLeaveEmpReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_INFO_REQ, GuildReInfoEmpReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_MOVE_REQ, GuildMoveReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_LOADING_COMBAT_FINISHED_REQ, GuildReLoadingCombatFinishedEmpReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_ENCOURAGE_SINGLE_REQ, GuildReEncourageSingleEmpReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_ENCOURAGE_ALL_REQ, GuildReEncourageAllEmpReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_OPPOSITE_REQ, GuildReOppositeEmpReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_FINAL_LIST_REQ, GuildReFinalListEmpReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_OPEN, GuildWarStartTime.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_CLOSE, GuildReCloseEmpReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_NEXT_ROUND, GuildReNextRoundEmpReq.class);
    }

    public static void registerS2CProto() {
        ClientSocket.registS2CProto(ProtoNotification.GUILD_WAR_SIGN_RESULT, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_SIGN_RESULT, GuildWarResultRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.GUILD_WAR_QUERY_INFO_RESULT, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_QUERY_INFO_RESULT, GuildWarQueryInfoResultRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.GUILD_WAR_INFO, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_INFO, GuildWarInfoRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.GUILD_WAR_ENTER, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_ENTER, WarriorInfo.class);
        ClientSocket.registS2CProto(ProtoNotification.GUILD_WAR_LEAVE, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_LEAVE, GuildWarIdRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.GUILD_WAR_DEATH, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_DEATH, GuildWarIdRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.GUILD_WAR_PREPARE_START, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_PREPARE_START, GuildWarFightPlayerInfo.class);
        ClientSocket.registS2CProto(ProtoNotification.GUILD_WAR_MOVE, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_MOVE, MoveInfo.class);
        ClientSocket.registS2CProto(ProtoNotification.GUILD_WAR_ENTER_RESULT, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_ENTER_RESULT, GuildWarResultRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.GUILD_WAR_ROUND_START, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_ROUND_START, GuildWarStartRoundRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.GUILD_WAR_ROUND_END, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_ROUND_END, GuildWarEndRoundRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.GUILD_WAR_OPPOSITE_NULL, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_OPPOSITE_NULL, NullMessage.class);
        ClientSocket.registS2CProto(ProtoNotification.GUILD_WAR_CLOSE, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_CLOSE, NullMessage.class);
        ClientSocket.registS2CProto(ProtoNotification.GUILD_WAR_STATUS_UPDATE, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_STATUS_UPDATE, GuildWarStatusUpdateRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.GUILD_WAR_RESULT, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_RESULT, GuildWarRoundResult.class);
        ClientSocket.registS2CProto(ProtoNotification.GUILD_WAR_OPPOSITE, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_OPPOSITE, GuildWarOppositeRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.GUILD_WAR_FINAL_LIST, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_FINAL_LIST, GuildWarFinalList.class);
        ClientSocket.registS2CProto(ProtoNotification.GUILD_WAR_ENCOURAGE_ALL_UPDATE, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_ENCOURAGE_ALL_UPDATE, GuildWarEncourageInfoRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.GUILD_WAR_ENCOURAGE_SINGLE_UPDATE, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_ENCOURAGE_SINGLE_UPDATE, GuildWarEncourageInfoRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.GUILD_WAR_ERROR_CODE, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_ERROR_CODE, GuildWarErrorRsp.class);
    }
}
