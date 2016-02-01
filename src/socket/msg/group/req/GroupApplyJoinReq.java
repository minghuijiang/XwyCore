package socket.msg.group.req;

import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

/**
 * @deprecated Unregister Message
 * @author Ming Jiang
 *
 */
public class GroupApplyJoinReq extends socket.msg.basic.Request {

    public int groupid;
    public String password;

    public GroupApplyJoinReq(int groupid, String password) {
        this.groupid = groupid;
        this.password = password;
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.VARINT, 1);
        WriteUtils.write$TYPE_INT32(buff, this.groupid);
        if (this.password != null && password.length() > 0) {
            WriteUtils.writeTag(buff, WireType.LENGTH_DELIMITED, 2);
            WriteUtils.write$TYPE_STRING(buff, this.password);
        }
    }

}
