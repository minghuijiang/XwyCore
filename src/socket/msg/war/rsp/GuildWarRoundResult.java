package socket.msg.war.rsp;

import java.util.ArrayList;
import java.util.List;

import socket.msg.info.GuildWarRanklistRecord;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

public class GuildWarRoundResult extends socket.msg.basic.Respond {

    public int winguildid;
    public int rank;
    public int winsteak;
    public String prize;
    public List<GuildWarRanklistRecord> ranklist = new ArrayList<GuildWarRanklistRecord>();

    public GuildWarRoundResult(User user) {
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
                        show("Bad data format: GuildWarRoundResult.winguildid cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.winguildid = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 2: {
                    if (_loc_4 != 0) {
                        show("Bad data format: GuildWarRoundResult.rank cannot be set twice.");
                    }
                    _loc_4 = _loc_4 + 1;
                    this.rank = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 3: {
                    if (_loc_5 != 0) {
                        show("Bad data format: GuildWarRoundResult.winsteak cannot be set twice.");
                    }
                    _loc_5 = _loc_5 + 1;
                    this.winsteak = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 4: {
                    if (_loc_6 != 0) {
                        show("Bad data format: GuildWarRoundResult.prize cannot be set twice.");
                    }
                    _loc_6 = _loc_6 + 1;
                    this.prize = ReadUtils.read$TYPE_STRING(buff);
                    break;
                }
                case 5: {
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

    @Override
    protected void action() {
		// TODO Auto-generated method stub

    }

}
