package socket.msg.system;

import socket.ClientSocket;
import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

public class LoginReq extends socket.msg.basic.Request {

    public int userId = 0;
    public String sessionId = "";

    public LoginReq(int id, String session) {
        userId = id;
        sessionId = session;
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.VARINT, 1);
        //    ClientSocket.printBytes("first tag", buff.data());
        WriteUtils.write$TYPE_INT32(buff, this.userId);
        //  ClientSocket.printBytes("after int", buff.data());
        WriteUtils.writeTag(buff, WireType.LENGTH_DELIMITED, 2);
        //  ClientSocket.printBytes("second tag", buff.data());
        WriteUtils.write$TYPE_STRING(buff, this.sessionId);
        //  ClientSocket.printBytes("finish write", buff.data());
    }

}
