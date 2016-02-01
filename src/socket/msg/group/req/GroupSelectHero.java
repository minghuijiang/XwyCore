package socket.msg.group.req;

import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

public class GroupSelectHero extends socket.msg.basic.Request {

    public int mainPos;
    public int heroPos;
    public boolean first;
    public int heroid;
    public int skin;
    public int quality;
    public int cfgid;
    public int level;
    public int score;

    public GroupSelectHero(int mainPos, int heroPos, boolean first, int heroid,
            int skin, int quality, int cfgid, int level, int score) {
        this.mainPos = mainPos;
        this.heroPos = heroPos;
        this.first = first;
        this.heroid = heroid;
        this.skin = skin;
        this.quality = quality;
        this.cfgid = cfgid;
        this.level = level;
        this.score = score;
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.VARINT, 1);
        WriteUtils.write$TYPE_INT32(buff, this.mainPos);
        WriteUtils.writeTag(buff, WireType.VARINT, 2);
        WriteUtils.write$TYPE_INT32(buff, this.heroPos);
        WriteUtils.writeTag(buff, WireType.VARINT, 3);
        WriteUtils.write$TYPE_BOOL(buff, this.first);
        if (this.heroid > 0) {
            WriteUtils.writeTag(buff, WireType.VARINT, 4);
            WriteUtils.write$TYPE_INT32(buff, this.heroid);
        }
        if (this.skin > 0) {
            WriteUtils.writeTag(buff, WireType.VARINT, 5);
            WriteUtils.write$TYPE_INT32(buff, this.skin);
        }
        if (this.quality > 0) {
            WriteUtils.writeTag(buff, WireType.VARINT, 6);
            WriteUtils.write$TYPE_INT32(buff, this.quality);
        }
        if (this.cfgid > 0) {
            WriteUtils.writeTag(buff, WireType.VARINT, 7);
            WriteUtils.write$TYPE_INT32(buff, this.cfgid);
        }
        if (this.level > 0) {
            WriteUtils.writeTag(buff, WireType.VARINT, 8);
            WriteUtils.write$TYPE_INT32(buff, this.level);
        }
        if (this.score > 0) {
            WriteUtils.writeTag(buff, WireType.VARINT, 9);
            WriteUtils.write$TYPE_INT32(buff, this.score);
        }
    }

}
