package socket.msg.combat.rsp;

import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;

import component.User;

import java.util.logging.Level;
import java.util.logging.Logger;

import message.FightMsg;
import message.ItemMsg;
import socket.msg.combat.req.CombatQuitReq;
import socket.msg.combat.req.PerformOkReq;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import socket.util.WritingBuffer;

public class CombatPrizeRsp extends socket.msg.basic.Respond {

    public String data;

    public CombatPrizeRsp(User user) {
        super(user);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_4 = 0;
        int _loc_3 = 0;
        while (buff.remaining() > limit) {
            _loc_4 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_4 >> 3) {
                case 1:
                    if (data != null) {
                        show("Bad data format: CombatPrizeRsp.data cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.data = ReadUtils.read$TYPE_STRING(buff);
                    break;

                default:
                    error("unknown data", buff);
                    return;
            }
        }
    }

    @Override
    protected void action() {
        try {
            //	user.setMsg("获得战斗奖励. "+user.mapId);
         //   user.log("combat prize: "+data);
            user.updateData(new Json(data).getJson("res").toString());
            int num= user.getItems().getNum(894);
            user.setMsg(System.currentTimeMillis()+" : "+user.getUname()+" : 礼包: "+num);
            if(user.end==-1){
            	if(num>999){
            	//	for(int i=0;i<3;i++){
            			ItemMsg.openBoxNoUpdate(user, user.getItems().getId(894), 999);
            	//	}
            	}
            }else
            if(num>user.end){
            	System.exit(0);
            }
        } catch (Exception ex) {
            user.log("json error prize respond: "+data);
           // Logger.getLogger(CombatPrizeRsp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(!FightMsg.isCheat){
	        synchronized (user.getFightLock()) {
	            user.getFightLock().notifyAll();
	        }
	
	        user.sendMessage(new PerformOkReq());
	        user.sendMessage(new CombatQuitReq());
        }
    }

}
