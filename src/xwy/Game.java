/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xwy;

import com.mingJiang.util.HttpUtil;
import component.User;
import component.XwyInfo;
import data.StaticInfo;
import java.util.List;
import message.MainMsg;

/**
 *
 * @author Ming Jiang
 */
public abstract class Game {

    // after this method, user.getInfo.getURL should contain the gameURL, null otherwise;
    // return true if get url is success;
    public abstract boolean getURL(XwyInfo user);

    protected void addGame(XwyInfo info) {
        addGame(info, null);
    }

    protected abstract void addGame(XwyInfo user, String captcha);

    protected abstract List<String> getHeader(XwyInfo user);

    protected String sendLogin(XwyInfo user) {
        return MainMsg.login(new User(user));
    }

    protected void login(XwyInfo user) {
        StaticInfo.login.login(user.getAcc());
    }

    protected List<String> connect(String url, String data, List<String> head) {
        return HttpUtil.connect(url, data, head, null, true);
    }
}
