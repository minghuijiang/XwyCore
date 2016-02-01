/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xwy;

import com.mingJiang.util.EncodeUtil;
import com.mingJiang.util.Util;
import com.mingJiang.util.json.Json;

import component.XwyInfo;
import data.StaticInfo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ming Jiang
 */
public class QQGame extends Game {

    private static final String urlURL = "http://appframe.qq.com/cgi-bin/qzapps/appframe.cgi?appid=100645087&qz_ver=6&pf=qzone&via=QZ.MYAPP&v=1&g_tk=";
    private static final String formateURL
            = "http://app100645087.qzone.qzoneapp.com/?qz_height=1400&qz_width=950&openid=%s"
            + "&openkey=%s&pf=qzone&pfkey=%s&qz_ver=6&appcanvas=1&params=&via=QZ.MYAPP";

    private static final String qref = "http://appstore.qzone.qq.com/cgi-bin/qzapps/qz_appstore_app_lite_v3.cgi?"
            + "appid=100645087&uin=%s&pfid=2&qz_ver=6&appcanvas=0&qz_style=v6/88&params=&entertime=%d&canvastype=home&via=QZ.APP.SEARCH";
    private static final String addGameData
            = "qzreferrer=%s&%s"
            + "&appid=100645087&pfid=2&qz_ver=6&appcanvas=0&qz_style=v6/88&params="
            + "&entertime=%d&canvastype=home&via=QZ.APP.SEARCH&detail=";

    @Override
    public boolean getURL(XwyInfo user) {
        String data = "";
        try {
            List<String> prop = getHeader(user);
            List<String> result = connect(urlURL + getHash(user), null, prop);
            data = result.get(result.size() - 1);
          //  System.out.println(data);
            if (data.contains("未开通应用")) {
                StaticInfo.debug(user.getAcc().getUser()+": 未开通应用。尝试开通");
                addGame(user);
                return getURL(user);
            }
            Json j = new Json(data).getJson("data");
            String url = String.format(formateURL, j.getString("openid"),
                    j.getString("openkey"), j.getString("pfkey"));
         //   System.out.println(url);
            user.setUrl(url);
            return true;
        } catch (Exception e) {
            StaticInfo.debug("getURL: "+e.getMessage()+"  " + data );
            e.printStackTrace();
        }
        return false;
    }

    @Override
    protected List<String> getHeader(XwyInfo user) {
        List<String> tmp = new ArrayList<>(12);
        tmp.add("Host: app100645087.qzone.qzoneapp.com");
        tmp.add("Connection: keep-alive");
        tmp.add("Origin: http://user.qzone.qq.com");
        tmp.add("User-Agent: Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.64 Safari/537.11");
        tmp.add("Accept: text/html,application/xhtml+xml,application/xml;q=0.9,* /*;q=0.8");
        tmp.add("Referer: http://os.qzs.qq.com/qzone/v6/app/app_redirect.html");
        tmp.add("Accept-Encoding: gzip,deflate,sdch");
        tmp.add("Accept-Language: en-US,en;q=0.8");
        tmp.add("Accept-Charset: ISO-8859-1,utf-8;q=0.7,*;q=0.3");
        tmp.add(user.getAcc().getCookies().getCookie(null));
        return tmp;
    }

    @Override
    protected void addGame(XwyInfo user, String captcha) {
        List<String> head = getHeader(user);
        String uin = "uin=" + user.getAcc().getUser() + "&g_tk=" + getHash(user);
        String data = String.format(addGameData,
                EncodeUtil.encode(String.format(qref, user.getAcc().getUser(), System.currentTimeMillis() - 1000)), uin, System.currentTimeMillis());
        
        if (captcha != null) {
            data += "&code=" + captcha;
        }
        List<String> result = connect(
                "http://appsupport.qzone.qq.com/cgi-bin/qzapps/userapp_addapp.cgi?" + uin, data, head);
        String d = result.get(result.size() - 1);
     //   System.out.println(d);
        if (d.contains("验证码输出")) {
        	if(captcha!=null){
        		Util.print(result);
        		return ;
        	}
            String c = StaticInfo.login.getCaptcha(user.getAcc());
            addGame(user, c);
        }
    }

    private int getHash(XwyInfo info) {
        return getHash(info.getAcc().getCookies().getVal("skey"));
    }

    private int getHash(String str) {
        int hash = 5381;
        for (int i = 0, len = str.length(); i < len; ++i) {
            hash += (hash << 5) + str.charAt(i);
        }
        return hash & 2147483647;
    }

}
