package socket.msg.combat.rsp;

import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

public class AuraRemoveRsp extends socket.msg.basic.Respond {

    public int casterSide;
    public int casterPos;
    public int auraId;

    public AuraRemoveRsp(User user) {
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
                case 1:
                    if (casterSide != 0) {
                        show("Bad data format: AuraRemoveRsp.casterSide cannot be set twice.");
                    }
                    this.casterSide = ReadUtils.read$TYPE_INT32(buff);
                    break;

                case 2:
                    if (casterPos != 0) {
                        show("Bad data format: AuraRemoveRsp.casterPos cannot be set twice.");
                    }
                    this.casterPos = ReadUtils.read$TYPE_INT32(buff);
                    break;

                case 3:
                    if (auraId != 0) {
                        show("Bad data format: AuraRemoveRsp.auraId cannot be set twice.");
                    }
                    this.auraId = ReadUtils.read$TYPE_INT32(buff);
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
