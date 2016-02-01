package socket.msg.spa.rsp;

import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

public class WaterEnhanceResult extends socket.msg.basic.Respond {

    public int result;
    public WaterEnhancedInfo info;
    public String change;

    public WaterEnhanceResult(User user) {
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
                        show("Bad data format: WaterEnhanceResult.result cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.result = ReadUtils.read$TYPE_ENUM(buff);
                    break;
                }
                case 2: {
                    if (_loc_4 != 0) {
                        show("Bad data format: WaterEnhanceResult.info cannot be set twice.");
                    }
                    _loc_4 = _loc_4 + 1;
                    this.info = new WaterEnhancedInfo(user);
                    ReadUtils.read$TYPE_MESSAGE(buff, this.info);
                    break;
                }
                case 3: {
                    if (_loc_5 != 0) {
                        show("Bad data format: WaterEnhanceResult.change cannot be set twice.");
                    }
                    _loc_5 = _loc_5 + 1;
                    this.change = ReadUtils.read$TYPE_STRING(buff);
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
