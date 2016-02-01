package socket.msg.combat.req;

import component.User;

import socket.msg.constant.WireType;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

public class StartCombatReq extends socket.msg.basic.Request {

    public String fightId;
    public int mapId;
    public int groupId;
    public int fightType;
    public int pkroleId;

    /**
     *
     * @param fightId
     * @param mapId
     * @param groupId
     * @param fightType
     * @param pkroleId
     */
    public StartCombatReq(String fightId, int mapId, int groupId,
            int fightType, int pkroleId,User user) {
        this.fightId = fightId;
        this.mapId = mapId;
        this.groupId = groupId;
        this.fightType = fightType;
        this.pkroleId = pkroleId;
      //  user.log(String.format("start bombat req: fightId: %s,mapId: %d,groupId: %d,fightType: %d,pkroleId: %d",
      //  		fightId,mapId, groupId,fightType,pkroleId));
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.LENGTH_DELIMITED, 1);
        WriteUtils.write$TYPE_STRING(buff, this.fightId);
        WriteUtils.writeTag(buff, WireType.VARINT, 2);
        WriteUtils.write$TYPE_INT32(buff, this.mapId);
        WriteUtils.writeTag(buff, WireType.VARINT, 3);
        WriteUtils.write$TYPE_INT32(buff, this.groupId);
        WriteUtils.writeTag(buff, WireType.VARINT, 4);
        WriteUtils.write$TYPE_INT32(buff, this.fightType);
        if (this.pkroleId > 0) {
            WriteUtils.writeTag(buff, WireType.VARINT, 5);
            WriteUtils.write$TYPE_INT32(buff, this.pkroleId);
        }
    }

}
