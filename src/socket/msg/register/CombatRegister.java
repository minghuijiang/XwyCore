package socket.msg.register;

import socket.ClientSocket;
import socket.msg.combat.req.AIReq;
import socket.msg.combat.req.CombatQuitReq;
import socket.msg.combat.req.EnterDungeonReq;
import socket.msg.combat.req.InstantWinReq;
import socket.msg.combat.req.PerformOkReq;
import socket.msg.combat.req.ReadToStartReq;
import socket.msg.combat.req.SkipCombatReq;
import socket.msg.combat.req.SpellCastPrepareReq;
import socket.msg.combat.req.SpellCastReq;
import socket.msg.combat.req.StartCombatReq;
import socket.msg.combat.req.YunJiebiaoSurrenderSkipReq;
import socket.msg.combat.rsp.AuraRemoveRsp;
import socket.msg.combat.rsp.AuraTickRsp;
import socket.msg.combat.rsp.BossChangeRsp;
import socket.msg.combat.rsp.CombatInfoRsp;
import socket.msg.combat.rsp.CombatPrizeRsp;
import socket.msg.combat.rsp.CombatResultRsp;
import socket.msg.combat.rsp.CombatTimeRsp;
import socket.msg.combat.rsp.PowerChangeRsp;
import socket.msg.combat.rsp.SpellCastRsp;
import socket.msg.constant.ProtoNotification;
import socket.msg.constant.ProtoType;
import socket.msg.system.NullMessage;

public class CombatRegister {

    public static void register() {
        registerC2SProto();
        registerS2CProto();
    }

    public static void registerC2SProto() {
        ClientSocket.registC2SProto(ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_ENTER_DUNGEON_REQ, EnterDungeonReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_START_REQ, StartCombatReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_SPELL_CAST_REQ, SpellCastReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_PERFORM_OK_REQ, PerformOkReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_AI_REQ, AIReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_READY_TO_START_REQ, ReadToStartReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_QUIT_REQ, CombatQuitReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_SPELL_PREPARE_REQ, SpellCastPrepareReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_COMBAT, ProtoType.MSG_C2S_SUBTYPE_COMBAT_YUNBIAO_SURRENDER, YunJiebiaoSurrenderSkipReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_COMBAT, ProtoType.MSG_C2S_SUBTYPE_COMBAT_INSTANT_WIN, InstantWinReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_COMBAT, ProtoType.MSG_C2S_SUBTYPE_COMBAT_SKIP, SkipCombatReq.class);
    }

    public static void registerS2CProto() {
        ClientSocket.registS2CProto(ProtoNotification.COMBAT_SPELL_CAST, ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_SPELL_CAST, SpellCastRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.COMBAT_AURA_REMOVE, ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_AURA_REMOVE, AuraRemoveRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.COMBAT_AURA_TICK, ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_AURA_TICK, AuraTickRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.COMBAT_POWER_CHANGE, ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_POWER_CHANGED, PowerChangeRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.COMBAT_RESULT, ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_PRIZE, CombatPrizeRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.COMBAT_START_NOTIFY, ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_START_NOTIFY, NullMessage.class);
        ClientSocket.registS2CProto(ProtoNotification.COMBAT_OVER, ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT__OVER, CombatResultRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.COMBAT_TIMESTAMP, ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_TIMESTAMP, CombatTimeRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.COMBAT_BOSS_CHANGE, ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_NEXT_CREATURE_GROUP, BossChangeRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.COMBAT_INFO_SYNC, ProtoType.TYPE_COMBAT, ProtoType.MSG_S2C_SUBTYPE_COMBAT_INFO, CombatInfoRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.COMBAT_DEAD_FIGHT, ProtoType.TYPE_COMBAT, ProtoType.MSG_S2C_SUBTYPE_COMBAT_DOUBLE_ATTACK, NullMessage.class);
    }
}
