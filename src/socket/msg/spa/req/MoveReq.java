package socket.msg.spa.req;

import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

public class MoveReq extends socket.msg.basic.Request {

    public int srcX;
    public int srcY;
    public int dstX;
    public int dstY;

    public MoveReq(int srcX, int srcY, int dstX, int dstY) {
        this.srcX = srcX;
        this.srcY = srcY;
        this.dstX = dstX;
        this.dstY = dstY;
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.VARINT, 1);
        WriteUtils.write$TYPE_INT32(buff, this.srcX);
        WriteUtils.writeTag(buff, WireType.VARINT, 2);
        WriteUtils.write$TYPE_INT32(buff, this.srcY);
        WriteUtils.writeTag(buff, WireType.VARINT, 3);
        WriteUtils.write$TYPE_INT32(buff, this.dstX);
        WriteUtils.writeTag(buff, WireType.VARINT, 4);
        WriteUtils.write$TYPE_INT32(buff, this.dstY);

    }

}
