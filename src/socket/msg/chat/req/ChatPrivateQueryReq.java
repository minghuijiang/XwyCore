package socket.msg.chat.req;

import socket.msg.chat.rsp.ChatPrivateQueryRsp;
import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;
import component.User;

/**
 * 聊天 改变私聊对象id.
 *
 * @author Ming Jiang
 *
 */
public class ChatPrivateQueryReq extends socket.msg.basic.Request {

	public static final Object LOCK= new Object();
    public int userid;

    private ChatPrivateQueryReq(int id) {
        userid = id;
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.VARINT, 1);
        WriteUtils.write$TYPE_INT32(buff, this.userid);
    }

    
    public static synchronized String getUserName(User user, int targetId){
    	user.sendMessage(new ChatPrivateQueryReq(targetId));
    	synchronized (LOCK) {
			try {
				LOCK.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return ChatPrivateQueryRsp.name;
    	
    }
}
