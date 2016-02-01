/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.server;

import com.mingJiang.login.Login;
import static data.StaticInfo.debug;
import data.Constant;

/**
 *
 * @author Ming Jiang
 */
public abstract class ServerInfo {

    public static ServerInfo getServer(int pla, int ser) {
        switch (pla) {
            case Constant.TENCENT:
                return new QQServer(ser);
            case Constant.RENREN:
                return new RRServer(ser);
            case Constant.SINA:
                return new SNServer(ser);
            case Constant.ACFUN:
                return new ACServer(ser);
            case Constant.BILI:
                return new BiliServer(ser);
            case Constant.FACEBOOK:
                return new FBServer(ser);
            case Constant.U17:
                return new U17Server(ser);
            case Constant.UZ:
                return new UZServer(ser);
            default:
                debug("未知服务器: " + pla);
                return null;
        }
    }

    public String gateway;
    public String socketURL;
    public String platform;
    public String urlSuffix;
    public String seridSuffix;
    protected int vSerid;// showed serid;
    protected int serid;
    protected int changeId;// 合区后.
    public int port;
    public String tgwHeader;
    public int platformConstant;
    protected String nickName;

    public ServerInfo(int serid) {
        this.serid = serid;
        this.vSerid= serid;
        checkBounds();

        initInfo();
    }

    public abstract void initInfo();

    public String getFileName() {
        return "Account" + nickName + "-" + vSerid + ".xml";
    }

    public int getSerid(){
        return serid;
    }
    
    public int getvSerid() {
		return vSerid;
	}

	public void setvSerid(int vSerid) {
		this.vSerid = vSerid;
	}

	public String getServerInfo() {
        return platform + vSerid + "区";
    }
    
    public String parseUrl(String link){
        String[] ssp = link.split("serid=");
        // check serid=
        if(ssp.length==2){
            link = ssp[0]+ ssp[1].substring(ssp[1].indexOf("&")+1);
        }
        //check choseId=
        ssp = link.split("choseId=");
        if(ssp.length==2){
            link = ssp[0]+ ssp[1].substring(ssp[1].indexOf("&")+1);
        }
        
        link+= urlSuffix;
        return link;
    }
    

    @Override
    public String toString() {
        return getServerInfo() + "\ngateway: " + gateway + "\nsocket: " + socketURL + ":" + port + "\ntgwheader: " + tgwHeader;
    }

    public abstract Login getLogin();

    public abstract void checkBounds();
}
