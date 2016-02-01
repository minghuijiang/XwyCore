package socket.msg.spa.rsp;

import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

public class LeaveRoom extends socket.msg.basic.Respond {

    public int userId;
    public int playerNum;

    public LeaveRoom(User user) {
        super(user);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_5 = 0;
        int _loc_3 = 0;
        int _loc_4 = 0;
        while (buff.remaining() > limit) {

            _loc_5 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_5 >> 3) {
                case 1: {
                    if (_loc_3 != 0) {
                        show("Bad data format: LeaveRoom.userId cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.userId = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 2: {
                    if (_loc_4 != 0) {
                        show("Bad data format: LeaveRoom.playerNum cannot be set twice.");
                    }
                    _loc_4 = _loc_4 + 1;
                    this.playerNum = ReadUtils.read$TYPE_INT32(buff);
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
        setMsg(userId + " 离开了");
    }

}
