package socket.msg.combat.rsp;

import component.User;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import socket.util.WritingBuffer;

public class AuraTickRsp extends socket.msg.basic.Respond {

    public int casterSide;
    public int casterPos;
    public int damage;
    public int currentHP;

    public AuraTickRsp(User user) {
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
                case 1:
                    if (casterSide != 0) {
                        show("Bad data format: AuraTickRsp.casterSide cannot be set twice.");
                    }
                    this.casterSide = ReadUtils.read$TYPE_INT32(buff);
                    break;

                case 2:
                    if (casterPos != 0) {
                        show("Bad data format: AuraTickRsp.casterPos cannot be set twice.");
                    }
                    this.casterPos = ReadUtils.read$TYPE_INT32(buff);
                    break;

                case 3:
                    if (damage != 0) {
                        show("Bad data format: AuraTickRsp.damage cannot be set twice.");
                    }
                    this.damage = ReadUtils.read$TYPE_INT32(buff);
                    break;

                case 4:
                    if (currentHP != 0) {
                        show("Bad data format: AuraTickRsp.currentHP cannot be set twice.");
                    }
                    this.currentHP = ReadUtils.read$TYPE_INT32(buff);
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

    }

}
