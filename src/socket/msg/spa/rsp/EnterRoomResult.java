package socket.msg.spa.rsp;

import java.util.ArrayList;
import java.util.List;

import socket.msg.constant.Constant;
import socket.msg.constant.RoomResult;
import socket.msg.info.PlayerInfo;
import socket.msg.info.RoomInfo;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import socket.util.WritingBuffer;
import component.User;

public class EnterRoomResult extends socket.msg.basic.Respond {

    public int result;
    public RoomInfo roomInfo;
    public List<PlayerInfo> playerList = new ArrayList<PlayerInfo>();
    public int strength;
    public int reputation;

    public EnterRoomResult(User user) {
        super(user);
        // TODO Auto-generated constructor stub
    }


    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_7 = 0;
        int _loc_3 = 0;
        int _loc_4 = 0;
        int _loc_5 = 0;
        int _loc_6 = 0;
        while (buff.remaining() > limit) {

            _loc_7 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_7 >> 3) {
                case 1: {
                    if (_loc_3 != 0) {
                        show("Bad data format: EnterRoomResult.result cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.result = ReadUtils.read$TYPE_ENUM(buff);
                    break;
                }
                case 2: {
                    if (_loc_4 != 0) {
                        show("Bad data format: EnterRoomResult.roomInfo cannot be set twice.");
                    }
                    _loc_4 = _loc_4 + 1;
                    this.roomInfo = new RoomInfo(user);
                    ReadUtils.read$TYPE_MESSAGE(buff, this.roomInfo);
                    break;
                }
                case 3: {
                    PlayerInfo tmp = new PlayerInfo(user);
                    ReadUtils.read$TYPE_MESSAGE(buff, tmp);
                    this.playerList.add(tmp);
                    break;
                }
                case 4: {
                    if (_loc_5 != 0) {
                        show("Bad data format: EnterRoomResult.strength cannot be set twice.");
                    }
                    _loc_5 = _loc_5 + 1;
                    this.strength = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 5: {
                    if (_loc_6 != 0) {
                        show("Bad data format: EnterRoomResult.reputation cannot be set twice.");
                    }
                    _loc_6 = _loc_6 + 1;
                    this.reputation = ReadUtils.read$TYPE_INT32(buff);
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
        if (result == RoomResult.SUCCESS) {
            setMsg("进入温泉: 房间" + this.roomInfo.roomId + ""
                    + (this.roomInfo.waterEnhancedInfo.isEnhanced ? "(高汤)" : ""));
        }
    }

}
