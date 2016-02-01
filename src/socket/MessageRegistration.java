package socket;

import com.mingJiang.util.FileUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import message.FightMsg;
import socket.msg.basic.Message;
import socket.msg.combat.req.AIReq;
import socket.msg.combat.req.EnterDungeonReq;
import socket.msg.combat.req.StartCombatReq;
import socket.msg.register.ChatRegister;
import socket.msg.register.CombatRegister;
import socket.msg.register.EtcRegister;
import socket.msg.register.GroupRegister;
import socket.msg.register.SpaRegister;
import socket.msg.register.WarRegister;
import socket.util.ByteArray;

import com.mingJiang.util.Util;
import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;

import component.User;
import java.util.logging.Level;
import java.util.logging.Logger;
import socket.msg.register.QARegister;

public class MessageRegistration {

    public static ArrayList<String> create(String fileName) {
        ArrayList<String> data = new ArrayList<String>();
        data.add("package socket.msg;");
        data.add("");
        data.add("import java.nio.ByteBuffer;");
        data.add("import socket.object.WritingBuffer;");
        data.add("");
        data.add("public class " + fileName + " extends socket.object.Message {");
        data.add("");
        data.add("\t@Override");
        data.add("\tpublic void readFromSlice(ByteBuffer buff, int limit) {");
        data.add("\t\t// TODO Auto-generated method stub");
        data.add("\t\t");
        data.add("\t}");
        data.add("");
        data.add("\t@Override");
        data.add("\tpublic void writeToBuffer(WritingBuffer buff) {");
        data.add("\t\t// TODO Auto-generated method stub");
        data.add("\t\t");
        data.add("\t}");
        data.add("");
        data.add("}");
        return data;

    }

    public static List<File> getFile(File root) {
        List<File> tmp = new ArrayList<File>();
        for (File f : root.listFiles()) {
            if (f.isDirectory()) {
                tmp.addAll(getFile(f));
            } else {
                tmp.add(f);
            }
        }
        return tmp;
    }

    public static void modify() {
        List<File> files = getFile(new File("./src/socket/msg/"));

        Hashtable<String, String> replace = new Hashtable<String, String>();

        replace.put("private",
                "public");
        for (File f : files) {
            try {
                boolean needChange = false;
                List<String> data = FileUtil.readFrom(f.getAbsolutePath());
                for (int i = 0; i < data.size(); i++) {
                    String s = data.get(i);
                    for (String key : replace.keySet()) {
                        if (s.contains(key)) {
                            System.out.println(f + " contain");
                            needChange = true;
                            s = s.replace(key, replace.get(key));
                            data.set(i, s);
                            //break;
                        }
                    }
                    
                }
                if (needChange) {
                    FileUtil.writeTo(f.getAbsolutePath(), data);
                }
            } catch (IOException ex) {
                Logger.getLogger(MessageRegistration.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void create(ArrayList<String> classNeed) {
        for (String s : classNeed) {
            String[] names = s.split(",");
            String name = names[names.length - 1].replace(");", "").trim();
		//	System.out.println(name);
            //if(name.endsWith("Rsp"))
            System.out.println(name);
            FileUtil.writeTo("src/socket/msg/" + name + ".java", create(name));
			//else
            //	System.out.println(name);
        }
    }

    public static void read(byte[] data, Message msg) {
        msg.mergeFrom(new ByteArray(data));
    }

    public static void main(String[] args) {
        byte peer0_10[] = {
            0x0a, 0x14, 0x38,
            0x30, 0x35, 0x34, 0x39, 0x33, 0x5f, 0x35, 0x32,
            0x38, 0x35, 0x39, 0x32, 0x66, 0x66, 0x36, 0x62,
            0x32, 0x33, 0x61, 0x10, (byte) 0x90, 0x4e, 0x18, 0x0a};
        read(peer0_10, new EnterDungeonReq("", 0, 0));
    }

    /*public static void mains(String[] args) throws IOException, InterruptedException, JSONException{
     modify();
     System.exit(0);
     //regist();

     User user = new User("http://app100645087.qzone.qzoneapp.com/?qz_height=1400&openid=6DB4115F712DB36C56BB1AF1CB031A41&openkey=48A50F83B9E78B79DB52AC17AD7ADA61&pf=qzone&pfkey=acdc965600f2026b0352d8e14beb2360&qz_ver=6&appcanvas=1&params="
     ,true);
     user.login();
     ClientSocket socket = user.getSocket();
     Thread.sleep(2000);
     String result = FightMsg.fight(user, 0, 101, 0);
     String fightId= new Json(result).getJson("data").getString("fightid");
     //{"froleid":0,"fighttype":0,"mapcfgid":100}
     System.out.println(fightId);
     socket.sendMessage(new EnterDungeonReq(fightId,0,100));
     socket.sendMessage(new StartCombatReq(fightId,100,0,0,0));
     socket.sendMessage(new AIReq(true));
     //	socket.sendMessage(new StartCombatReq("0",100,0,0,0));
     for(int i =1;i<=200;i++)
     socket.sendMessage(new SearchRoomReq(i));
     //socket.sendMessage(new ChatReq(ChatType.PRIVATE, 823942, "UZ 傻逼"));

     }*/
    public static void regist() {
        SpaRegister.register();
        ChatRegister.register();
        CombatRegister.register();
        EtcRegister.register();
        GroupRegister.register();
        WarRegister.register();
        QARegister.register();
    }
    /**
     * socket.registC2SProto(ProtoType.TYPE_AUTH, ProtoType.SUB_AUTH_REQ, LoginReq);
            socket.registC2SProto(ProtoType.TYPE_CHAT, ProtoType.SUB_CHAT_REQ, ChatReq);
            socket.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_ENTER_REQ, EnterRoomReq);
            socket.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_LEAVE_REQ, LeaveRoomReq);
            socket.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_MOVE_REQ, MoveReq);
            socket.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_FASTJOIN_REQ, JoinRandomReq);
            socket.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_SEARCH_REQ, SearchRoomReq);
            socket.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_LIST_REQ, RoomListReq);
            socket.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_ENHANCE_REQ, EnhanceWater);
            socket.registC2SProto(ProtoType.TYPE_MISC, ProtoType.SUB_MISC_PING, PingReq);
            socket.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.SUB_ENTER_GUILD_SPA, EnterGuildSpaReq);
            socket.registC2SProto(ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_ENTER_DUNGEON_REQ, EnterDungeonReq);
            socket.registC2SProto(ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_START_REQ, StartCombatReq);
            socket.registC2SProto(ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_SPELL_CAST_REQ, SpellCastReq);
            socket.registC2SProto(ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_PERFORM_OK_REQ, PerformOkReq);
            socket.registC2SProto(ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_AI_REQ, AIReq);
            socket.registC2SProto(ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_READY_TO_START_REQ, ReadToStartReq);
            socket.registC2SProto(ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_QUIT_REQ, CombatQuitReq);
            socket.registC2SProto(ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_SPELL_PREPARE_REQ, SpellCastPrepareReq);
            socket.registC2SProto(ProtoType.TYPE_COMBAT, ProtoType.MSG_C2S_SUBTYPE_COMBAT_YUNBIAO_SURRENDER, YunJiebiaoSurrenderSkipReq);
            socket.registC2SProto(ProtoType.TYPE_COMBAT, ProtoType.MSG_C2S_SUBTYPE_COMBAT_INSTANT_WIN, InstantWinReq);
            socket.registC2SProto(ProtoType.TYPE_COMBAT, ProtoType.MSG_C2S_SUBTYPE_COMBAT_SKIP, SkipCombatReq);
            socket.registS2CProto(ProtoNotification.AUTH_RESULT, ProtoType.TYPE_AUTH, ProtoType.SUB_AUTH, LoginAck);
            socket.registS2CProto(ProtoNotification.OTHER_LOGIN, ProtoType.TYPE_AUTH, ProtoType.SUB_OTHER_LOGIN, null);
            socket.registS2CProto(ProtoNotification.CHAT_MSG, ProtoType.TYPE_CHAT, ProtoType.SUB_CHAT, Chat);
            socket.registS2CProto(ProtoNotification.CHAT_FIND_ID_RESULT, ProtoType.TYPE_CHAT, ProtoType.MSG_S2C_SUBTYPE_CHAT_PRIVATE_QUERY_RESULT, ChatPrivateQueryRsp);
            socket.registS2CProto(ProtoNotification.RECEVIE_CHAT_WORLD_INFO, ProtoType.TYPE_CHAT, ProtoType.MSG_S2C_SUBTYPE_CHAT_WORLD_INFO, ChatWorldInfoRsp);
            socket.registS2CProto(ProtoNotification.CHAT_CHANGE_WORLD, ProtoType.TYPE_CHAT, ProtoType.MSG_S2C_SUBTYPE_CHAT_CHANGE_WORLD, ChatChangeWorldRsp);
            socket.registS2CProto(ProtoNotification.CHAT_HORN_INFO, ProtoType.TYPE_CHAT, ProtoType.MSG_S2C_SUBTYPE_CHAT_HORN_COUNTDOWN, ChatHornRsp);
            socket.registC2SProto(ProtoType.TYPE_CHAT, ProtoType.SUB_CHAT_REQ, ChatReq);
            socket.registC2SProto(ProtoType.TYPE_CHAT, ProtoType.SUB_CHAT_CHANGE_WOLRD, ChatChangeWorldReq);
            socket.registC2SProto(ProtoType.TYPE_CHAT, ProtoType.SUB_CHAT_PRIVATE_QUERY_REQ, ChatPrivateQueryReq);
            socket.registS2CProto(ProtoNotification.ROOM_ENTER, ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_ENTER, EnterRoomNotice);
            socket.registS2CProto(ProtoNotification.ROOM_LEAVE, ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_LEAVE, LeaveRoom);
            socket.registS2CProto(ProtoNotification.ROOM_MOVE, ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_MOVE, MoveList);
            socket.registS2CProto(ProtoNotification.ROOM_ENTER_RESULT, ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_ENTER_RESULT, EnterRoomResult);
            socket.registS2CProto(ProtoNotification.ROOM_SEARCH, ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_SEARCH_RESULT, SearchRoomResult);
            socket.registS2CProto(ProtoNotification.ROOM_LIST, ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_LIST_RESULT, RoomList);
            socket.registS2CProto(ProtoNotification.ENHANCE_RESULT, ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_ENHANCE_RESULT, WaterEnhanceResult);
            socket.registS2CProto(ProtoNotification.ENHANCE_WATER_BROADCAST, ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_ENHANCE_WATER_BROADCAST, WaterEnhancedInfo);
            socket.registS2CProto(ProtoNotification.ENHANCE_STOP_BROADCAST, ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_ENHANCE_STOP_BROADCAST, null);
            socket.registS2CProto(ProtoNotification.USER_EN_RESULT, ProtoType.TYPE_ROOM, ProtoType.SUB_USER_EN_RESULT, Strength);
            socket.registS2CProto(ProtoNotification.C_DATA_CHANGE, ProtoType.TYPE_ROOM, ProtoType.SUB_ROOM_LEAVE_RESULT, StrengthReputationChange);
            socket.registS2CProto(ProtoNotification.USER_RN_RESULT, ProtoType.TYPE_ROOM, ProtoType.SUB_USER_RN_RESULT, Reputation);
            socket.registS2CProto(ProtoNotification.SPA_OPEN, ProtoType.TYPE_SYSTEM, ProtoType.SUB_SYSTEM_SPA_OPEN, null);
            socket.registS2CProto(ProtoNotification.SPA_CLOSE, ProtoType.TYPE_SYSTEM, ProtoType.SUB_SYSTEM_SPA_CLOSE, null);
            socket.registS2CProto(ProtoNotification.COMBAT_SPELL_CAST, ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_SPELL_CAST, SpellCastRsp);
            socket.registS2CProto(ProtoNotification.COMBAT_AURA_REMOVE, ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_AURA_REMOVE, AuraRemoveRsp);
            socket.registS2CProto(ProtoNotification.COMBAT_AURA_TICK, ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_AURA_TICK, AuraTickRsp);
            socket.registS2CProto(ProtoNotification.COMBAT_POWER_CHANGE, ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_POWER_CHANGED, PowerChangeRsp);
            socket.registS2CProto(ProtoNotification.COMBAT_RESULT, ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_PRIZE, CombatPrizeRsp);
            socket.registS2CProto(ProtoNotification.COMBAT_START_NOTIFY, ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_START_NOTIFY, null);
            socket.registS2CProto(ProtoNotification.COMBAT_OVER, ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT__OVER, CombatResultRsp);
            socket.registS2CProto(ProtoNotification.COMBAT_TIMESTAMP, ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_TIMESTAMP, CombatTimeRsp);
            socket.registS2CProto(ProtoNotification.COMBAT_BOSS_CHANGE, ProtoType.TYPE_COMBAT, ProtoType.SUB_COMBAT_NEXT_CREATURE_GROUP, BossChangeRsp);
            socket.registS2CProto(ProtoNotification.COMBAT_INFO_SYNC, ProtoType.TYPE_COMBAT, ProtoType.MSG_S2C_SUBTYPE_COMBAT_INFO, CombatInfoRsp);
            socket.registS2CProto(ProtoNotification.COMBAT_DEAD_FIGHT, ProtoType.TYPE_COMBAT, ProtoType.MSG_S2C_SUBTYPE_COMBAT_DOUBLE_ATTACK, null);
            socket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_CREATE, GroupCreateReq);
            socket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_LIST, GroupListReq);
            socket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_INVITE, GroupInviteReq);
            socket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_INVITE_REPLY, GroupInviteReplyReq);
            socket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_SET_PASSWD, GroupSetPasswordReq);
            socket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_SET_POS, GroupSetPosReq);
            socket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_APPLY_JOIN, GroupJoinReq);
            socket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_KICK, GroupKickReq);
            socket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_LEAVE, GroupLeaveReq);
            socket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_SET_HERO, GroupSelectHero);
            socket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_QUICK_JOIN, GroupQuickJoinReq);
            socket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_READY, GroupReadyReq);
            socket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_LOADING_FINISHED, GroupLoadingFinishedReq);
            socket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_PASSED_MAP_REQ, GroupPassedMapReq);
            socket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_LOADING_COMBAT_FINISHED_REQ, GroupLoadingCombatFinishedReq);
            socket.registC2SProto(ProtoType.TYPE_GROUP, ProtoType.GROUP_RE_BROADCAST, GroupBroadcastReq);
            socket.registS2CProto(ProtoNotification.GROUP_ERROR_CODE, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_ERROR_CODE, GroupErrorCodeRsp);
            socket.registS2CProto(ProtoNotification.GROUP_LIST_ACK, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_LIST_ACK, GroupListRsp);
            socket.registS2CProto(ProtoNotification.GROUP_INVITE_NOTIFY, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_INVITE_NOTIFY, GroupInviteNotifyRsp);
            socket.registS2CProto(ProtoNotification.GROUP_INFO_UPDATE, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_INFO_UPDATE, GroupMemberInfoUpdate);
            socket.registS2CProto(ProtoNotification.GROUP_KICK_NOTIFY, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_KICK_NOTIFY, GroupKickRsp);
            socket.registS2CProto(ProtoNotification.GROUP_SOMEONE_APPLY_LEADER, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_SOMEONE_APPLY_LEADER, null);
            socket.registS2CProto(ProtoNotification.GROUP_DECLINE_INVITATION_NOTIFY, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_DECLINE_INVITATION_NOTIFY, GroupInviteDeclineNotifyRsp);
            socket.registS2CProto(ProtoNotification.GROUP_KICK_COUNT_DOWN, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_KICK_COUNT_DOWN, GroupCountDownRsp);
            socket.registS2CProto(ProtoNotification.GROUP_START_COMBAT, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_START_COMBAT, GroupStartCombatInfoRsp);
            socket.registS2CProto(ProtoNotification.GROUP_CREATE_RESULT, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_CREATE_RESULT, GroupCreateRsp);
            socket.registS2CProto(ProtoNotification.GROUP_JOIN_SUCCESS, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_JOIN_SUCCESS, GroupInfo);
            socket.registS2CProto(ProtoNotification.GROUP_LEAVE, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_LEAVE, GroupLeaveRsp);
            socket.registS2CProto(ProtoNotification.GROUP_PASSED_MAP, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_PASSED_MAP, GroupPassedMapRsp);
            socket.registS2CProto(ProtoNotification.GROUP_LOADING_STATUS, ProtoType.TYPE_GROUP, ProtoType.GROUP_RT_LOADING_STATUS, GroupMemberLoadingStatusRsp);
            
            param1.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_SIGN_REQ, GuildReSignEmpReq);
            param1.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_QUERY_SIGN_REQ, GuildReQuerySignEmpReq);
            param1.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_ENTER_REQ, GuildReEnterEmpReq);
            param1.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_LEAVE_REQ, GuildReLeaveEmpReq);
            param1.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_INFO_REQ, GuildReInfoEmpReq);
            param1.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_MOVE_REQ, GuildMoveReq);
            param1.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_LOADING_COMBAT_FINISHED_REQ, GuildReLoadingCombatFinishedEmpReq);
            param1.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_ENCOURAGE_SINGLE_REQ, GuildReEncourageSingleEmpReq);
            param1.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_ENCOURAGE_ALL_REQ, GuildReEncourageAllEmpReq);
            param1.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_OPPOSITE_REQ, GuildReOppositeEmpReq);
            param1.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_FINAL_LIST_REQ, GuildReFinalListEmpReq);
            param1.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_OPEN, GuildWarStartTime);
            param1.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_CLOSE, GuildReCloseEmpReq);
            param1.registC2SProto(ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_RE_NEXT_ROUND, GuildReNextRoundEmpReq);
            param1.registS2CProto(ProtoNotification.GUILD_WAR_SIGN_RESULT, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_SIGN_RESULT, GuildWarResultRsp);
            param1.registS2CProto(ProtoNotification.GUILD_WAR_QUERY_INFO_RESULT, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_QUERY_INFO_RESULT, GuildWarQueryInfoResultRsp);
            param1.registS2CProto(ProtoNotification.GUILD_WAR_INFO, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_INFO, GuildWarInfoRsp);
            param1.registS2CProto(ProtoNotification.GUILD_WAR_ENTER, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_ENTER, WarriorInfo);
            param1.registS2CProto(ProtoNotification.GUILD_WAR_LEAVE, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_LEAVE, GuildWarIdRsp);
            param1.registS2CProto(ProtoNotification.GUILD_WAR_DEATH, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_DEATH, GuildWarIdRsp);
            param1.registS2CProto(ProtoNotification.GUILD_WAR_PREPARE_START, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_PREPARE_START, GuildWarFightPlayerInfo);
            param1.registS2CProto(ProtoNotification.GUILD_WAR_MOVE, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_MOVE, MoveInfo);
            param1.registS2CProto(ProtoNotification.GUILD_WAR_ENTER_RESULT, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_ENTER_RESULT, GuildWarResultRsp);
            param1.registS2CProto(ProtoNotification.GUILD_WAR_ROUND_START, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_ROUND_START, GuildWarStartRoundRsp);
            param1.registS2CProto(ProtoNotification.GUILD_WAR_ROUND_END, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_ROUND_END, GuildWarEndRoundRsp);
            param1.registS2CProto(ProtoNotification.GUILD_WAR_OPPOSITE_NULL, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_OPPOSITE_NULL, null);
            param1.registS2CProto(ProtoNotification.GUILD_WAR_CLOSE, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_CLOSE, null);
            param1.registS2CProto(ProtoNotification.GUILD_WAR_STATUS_UPDATE, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_STATUS_UPDATE, GuildWarStatusUpdateRsp);
            param1.registS2CProto(ProtoNotification.GUILD_WAR_RESULT, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_RESULT, GuildWarRoundResult);
            param1.registS2CProto(ProtoNotification.GUILD_WAR_OPPOSITE, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_OPPOSITE, GuildWarOppositeRsp);
            param1.registS2CProto(ProtoNotification.GUILD_WAR_FINAL_LIST, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_FINAL_LIST, GuildWarFinalList);
            param1.registS2CProto(ProtoNotification.GUILD_WAR_ENCOURAGE_ALL_UPDATE, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_ENCOURAGE_ALL_UPDATE, GuildWarEncourageInfoRsp);
            param1.registS2CProto(ProtoNotification.GUILD_WAR_ENCOURAGE_SINGLE_UPDATE, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_ENCOURAGE_SINGLE_UPDATE, GuildWarEncourageInfoRsp);
            param1.registS2CProto(ProtoNotification.GUILD_WAR_ERROR_CODE, ProtoType.TYPE_GUILDWAR, ProtoType.GUILD_WAR_RT_ERROR_CODE, GuildWarErrorRsp);
            
            * 
            * 
            param1.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.MSG_C2S_SUBTYPE_QA_CHOOSE_REQ, QAChooseReq);
            param1.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.MSG_C2S_SUBTYPE_QA_INTELLIGENT_REQ, QaIntelligentEmpReq);
            param1.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.MSG_C2S_SUBTYPE_QA_ANSWER_ALL, QaAnswerAllEmpReq);
            param1.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.MSG_C2S_SUBTYPE_QA_SET_START, QaSetStartEmpReq);
            param1.registC2SProto(ProtoType.TYPE_MISC, ProtoType.MSG_C2S_SUBTYPE_MISC_ACHIEVE_CHANGE_REQ, MiscAchieveChangeEmpReq);
            param1.registS2CProto(ProtoNotification.QA_CHOOSE, ProtoType.TYPE_ROOM, ProtoType.MSG_S2C_SUBTYPE_QA_CHOOSE, QAChooseRsp);
            param1.registS2CProto(ProtoNotification.QA_ROUND_START, ProtoType.TYPE_ROOM, ProtoType.MSG_S2C_SUBTYPE_QA_ROUND_START, QARoundStartRsp);
            param1.registS2CProto(ProtoNotification.QA_ROUND_END, ProtoType.TYPE_ROOM, ProtoType.MSG_S2C_SUBTYPE_QA_ROUND_END, QARoundEndRsp);
            param1.registS2CProto(ProtoNotification.QA_PRIZE, ProtoType.TYPE_ROOM, ProtoType.MSG_S2C_SUBTYPE_QA_PRIZE, QAPrizeRsp);
            param1.registS2CProto(ProtoNotification.QA_PREPARE, ProtoType.TYPE_ROOM, ProtoType.MSG_S2C_SUBTYPE_QA_PREPARE, QAPrepareTimeRsp);
            param1.registS2CProto(ProtoNotification.QA_AUTO_ANSWER, ProtoType.TYPE_ROOM, ProtoType.MSG_S2C_SUBTYPE_QA_AUTO_ANSWER, QAAutoAnswerRsp);
            
     */
}
