package socket.msg.war.rsp;

import component.User;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import socket.util.WritingBuffer;

public class GuildWarQueryInfoResultRsp extends socket.msg.basic.Respond {

    public boolean result;
    public boolean ischairman;
    public int round;
    public int signedNumber;

    public GuildWarQueryInfoResultRsp(User user) {
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
                        show("Bad data format: GuildWarQueryInfoResultRsp.result cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.result = ReadUtils.read$TYPE_BOOL(buff);
                    break;
                }
                case 2: {
                    if (_loc_4 != 0) {
                        show("Bad data format: GuildWarQueryInfoResultRsp.ischairman cannot be set twice.");
                    }
                    _loc_4 = _loc_4 + 1;
                    this.ischairman = ReadUtils.read$TYPE_BOOL(buff);
                    break;
                }
                case 3: {
                    if (_loc_5 != 0) {
                        show("Bad data format: GuildWarQueryInfoResultRsp.round cannot be set twice.");
                    }
                    _loc_5 = _loc_5 + 1;
                    this.round = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 4: {
                    if (_loc_6 != 0) {
                        show("Bad data format: GuildWarQueryInfoResultRsp.signedNumber cannot be set twice.");
                    }
                    _loc_6 = _loc_6 + 1;
                    this.signedNumber = ReadUtils.read$TYPE_INT32(buff);
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

    @Override
    public void writeToBuffer(WritingBuffer buff) {
		// TODO Auto-generated method stub

    }

}
