package socket.msg.combat.rsp;

import message.FightMsg;
import component.User;
import socket.msg.combat.req.AIReq;
import socket.msg.combat.req.CombatQuitReq;
import socket.msg.combat.req.PerformOkReq;
import socket.msg.combat.req.StartCombatReq;
import socket.msg.combat.req.YunJiebiaoSurrenderSkipReq;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import socket.util.WritingBuffer;

public class CombatResultRsp extends socket.msg.basic.Respond {

    public int win;
    public boolean force;

    public CombatResultRsp(User user) {
        super(user);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_5 = 0;
        int _loc_4 = 0;
        while (buff.remaining() > limit) {
            _loc_5 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_5 >> 3) {
                case 1:
                    if (win != 0) {
                        show("Bad data format: CombatResultRsp.win cannot be set twice.");
                    }
                    this.win = ReadUtils.read$TYPE_INT32(buff);
                    break;

                case 2:
                    if (_loc_4 != 0) {
                        show("Bad data format: CombatResultRsp.force cannot be set twice.");
                    }
                    _loc_4 = _loc_4 + 1;
                    this.force = ReadUtils.read$TYPE_BOOL(buff);
                    break;

                default:
                    error("unknown data", buff);
                    return;
            }
        }
    }

    @Override
    protected void action() {
        user.log(user.getMapId() + "  --- win= 1  " + this.win);
    //    user.log(this.toString());
     //       user.log(user.getFightCount() + " : " + user.getFightNum());
        if (win == 1) {
            user.setWin(true);
        } else {
            user.setWin(false);
        }//lock forever
        if(!FightMsg.isCheat)
        	user.setFightNum(user.getFightNum() + 1);

        if (user.getFightCount() >= user.getFightNum()) {
            if (user.isRob()) {
                while (true) {
                    //      System.out.println(user.robIds[user.fightNum - 1]);
                    user.setPkId(user.getRobIds()[user.getFightNum() - 1]);
                    if (user.getPkId() == 0) {
                        user.sendMessage(new YunJiebiaoSurrenderSkipReq(user.getFightId(), 
                        		user.getMapId(), user.getFightNum(), user.getFightType(), 0));
                        user.setFightNum(user.getFightNum() + 1);
                    } else {
                        break;
                    }
                    if (user.getFightCount() < user.getFightNum()) {
                        user.sendMessage(new PerformOkReq());
                        user.sendMessage(new CombatQuitReq());
                        break;
                    }
                }
            }

            user.sendMessage(new AIReq(true));
            user.sendMessage(new AIReq(true));
            user.sendMessage(new StartCombatReq(user.getFightId(), 
            		user.getMapId(), user.getFightNum(), 
            		user.getFightType(), user.getPkId(),user));

        } else {
        	if(!FightMsg.isCheat){
	            user.sendMessage(new AIReq(true));
	            user.sendMessage(new AIReq(true));
	            user.sendMessage(new StartCombatReq(user.getFightId(), 
	            		user.getMapId(), user.getFightNum(), 
	            		user.getFightType(), user.getPkId(),user));
        	}
        	else
        		user.sendMessage(new PerformOkReq());
        }

        if (user.getMapId() == 10025 || 
        		(user.getMapId() == 10001 && user.getFightCount() < user.getFightNum())) {//servant
            synchronized (user.getFightLock()) {
                user.getFightLock().notifyAll();
            }
        }
    }

}
