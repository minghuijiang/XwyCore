/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xwy;

import com.mingJiang.util.HttpUtil;
import component.XwyInfo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ming Jiang
 */
public class BiliGame extends Game {

    public static String enterUrl = "http://xwy.bilibili.wan.liebao.cn/";
    public static String gameUrl = "http://xwy.bilibili.wan.liebao.cn/play.html?sid=1";
    public static String bypassUrl = "http://i.wan.liebao.cn/game/play?gid=25&sid=1&pf=bili&fail_redirect_url=http%3A%2F%2Fxwy.bilibili.wan.liebao.cn%2Flogin_ok%3Fact%3Dredirect";

    @Override
    public boolean getURL(XwyInfo user) {
        try {
            List<String> header = getHeader(user);
            List<String> result = HttpUtil.sendGet(enterUrl, header, null, true);

            String web = result.get(result.size() - 1).split("url:\"")[1].split("\"")[0];// first redirct
            result = HttpUtil.sendGet(web, header);

            web = result.get(result.size() - 1).split("\\[")[1].split("\\]")[0];// second redirct;
            result = HttpUtil.sendGet(web, header);

            web = result.get(result.size() - 1).split("\\[")[1].split("\\]")[0];// last redirct
            result = HttpUtil.sendGet(web, header);
            HttpUtil.setCookies(user.getAcc().getCookies(), result);

            web = result.get(result.size() - 1).split("\\[")[1].split("\\]")[0];// get game first redirect;

            result = HttpUtil.sendGet(web, header);
            HttpUtil.setCookies(user.getAcc().getCookies(), result);

            header = getHeader(user);

            result = HttpUtil.sendGet(bypassUrl, header);
            web = result.get(result.size() - 1).split("\\[")[1].split("\\]")[0];;
            user.setUrl(web);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    @Override
    protected void addGame(XwyInfo user, String captcha) {
        // don't need add;
    }

    @Override
    protected List<String> getHeader(XwyInfo user) {
        List<String> header = new ArrayList<>();

        header.add("Host: secure.bilibili.tv");
        header.add("Connection: keep-alive");
        header.add("Accept: */*");
        header.add("User-Agent: Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/28.0.1500.95 Safari/537.36");
        header.add("Referer: http://xwy.bilibili.wan.liebao.cn/");
        header.add("Accept-Encoding: gzip,deflate,sdch");
        header.add("Accept-Language: en-US,en;q=0.8");
        header.add(user.getAcc().getCookies().getCookie(null));
        return header;

    }

}
