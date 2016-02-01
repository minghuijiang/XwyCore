package socket.msg.system;

import socket.msg.basic.Request;
import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

/**
 * @deprecated Unregister Message
 * @author Ming Jiang
 *
 */
public class GmSystemNotice extends Request {

    public String content;

    public GmSystemNotice(String content) {
        this.content = content;
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.LENGTH_DELIMITED, 1);
        WriteUtils.write$TYPE_STRING(buff, this.content);
    }

}
