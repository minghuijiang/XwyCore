package socket.msg.war.rsp;

import java.util.ArrayList;
import java.util.List;

import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

public class GuildWarOppositeRsp extends socket.msg.basic.Respond {

    public List<String> name = new ArrayList<String>();

    public GuildWarOppositeRsp(User user) {
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
                    this.name.add(ReadUtils.read$TYPE_STRING(buff));
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
