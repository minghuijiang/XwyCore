package socket.msg.war.rsp;

import socket.util.ByteArray;
import socket.util.ReadUtils;
import socket.util.WritingBuffer;
import component.User;

public class GuildWarResultRsp extends socket.msg.basic.Respond {

    public boolean result;

    public GuildWarResultRsp(User user) {
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
                    if (_loc_3 != 0) {
                        show("Bad data format: GuildWarResultRsp.result cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.result = ReadUtils.read$TYPE_BOOL(buff);
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
