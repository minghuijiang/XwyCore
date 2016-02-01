package socket.msg.war.rsp;

import java.util.ArrayList;
import java.util.List;

import socket.msg.info.GuildWarStatusSingleRsp;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

public class GuildWarStatusUpdateRsp extends socket.msg.basic.Respond {

    public List<GuildWarStatusSingleRsp> status = new ArrayList<GuildWarStatusSingleRsp>();

    public GuildWarStatusUpdateRsp(User user) {
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
                    GuildWarStatusSingleRsp tmp = new GuildWarStatusSingleRsp(user);
                    ReadUtils.read$TYPE_MESSAGE(buff, tmp);
                    this.status.add(tmp);
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
