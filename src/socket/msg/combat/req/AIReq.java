package socket.msg.combat.req;

import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

public class AIReq extends socket.msg.basic.Request {

    public boolean useAI;

    public AIReq(boolean use) {
        useAI = use;
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.VARINT, 1);
        WriteUtils.write$TYPE_BOOL(buff, this.useAI);
    }

}
