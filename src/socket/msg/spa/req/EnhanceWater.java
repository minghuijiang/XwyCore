package socket.msg.spa.req;

import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

public class EnhanceWater extends socket.msg.basic.Request {

    public int destLevel;
    public int kind;

    public EnhanceWater(int destLevel, int kind) {
        this.destLevel = destLevel;
        this.kind = kind;
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.VARINT, 1);
        WriteUtils.write$TYPE_INT32(buff, this.destLevel);
        if (this.kind > -1) {
            WriteUtils.writeTag(buff, WireType.VARINT, 2);
            WriteUtils.write$TYPE_INT32(buff, this.kind);
        }
    }

}
