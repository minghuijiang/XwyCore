package socket.msg.group.req;

import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

public class GroupJoinReq extends socket.msg.basic.Request {

    public int groupid;
    public int flag;
    public String password;
    public boolean accept;
    public int maxmapid;

    public GroupJoinReq(int groupid, int flag, String password, boolean accept,
            int maxmapid) {
        this.groupid = groupid;
        this.flag = flag;
        this.password = password;
        this.accept = accept;
        this.maxmapid = maxmapid;
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.VARINT, 1);
        WriteUtils.write$TYPE_INT32(buff, this.groupid);
        WriteUtils.writeTag(buff, WireType.VARINT, 2);
        WriteUtils.write$TYPE_INT32(buff, this.flag);
        WriteUtils.writeTag(buff, WireType.LENGTH_DELIMITED, 3);
        WriteUtils.write$TYPE_STRING(buff, this.password);
        WriteUtils.writeTag(buff, WireType.VARINT, 4);
        WriteUtils.write$TYPE_BOOL(buff, this.accept);
        WriteUtils.writeTag(buff, WireType.VARINT, 5);
        WriteUtils.write$TYPE_INT32(buff, this.maxmapid);

    }

}
