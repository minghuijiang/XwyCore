package socket.msg.group.rsp;

import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

public class GroupInfo extends socket.msg.basic.Respond {

    public int groupid;
    public String groupName;
    public String leaderName;
    public int leaderLevel;
    public int memberNumber;
    public boolean isLock;
    public String password;

    public GroupInfo(User user) {
        super(user);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_10 = 0;
        int _loc_3 = 0;
        int _loc_4 = 0;
        int _loc_5 = 0;
        int _loc_6 = 0;
        int _loc_7 = 0;
        int _loc_8 = 0;
        int _loc_9 = 0;
        while (buff.remaining() > limit) {

            _loc_10 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_10 >> 3) {
                case 1: {
                    if (_loc_3 != 0) {
                        show("Bad data format: GroupInfo.groupid cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.groupid = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 2: {
                    if (_loc_4 != 0) {
                        show("Bad data format: GroupInfo.groupName cannot be set twice.");
                    }
                    _loc_4 = _loc_4 + 1;
                    this.groupName = ReadUtils.read$TYPE_STRING(buff);
                    break;
                }
                case 3: {
                    if (_loc_5 != 0) {
                        show("Bad data format: GroupInfo.leaderName cannot be set twice.");
                    }
                    _loc_5 = _loc_5 + 1;
                    this.leaderName = ReadUtils.read$TYPE_STRING(buff);
                    break;
                }
                case 4: {
                    if (_loc_6 != 0) {
                        show("Bad data format: GroupInfo.leaderLevel cannot be set twice.");
                    }
                    _loc_6 = _loc_6 + 1;
                    this.leaderLevel = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 5: {
                    if (_loc_7 != 0) {
                        show("Bad data format: GroupInfo.memberNumber cannot be set twice.");
                    }
                    _loc_7 = _loc_7 + 1;
                    this.memberNumber = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 6: {
                    if (_loc_8 != 0) {
                        show("Bad data format: GroupInfo.isLock cannot be set twice.");
                    }
                    _loc_8 = _loc_8 + 1;
                    this.isLock = ReadUtils.read$TYPE_BOOL(buff);
                    break;
                }
                case 7: {
                    if (_loc_9 != 0) {
                        show("Bad data format: GroupInfo.password cannot be set twice.");
                    }
                    _loc_9 = _loc_9 + 1;
                    this.password = ReadUtils.read$TYPE_STRING(buff);
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
