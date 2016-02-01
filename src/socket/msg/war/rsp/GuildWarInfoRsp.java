package socket.msg.war.rsp;

import component.User;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import socket.util.WritingBuffer;

public class GuildWarInfoRsp extends socket.msg.basic.Respond {

    public GuildWarSideInfoRsp side_0;
    public GuildWarSideInfoRsp side_1;

    public GuildWarInfoRsp(User user) {
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
                        show("Bad data format: GuildWarInfoRsp.side_0 cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.side_0 = new GuildWarSideInfoRsp(user);
                    ReadUtils.read$TYPE_MESSAGE(buff, this.side_0);
                    break;
                }
                case 2: {
                    if (_loc_4 != 0) {
                        show("Bad data format: GuildWarInfoRsp.side_1 cannot be set twice.");
                    }
                    _loc_4 = _loc_4 + 1;
                    this.side_1 = new GuildWarSideInfoRsp(user);
                    ReadUtils.read$TYPE_MESSAGE(buff, this.side_1);
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
