/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket.msg.register;

import socket.ClientSocket;
import socket.msg.constant.ProtoNotification;
import socket.msg.constant.ProtoType;
import socket.msg.qa.req.MiscAchieveChangeEmpReq;
import socket.msg.qa.req.QaAnswerAllEmpReq;
import socket.msg.qa.req.QaIntelligentEmpReq;
import socket.msg.qa.req.QaSetStartEmpReq;
import socket.msg.qa.rsp.QAAutoAnswerRsp;
import socket.msg.qa.rsp.QAChooseRsp;
import socket.msg.qa.rsp.QAPrepareTimeRsp;
import socket.msg.qa.rsp.QARoundEndRsp;
import socket.msg.qa.rsp.QARoundStartRsp;

/**
 *
 * @author Ming Jiang
 */
public class QARegister {
    /*
     ClientSocket.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.MSG_C2S_SUBTYPE_QA_CHOOSE_REQ, QAChooseReq);
     ClientSocket.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.MSG_C2S_SUBTYPE_QA_INTELLIGENT_REQ, QaIntelligentEmpReq);
     ClientSocket.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.MSG_C2S_SUBTYPE_QA_ANSWER_ALL, QaAnswerAllEmpReq);
     ClientSocket.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.MSG_C2S_SUBTYPE_QA_SET_START, QaSetStartEmpReq);
     ClientSocket.registC2SProto(ProtoType.TYPE_MISC, ProtoType.MSG_C2S_SUBTYPE_MISC_ACHIEVE_CHANGE_REQ, MiscAchieveChangeEmpReq);
     ClientSocket.registS2CProto(ProtoNotification.QA_CHOOSE, ProtoType.TYPE_ROOM, ProtoType.MSG_S2C_SUBTYPE_QA_CHOOSE, QAChooseRsp);
     ClientSocket.registS2CProto(ProtoNotification.QA_ROUND_START, ProtoType.TYPE_ROOM, ProtoType.MSG_S2C_SUBTYPE_QA_ROUND_START, QARoundStartRsp);
     ClientSocket.registS2CProto(ProtoNotification.QA_ROUND_END, ProtoType.TYPE_ROOM, ProtoType.MSG_S2C_SUBTYPE_QA_ROUND_END, QARoundEndRsp);
     ClientSocket.registS2CProto(ProtoNotification.QA_PRIZE, ProtoType.TYPE_ROOM, ProtoType.MSG_S2C_SUBTYPE_QA_PRIZE, QAPrizeRsp);
     ClientSocket.registS2CProto(ProtoNotification.QA_PREPARE, ProtoType.TYPE_ROOM, ProtoType.MSG_S2C_SUBTYPE_QA_PREPARE, QAPrepareTimeRsp);
     ClientSocket.registS2CProto(ProtoNotification.QA_AUTO_ANSWER, ProtoType.TYPE_ROOM, ProtoType.MSG_S2C_SUBTYPE_QA_AUTO_ANSWER, QAAutoAnswerRsp);
            
     */

    public static void register() {
        registerC2SProto();
        registerS2CProto();
    }

    public static void registerC2SProto() {
        ClientSocket.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.MSG_C2S_SUBTYPE_QA_INTELLIGENT_REQ, QaIntelligentEmpReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.MSG_C2S_SUBTYPE_QA_ANSWER_ALL, QaAnswerAllEmpReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_ROOM, ProtoType.MSG_C2S_SUBTYPE_QA_SET_START, QaSetStartEmpReq.class);
        ClientSocket.registC2SProto(ProtoType.TYPE_MISC, ProtoType.MSG_C2S_SUBTYPE_MISC_ACHIEVE_CHANGE_REQ, MiscAchieveChangeEmpReq.class);
    }

    public static void registerS2CProto() {
        ClientSocket.registS2CProto(ProtoNotification.QA_CHOOSE, ProtoType.TYPE_ROOM, ProtoType.MSG_S2C_SUBTYPE_QA_CHOOSE, QAChooseRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.QA_ROUND_START, ProtoType.TYPE_ROOM, ProtoType.MSG_S2C_SUBTYPE_QA_ROUND_START, QARoundStartRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.QA_ROUND_END, ProtoType.TYPE_ROOM, ProtoType.MSG_S2C_SUBTYPE_QA_ROUND_END, QARoundEndRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.QA_PRIZE, ProtoType.TYPE_ROOM, ProtoType.MSG_S2C_SUBTYPE_QA_PRIZE, QAPrizeRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.QA_PREPARE, ProtoType.TYPE_ROOM, ProtoType.MSG_S2C_SUBTYPE_QA_PREPARE, QAPrepareTimeRsp.class);
        ClientSocket.registS2CProto(ProtoNotification.QA_AUTO_ANSWER, ProtoType.TYPE_ROOM, ProtoType.MSG_S2C_SUBTYPE_QA_AUTO_ANSWER, QAAutoAnswerRsp.class);
    }
}
