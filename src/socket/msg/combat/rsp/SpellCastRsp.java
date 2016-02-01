package socket.msg.combat.rsp;

import java.util.ArrayList;
import java.util.List;

import socket.msg.combat.req.InstantWinReq;
import socket.msg.combat.req.PerformOkReq;
import socket.msg.combat.req.SkipCombatReq;
import socket.msg.info.SpellDetail;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

public class SpellCastRsp extends socket.msg.basic.Respond {

    public int casterSide;
    public int casterPos;
    public int spellId;
    public boolean needUnlock;
    public List<SpellDetail> spellDetail = new ArrayList<SpellDetail>();

    public SpellCastRsp(User user) {
        super(user);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_7 = 0;
        int _loc_6 = 0;
        //      ClientSocket.printBytes("", buff.data());
        while (buff.remaining() > limit) {
            _loc_7 = ReadUtils.read$TYPE_UINT32(buff);
            //     System.out.println(_loc_7+"  "+(_loc_7>>>3));
            switch (_loc_7 >> 3) {
                case 1:
                    if (casterSide != 0) {
                        show("Bad data format: SpellCastRsp.casterSide cannot be set twice.");
                    }
                    this.casterSide = ReadUtils.read$TYPE_INT32(buff);
                    break;

                case 2:
                    if (casterPos != 0) {
                        show("Bad data format: SpellCastRsp.casterPos cannot be set twice.");
                    }
                    this.casterPos = ReadUtils.read$TYPE_INT32(buff);
                    break;

                case 3:
                    if (spellId != 0) {
                        show("Bad data format: SpellCastRsp.spellId cannot be set twice.");
                    }
                    this.spellId = ReadUtils.read$TYPE_INT32(buff);
                    break;

                case 4:
                    if (_loc_6 != 0) {
                        show("Bad data format: SpellCastRsp.needUnlock cannot be set twice.");
                    }
                    _loc_6 = _loc_6 + 1;
                    this.needUnlock = ReadUtils.read$TYPE_BOOL(buff);
                    break;

                case 5:
                    SpellDetail tmp = new SpellDetail(user);
                    ReadUtils.read$TYPE_MESSAGE(buff, tmp);
                    this.spellDetail.add(tmp);
                    break;
                default:
                    error("unknown data", buff);
                    return;
            }
        }
    }

    @Override
    protected void action() {
    	// user.sendMessage(new PerformOkReq());
        if (!user.isIsboss()) {
            user.sendMessage(new SkipCombatReq());
            
        } else {
            user.sendMessage(new PerformOkReq());
        }
    }

}
