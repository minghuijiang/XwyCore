package socket.msg.info;

import java.util.ArrayList;
import java.util.List;

import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

/**
 *
 * @author Ming Jiang
 *
 */
public class GuildWarRanklistRsp extends socket.msg.basic.Info {

    public List<GuildWarRanklistRecord> ranklist = new ArrayList<GuildWarRanklistRecord>();

    public GuildWarRanklistRsp(User user) {
        super(user);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_3 = 0;
        while (buff.remaining() > limit) {

            _loc_3 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_3 >> 3) {
                case 2: {
                    GuildWarRanklistRecord tmp = new GuildWarRanklistRecord(user);
                    ReadUtils.read$TYPE_MESSAGE(buff, tmp);
                    this.ranklist.add(tmp);
                    break;
                }
                default:
                    error("unknown data", buff);
                    return;
            }
        }
    }

}
