/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package socket.msg.register;

import component.User;
import socket.util.ByteArray;
import socket.util.ReadUtils;

/**
 *
 * @author Ming Jiang
 */
public class QAPrizeRsp extends socket.msg.basic.Respond {
    private String prize;

    public QAPrizeRsp(User user) {
        super(user);
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_4 = 0;
            int _loc_3 = 0;
            while (buff.remaining() > limit)
            {
                
                _loc_4 = ReadUtils.read$TYPE_UINT32(buff);
                switch(_loc_4 >> 3)
                {
                    case 1:
                    {
                        if (_loc_3 != 0)
                        {
                            show("Bad data format: QAPrizeRsp.prize cannot be set twice.");
                        }
                        _loc_3 = _loc_3 + 1;
                        this.prize = ReadUtils.read$TYPE_STRING(buff);
                        break;
                    }
                    default:
                    {
                   error("unknown data", buff);
                    return;
                    }
                }
            }
    }

    @Override
    protected void action() {
        System.out.println(this);
    }
    
}
