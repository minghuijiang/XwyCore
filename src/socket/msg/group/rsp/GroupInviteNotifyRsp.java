package socket.msg.group.rsp;

import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

public class GroupInviteNotifyRsp extends socket.msg.basic.Respond {

    public String name;
    public int level;
    public int groupid;

    public GroupInviteNotifyRsp(User user) {
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
                        show("Bad data format: GroupInviteNotifyRsp.name cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.name = ReadUtils.read$TYPE_STRING(buff);
                    break;
                }
                case 2: {
                    if (_loc_4 != 0) {
                        show("Bad data format: GroupInviteNotifyRsp.level cannot be set twice.");
                    }
                    _loc_4 = _loc_4 + 1;
                    this.level = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 3: {
                    if (_loc_5 != 0) {
                        show("Bad data format: GroupInviteNotifyRsp.groupid cannot be set twice.");
                    }
                    _loc_5 = _loc_5 + 1;
                    this.groupid = ReadUtils.read$TYPE_INT32(buff);
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
