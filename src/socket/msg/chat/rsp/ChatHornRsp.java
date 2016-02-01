package socket.msg.chat.rsp;

import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

public class ChatHornRsp extends socket.msg.basic.Respond {

    public int countdown;

    public ChatHornRsp(User user) {
        super(user);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_4 = 0;
        while (buff.remaining() > limit) {
            _loc_4 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_4 >> 3) {
                case 1:
                    if (countdown != 0) {
                        show("Bad data format: ChatHornRsp.countdown cannot be set twice.");
                    }
                    this.countdown = ReadUtils.read$TYPE_INT32(buff);
                    break;

                default:
                    error("unknown data", buff);
                    return;
            }
        }
    }

    @Override
    protected void action() {
        //setMsg(this.toString());
    }

}
