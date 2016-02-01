package socket.msg.system;

import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;
import data.StaticInfo;

public class LoginAck extends socket.msg.basic.Respond {

    public LoginAck(User user) {
        super(user);
        // TODO Auto-generated constructor stub
    }

    public int result;

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_4 = 0;
        int _loc_3 = 0;
        while (buff.remaining() > limit) {

            _loc_4 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_4 >> 3) {
                case 1: {
                    if (_loc_3 != 0) {
                        show("Bad data format: LoginAck.result cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.result = ReadUtils.read$TYPE_ENUM(buff);
                    break;
                }
                default: {
                    error("fail reading data", buff);
                    return;
                }
            }
        }
    }

    @Override
    protected void action() {
        if (result != 0) {
            StaticInfo.debug(user.getAcc()+this.getClass() + " : result: " + result);
        }

    }

}
