/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package xwy.game;

import com.mingJiang.login.Login;
import com.mingJiang.util.account.Account;

/**
 *
 * @author Ming Jiang
 */
public abstract class Game {
    public static final int GAME_NOT_INSTALLED = 1;
    public static final int NOT_LOGIN = 2;
    public static final int FREEZED = 3;
    public static final int UNKNOWN = 0;

    public String startGame(Account acc, Login login){
        String key = getGameSession(acc);
        if(key != null)// url success;
            return key;
        
        // try update URL;
        return reLogin(acc,login);
        
    }
    
    protected abstract String reLogin(Account acc, Login login);
    protected abstract String getGameSession(Account acc);
    protected abstract int getGameURL(Account acc);
    protected abstract boolean addGame(Account acc,int gameId);
    
    
}
