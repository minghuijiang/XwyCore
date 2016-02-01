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
public class QARoomInfoRsp extends socket.msg.basic.Info {
    private boolean startQA;
    private int round;
    private int questionId;

    public QARoomInfoRsp(User user) {
        super(user);
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_6 = 0;
            int _loc_3 = 0;
            int _loc_4 = 0;
            int _loc_5 = 0;
            while (buff.remaining() > limit)
            {
                
                _loc_6 = ReadUtils.read$TYPE_UINT32(buff);
                switch(_loc_6 >> 3)
                {
                    case 1:
                    {
                        if (_loc_3 != 0)
                        {
                            show("Bad data format: QARoomInfoRsp.startQA cannot be set twice.");
                        }
                        _loc_3 = _loc_3 + 1;
                        this.startQA = ReadUtils.read$TYPE_BOOL(buff);
                        break;
                    }
                    case 2:
                    {
                        if (_loc_4 != 0)
                        {
                            show("Bad data format: QARoomInfoRsp.round cannot be set twice.");
                        }
                        _loc_4 = _loc_4 + 1;
                        this.round = ReadUtils.read$TYPE_INT32(buff);
                        break;
                    }
                    case 3:
                    {
                        if (_loc_5 != 0)
                        {
                            show("Bad data format: QARoomInfoRsp.questionId cannot be set twice.");
                        }
                        _loc_5 = _loc_5 + 1;
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

}
