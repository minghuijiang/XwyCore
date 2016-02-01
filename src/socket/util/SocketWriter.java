package socket.util;

import data.StaticInfo;
import socket.ClientSocket;
import socket.msg.basic.Message;

public class SocketWriter {

    //TODO  change ByteBuffer to ByteArray;
    protected ByteArray buff;

    public byte[] data() {
        return buff.data();
    }

    public void write(Message msg) {
        SocketProtocol proto = ClientSocket.getC2SProto(msg);
        if (proto == null) {
            StaticInfo.debug("未注册的protocolbuffer无法被发送 " + buff);
            return;
        }
        ByteArray msgBuff = new ByteArray(256);
        if (!msg.checkEmpty()) {
            msg.writeTo(msgBuff);
        }

        this.buff = new ByteArray(512);

        this.buff.writeShort((short) (msgBuff.position() + 13));
        this.buff.writeByte((byte) 0);
        this.buff.writeInt(0);
        this.buff.writeByte((byte) proto.type);
        this.buff.writeByte((byte) proto.subtype);
        this.buff.writeInt(100);
        this.buff.writeBytes(msgBuff.data(), 0, msgBuff.position());

    }

}
