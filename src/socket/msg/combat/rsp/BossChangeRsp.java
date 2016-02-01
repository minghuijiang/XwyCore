package socket.msg.combat.rsp;

import component.User;
import socket.msg.combat.req.PerformOkReq;
import socket.msg.combat.req.SkipCombatReq;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import socket.util.WritingBuffer;

public class BossChangeRsp extends socket.msg.basic.Respond {

    public int changeId;

    public BossChangeRsp(User user) {
        super(user);
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_4 = 0;
        int _loc_3 = 0;
        while (buff.remaining() > limit) {
            _loc_4 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_4 >> 3) {
                case 1:
                    if (changeId != 0) {
                        show("Bad data format: BossChangeRsp.changeId cannot be set twice.");
                    }
                    this.changeId = ReadUtils.read$TYPE_INT32(buff);
                    break;

                default:
                    error("unknown data", buff);
                    return;
            }
        }
    }

    @Override
    protected void action() {
        //	System.out.println(this);
        user.sendMessage(new PerformOkReq());
		//user.sendMessage(new SkipCombatReq());
        //user.sendMessage(new PerformOkReq());
    }

}
