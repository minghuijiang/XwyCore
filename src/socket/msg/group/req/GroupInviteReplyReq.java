package socket.msg.group.req;

import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

public class GroupInviteReplyReq extends socket.msg.basic.Request {

    public int groupid;
    public boolean accept;

    public GroupInviteReplyReq(int groupid, boolean accept) {
        this.groupid = groupid;
        this.accept = accept;
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.VARINT, 1);
        WriteUtils.write$TYPE_INT32(buff, this.groupid);
        WriteUtils.writeTag(buff, WireType.VARINT, 2);
        WriteUtils.write$TYPE_BOOL(buff, this.accept);
    }

}
