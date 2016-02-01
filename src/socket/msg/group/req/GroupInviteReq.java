package socket.msg.group.req;

import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

public class GroupInviteReq extends socket.msg.basic.Request {

    public int userid;

    public GroupInviteReq(int userid) {
        this.userid = userid;
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.VARINT, 1);
        WriteUtils.write$TYPE_INT32(buff, this.userid);
    }

}
