package socket.msg.group.req;

import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

public class GroupQuickJoinReq extends socket.msg.basic.Request {

    public int mapid;

    public GroupQuickJoinReq(int mapid) {
        this.mapid = mapid;
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.VARINT, 1);
        WriteUtils.write$TYPE_INT32(buff, this.mapid);

    }

}
