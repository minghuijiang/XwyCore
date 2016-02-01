package socket.msg.chat.rsp;

import socket.msg.chat.req.ChatPrivateQueryReq;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

public class ChatPrivateQueryRsp extends socket.msg.basic.Respond {

	public static String name=null;
    public int userId;
    public String userName;

    public ChatPrivateQueryRsp(User user) {
        super(user);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_5 = 0;
        while (buff.remaining() > limit) {
            _loc_5 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_5 >> 3) {
                case 1:
                    if (userId != 0) {
                        show("Bad data format: ChatPrivateQueryRsp.userId cannot be set twice.");
                    }
                    this.userId = ReadUtils.read$TYPE_INT32(buff);
                    break;

                case 2:
                    if (userName != null) {
                        show("Bad data format: ChatPrivateQueryRsp.userName cannot be set twice.");
                    }
                    this.userName = ReadUtils.read$TYPE_STRING(buff);
                    break;

                default:
                    error("unknown data", buff);
                    return;
            }
        }
    }

    @Override
    protected void action() {
    	if(userId==0)
    		name=null;
    	else
    		name = userName;
    	synchronized (ChatPrivateQueryReq.LOCK) {
    		ChatPrivateQueryReq.LOCK.notifyAll();
    	}
        //setMsg(this.toString());
    }

}
