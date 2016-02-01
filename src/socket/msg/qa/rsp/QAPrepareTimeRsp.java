/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package socket.msg.qa.rsp;

import component.User;
import socket.util.ByteArray;
import socket.util.ReadUtils;

/**
 *
 * @author Ming Jiang
 */
public class QAPrepareTimeRsp extends socket.msg.basic.Respond {
    private int time;
    private int rightNumber;
    private int wrongNumber;
    private int status;

    public QAPrepareTimeRsp(User user) {
        super(user);
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
      int _loc_7 = 0;
            int _loc_3 = 0;
            int _loc_4 = 0;
            int _loc_5 = 0;
            int _loc_6 = 0;
            while (buff.remaining() > limit)
            {
                
                _loc_7 = ReadUtils.read$TYPE_UINT32(buff);
                switch(_loc_7 >> 3)
                {
                    case 1:
                    {
                        if (_loc_3 != 0)
                        {
                            show("Bad data format: QAPrepareTimeRsp.time cannot be set twice.");
                        }
                        _loc_3 = _loc_3 + 1;
                        this.time = ReadUtils.read$TYPE_INT32(buff);
                        break;
                    }
                    case 2:
                    {
                        if (_loc_4 != 0)
                        {
                            show("Bad data format: QAPrepareTimeRsp.rightNumber cannot be set twice.");
                        }
                        _loc_4 = _loc_4 + 1;
                        this.rightNumber = ReadUtils.read$TYPE_INT32(buff);
                        break;
                    }
                    case 3:
                    {
                        if (_loc_5 != 0)
                        {
                            show("Bad data format: QAPrepareTimeRsp.wrongNumber cannot be set twice.");
                        }
                        _loc_5 = _loc_5 + 1;
                        this.wrongNumber = ReadUtils.read$TYPE_INT32(buff);
                        break;
                    }
                    case 4:
                    {
                        if (_loc_6 != 0)
                        {
                            show("Bad data format: QAPrepareTimeRsp.status cannot be set twice.");
                        }
                        _loc_6 = _loc_6 + 1;
                        this.status = ReadUtils.read$TYPE_INT32(buff);
                        break;
                    }
                    default:
                    {
                                           error("unknown data", buff);
                    return;
                    }
                }
            } }

    @Override
    protected void action() {
      //  System.out.println(this);
    }
    
}
