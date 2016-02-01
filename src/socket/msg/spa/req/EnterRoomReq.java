package socket.msg.spa.req;

import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

public class EnterRoomReq extends socket.msg.basic.Request {

    public int roomId;

    public EnterRoomReq(int roomId) {
        this.roomId = roomId;
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.VARINT, 1);
        WriteUtils.write$TYPE_INT32(buff, this.roomId);
    }

}
