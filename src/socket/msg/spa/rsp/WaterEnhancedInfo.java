package socket.msg.spa.rsp;

import java.util.ArrayList;
import java.util.List;

import socket.msg.constant.WireType;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

public class WaterEnhancedInfo extends socket.msg.basic.Respond {

    public boolean isEnhanced;
    public List<Integer> userId = new ArrayList<Integer>();
    public List<String> userName = new ArrayList<String>();
    public int waterEnhancedLevel;
    public int waterEnhancedTime;

    public WaterEnhancedInfo(User user) {
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
                        show("Bad data format: WaterEnhancedInfo.isEnhanced cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.isEnhanced = ReadUtils.read$TYPE_BOOL(buff);
                    break;
                }
                case 2: {
                    if ((_loc_6 & 7) == WireType.LENGTH_DELIMITED) {
                        ReadUtils.readPackedRepeated$TYPE_INT32(buff, this.userId);
                        break;
                    }
                    this.userId.add(ReadUtils.read$TYPE_INT32(buff));
                    break;
                }
                case 3: {
                    this.userName.add(ReadUtils.read$TYPE_STRING(buff));
                    break;
                }
                case 4: {
                    if (_loc_4 != 0) {
                        show("Bad data format: WaterEnhancedInfo.waterEnhancedLevel cannot be set twice.");
                    }
                    _loc_4 = _loc_4 + 1;
                    this.waterEnhancedLevel = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 5: {
                    if (_loc_5 != 0) {
                        show("Bad data format: WaterEnhancedInfo.waterEnhancedTime cannot be set twice.");
                    }
                    _loc_5 = _loc_5 + 1;
                    this.waterEnhancedTime = ReadUtils.read$TYPE_INT32(buff);
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
