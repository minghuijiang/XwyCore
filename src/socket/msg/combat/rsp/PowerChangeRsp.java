package socket.msg.combat.rsp;

import component.User;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import socket.util.WritingBuffer;

public class PowerChangeRsp extends socket.msg.basic.Respond {

    public int casterSide;
    public int casterPos;
    public int currentPower;

    public PowerChangeRsp(User user) {
        super(user);
        // TODO Auto-generated constructor stublimit:
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_6 = 0;

        while (buff.remaining() > limit) {
            _loc_6 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_6 >> 3) {
                case 1:
                    if (casterSide != 0) {
                        show("Bad data format: PowerChangeRsp.casterSide cannot be set twice.");
                    }
                    this.casterSide = ReadUtils.read$TYPE_INT32(buff);
                    break;

                case 2:
                    if (casterPos != 0) {
                        show("Bad data format: PowerChangeRsp.casterPos cannot be set twice.");
                    }
                    this.casterPos = ReadUtils.read$TYPE_INT32(buff);
                    break;

                case 3:
                    if (currentPower != 0) {
                        show("Bad data format: PowerChangeRsp.currentPower cannot be set twice.");
                    }
                    this.currentPower = ReadUtils.read$TYPE_INT32(buff);
                    break;

                default:
                    error("unknown data", buff);
                    return;
            }
        }
    }

    @Override
    protected void action() {
		// TODO Auto-generated method stub
        //System.out.println(this);
    }

}
