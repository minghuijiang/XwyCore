/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xwy;

import component.XwyInfo;
import data.StaticInfo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ming Jiang
 */
public class RRGame extends Game {

    private static String xwyUrl = "http://apps.renren.com/xiawuyu?origin=50115";

    @Override
    public boolean getURL(XwyInfo user) {
        List<String> data = connect(xwyUrl, null, getHeader(user));
      //  System.out.println(data.get(data.size()-1));
        try {
            String datas = data.get(data.size() - 1).split("id=\"iframe_canvas\"src=\"")[1]
                    .split("\" frameborder")[0];
            datas = datas.replace("&amp;", "&");
            user.setUrl(datas);
            return true;
        } catch (Exception e) {
            StaticInfo.debug("GetRR: " + user.getAcc() + "\n" + data == null ? "" : data.get(data.size() - 1));
        }
        return false;
    }

    @Override
    protected void addGame(XwyInfo user, String captcha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<String> getHeader(XwyInfo user) {
        List<String> header = new ArrayList<>();
        header.add("Host: www.renren.com");
        header.add("Connection: keep-alive");
        header.add("Origin: http://www.renren.com");
        header.add("X-Requested-With: XMLHttpRequest");
        header.add("User-Agent: Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/28.0.1500.95 Safari/537.36");
        header.add("Content-Type: application/x-www-form-urlencoded");
        header.add("Accept: */*");
        header.add("Referer: http://www.renren.com/");
        header.add("Accept-Encoding: gzip,deflate,sdch");
        header.add("Accept-Language: en-US,en;q=0.8");

        header.add(user.getAcc().getCookies().getCookie(null));
        return header;
    }

}
