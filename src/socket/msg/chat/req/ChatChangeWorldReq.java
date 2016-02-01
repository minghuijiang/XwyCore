package socket.msg.chat.req;

import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

/**
 * 改变聊天窗口的 世界频道
 *
 * @deprecated
 * @author Ming Jiang
 *
 */
public class ChatChangeWorldReq extends socket.msg.basic.Request {

    public int worldId;

    public ChatChangeWorldReq(int id) {
        worldId = id;
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.VARINT, 1);
        WriteUtils.write$TYPE_INT32(buff, this.worldId);
    }

}
