package socket.msg.group.rsp;

import java.util.ArrayList;
import java.util.List;

import socket.msg.info.GroupMemberInfo;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

public class GroupMemberInfoUpdate extends socket.msg.basic.Respond {

    public List<GroupMemberInfo> member = new ArrayList<GroupMemberInfo>();
    public int mapid;

    public GroupMemberInfoUpdate(User user) {
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
                    GroupMemberInfo tmp = new GroupMemberInfo(user);
                    ReadUtils.read$TYPE_MESSAGE(buff, tmp);
                    this.member.add(tmp);
                    break;
                }
                case 2: {
                    if (_loc_3 != 0) {
                        show("Bad data format: GroupMemberInfoUpdate.mapid cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.mapid = ReadUtils.read$TYPE_INT32(buff);
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
