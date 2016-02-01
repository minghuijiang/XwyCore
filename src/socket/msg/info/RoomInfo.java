package socket.msg.info;

import socket.msg.spa.rsp.WaterEnhancedInfo;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;
import component.handler.SpaHandler;

/**
 *
 * @author Ming Jiang
 *
 */
public class RoomInfo extends socket.msg.basic.Info {

    public int roomId;
    public String roomName;
    public int peopleLimit;
    public int waterLevel;
    public int currentNum;
    public int stengthLimit;
    public boolean isPrizeOpen;
    public int prizeOpenTime;
    public WaterEnhancedInfo waterEnhancedInfo;

    public RoomInfo(User user) {
        super(user);
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_12 = 0;
        int _loc_3 = 0;
        int _loc_4 = 0;
        int _loc_5 = 0;
        int _loc_6 = 0;
        int _loc_7 = 0;
        int _loc_8 = 0;
        int _loc_9 = 0;
        int _loc_10 = 0;
        int _loc_11 = 0;
        while (buff.remaining() > limit) {

            _loc_12 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_12 >> 3) {
                case 1: {
                    if (_loc_3 != 0) {
                        show("Bad data format: RoomInfo.roomId cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.roomId = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 2: {
                    if (_loc_4 != 0) {
                        show("Bad data format: RoomInfo.roomName cannot be set twice.");
                    }
                    _loc_4 = _loc_4 + 1;
                    this.roomName = ReadUtils.read$TYPE_STRING(buff);
                    break;
                }
                case 3: {
                    if (_loc_5 != 0) {
                        show("Bad data format: RoomInfo.peopleLimit cannot be set twice.");
                    }
                    _loc_5 = _loc_5 + 1;
                    this.peopleLimit = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 4: {
                    if (_loc_6 != 0) {
                        show("Bad data format: RoomInfo.waterLevel cannot be set twice.");
                    }
                    _loc_6 = _loc_6 + 1;
                    this.waterLevel = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 5: {
                    if (_loc_7 != 0) {
                        show("Bad data format: RoomInfo.currentNum cannot be set twice.");
                    }
                    _loc_7 = _loc_7 + 1;
                    this.currentNum = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 6: {
                    if (_loc_8 != 0) {
                        show("Bad data format: RoomInfo.stengthLimit cannot be set twice.");
                    }
                    _loc_8 = _loc_8 + 1;
                    this.stengthLimit = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 7: {
                    if (_loc_9 != 0) {
                        show("Bad data format: RoomInfo.isPrizeOpen cannot be set twice.");
                    }
                    _loc_9 = _loc_9 + 1;
                    this.isPrizeOpen = ReadUtils.read$TYPE_BOOL(buff);
                    break;
                }
                case 8: {
                    if (_loc_10 != 0) {
                        show("Bad data format: RoomInfo.prizeOpenTime cannot be set twice.");
                    }
                    _loc_10 = _loc_10 + 1;
                    this.prizeOpenTime = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 9: {
                    if (_loc_11 != 0) {
                        show("Bad data format: RoomInfo.waterEnhancedInfo cannot be set twice.");
                    }
                    _loc_11 = _loc_11 + 1;
                    this.waterEnhancedInfo = new WaterEnhancedInfo(user);
                    ReadUtils.read$TYPE_MESSAGE(buff, this.waterEnhancedInfo);
                    break;
                }
                default:
                    error("unknown data", buff);
                    return;
            }
        }
    }

    protected void action() {

        if (SpaHandler.showEnhancedRoom) {
            if (this.waterEnhancedInfo.isEnhanced) {
                setMsg("高汤 : " + this.roomId);
            }
            if (this.roomId == 200) {
                SpaHandler.showEnhancedRoom = false;
                setMsg("搜索高汤结束.");
            }
        }
    }

}
