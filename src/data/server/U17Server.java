/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data.server;

import com.mingJiang.login.Login;
import com.mingJiang.login.qqLogin.QQLogin;

import data.Constant;

/**
 *
 * @author Ming Jiang
 */
public class U17Server extends ServerInfo{

    public U17Server(int serid) {
        super(serid);
    }

    @Override
    public void initInfo() {
    	nickName = "tx";
        platform = "腾讯";
        platformConstant = Constant.TENCENT;
        
        seridSuffix = "&serid=-1113255026";
        urlSuffix = seridSuffix;
        {
            gateway = "http://ua1.xwy.9787.com/gateway.php?";
            socketURL = "fua1.9787.xwyw.uuzuonline.net";
            port = 15031;
        } 

        tgwHeader = "tgw_l7_forward\r\nHost: " + socketURL + ":" + port + "\r\n\r\n";
        
    }

    @Override
    public Login getLogin() {

    	return new QQLogin();
    }

    @Override
    public void checkBounds() {
       
    }
    
}
