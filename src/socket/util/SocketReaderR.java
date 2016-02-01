package socket.util;

import com.mingJiang.util.Util;

import socket.ClientSocket;
import socket.msg.basic.Message;
import component.User;
import data.StaticInfo;

public class SocketReaderR {

    public int length;
    public int compressionFlag;
    public int CRC32;
    public int type;
    public int subtype;
    public int sessionId;
    public boolean _headReady = false;
    public User user;

    public SocketReaderR(User user) {
        this.user = user;
    }

    public boolean readHead(ByteArray data) {
        this.length = data.getShort();
        this.compressionFlag = data.get() & 0xff;
        this.CRC32 = data.getInt();
        this.type = data.get() & 0xff;
        this.subtype = data.get() & 0xff;
        this.sessionId = data.getInt();
        this._headReady = true;
        return type!=0;
    }

    public void readBody(ByteArray buff) {
    
        SocketProtocol proto = ClientSocket.getC2SProto(this.type, this.subtype);
        if (proto == null) {
            log("unknown socket protocol");
            log("type: " + this.type);
            log("subtype: " + this.subtype);
            log("length: " + this.subtype);
    //        ClientSocket.printBytes("unknown socket protocol", buff.data());
            //	System.exit(0);
            return;
        }
	   
        //    System.out.println(proto);

        if (proto.msgClass != null) {
            try {
              //  Message msg = (Message) proto.msgClass.getConstructor().newInstance();
                if(ClientSocket.showSocket){
                	log("Send: "+proto.msgClass);
                }
                 
              //  msg.mergeFrom(buff);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(proto);
                System.exit(0);
            }
        }
    }

    public int headLength() {
        return 8;
    }

    public boolean headReady() {
        return this._headReady;
    }
    
    public void log(String string){
    	if(user!=null)
    		user.log(string);
    	else {
			System.out.println(string);
		}
    }

}
