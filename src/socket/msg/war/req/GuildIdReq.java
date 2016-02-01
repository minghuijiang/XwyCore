package socket.msg.war.req;

import socket.msg.basic.Request;
import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

/**
 * @deprecated Unregister Message
 * @author Ming Jiang
 *
 */
public class GuildIdReq extends Request {

    public int id;

    public GuildIdReq(int id) {
        this.id = id;
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.VARINT, 1);
        WriteUtils.write$TYPE_INT32(buff, this.id);
    }

}
