package socket.msg.war.rsp;

import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

public class WarriorInfo extends socket.msg.basic.Info {

    public int pos;
    public String name;
    public int hp;
    public int attackPrior;
    public int normalAttackId;
    public int skillAttackId;
    public int skillAttackId2;
    public int skillAttackId3;
    public int skinid;
    public int quality;
    public int warriorcfgid;
    public int heroid;
    public int maxhp;
    public int level;
    public int score;
    public boolean death;
    public int userid;
    public int posx;
    public int posy;
    public int gender;
    public boolean combat;
    public int maxen;
    public int side;

    public WarriorInfo(User user) {
        super(user);
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_26 = 0;
        int _loc_3 = 0;
        int _loc_4 = 0;
        int _loc_5 = 0;
        int _loc_6 = 0;
        int _loc_7 = 0;
        int _loc_8 = 0;
        int _loc_9 = 0;
        int _loc_10 = 0;
        int _loc_11 = 0;
        int _loc_12 = 0;
        int _loc_13 = 0;
        int _loc_14 = 0;
        int _loc_15 = 0;
        int _loc_16 = 0;
        int _loc_17 = 0;
        int _loc_18 = 0;
        int _loc_19 = 0;
        int _loc_20 = 0;
        int _loc_21 = 0;
        int _loc_22 = 0;
        int _loc_23 = 0;
        int _loc_24 = 0;
        int _loc_25 = 0;
        while (buff.remaining() > limit) {

            _loc_26 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_26 >> 3) {
                case 1: {
                    if (_loc_3 != 0) {
                        show("Bad data format: WarriorInfo.pos cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.pos = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 2: {
                    if (_loc_4 != 0) {
                        show("Bad data format: WarriorInfo.name cannot be set twice.");
                    }
                    _loc_4 = _loc_4 + 1;
                    this.name = ReadUtils.read$TYPE_STRING(buff);
                    break;
                }
                case 3: {
                    if (_loc_5 != 0) {
                        show("Bad data format: WarriorInfo.hp cannot be set twice.");
                    }
                    _loc_5 = _loc_5 + 1;
                    this.hp = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 4: {
                    if (_loc_6 != 0) {
                        show("Bad data format: WarriorInfo.attackPrior cannot be set twice.");
                    }
                    _loc_6 = _loc_6 + 1;
                    this.attackPrior = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 5: {
                    if (_loc_7 != 0) {
                        show("Bad data format: WarriorInfo.normalAttackId cannot be set twice.");
                    }
                    _loc_7 = _loc_7 + 1;
                    this.normalAttackId = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 6: {
                    if (_loc_8 != 0) {
                        show("Bad data format: WarriorInfo.skillAttackId cannot be set twice.");
                    }
                    _loc_8 = _loc_8 + 1;
                    this.skillAttackId = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 7: {
                    if (_loc_9 != 0) {
                        show("Bad data format: WarriorInfo.skillAttackId2 cannot be set twice.");
                    }
                    _loc_9 = _loc_9 + 1;
                    this.skillAttackId2 = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 8: {
                    if (_loc_10 != 0) {
                        show("Bad data format: WarriorInfo.skillAttackId3 cannot be set twice.");
                    }
                    _loc_10 = _loc_10 + 1;
                    this.skillAttackId3 = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 9: {
                    if (_loc_11 != 0) {
                        show("Bad data format: WarriorInfo.skinid cannot be set twice.");
                    }
                    _loc_11 = _loc_11 + 1;
                    this.skinid = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 10: {
                    if (_loc_12 != 0) {
                        show("Bad data format: WarriorInfo.quality cannot be set twice.");
                    }
                    _loc_12 = _loc_12 + 1;
                    this.quality = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 11: {
                    if (_loc_13 != 0) {
                        show("Bad data format: WarriorInfo.warriorcfgid cannot be set twice.");
                    }
                    _loc_13 = _loc_13 + 1;
                    this.warriorcfgid = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 12: {
                    if (_loc_14 != 0) {
                        show("Bad data format: WarriorInfo.heroid cannot be set twice.");
                    }
                    _loc_14 = _loc_14 + 1;
                    this.heroid = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 13: {
                    if (_loc_15 != 0) {
                        show("Bad data format: WarriorInfo.maxhp cannot be set twice.");
                    }
                    _loc_15 = _loc_15 + 1;
                    this.maxhp = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 14: {
                    if (_loc_16 != 0) {
                        show("Bad data format: WarriorInfo.level cannot be set twice.");
                    }
                    _loc_16 = _loc_16 + 1;
                    this.level = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 15: {
                    if (_loc_17 != 0) {
                        show("Bad data format: WarriorInfo.score cannot be set twice.");
                    }
                    _loc_17 = _loc_17 + 1;
                    this.score = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 16: {
                    if (_loc_18 != 0) {
                        show("Bad data format: WarriorInfo.death cannot be set twice.");
                    }
                    _loc_18 = _loc_18 + 1;
                    this.death = ReadUtils.read$TYPE_BOOL(buff);
                    break;
                }
                case 17: {
                    if (_loc_19 != 0) {
                        show("Bad data format: WarriorInfo.userid cannot be set twice.");
                    }
                    _loc_19 = _loc_19 + 1;
                    this.userid = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 18: {
                    if (_loc_20 != 0) {
                        show("Bad data format: WarriorInfo.posx cannot be set twice.");
                    }
                    _loc_20 = _loc_20 + 1;
                    this.posx = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 19: {
                    if (_loc_21 != 0) {
                        show("Bad data format: WarriorInfo.posy cannot be set twice.");
                    }
                    _loc_21 = _loc_21 + 1;
                    this.posy = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 20: {
                    if (_loc_22 != 0) {
                        show("Bad data format: WarriorInfo.gender cannot be set twice.");
                    }
                    _loc_22 = _loc_22 + 1;
                    this.gender = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 21: {
                    if (_loc_23 != 0) {
                        show("Bad data format: WarriorInfo.combat cannot be set twice.");
                    }
                    _loc_23 = _loc_23 + 1;
                    this.combat = ReadUtils.read$TYPE_BOOL(buff);
                    break;
                }
                case 22: {
                    if (_loc_24 != 0) {
                        show("Bad data format: WarriorInfo.maxen cannot be set twice.");
                    }
                    _loc_24 = _loc_24 + 1;
                    this.maxen = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 23: {
                    if (_loc_25 != 0) {
                        show("Bad data format: WarriorInfo.side cannot be set twice.");
                    }
                    _loc_25 = _loc_25 + 1;
                    this.side = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                default:
                    error("unknown data", buff);
                    return;
            }
        }
    }

}
