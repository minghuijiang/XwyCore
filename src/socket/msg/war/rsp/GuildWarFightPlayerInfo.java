package socket.msg.war.rsp;

import java.util.ArrayList;
import java.util.List;

import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

public class GuildWarFightPlayerInfo extends socket.msg.basic.Respond {

    public List<WarriorInfo> warriors_0 = new ArrayList<WarriorInfo>();
    public List<WarriorInfo> warriors_1 = new ArrayList<WarriorInfo>();
    public int encourage_0;
    public int encourage_1;

    public GuildWarFightPlayerInfo(User user) {
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
                    WarriorInfo tmp = new WarriorInfo(user);
                    ReadUtils.read$TYPE_MESSAGE(buff, tmp);
                    this.warriors_0.add(tmp);
                    break;
                }
                case 2: {
                    WarriorInfo tmp = new WarriorInfo(user);
                    ReadUtils.read$TYPE_MESSAGE(buff, tmp);
                    this.warriors_1.add(tmp);
                    break;
                }
                case 3: {
                    if (_loc_3 != 0) {
                        show("Bad data format: GuildWarFightPlayerInfo.encourage_0 cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.encourage_0 = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 4: {
                    if (_loc_4 != 0) {
                        show("Bad data format: GuildWarFightPlayerInfo.encourage_1 cannot be set twice.");
                    }
                    _loc_4 = _loc_4 + 1;
                    this.encourage_1 = ReadUtils.read$TYPE_INT32(buff);
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
