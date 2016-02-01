package socket.msg.system;

import component.User;
import socket.msg.constant.WireType;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

/**
 * @deprecated Unregister Message
 * @author Ming Jiang
 *
 */
public class GmContent extends socket.msg.basic.Message {

    public String content;

    public GmContent(User user, String content) {
        super(user);
        this.content = content;
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_4 = 0;
        while (buff.remaining() > limit) {
            _loc_4 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_4 >> 3) {
                case 1:
                    if (content != null) {
                        show("Bad data format: GmContent.content cannot be set twice.");
                    }
                    this.content = ReadUtils.read$TYPE_STRING(buff);
                    break;

                default:
                    error("unknown data", buff);
                    return;
            }
        }
    }

    @Override
    protected void action() {
		// TODO Auto-generated method stub

    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.LENGTH_DELIMITED, 1);
        WriteUtils.write$TYPE_STRING(buff, this.content);

    }

}
