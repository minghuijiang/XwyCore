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
public class QQServer extends ServerInfo {

    public QQServer(int serid) {
        super(serid);
    }

    @Override
    public void initInfo() {
        nickName = "tx";
        platform = "腾讯";
        platformConstant = Constant.TENCENT;
        port = 443;
        
        seridSuffix = "&serid="+serid;
        urlSuffix = seridSuffix;
        if (vSerid == 1) {
            gateway = "http://app100645087.qzone.qzoneapp.com/gateway.php?";
            socketURL = "xwycsrtest.app100645087.twsapp.com";
            port = 80;
        } else if (vSerid >= 49) {
        	int tmp = vSerid+4;
            gateway = "http://xwynew"+tmp+".app100645087.twsapp.com/gateway.php?";
            socketURL = "xwy"+(tmp+1)+"csr1.app100645087.twsapp.com";
            seridSuffix = "&serid="+(tmp+1);
            urlSuffix = seridSuffix;
        }
//        else if (vSerid == 50) {
//        	int tmp = vSerid+4;
//            gateway = "http://xwynew"+tmp+".app100645087.twsapp.com/gateway.php?";
//            socketURL = "xwy"+(tmp+1)+"csr1.app100645087.twsapp.com";
//            seridSuffix = "&serid="+(tmp+1);
//            urlSuffix = seridSuffix;
//        }
   

        if(vSerid>=2&&vSerid<=10){
        	urlSuffix = "&serid=52&choseId="+serid;
            seridSuffix ="&serid=52";
            gateway ="http://ua3xwy.app100645087.twsapp.com/gateway.php?";
            socketURL ="fua3xwy.app100645087.twsapp.com";
     
        }else if(vSerid>=11&&vSerid<=20){
	        urlSuffix = "&serid=50&choseId="+serid;
	        seridSuffix ="&serid=50";
	        gateway ="http://ua1xwy.app100645087.twsapp.com/gateway.php?";
	        socketURL ="fua1xwy.app100645087.twsapp.com";

        }else if(vSerid>=21&&vSerid<=30){
        	urlSuffix = "&serid=51&choseId="+serid;
            seridSuffix ="&serid=51";
            gateway ="http://ua2xwy.app100645087.twsapp.com/gateway.php?";
            socketURL ="fua2xwy.app100645087.twsapp.com";
        }else if(vSerid>=31&&vSerid<=39){
        	urlSuffix = "&serid=53&choseId="+serid;
            seridSuffix ="&serid=53";
            gateway ="http://ua4xwy.app100645087.twsapp.com/gateway.php?";
            socketURL ="fua4xwy.app100645087.twsapp.com";
        } else if(vSerid>=40&&vSerid<=48){
        	gateway = "http://xwynew"+vSerid+".app100645087.twsapp.com/gateway.php?";
            socketURL = "xwy"+(vSerid+1)+"csr1.app100645087.twsapp.com";
            seridSuffix = "&serid="+(vSerid+1);
            urlSuffix = seridSuffix;
        } 
//        else if(vSerid>=50&&vSerid<=53){
//        	urlSuffix = "&serid="+vSerid+"&choseId=1";
//            seridSuffix ="&serid="+vSerid;
//            gateway ="http://ua"+(vSerid-49)+"xwy.app100645087.twsapp.com/gateway.php?";
//            socketURL ="fua"+(vSerid-49)+"xwy.app100645087.twsapp.com";
//        }
        
        tgwHeader = "tgw_l7_forward\r\nHost: " + socketURL + ":" + port + "\r\n\r\n";
        

    }

    
    @Override
    public Login getLogin(){
        return new QQLogin();
    }

    @Override
    public void checkBounds() {
        if(serid>60||serid<1)
           throw new UnsupportedOperationException("Not supported yet. init info"); //To change body of generated methods, choose Tools | Templates.
 }
}
