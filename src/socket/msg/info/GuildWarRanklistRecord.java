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
public class GuildWarRanklistRecord extends socket.msg.basic.Info {

    public int rank;
    public String username;
    public String guildname;
    public int winstreak;
    public List<AwardRsp> award = new ArrayList<AwardRsp>();

    public GuildWarRanklistRecord(User user) {
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
                        show("Bad data format: GuildWarRanklistRecord.rank cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.rank = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 2: {
                    if (_loc_4 != 0) {
                        show("Bad data format: GuildWarRanklistRecord.username cannot be set twice.");
                    }
                    _loc_4 = _loc_4 + 1;
                    this.username = ReadUtils.read$TYPE_STRING(buff);
                    break;
                }
                case 3: {
                    if (_loc_5 != 0) {
                        show("Bad data format: GuildWarRanklistRecord.guildname cannot be set twice.");
                    }
                    _loc_5 = _loc_5 + 1;
                    this.guildname = ReadUtils.read$TYPE_STRING(buff);
                    break;
                }
                case 4: {
                    if (_loc_6 != 0) {
                        show("Bad data format: GuildWarRanklistRecord.winstreak cannot be set twice.");
                    }
                    _loc_6 = _loc_6 + 1;
                    this.winstreak = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 5: {
                    AwardRsp tmp = new AwardRsp(user);
                    ReadUtils.read$TYPE_MESSAGE(buff, tmp);
                    this.award.add(tmp);
                    break;
                }
                default:
                    error("unknown data", buff);
                    return;
            }
        }

    }

}
