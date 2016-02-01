package socket.msg.info;

import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

/**
 *
 * @author Ming Jiang
 *
 */
public class AwardRsp extends socket.msg.basic.Info {

    public int cfgid;
    public int num;
    public String type;

    public AwardRsp(User user) {
        super(user);
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_6 = 0;
        int _loc_3 = 0;
        int _loc_4 = 0;
        int _loc_5 = 0;
        while (buff.remaining() > limit) {
            _loc_6 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_6 >> 3) {
                case 1:
                    if (cfgid != 0) {
                        show("Bad data format: AwardRsp.cfgid cannot be set twice.");
                    }
                    this.cfgid = ReadUtils.read$TYPE_INT32(buff);
                    break;
                case 2:
                    if (num != 0) {
                        show("Bad data format: AwardRsp.num cannot be set twice.");
                    }
                    this.num = ReadUtils.read$TYPE_INT32(buff);
                    break;

                case 3:
                    if (type != null) {
                        show("Bad data format: AwardRsp.type cannot be set twice.");
                    }
                    this.type = ReadUtils.read$TYPE_STRING(buff);
                    break;

                default:
                    error("unknown data", buff);
                    return;
            }
        }
    }

}
