package socket.msg.info;

import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

/**
 *
 * @author Ming Jiang
 *
 */
public class AuraAddRsp extends socket.msg.basic.Info {

    public int side;
    public int pos;
    public int buffId;
    public int timestamp;

    public AuraAddRsp(User user) {
        super(user);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_7 = 0;

        while (buff.remaining() > limit) {
            _loc_7 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_7 >> 3) {
                case 1:
                    if (side != 0) {
                        show("Bad data format: AuraAddRsp.side cannot be set twice.");
                    }
                    this.side = ReadUtils.read$TYPE_INT32(buff);
                    break;

                case 2:
                    if (pos != 0) {
                        show("Bad data format: AuraAddRsp.pos cannot be set twice.");
                    }
                    this.pos = ReadUtils.read$TYPE_INT32(buff);
                    break;

                case 3:
                    if (buffId != 0) {
                        show("Bad data format: AuraAddRsp.buffId cannot be set twice.");
                    }
                    this.buffId = ReadUtils.read$TYPE_INT32(buff);
                    break;

                case 4:
                    if (timestamp != 0) {
                        show("Bad data format: AuraAddRsp.timestamp cannot be set twice.");
                    }
                    this.timestamp = ReadUtils.read$TYPE_INT32(buff);
                    break;

                default:
                    error("unknown data", buff);
                    return;
            }
        }
    }

}
