package socket.msg.war.rsp;

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
public class GuildWarSideInfoRsp extends socket.msg.basic.Respond {

    public int guildid;
    public String guildname;
    public List<WarriorInfo> warriors = new ArrayList<WarriorInfo>();
    public int encourage;

    public GuildWarSideInfoRsp(User user) {
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
                        show("Bad data format: GuildWarSideInfoRsp.guildid cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.guildid = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 2: {
                    if (_loc_4 != 0) {
                        show("Bad data format: GuildWarSideInfoRsp.guildname cannot be set twice.");
                    }
                    _loc_4 = _loc_4 + 1;
                    this.guildname = ReadUtils.read$TYPE_STRING(buff);
                    break;
                }
                case 3: {
                    WarriorInfo tmp = new WarriorInfo(user);
                    ReadUtils.read$TYPE_MESSAGE(buff, tmp);
                    this.warriors.add(tmp);
                    break;
                }
                case 4: {
                    if (_loc_5 != 0) {
                        show("Bad data format: GuildWarSideInfoRsp.encourage cannot be set twice.");
                    }
                    _loc_5 = _loc_5 + 1;
                    this.encourage = ReadUtils.read$TYPE_INT32(buff);
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
