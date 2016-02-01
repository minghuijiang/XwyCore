package socket.msg.combat.rsp;

import component.User;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import socket.util.WritingBuffer;

public class CombatInfoRsp extends socket.msg.basic.Respond {

    public boolean isAuto;

    public CombatInfoRsp(User user) {
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
                    if (_loc_3 != 0) {
                        show("Bad data format: CombatInfoRsp.isAuto cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.isAuto = ReadUtils.read$TYPE_BOOL(buff);
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
