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
public class QARoundStartRsp extends socket.msg.basic.Respond {
    private int round;
    private int questionId;

    public QARoundStartRsp(User user) {
        super(user);
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_5 = 0;
            int _loc_3 = 0;
            int _loc_4 = 0;
            while (buff.remaining() > limit)
            {
                
                _loc_5 = ReadUtils.read$TYPE_UINT32(buff);
                switch(_loc_5 >> 3)
                {
                    case 1:
                    {
                        if (_loc_3 != 0)
                        {
                            show("Bad data format: QARoundStartRsp.round cannot be set twice.");
                        }
                        _loc_3 = _loc_3 + 1;
                        this.round = ReadUtils.read$TYPE_INT32(buff);
                        break;
                    }
                    case 2:
                    {
                        if (_loc_4 != 0)
                        {
                            show("Bad data format: QARoundStartRsp.questionId cannot be set twice.");
                        }
                        _loc_4 = _loc_4 + 1;
                        this.questionId = ReadUtils.read$TYPE_INT32(buff);
                        break;
                    }
                    default:
                    {
                                           error("unknown data", buff);
                    return;
                    }
                }
            }}

    @Override
    protected void action() {
      //  System.out.println(this);
    }
    
}
