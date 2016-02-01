package socket.msg.war.rsp;

import socket.util.ByteArray;
import socket.util.ReadUtils;
import socket.util.WritingBuffer;
import component.User;

public class MoveInfo extends socket.msg.basic.Respond {

    public int userId;
    public int srcX;
    public int srcY;
    public int dstX;
    public int dstY;
    public boolean keepMoving;

    public MoveInfo(User user) {
        super(user);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_9 = 0;
        int _loc_3 = 0;
        int _loc_4 = 0;
        int _loc_5 = 0;
        int _loc_6 = 0;
        int _loc_7 = 0;
        int _loc_8 = 0;
        while (buff.remaining() > limit) {

            _loc_9 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_9 >> 3) {
                case 1: {
                    if (_loc_3 != 0) {
                        show("Bad data format: MoveInfo.userId cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.userId = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 2: {
                    if (_loc_4 != 0) {
                        show("Bad data format: MoveInfo.srcX cannot be set twice.");
                    }
                    _loc_4 = _loc_4 + 1;
                    this.srcX = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 3: {
                    if (_loc_5 != 0) {
                        show("Bad data format: MoveInfo.srcY cannot be set twice.");
                    }
                    _loc_5 = _loc_5 + 1;
                    this.srcY = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 4: {
                    if (_loc_6 != 0) {
                        show("Bad data format: MoveInfo.dstX cannot be set twice.");
                    }
                    _loc_6 = _loc_6 + 1;
                    this.dstX = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 5: {
                    if (_loc_7 != 0) {
                        show("Bad data format: MoveInfo.dstY cannot be set twice.");
                    }
                    _loc_7 = _loc_7 + 1;
                    this.dstY = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 6: {
                    if (_loc_8 != 0) {
                        show("Bad data format: MoveInfo.keepMoving cannot be set twice.");
                    }
                    _loc_8 = _loc_8 + 1;
                    this.keepMoving = ReadUtils.read$TYPE_BOOL(buff);
                    break;
                }
                default:
                    error("unknown data", buff);
                    return;
            }
        }
    }

    @Override
    protected void action() {
		// TODO Auto-generated method stub

    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
		// TODO Auto-generated method stub

    }

}
