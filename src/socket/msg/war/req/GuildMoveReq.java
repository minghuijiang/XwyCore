package socket.msg.war.req;

import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

public class GuildMoveReq extends socket.msg.basic.Request {

    public int dstx;
    public int dsty;

    public GuildMoveReq(int dstx, int dsty) {
        this.dstx = dstx;
        this.dsty = dsty;
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.VARINT, 1);
        WriteUtils.write$TYPE_INT32(buff, this.dstx);
        WriteUtils.writeTag(buff, WireType.VARINT, 2);
        WriteUtils.write$TYPE_INT32(buff, this.dsty);
    }

}
