package socket.msg.group.req;

import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

public class GroupCreateReq extends socket.msg.basic.Request {

    public String name;
    public String password;
    public int mapid;

    public GroupCreateReq(String name, String password, int mapid) {
        this.name = name;
        this.password = password;
        this.mapid = mapid;
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.LENGTH_DELIMITED, 1);
        WriteUtils.write$TYPE_STRING(buff, this.name);
        WriteUtils.writeTag(buff, WireType.LENGTH_DELIMITED, 2);
        WriteUtils.write$TYPE_STRING(buff, this.password);
        WriteUtils.writeTag(buff, WireType.VARINT, 3);
        WriteUtils.write$TYPE_INT32(buff, this.mapid);
    }

}
