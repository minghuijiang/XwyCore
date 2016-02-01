package socket.msg.group.rsp;

import java.util.ArrayList;
import java.util.List;

import socket.msg.constant.WireType;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

public class GroupPassedMapRsp extends socket.msg.basic.Respond {

    public List<Integer> mapids = new ArrayList<Integer>();

    public GroupPassedMapRsp(User user) {
        super(user);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_3 = 0;
        while (buff.remaining() > limit) {

            _loc_3 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_3 >> 3) {
                case 1: {
                    if ((_loc_3 & 7) == WireType.LENGTH_DELIMITED) {
                        ReadUtils.readPackedRepeated$TYPE_INT32(buff, this.mapids);
                        break;
                    }
                    this.mapids.add(ReadUtils.read$TYPE_INT32(buff));
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
