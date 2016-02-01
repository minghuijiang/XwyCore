package socket.msg.war.rsp;

import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

public class GuildWarWeekday extends socket.msg.basic.Request {

    public int weekday;

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.VARINT, 1);
        WriteUtils.write$TYPE_INT32(buff, this.weekday);
    }

}
