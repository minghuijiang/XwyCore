package socket.msg.spa.rsp;

import socket.msg.info.RoomInfo;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

public class SearchRoomResult extends socket.msg.basic.Respond {

    public int result;
    public RoomInfo roomInfo;

    public SearchRoomResult(User user) {
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
                        show("Bad data format: SearchRoomResult.result cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.result = ReadUtils.read$TYPE_ENUM(buff);
                    break;
                }
                case 2: {
                    if (_loc_4 != 0) {
                        show("Bad data format: SearchRoomResult.roomInfo cannot be set twice.");
                    }
                    _loc_4 = _loc_4 + 1;
                    this.roomInfo = new RoomInfo(user);
                    ReadUtils.read$TYPE_MESSAGE(buff, this.roomInfo);
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
        setMsg(this);
    }

}
