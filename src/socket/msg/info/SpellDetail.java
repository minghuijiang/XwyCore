package socket.msg.info;

import java.util.ArrayList;
import java.util.List;

import socket.ClientSocket;
import socket.msg.constant.WireType;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

/**
 *
 * @author Ming Jiang
 *
 */
public class SpellDetail extends socket.msg.basic.Info {

    public int targetSide;
    public int targetPos;
    public int damage;
    public int currentHp;
    public List<Integer> status = new ArrayList<Integer>();
    public int maxHp;
    public AuraAddRsp buff;

    public SpellDetail(User user) {
        super(user);
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_9 = 0;

        //   ClientSocket.printBytes("", buff.data());
        while (buff.remaining() > limit) {
            _loc_9 = ReadUtils.read$TYPE_UINT32(buff);
            //       System.out.println(buff.position()+" "+_loc_9+"  "+(_loc_9 >> 3));
            switch (_loc_9 >> 3) {
                case 1:
                    if (targetSide != 0) {
                        show("Bad data format: SpellDetail.targetSide cannot be set twice.");
                    }
                    this.targetSide = ReadUtils.read$TYPE_INT32(buff);
                    break;

                case 2:
                    if (targetPos != 0) {
                        show("Bad data format: SpellDetail.targetPos cannot be set twice.");
                    }
                    this.targetPos = ReadUtils.read$TYPE_INT32(buff);
                    break;

                case 3:
                    if (damage != 0) {
                        show("Bad data format: SpellDetail.damage cannot be set twice.");
                    }
                    this.damage = ReadUtils.read$TYPE_INT32(buff);
                    break;

                case 4:
                    if ((_loc_9 & 7) == WireType.LENGTH_DELIMITED) {
                        ReadUtils.readPackedRepeated$TYPE_ENUM(buff, this.status);
                        //  ReadUtils.readPackedRepeated(buff, ReadUtils.read$TYPE_ENUM, this.status);
                        break;
                    }
                    this.status.add(ReadUtils.read$TYPE_ENUM(buff));
                    break;

                case 5:
                    if (currentHp != 0) {
                        show("Bad data format: SpellDetail.currentHp cannot be set twice.");
                    }
                    this.currentHp = ReadUtils.read$TYPE_INT32(buff);
                    break;

                case 6:
                    if (maxHp != 0) {
                        show("Bad data format: SpellDetail.maxHp cannot be set twice.");
                    }
                    this.maxHp = ReadUtils.read$TYPE_INT32(buff);
                    break;

                case 7:
                    if (this.buff != null) {
                        show("Bad data format: SpellDetail.buff cannot be set twice.");
                    }
                    this.buff = new AuraAddRsp(user);
                    ReadUtils.read$TYPE_MESSAGE(buff, this.buff);
                    break;

                default:
                    error("unknown data", buff);
                    return;
            }
        }
    }

}
