package socket.msg.group.req;

import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

public class GroupSetPasswordReq extends socket.msg.basic.Request {

    public String password;

    public GroupSetPasswordReq(String password) {
        this.password = password;
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.LENGTH_DELIMITED, 1);
        WriteUtils.write$TYPE_STRING(buff, this.password);
    }

}
