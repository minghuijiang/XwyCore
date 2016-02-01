package socket.msg.system;

import socket.msg.basic.Request;
import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

/**
 *
 * @author Ming Jiang
 *
 */
public class GmBan extends Request {

    public int userid;
    public int time;

    public GmBan(int userid, int time) {
        this.userid = userid;
        this.time = time;
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.VARINT, 1);
        WriteUtils.write$TYPE_INT32(buff, this.userid);
        WriteUtils.writeTag(buff, WireType.VARINT, 2);
        WriteUtils.write$TYPE_INT32(buff, this.time);
    }

}
