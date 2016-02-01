package socket.msg.chat.req;

import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

public class ChatReq extends socket.msg.basic.Request {

    public int chatType;
    public int targetId;
    public String content;

    public ChatReq(int type, int id, String text) {
        chatType = type;
        targetId = id;
        content = text;
        //TODO  string need to be in utf encoding format?
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.VARINT, 1);
        WriteUtils.write$TYPE_ENUM(buff, this.chatType);
        WriteUtils.writeTag(buff, WireType.VARINT, 2);
        WriteUtils.write$TYPE_INT32(buff, this.targetId);
        WriteUtils.writeTag(buff, WireType.LENGTH_DELIMITED, 3);
        WriteUtils.write$TYPE_STRING(buff, this.content);
    }

}
