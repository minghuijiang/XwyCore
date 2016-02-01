package socket.msg.info;

import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

/**
 *
 * @author Ming Jiang
 *
 */
public class GuildWarStatusSingleRsp extends socket.msg.basic.Info {

    public int userid;
    public boolean death;
    public boolean combat;

    public GuildWarStatusSingleRsp(User user) {
        super(user);
        // TODO Auto-generated constructor stub
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
                case 1: {
                    if (_loc_3 != 0) {
                        show("Bad data format: GuildWarStatusSingleRsp.userid cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.userid = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 2: {
                    if (_loc_4 != 0) {
                        show("Bad data format: GuildWarStatusSingleRsp.death cannot be set twice.");
                    }
                    _loc_4 = _loc_4 + 1;
                    this.death = ReadUtils.read$TYPE_BOOL(buff);
                    break;
                }
                case 3: {
                    if (_loc_5 != 0) {
                        show("Bad data format: GuildWarStatusSingleRsp.combat cannot be set twice.");
                    }
                    _loc_5 = _loc_5 + 1;
                    this.combat = ReadUtils.read$TYPE_BOOL(buff);
                    break;
                }
                default:
                    error("unknown data", buff);
                    return;
            }
        }
    }

}
