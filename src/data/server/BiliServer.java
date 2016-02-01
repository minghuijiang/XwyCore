/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data.server;

import com.mingJiang.login.Login;
import com.mingJiang.login.biliLogin.BiliLogin;
import data.Constant;

/**
 *
 * @author Ming Jiang
 */
public class BiliServer extends ServerInfo{

    public BiliServer(int serid) {
        super(serid);
    }

    @Override
    public void initInfo() {
        
        nickName = "bili";
        platform = "哔哩";
        platformConstant = Constant.BILI;
        port = 443;
        seridSuffix = "&serid="+serid;
        urlSuffix = seridSuffix;
        gateway = String.format("http://s%d.kingsoft.xwy.youzu.com/gateway.php?", serid);
        socketURL = String.format("fs%d.kingsoft.xwy.uuzuonline.net", serid);
        
        tgwHeader = null;
        if(serid==3)
            port =16153;
    }

    @Override
    public Login getLogin() {
        return new BiliLogin();
    }

    @Override
    public void checkBounds() {
        if(serid<1||serid>3)
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
