package socket.msg.info;

import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

/**
 *
 * @author Ming Jiang
 *
 */
public class PlayerInfo extends socket.msg.basic.Info {

    public int userId;
    public String userName;
    public int gender;
    public int posX;
    public int posY;
    public int heroId;
    public String heroName;
    public String avatar;
    public int yellowVip;

    public PlayerInfo(User user) {
        super(user);
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_12 = 0;
        int _loc_3 = 0;
        int _loc_4 = 0;
        int _loc_5 = 0;
        int _loc_6 = 0;
        int _loc_7 = 0;
        int _loc_8 = 0;
        int _loc_9 = 0;
        int _loc_10 = 0;
        int _loc_11 = 0;
        while (buff.remaining() > limit) {

            _loc_12 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_12 >> 3) {
                case 1: {
                    if (_loc_3 != 0) {
                        show("Bad data format: PlayerInfo.userId cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.userId = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 2: {
                    if (_loc_4 != 0) {
                        show("Bad data format: PlayerInfo.userName cannot be set twice.");
                    }
                    _loc_4 = _loc_4 + 1;
                    this.userName = ReadUtils.read$TYPE_STRING(buff);
                    break;
                }
                case 3: {
                    if (_loc_5 != 0) {
                        show("Bad data format: PlayerInfo.gender cannot be set twice.");
                    }
                    _loc_5 = _loc_5 + 1;
                    this.gender = ReadUtils.read$TYPE_ENUM(buff);
                    break;
                }
                case 4: {
                    if (_loc_6 != 0) {
                        show("Bad data format: PlayerInfo.posX cannot be set twice.");
                    }
                    _loc_6 = _loc_6 + 1;
                    this.posX = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 5: {
                    if (_loc_7 != 0) {
                        show("Bad data format: PlayerInfo.posY cannot be set twice.");
                    }
                    _loc_7 = _loc_7 + 1;
                    this.posY = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 6: {
                    if (_loc_8 != 0) {
                        show("Bad data format: PlayerInfo.heroId cannot be set twice.");
                    }
                    _loc_8 = _loc_8 + 1;
                    this.heroId = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 7: {
                    if (_loc_9 != 0) {
                        show("Bad data format: PlayerInfo.heroName cannot be set twice.");
                    }
                    _loc_9 = _loc_9 + 1;
                    this.heroName = ReadUtils.read$TYPE_STRING(buff);
                    break;
                }
                case 8: {
                    if (_loc_10 != 0) {
                        show("Bad data format: PlayerInfo.avatar cannot be set twice.");
                    }
                    _loc_10 = _loc_10 + 1;
                    this.avatar = ReadUtils.read$TYPE_STRING(buff);
                    break;
                }
                case 9: {
                    if (_loc_11 != 0) {
                        show("Bad data format: PlayerInfo.yellowVip cannot be set twice.");
                    }
                    _loc_11 = _loc_11 + 1;
                    this.yellowVip = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                default:
                    error("unknown data", buff);
                    return;
            }
        }
    }

}
