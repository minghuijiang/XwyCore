package socket.msg.combat.req;

import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

public class SpellCastReq extends socket.msg.basic.Request {

    public int spellEntry;

    public SpellCastReq(int spellEntry) {
        this.spellEntry = spellEntry;
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.VARINT, 1);
        WriteUtils.write$TYPE_INT32(buff, this.spellEntry);
    }

}
