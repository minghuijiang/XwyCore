/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data.server;

import com.mingJiang.login.Login;
import com.mingJiang.login.qqLogin.QQLogin;

/**
 *
 * @author Ming Jiang
 */
public class SNServer extends ServerInfo{

    public SNServer(int serid) {
        super(serid);
    }

    @Override
    public void initInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        @Override
    public Login getLogin(){
        return null;
    }

    @Override
    public void checkBounds() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
