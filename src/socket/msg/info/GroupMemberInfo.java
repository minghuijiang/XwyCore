package socket.msg.info;

import socket.msg.war.rsp.WarriorInfo;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

/**
 *
 * @author Ming Jiang
 *
 */
public class GroupMemberInfo extends socket.msg.basic.Info {

    public int userid;
    public boolean isReady;
    public boolean isAdmin;
    public WarriorInfo mainHero;
    public WarriorInfo hero;
    public WarriorInfo pet;

    public GroupMemberInfo(User user) {
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
                        show("Bad data format: GroupMemberInfo.userid cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.userid = ReadUtils.read$TYPE_INT32(buff);
                    break;
                }
                case 2: {
                    if (_loc_4 != 0) {
                        show("Bad data format: GroupMemberInfo.isReady cannot be set twice.");
                    }
                    _loc_4 = _loc_4 + 1;
                    this.isReady = ReadUtils.read$TYPE_BOOL(buff);
                    break;
                }
                case 3: {
                    if (_loc_5 != 0) {
                        show("Bad data format: GroupMemberInfo.isAdmin cannot be set twice.");
                    }
                    _loc_5 = _loc_5 + 1;
                    this.isAdmin = ReadUtils.read$TYPE_BOOL(buff);
                    break;
                }
                case 4: {
                    if (_loc_6 != 0) {
                        show("Bad data format: GroupMemberInfo.mainHero cannot be set twice.");
                    }
                    _loc_6 = _loc_6 + 1;
                    this.mainHero = new WarriorInfo(user);
                    ReadUtils.read$TYPE_MESSAGE(buff, this.mainHero);
                    break;
                }
                case 5: {
                    if (_loc_7 != 0) {
                        show("Bad data format: GroupMemberInfo.hero cannot be set twice.");
                    }
                    _loc_7 = _loc_7 + 1;
                    this.hero = new WarriorInfo(user);
                    ReadUtils.read$TYPE_MESSAGE(buff, this.hero);
                    break;
                }
                case 6: {
                    if (_loc_8 != 0) {
                        show("Bad data format: GroupMemberInfo.pet cannot be set twice.");
                    }
                    _loc_8 = _loc_8 + 1;
                    this.pet = new WarriorInfo(user);
                    ReadUtils.read$TYPE_MESSAGE(buff, this.pet);
                    break;
                }
                default:
                    error("unknown data", buff);
                    return;
            }
        }
    }

}
