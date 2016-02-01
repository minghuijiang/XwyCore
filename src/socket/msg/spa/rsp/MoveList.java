package socket.msg.spa.rsp;

import java.util.ArrayList;
import java.util.List;

import socket.msg.war.rsp.MoveInfo;
import socket.util.ByteArray;
import socket.util.ReadUtils;

import component.User;

public class MoveList extends socket.msg.basic.Respond {

    public List<MoveInfo> moveList = new ArrayList<MoveInfo>();

    public MoveList(User user) {
        super(user);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_3 = 0;
        while (buff.remaining() > limit) {

            _loc_3 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_3 >> 3) {
                case 1: {
                    MoveInfo tmp = new MoveInfo(user);
                    ReadUtils.read$TYPE_MESSAGE(buff, tmp);
                    this.moveList.add(tmp);
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
        for (MoveInfo info : moveList) {
            setMsg(info.userId + " 走来走去的");
        }
    }

}
