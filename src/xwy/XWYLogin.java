package xwy;


import com.mingJiang.log.Logging;
import com.mingJiang.util.HttpUtil;
import com.mingJiang.login.Login;
import com.mingJiang.util.PanelUtil;
import com.mingJiang.util.account.Cookies;
import com.mingJiang.util.json.Json;
import component.User;

import component.XwyInfo;
import data.Constant;
import data.StaticInfo;
import gui.basic.event.PlatformChangeListener;
import gui.basic.event.PlatformChangedEvent;
import message.MainMsg;

public class XWYLogin {

    static {
        Logging.initLogger();
        
        Cookies.setNeed(null);
    }

    public static Game game = new QQGame();

    public static void changeGame(PlatformChangedEvent e) {
        StaticInfo.debug("change game "+e);
        switch (e.getInfo().platformConstant) {
            case Constant.TENCENT:
                game = new QQGame();
                break;
            case Constant.RENREN:
                game = new RRGame();
                break;
            default:
                PanelUtil.showInfo("unimplemented game: " + e.getInfo().platformConstant);
                break;
        }

    }

    public static boolean getGameSessionKey(User user) {
    //    System.out.println("game "+StaticInfo.login.getClass());
        return getGameSessionKey(user, 0);
    }

    private static boolean getGameSessionKey(User user, int err) {
        String html = getSessionKey(user);
        if (html.length() < 1) {
            return false;
        }

        boolean isError = false;
        try {
            Json j = new Json(html);
         //   System.out.println(j.toFormatString());

            String session = j.getString("sessionId");
            //  System.out.println(session);
            if (session == null) {// test if openkey and pfkey exist;
                String pfKey = j.getString("platkey");
                if (pfKey != null) {
                    String openKey = j.getString("platuid");
                    user.getInfo().setOpenKey(openKey);
                    user.getInfo().setPfKey(pfKey);
                    session = MainMsg.login(user);
                    if (session.length() > 2) {
                        user.getInfo().setSessionKey(session);
                    } else {
                        isError = true;
                    }
                } else {
                    StaticInfo.debug("no session key");
                    StaticInfo.debug(html);
                    isError = true;
                }
            } else {
                user.getInfo().setSessionKey(session);
            }
        } catch (Exception e) {
            isError = true;
            StaticInfo.debug(e.getMessage() + "  : " + html);
        }
        if (isError) {
        	StaticInfo.debug(user.getInfo().getUrl());
            StaticInfo.debug("retry");
            if (err > 5) {
            	
                StaticInfo.debug("错误链接");
                return false;
            } else {
                if (html.contains("Notice: Undefined index")) {
                    user.getInfo().setUrl("");
                    return getGameSessionKey(user, ++err);
                }
                return getGameSessionKey(user, ++err);
            }
        }
        return true;
    }

    private static String getSessionKey(User user) {
        //     System.out.println("get session key");
        XwyInfo data = user.getInfo();
        if (data.getUrl().length() > 10) {
            String val = HttpUtil.getWebpage(data.getUrl(), 2);
            //   System.out.println(val);
            if (val.length() < 2) {
                StaticInfo.debug("链接错误");
                data.setUrl("");
            } else if (val.contains("平台已经掉线")) {
                StaticInfo.debug("平台掉线 重登");
                data.setUrl("");
            } else {
                return val;
            }
        }
         //   System.out.println("login "+StaticInfo.login.getClass());
          //   System.out.println(data.toXML());
        int result = StaticInfo.login.login(data.getAcc());
    //    System.out.println(data.toXML());
            System.out.println("get session key end login "+result);
        switch (result) {// try relogin and get session
            case Login.SUCCESS:
          //      System.out.println("login success============ "+game.getClass());
                if (game.getURL(data)) {
                    user.getInfo().setUrl(user.getServer().parseUrl(user.getInfo().getUrl()));
                    return getSessionKey(user);
                } else {
                    System.out.println("this should not happened. xwylogin, fail after success");
                    return "";
                }
            case Login.PASSWORD_ERROR:
                user.error("密码错误 " + user.getAcc());
                return "";
            case Login.FREEZE:
                user.error("账号冻结: " + user.getAcc());
//                if (game.getURL(data)) {
//                    user.getInfo().setUrl(user.getServer().parseUrl(user.getInfo().getUrl()));
//                    return getSessionKey(user);
//                } else {
//                    System.out.println("this should not happened. xwylogin, fail after success");
//                    return "";
//                }
                return "";
            default:
                user.error("未知错误");
                return "";
        }
    }

    public static String getGameSessionKey(String url) {
        User u = new User(new XwyInfo("", "", url));
        if (getGameSessionKey(u)) {
            return u.getInfo().getSessionKey();
        }
        return "";
    }
    
    public static String getGameSessionKey(String url,boolean noParse) {
        User u = new User(new XwyInfo(url,noParse));
        if (getGameSessionKey(u)) {
            return u.getInfo().getSessionKey();
        }
        return "";
    }
}
