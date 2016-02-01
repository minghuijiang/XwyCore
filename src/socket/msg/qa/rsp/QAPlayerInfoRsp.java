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
public class QAPlayerInfoRsp extends socket.msg.basic.Respond {
    private int userid;
    private String username;
    private String title;
    private int skinid;
    private int warriorcfgid;
    private int position;

    public QAPlayerInfoRsp(User user) {
        super(user);
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
            while (buff.remaining() > limit)
            {
                
                _loc_9 = ReadUtils.read$TYPE_UINT32(buff);
                switch(_loc_9 >> 3)
                {
                    case 1:
                    {
                        if (_loc_3 != 0)
                        {
                            show("Bad data format: QAPlayerInfoRsp.userid cannot be set twice.");
                        }
                        _loc_3 = _loc_3 + 1;
                        this.userid = ReadUtils.read$TYPE_INT32(buff);
                        break;
                    }
                    case 2:
                    {
                        if (_loc_4 != 0)
                        {
                            show("Bad data format: QAPlayerInfoRsp.username cannot be set twice.");
                        }
                        _loc_4 = _loc_4 + 1;
                        this.username = ReadUtils.read$TYPE_STRING(buff);
                        break;
                    }
                    case 3:
                    {
                        if (_loc_5 != 0)
                        {
                            show("Bad data format: QAPlayerInfoRsp.title cannot be set twice.");
                        }
                        _loc_5 = _loc_5 + 1;
                        this.title = ReadUtils.read$TYPE_STRING(buff);
                        break;
                    }
                    case 4:
                    {
                        if (_loc_6 != 0)
                        {
                            show("Bad data format: QAPlayerInfoRsp.skinid cannot be set twice.");
                        }
                        _loc_6 = _loc_6 + 1;
                        this.skinid = ReadUtils.read$TYPE_INT32(buff);
                        break;
                    }
                    case 5:
                    {
                        if (_loc_7 != 0)
                        {
                            show("Bad data format: QAPlayerInfoRsp.warriorcfgid cannot be set twice.");
                        }
                        _loc_7 = _loc_7 + 1;
                        this.warriorcfgid = ReadUtils.read$TYPE_INT32(buff);
                        break;
                    }
                    case 6:
                    {
                        if (_loc_8 != 0)
                        {
                            show("Bad data format: QAPlayerInfoRsp.position cannot be set twice.");
                        }
                        _loc_8 = _loc_8 + 1;
                        this.position = ReadUtils.read$TYPE_INT32(buff);
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
        //System.out.println(this); 
    	}
    
}
