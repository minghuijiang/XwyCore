/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message;

import component.User;
import data.Constant;
import data.StaticInfo;

/**
 *
 * @author Ming Jiang
 */
public class FinanceMsg {

    //210003 -3    210002 - 2  210001 - 1
    public static String initFund(User user, int fundid) {
        return user.send(
                "act=buyfund&ctl=finance",
                "{\"fundid\":%d}", fundid
        );
    }

    //200003 -3   200002 -2  200001-1
    public static String initFinance(User user, int financeid) {
        return user.send(
                "act=buyfinance&ctl=finance",
                "{\"financeid\":%d}", financeid
        );
    }
    
    public static String getFinance(User user){
        return user.send(
                "ctl=finance&act=gainfinance",
                null
        );
    }
    public static String getFund(User user){
        return user.send(
                "ctl=finance&act=gainfund",
                null
        );
    }
}
