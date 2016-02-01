package socket.msg.combat.req;

import java.io.IOError;

import socket.msg.constant.WireType;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import socket.util.WriteUtils;
import socket.util.WritingBuffer;

public class EnterDungeonReq extends socket.msg.basic.Request {

    public String fightId;
    public int mapId;
    public int fightType;

    public EnterDungeonReq(String id, int map, int type) {
        fightId = id;
        mapId = map;
        fightType = type;
    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        WriteUtils.writeTag(buff, WireType.LENGTH_DELIMITED, 1);
        WriteUtils.write$TYPE_STRING(buff, this.fightId);
        WriteUtils.writeTag(buff, WireType.VARINT, 2);
        WriteUtils.write$TYPE_INT32(buff, this.mapId);
        if (this.fightType > 0) {
            WriteUtils.writeTag(buff, WireType.VARINT, 3);
            WriteUtils.write$TYPE_INT32(buff, this.fightType);
        }
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_6 = 0;
        int _loc_3 = 0;
        int _loc_4 = 0;
        int _loc_5 = 0;
        while (buff.remaining() > limit) {

            _loc_6 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_6 >> 3) {
                case 1: {
                    if (_loc_3 != 0) {
                        show("Bad data format: EnterDungeonReq.fightId cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.fightId = ReadUtils.read$TYPE_STRING(buff);
                    break;
                }
                case 2: {
                    if (_loc_4 != 0) {
                        show("Bad data format: EnterDungeonReq.mapId cannot be set twice.");
                    }
                    _loc_4 = _loc_4 + 1;
                    this.mapId = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 3: {
                    if (_loc_5 != 0) {
                        show("Bad data format: EnterDungeonReq.fightType cannot be set twice.");
                    }
                    _loc_5 = _loc_5 + 1;
                    this.fightType = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                default:
                    error("unknown data", buff);
                    return;
            }
        }
    }

}
