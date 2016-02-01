package socket.msg.war.req;

import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

public class GuildWarStartTime extends socket.msg.basic.Request {

    public int sec;

    public GuildWarStartTime(int sec) {
        this.sec = sec;
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.VARINT, 1);
        WriteUtils.write$TYPE_INT32(buff, this.sec);
    }

}
