package socket.msg.combat.rsp;

import component.User;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import socket.util.WritingBuffer;

public class CombatTimeRsp extends socket.msg.basic.Respond {

    public int timestamp;

    public CombatTimeRsp(User user) {
        super(user);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_4 = 0;
        while (buff.remaining() > limit) {
            _loc_4 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_4 >> 3) {
                case 1:
                    if (timestamp != 0) {
                        show("Bad data format: CombatTimeRsp.timestamp cannot be set twice.");
                    }
                    this.timestamp = ReadUtils.read$TYPE_INT32(buff);
                    break;

                default:
                    error("unknown data", buff);
                    return;
            }
        }
    }

    @Override
    protected void action() {
        //System.out.println(this.getClass());
    }

}
