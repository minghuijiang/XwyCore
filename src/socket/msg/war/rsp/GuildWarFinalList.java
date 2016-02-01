package socket.msg.war.rsp;

import java.util.ArrayList;
import java.util.List;

import socket.msg.constant.WireType;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

public class GuildWarFinalList extends socket.msg.basic.Respond {

    public List<Integer> final8 = new ArrayList<Integer>();
    public List<Integer> final4 = new ArrayList<Integer>();
    public List<Integer> final2 = new ArrayList<Integer>();
    public List<Integer> final1 = new ArrayList<Integer>();

    public GuildWarFinalList(User user) {
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
                    if ((_loc_3 & 7) == WireType.LENGTH_DELIMITED) {
                        ReadUtils.readPackedRepeated$TYPE_INT32(buff, this.final8);
                        break;
                    }
                    this.final8.add(ReadUtils.read$TYPE_INT32(buff));
                    break;
                }
                case 2: {
                    if ((_loc_3 & 7) == WireType.LENGTH_DELIMITED) {
                        ReadUtils.readPackedRepeated$TYPE_INT32(buff, this.final4);
                        break;
                    }
                    this.final4.add(ReadUtils.read$TYPE_INT32(buff));
                    break;
                }
                case 3: {
                    if ((_loc_3 & 7) == WireType.LENGTH_DELIMITED) {
                        ReadUtils.readPackedRepeated$TYPE_INT32(buff, this.final2);
                        break;
                    }
                    this.final2.add(ReadUtils.read$TYPE_INT32(buff));
                    break;
                }
                case 4: {
                    if ((_loc_3 & 7) == WireType.LENGTH_DELIMITED) {
                        ReadUtils.readPackedRepeated$TYPE_INT32(buff, this.final1);
                        break;
                    }
                    this.final1.add(ReadUtils.read$TYPE_INT32(buff));
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
