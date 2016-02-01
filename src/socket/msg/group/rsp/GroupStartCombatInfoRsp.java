package socket.msg.group.rsp;

import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

public class GroupStartCombatInfoRsp extends socket.msg.basic.Respond {

    public String mapInfo;

    public GroupStartCombatInfoRsp(User user) {
        super(user);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_4 = 0;
        int _loc_3 = 0;
        while (buff.remaining() > limit) {

            _loc_4 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_4 >> 3) {
                case 1: {
                    if (_loc_3 != 0) {
                        show("Bad data format: GroupStartCombatInfoRsp.mapInfo cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.mapInfo = ReadUtils.read$TYPE_STRING(buff);
                    break;
                }
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

}
