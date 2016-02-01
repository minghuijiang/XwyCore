/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket.msg.qa.rsp;

import component.User;
import java.util.ArrayList;
import java.util.List;
import socket.util.ByteArray;
import socket.util.ReadUtils;

/**
 *
 * @author Ming Jiang
 */
public class QAEnterResultRsp extends socket.msg.basic.Respond {

    private boolean succeed;
    private QARoomInfoRsp roomInfo;
    private List<QAPlayerInfoRsp> playerList = new ArrayList<>();

    public QAEnterResultRsp(User user) {
        super(user);
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_5 = 0;
        int _loc_3 = 0;
        int _loc_4 = 0;
        while (buff.remaining() > limit) {

            _loc_5 = ReadUtils.read$TYPE_UINT32(buff);
            switch (_loc_5 >> 3) {
                case 1: {
                    if (_loc_3 != 0) {
                        show("Bad data format: QAEnterResultRsp.succeed cannot be set twice.");
                    }
                    _loc_3 = _loc_3 + 1;
                    this.succeed = ReadUtils.read$TYPE_BOOL(buff);
                    break;
                }
                case 2: {
                    if (_loc_4 != 0) {
                        show("Bad data format: QAEnterResultRsp.roomInfo cannot be set twice.");
                    }
                    _loc_4 = _loc_4 + 1;
                    this.roomInfo = new QARoomInfoRsp(user);
                    ReadUtils.read$TYPE_MESSAGE(buff, this.roomInfo);
                    break;
                }
                case 3: {
                    QAPlayerInfoRsp tmp = new QAPlayerInfoRsp(user);
                    ReadUtils.read$TYPE_MESSAGE(buff, tmp);
                    this.playerList.add(tmp);

                }
                default: {
                    error("unknown data", buff);
                    return;
                }
            }
        }
    }

    @Override
    protected void action() {
    //    System.out.println(this);
    }

}
