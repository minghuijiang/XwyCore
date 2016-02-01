package socket.msg.spa.rsp;

import java.util.ArrayList;
import java.util.List;

import socket.msg.info.RoomInfo;
import socket.util.ByteArray;
import socket.util.ReadUtils;

import component.User;

public class RoomList extends socket.msg.basic.Respond {

    public List<RoomInfo> roomList = new ArrayList<RoomInfo>();

    public RoomList(User user) {
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
                    RoomInfo tmp = new RoomInfo(user);
                    ReadUtils.read$TYPE_MESSAGE(buff, tmp);
                    this.roomList.add(tmp);
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
        setMsg(this);
    }

}
