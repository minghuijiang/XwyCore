package socket.msg.combat.req;

import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

public class YunJiebiaoSurrenderSkipReq extends socket.msg.basic.Request {

    public int fightType;
    public String fightId;
    public int mapId;
    public int groupId;
    public int type;

    public YunJiebiaoSurrenderSkipReq(String fightId, int mapId, int groupId,
            int fightType, int pkroleId){
        
        this.fightType = pkroleId;
        this.fightId = fightId;
        this.mapId = mapId;
        this.groupId = groupId;
        this.type = fightType;
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.VARINT, 1);
        WriteUtils.write$TYPE_INT32(buff, this.fightType);
        WriteUtils.writeTag(buff, WireType.LENGTH_DELIMITED, 2);
        WriteUtils.write$TYPE_STRING(buff, this.fightId);
        WriteUtils.writeTag(buff, WireType.VARINT, 3);
        WriteUtils.write$TYPE_INT32(buff, this.mapId);
        WriteUtils.writeTag(buff, WireType.VARINT, 4);
        WriteUtils.write$TYPE_INT32(buff, this.groupId);
        WriteUtils.writeTag(buff, WireType.VARINT, 5);
        WriteUtils.write$TYPE_INT32(buff, this.type);
    }

}
