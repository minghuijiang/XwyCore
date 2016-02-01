package socket.msg.chat.rsp;

import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

public class ChatWorldInfoRsp extends socket.msg.basic.Respond {

    public ChatWorldInfoRsp(User user) {
        super(user);
    }

    public int worldId;
    public int number;

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_5 = 0;

        while (buff.remaining() > limit) {
            _loc_5 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_5 >> 3) {
                case 1:
                    if (number != 0) {
                        show("Bad data format: ChatWorldInfoRsp.number cannot be set twice.");
                    }
                    this.number = ReadUtils.read$TYPE_INT32(buff);
                    break;

                case 2:
                    if (worldId != 0) {
                        show("Bad data format: ChatWorldInfoRsp.worldId cannot be set twice.");
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
        //	setMsg("连接聊天窗成功. 世界频道 = "+worldId);
    }

}
