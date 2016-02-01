package socket.msg.chat.rsp;

import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

public class ChatChangeWorldRsp extends socket.msg.basic.Respond {

    public int status;
    public int worldId;

    public ChatChangeWorldRsp(User user) {
        super(user);
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_5 = 0;
        while (buff.remaining() > limit) {
            _loc_5 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_5 >> 3) {
                case 1:
                    if (status != 0) {
                        show("Bad data format: ChatChangeWorldRsp.status cannot be set twice.");
                    }
                    this.status = ReadUtils.read$TYPE_INT32(buff);
                    break;

                case 2:
                    if (worldId != 0) {
                        show("Bad data format: ChatChangeWorldRsp.worldId cannot be set twice.");
                    }
                    this.worldId = ReadUtils.read$TYPE_INT32(buff);
                    break;

                default:
                    error("unknown data", buff);
                    return;
            }
        }
    }

    @Override
    protected void action() {
        setMsg(this.toString());
    }

}
