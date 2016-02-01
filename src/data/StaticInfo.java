package data;

import component.User;
import gui.basic.MainPanel;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import javax.swing.JComboBox;
import com.mingJiang.login.Login;
import com.mingJiang.util.EncodeUtil;
import com.mingJiang.util.FileUtil;
import com.mingJiang.util.account.Account;
import com.mingJiang.util.proxy.ProxyLibrary;
import com.mingJiang.data.Pair;
import com.mingJiang.log.Logging;
import com.mingJiang.login.qqLogin.QQLogin;
import com.mingJiang.util.xml.TagElement;
import com.mingJiang.util.xml.UnclosedTagException;
import gui.basic.LoginPanel;
import com.mingJiang.util.PanelUtil;
import data.server.QQServer;
import data.server.ServerInfo;
import gui.basic.event.PlatformChangeListener;
import gui.basic.event.PlatformChangedEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import xwy.XWYLogin;

public class StaticInfo {

    static {
        Logging.initLogger();
    }
//test

    // Gui info start
    public static Dimension size = new Dimension(518, 518);
    public static Point position = new Point(385, 100);
    public static boolean encrypted = true;
    public static Font font = new Font("kaiti", Font.PLAIN, 14);
    public static String dataFile = "data.res";
    //gui info end;

    //platform server  start
    public static ServerInfo server;
    public static ProxyLibrary pl;
    public static boolean useProxy = false;
    public static String proxyFile = "proxy.txt";
    public static boolean debugMode = true;
    //platform server end

    // login preservation start
    public static int STORE_SIZE = 5;
    public static List<Pair<String, String>> passwords = new ArrayList<>();
    public static List<Pair<String, String>> urls = new ArrayList<>();
    public static Login login= new QQLogin();
    public static String GP;
    public static String lastUser = "";
    //login end

    //singleton start 
    public static MainPanel panel;
    public static LoginPanel loginPane;
    public static User user;
    //singleton end
    public static long startTime;
    public static long endTime;
    
    //multi start

    private static final List<PlatformChangeListener> changeListener = new ArrayList<>();
    //multi end

    static{
        StaticInfo.addListener(new PlatformChangeListener() {

            @Override
            public void platformChanged(PlatformChangedEvent e) {
                XWYLogin.changeGame(e);
            }

        });
    }
    public static void addListener(PlatformChangeListener lis){
        log("register listener");
        changeListener.add(lis);
    }
    
    public static boolean registerPlatform(int p, int s) {
        if (server!=null&&(server.platformConstant == p && server.getvSerid() == s)) {
        	log("服务器不变: "+server.getServerInfo());
            return true;
        }
        ServerInfo tmp = null;
        try {
            tmp = ServerInfo.getServer(p, s);
        } catch (UnsupportedOperationException e) {
            tmp = null;
        }
        if (tmp == null) {
            showMessage("暂时不支持该服务器.", 0);
            return false;
        }
        
        server = tmp;

        login = server.getLogin();
        log("服务器变化: " + server.getServerInfo());

        for(PlatformChangeListener lis: changeListener){
            lis.platformChanged(new PlatformChangedEvent("StaticInfo.registerPlatform",server));
        }
        return true;
    }

    public static void setMainUser(JComboBox<String> userBox) {
        userBox.addItem(lastUser);
        int count = 0;
        for (Pair<String, String> pair : passwords) {
            if (!pair.getKey().equalsIgnoreCase(lastUser)) {
                userBox.addItem(pair.getKey());
                if (count++ >= STORE_SIZE) {
                    break;
                }
            }
        }
    }

    public static void setUrl(JComboBox<String> urlBox) {
        System.out.println("set url");

        int count = 0;
        for (Pair<String, String> pair : urls) {
            System.out.println(pair);
            urlBox.addItem(pair.getKey() + "----" + pair.getObj());
            if (count++ >= STORE_SIZE) {
                break;
            }

        }
    }

    public static String getPassword(String userName) {
        for (Pair<String, String> val : passwords) {
            if (val.getKey().equalsIgnoreCase(userName)) {
                return val.getObj();
            }
        }
        return "";
    }

    public static void successLogin(Account acc) {
        lastUser = acc.getUser();
        for (int i = 0; i < passwords.size(); i++) {
            if (passwords.get(i).getKey().equalsIgnoreCase(lastUser)) {
                passwords.remove(i);
                i--;
            }
        }
        passwords.add(new Pair<>(acc.getUser(), acc.getPass()));
    }

    public static void successURL(String nameUrl) {
        String[] vals = nameUrl.split("----", 2);
        for (int i = 0; i < urls.size(); i++) {
            if (urls.get(i).getObj().equalsIgnoreCase(vals[1])) {
                urls.remove(i);
                i--;
            }
        }
        urls.add(new Pair<>(vals[0], vals[1]));
    }

    public static void registerPanel(MainPanel basic) {
        panel = basic;
        loginPane = new LoginPanel(panel);
    }

    public static void registerUser(User u) {
        user = u;
    }

  

    public static void initRes() {
        String tmps = "";
        if (new File(dataFile).exists()) {
            TagElement tag;
            try {
                byte[] data = FileUtil.readAllBytes(dataFile);
                EncodeUtil.decode(data);
                tmps = new String(data);
                debug("init res "+tmps);
                //  System.out.println(tmps);
                tag = new TagElement(tmps);
                   System.out.println(tag.toXMLString());
                startTime = tag.getLongVal("start");
                endTime = tag.getLongVal("end");
                int x = tag.getIntVal("posX");
                int y = tag.getIntVal("posY");
                if (x != 0 || y != 0) {
                    position = new Point(tag.getIntVal("posX"), tag.getIntVal("posY"));
                }
                int w = tag.getIntVal("width");
                int h = tag.getIntVal("height");
                if (w != 0 || h != 0) {
                    size = new Dimension(tag.getIntVal("width"), tag.getIntVal("height"));
                }
                for (TagElement tmp : tag.get("users").getAll("acc")) {
                    passwords.add(new Pair<>(tmp.getVal("uin"), tmp.getVal("pass")));
                }
                for (TagElement tmp : tag.get("urls").getAll("url")) {
                    urls.add(new Pair<>(tmp.getVal("nm"), tmp.getVal("link")));
                }
                lastUser = tag.getVal("lastUser");
                if (tag.contains("info")) {
                    panel.readSerializedString(tag.get("info"));// read saved data
                }

            } catch (UnclosedTagException e) {
                debug("init res fail "+tmps);
            } catch (IOException ex) {
                debug("file read fail."+ ex.getMessage());
            }
        }
    }

    public static void saveRes() {
        StringBuilder sb = new StringBuilder("<res>");
        sb.append("<posX>").append(position.x).append("</posX>");
        sb.append("<posY>").append(position.y).append("</posY>");
        sb.append("<width>").append(size.width).append("</width>");
        sb.append("<height>").append(size.height).append("</height>");
        sb.append("<start>").append(startTime).append("</start>");
        sb.append("<end>").append(endTime).append("</end>");
        sb.append("<lastUser>").append(lastUser).append("</lastUser>");
        sb.append("<users>");
        int count = 0;
        for (int i = passwords.size() - 1; i >= 0; i--) {//reverse save
            Pair<String, String> pair = passwords.get(i);
            sb.append("<acc><uin>").append(pair.getKey()).
                    append("</uin><pass>").append(pair.getObj()).
                    append("</pass></acc>");
            if (count++ > STORE_SIZE) {
                break;
            }
        }
        sb.append("</users>");
        sb.append("<urls>");
        count = 0;
        for (int i = urls.size() - 1; i >= 0; i--) {
            Pair<String, String> pair = urls.get(i);
            sb.append("<url><nm>").append(pair.getKey()).
                    append("</nm><link>").append(pair.getObj()).
                    append("</link></url>");
            if (count++ > STORE_SIZE) {
                break;
            }
        }
        sb.append("</urls>");

        if (panel != null) {
            sb.append("<info>").append(panel.toSerializedString()).append("</info>");
        }
        sb.append("</res>");
        String end= sb.toString();
        debug("save res "+end);
        //	System.out.println(tag.toXMLString());
        byte[] data = end.getBytes();
        EncodeUtil.encode(data);
        try {
            FileUtil.writeAllBytes(dataFile, data);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(StaticInfo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showTime() {
        if (panel != null) {
            if (startTime == 0 && endTime == 0) {
                setMsg("第一次运行.");
                return;
            }
            long current = System.currentTimeMillis();
            setMsg("上次运行开始时间: " + getTime(current - startTime));
            setMsg("上次运行结束时间: " + getTime(current - endTime));
        }
    }

    public static String getTime(long time) {
        time /= 60000; //换算成分钟
        String timeStr = "";
        if (time >= 60) {
            timeStr += time / 60 + "小时 ";
        }
        timeStr += (time % 60) + "分钟";

        return timeStr;
    }

    public static void setMsg(String msg) {
        if (panel != null) {
            panel.setMsg(msg);
        } else {
            System.out.println("MSG: "+msg);
        }
    }

    public static boolean showLog = true;
    public static void log(String log) {
    	if(showLog){
	        if (panel != null) {
	            panel.log(log);
	        } else {
	            System.out.println("LOG: "+log);
	        }
    	}
    }

    public static void error(String error) {
        if (panel != null) {
            panel.error(error);
        } else {
            System.out.println("ERR: "+error);
        }
    }

    public static String getServerInfo() {
        return server.getServerInfo();
                }

    public static void showLoginPanel() {
        JOptionPane.showMessageDialog(panel, loginPane);
    }

    public static void showMessage(String msg, int timeout) {
        error(msg);
        PanelUtil.showInfo(msg, timeout);
    }
    public static String getCaller() {
        return "";//Thread.currentThread().getStackTrace()[3].toString();
    }
    public static void debug(String msg){
        if(debugMode){
            System.out.println(getCaller()+" : "+msg);
        }
    }
    
    public static void info(String log){
            System.out.println(getCaller()+" : "+log);

    }
}
