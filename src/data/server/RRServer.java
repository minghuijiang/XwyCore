/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.server;

import com.mingJiang.login.Login;
import com.mingJiang.login.qqLogin.QQLogin;
import com.mingJiang.login.rrLogin.RRLogin;
import data.Constant;

/**
 *
 * @author Ming Jiang
 */
public class RRServer extends ServerInfo {

    public RRServer(int serid) {
        super(serid);
    }

    @Override
    public void initInfo() {

        nickName = "rr";
        platform = "人人";
        platformConstant = Constant.RENREN;
        port = 443;
        gateway = String.format("http://s%d.renren.xwy.youzu.com/gateway.php?", serid);
        seridSuffix = "&serid="+serid;
        urlSuffix = seridSuffix;
        if (serid == 1) {
            socketURL = "122.226.199.135";
        } else if (serid == 2) {
            socketURL = "122.226.207.153";
        } else {
            socketURL = String.format("fs%d.renren.xwy.uuzuonline.net", serid);
        }
        tgwHeader = null;
    }


    @Override
    public Login getLogin(){
        return new RRLogin();
    }

    @Override
    public void checkBounds() {
        if(serid>3||serid<1)
           throw new UnsupportedOperationException("Not supported yet. init info"); //To change body of generated methods, choose Tools | Templates.
}
}
