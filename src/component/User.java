/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component;

import static data.StaticInfo.debug;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import message.EtcMsg;
import message.MainMsg;
import socket.ClientSocket;
import socket.msg.basic.Message;
import xwy.XWYLogin;

import com.mingJiang.login.Login;
import com.mingJiang.util.EncodeUtil;
import com.mingJiang.util.PanelUtil;
import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;
import com.mingJiang.util.json.JsonArray;
import component.map.Map;

import data.StaticInfo;
import data.server.QQServer;
import data.server.ServerInfo;

/**
 *
 * @author Ming Jiang
 */
public class User implements Comparable<User> {

	public int init=0;
	public int end = 0;
    private XwyInfo info;
    private Sender sender;
    private String sessionKey;

    private HashMap<String, Integer> intVal;
    private HashMap<String, Object> objVal;
    private String uname;

    public static boolean G_needSocket = true;
    public static boolean G_isSynchronized= true;
    public static boolean G_showHttp = false;
    public static boolean G_needData = false;
    public static boolean G_showServer = false;

    public static void setBug(){
    	G_needSocket = false;
    	G_isSynchronized = false;
    	G_needData = true;
    }
    
    public void setBugL(){
    	this.needSocket= false;
    	this.isSynchronized= false;
    	this.needData= true;
    }
    
    
    private boolean needData= G_needData;
    private boolean needSocket = G_needSocket;
    private boolean isSynchronized= G_isSynchronized;
    
    private ClientSocket socket;
    private List<Warrior> monster;
    private List<Warrior> fighter;
    private String group;
    private ItemSet items;
    private Map maps;
    private QuestSet quests;

    private ServerInfo server= StaticInfo.server==null?new QQServer(1):StaticInfo.server;

    private int fightCount = 0;
    private int fightNum = 0;
    private Object fightLock = new Object();
    private String fightId = "";
    private int pkId, mapId, fightType;
    private boolean isboss = false;
    private boolean isRob = false;
    private int[] robIds = new int[6];
    private boolean isWin = false;
    private boolean isError = false;

    private boolean isLogin= false;
    private int reLoginDelay = 0;
    public void setLogin(boolean login){
    	isLogin = login;
    }
    
    public void setDelay(int delay){
    	reLoginDelay = delay;
    }
    
    public synchronized boolean isLogin(){
    	if(!isLogin){
    		reLogin();
    	}
    	return isLogin;
    }
    
    
    public User() {
        this(new XwyInfo("", ""));
    }

    public User(XwyInfo info) {
        this.info = info;
        
        sender = new Sender(this);
        sessionKey = info.getSessionKey();
      //  needData = false;
    }
    
    public User(User user){
        this(user.getInfo());
    }

    public User(String sessionKey) {
        this(new XwyInfo(sessionKey));
    }

    public User(String acc, String pass) {
        this(new XwyInfo(acc, pass));
    }

    public User(String acc, String pass, String url) {
        this(new XwyInfo(acc, pass, url));
    }

    public User(String url, boolean mark) {
        this(new XwyInfo("", "", url));
    }

    public void deLogin() {
        sessionKey = info.getSessionKey();
        setSessionKey("");
    }

    public String getSessionKey() {
        return info.getSessionKey();
    }

    public void setSessionKey(String key) {
        info.setSessionKey(key);
        sessionKey = key;
        sender.setKey();
    }

    public synchronized int reLogin() {
    	if(isLogin)
    		return Login.SUCCESS;
    	if(reLoginDelay!=-1){
    		error(reLoginDelay+" 秒后自动重登");
    	}else{
    		setMsg("异地登陆 不自动重登");
    		if(PanelUtil.showComfirmation("异地登陆 是否重登")){
    			this.setSessionKey("");
    	        return login();
    		}else
    			isError = true;
    	}
    	long current = System.currentTimeMillis();
    	if(reLoginDelay>0)
	    	if(PanelUtil.showComfirmation("异地登陆 是否立刻重登 %d秒后自动重登", reLoginDelay)){
	            this.setSessionKey("");
	            return login();
	    	}
	    	else{
	    		try {
					Thread.sleep(reLoginDelay*1000 -(System.currentTimeMillis()-current));
				} catch (InterruptedException e) {		}
	            this.setSessionKey("");
	            return login();
	    	}
        this.setSessionKey("");
        return login();
    }
    
    /**
     * erase all data;
     */
    public void remove(){
    	monster = null;
    	maps = null;
    	intVal=null;
    	objVal = null;
    	fighter= null;
    	items=null;
    	quests= null;
    	if(socket!=null){
	    	socket.close();
	    	socket = null;
    	}
    	log("user remove");
    }

    public int login() {
        if (info.getSessionKey().length() < 1) {
            if (sessionKey.length() < 1) {
            //	info.getAcc().setPass("");
            //	info.setUrl("");
                XWYLogin.getGameSessionKey(this);
                setSessionKey(this.info.getSessionKey());
            } else {
                setSessionKey(sessionKey);
            }
        }

        if (info.getSessionKey().length() < 1) {
            StaticInfo.info(info.toXML());
            isLogin = false;
            return Login.PASSWORD_ERROR;
        }
        String data = MainMsg.initLogin(this);
        try {
            initUser(data);
            
        } catch (UnknownHostException uhe) {
            return 2;
        } catch (Exception e) {
            if(data.contains("_gam_err_notlogin")){
                System.out.println(data);
                this.error("异地登陆 重登");
                info.setSessionKey("");
                sessionKey = "";
                return Login.PASSWORD_ERROR;//login();
            }
            if(data.contains("无法连接")||data.contains("请联系网站管理员")){
                this.error("无法连接服务器. 重试");
                return login();
            }
            e.printStackTrace();
            StaticInfo.debug(e.getMessage()+"  "+this.getAcc()+"  data: "+data);
     //       e.printStackTrace();
            //relogin
            StaticInfo.debug(info.getUrl());
            this.error("sessionkey 错误 "+this.sessionKey);
            info.setSessionKey("");
            sessionKey = "";
            this.getInfo().getAcc().setPass("");
            return login();
        }
        /*		socket = new ClientSocket(this);
         socket.connect();
         socket.registHeart(new PingReq(), 30000+ (int)(Math.random()*30000));
         socket.sendMessage(new LoginReq(this.getUserId(),this.getSessionKey()));*/
        return 0;
    }

    public String sendASyn(String method, String data, Object... args){
    	if (data == null) {
            return sender.sendASynchronized(method, null);
        } else {
            return sender.sendASynchronized(method, String.format(data, args));
        }
    }
    
    public String send(String method, String data, Object... args) {
    	if(isSynchronized)
	        if (data == null) {
	            return sender.send(method, null);
	        } else {
	            return sender.send(method, String.format(data, args));
	        }
    	else
    		if (data == null) {
                return sender.sendASynchronized(method, null);
            } else {
                return sender.sendASynchronized(method, String.format(data, args));
            }
    }

    public String send(String type, String data) {
    	if(isSynchronized)
    		return sender.send(type, data);
    	else
    		return sender.sendASynchronized(type, data);
    }

    public void setMsg(Object msg) {
        setMsg(msg.toString());
    }

    public void setMsg(String msg) {
        if(G_showServer)
            StaticInfo.setMsg(this.getAcc() + ": "+server.getServerInfo()+" : " + msg);
        else
            StaticInfo.setMsg(this.getAcc() + ": " + msg);
    }

    public void log(Object msg) {
        log(msg.toString());
    }

    public void log(String msg) {
    	if(G_showServer)
            StaticInfo.log(this.getAcc() + ": "+server.getServerInfo()+" : " + msg);
        else
            StaticInfo.log(this.getAcc() + ": " + msg);
    }

    public void error(Object msg) {
        error(msg.toString());
    }

    public void error(String msg) {
    	if(G_showServer)
            StaticInfo.error(this.getAcc() + ": "+server.getServerInfo()+" : " + msg);
        else
            StaticInfo.error(this.getAcc() + ": " + msg);
    }

    public XwyInfo getInfo() {
        return info;
    }

    public Sender getSender() {
        return sender;
    }

    public boolean equals(Object obj) {
        if (obj instanceof User) {
            return this.getInfo().getAcc().getUser().equalsIgnoreCase(
                    ((User) obj).getInfo().getAcc().getUser());
        }
        return false;

    }

    public void sendMessage(Message msg) {
    	if(socket!=null)
    		this.socket.sendMessage(msg);
    	else{
    		this.error("send message on null socket. "+msg.getClass());
    	}
    }

    public void startSocket() {
        if(needSocket){
            socket = new ClientSocket(this);
            socket.connect();
        }
    }

    private String accString="";
    public String getAcc() {
    	if(accString.length()<1){
    		if(this.getInfo().getAcc().getUser().length()<1){
    			accString = ""+this.getId();
    		}else{
    			accString = this.getInfo().getAcc().getUser();
    		}
    	}
        return accString+" : ";
    }


    public void initUser(String rawJson) throws JSONException,
            UnknownHostException {
    	
        if (rawJson.contains("unknownHost")) {
            throw new UnknownHostException("connection fail");
        }
        intVal = new HashMap<>(100);
        objVal = new HashMap<>();

        Json data = new Json(rawJson).getJson("data");

        Json roleInfo = data.getJson("roleInfo");
        for (String key : roleInfo.keyset()) {
            Object o = roleInfo.get(key);
            if (o instanceof Integer) {
                intVal.put(key, (Integer) o);
            } else if (o instanceof String) {
                objVal.put(key, (String) o);
            } else {
                if (o instanceof JsonArray) {
                    try {
                        List<Integer> tmp = new ArrayList<>();
                        for (Object in : ((JsonArray) o).getItems()) {
                            tmp.add((Integer) in);
                        }
                        objVal.put(key, tmp);
                    } catch (Exception e) {
                        debug("fail add array:  " + e.getMessage() + "  " + o.toString());
                        objVal.put(key, o);
                    }
                }
            }

        }
        Object name = objVal.get("uname");
        if(name== null)
            name = ""+intVal.get("uname");
        uname = EncodeUtil.decode(name.toString());
        
        
        items = new ItemSet(this);
        maps = new Map(this);
        quests = new QuestSet(this);
        monster = new ArrayList<>();
        fighter = new ArrayList<>();
        
        // 获取出战侠客
        List<Object> tmp = data.getArray("rwarriorgroupList").getJson(0)
                .getArray("monsters").getItems();
        List<Integer> monsterId = new ArrayList<>();
        String format = "[\"%d\",\"%d\",\"%d\",\"%d\",\"%d\",\"%d\"]";


        for (Object o : tmp) {
            int i = Integer.parseInt((o.toString()).equals("") ? "-1" : o.toString());
            if (i != -1) {
                monsterId.add(i);
            }
        }
        if(monsterId.isEmpty())
            return;

        format = String.format(format, tmp.get(0), tmp.get(1), tmp.get(2),
                tmp.get(3), tmp.get(4), tmp.get(5));
        group = format;
        JsonArray xiake = data.getArray("rwarriorList");
        for (Object o : xiake.getItems()) {
            Json j = (Json) o;
            Warrior w = new Warrior(j);
            getMonster().add(w);
            if (monsterId.contains(w.getId())) {
                fighter.add(w);
            }
        }
   //     maps.init(new Json(EtcMsg.getMap(this)));
        if(!this.needData)
            return;
        
        items.parseArray(data.getArray("rbagitemList"));
        
        JsonArray questList = data.getArray("rquestList");
        if(questList!=null){
            quests.init(questList);
        }
        else{
            StaticInfo.debug("null quest "+data.toString());
        }
        this.startSocket();
      //  this.startSocket();
    }

    public void updateData(String data) {
        try {
            Json change = new Json(data).getJson("change");
            if (change == null) {
                return;
            }
         //   System.out.println(data);
            Json val = change.getJson("role");
            if (val != null) {
           // 	System.out.println("role: "+val);
                updateRole(val);
            }
            val = change.getJson("rmap");
            if (val != null) {
                updateMap(val);
            }
            if(!this.needData){
                return ;
            }
            val = change.getJson("rbagitem");
            if (val != null) {
                updateItem(val);
            }

            val = change.getJson("rquest");
            if (val != null) {
                updateQuest(val);
            }
            val = change.getJson("rwarrior");
            if (val != null) {
                updateWarrior(val);
            }
        } catch (JSONException ex) {
            this.log("error in change json: "+ex.toString()+"  "+data);
        }catch(Exception e){
            StaticInfo.debug(data);
            e.printStackTrace();
        }
    }

    /**
	 * @return the maps
	 */
	public Map getMaps() {
		return maps;
	}

	private synchronized void updateRole(Json json) {
        if (json == null) {
            return;
        }
        json = json.getJson("" + this.getId());
        if (json == null) {
            return;
        }

        for (String key : json.keyset()) {
            Object o = json.get(key);
            if (o instanceof Integer) {
                int val = (Integer)o;
                if(key.equalsIgnoreCase("gamepoint")){
                    int old = intVal.put("gamepoint", val);
                    if(val-old!=0)
                        this.setMsg("元宝变化 "+(val-old));
                }
                intVal.put(key, val);
            } else if (o instanceof String) {
                objVal.put(key, o.toString());
            } else {
                if (o instanceof JsonArray) {
                    try {
                        List<Integer> tmp = new ArrayList<>();
                        for (Object in : ((JsonArray) o).getItems()) {
                            tmp.add((Integer) in);
                        }
                        objVal.put(key, tmp);
                    } catch (Exception e) {
                        debug("array fail "+o.toString());
                        objVal.put(key, o);
                    }
                }
            }
        }
    }

    private synchronized void updateItem(Json json) {
        if (this.items != null && json != null) {
            items.parseChange(json);
        }
    }
    
    public void resetItem(){
    	String str = MainMsg.initLogin(this);
    	try {
			items.parseArray(new Json(str).getJson("data").getArray("rbagitemList"));
		} catch (Exception e) {
			error("reset item fail "+str);
			e.printStackTrace();
		}
    }
    private synchronized void updateMap(Json json) {
        if (this.maps != null &&this.maps.isInit&& json != null) {
            maps.parseChange(json);
        }
    }

    private synchronized void updateWarrior(Json json) {
        if (json == null) {
            return;
        }
        for (String key : json.keyset()) {
            Json w = json.getJson(key);
            if (w != null) {
                int id = Integer.parseInt(key);
                int lv = w.getInt("level");
                int score = w.getInt("score");
                if (lv != 0 && score != 0) {
                    boolean isExist = false;
                    for (Warrior wa : this.monster) {
                        if (wa.getId() == id) {
                            if (lv != 0) {
                                wa.setLevel(lv);
                            }
                            if (score != 0) {
                                wa.setScore(score);
                            }
                            isExist = true;
                            break;
                        }
                    }
                    if(!isExist){
                        this.log("add new warrior");
                        this.monster.add(new Warrior(w));
                    }
                }
            }
        }
    }

    private synchronized void updateQuest(Json json) {
        quests.change(json);
    }
//
//    private synchronized void updateMap(Json json) {
//        // TODO Auto-generated method stub
//
//    }

    private int getInt(String key){
        if(intVal ==null)
            return -1;
        Integer i = intVal.get(key);
        return i==null? 0:i;
    }
    
    
    public int getChallengepoint() {
        return getInt("challengepoint");
    }

    public int getHonour() {
        return getInt("honour");
    }

    public int getPrestige() {
        return getInt("prestige");
    }

    public int getKingchip() {
        return getInt("kingchip");
    }

    public int getCharacter() {
        return getInt("character");
    }

    public int getFatesoul() {
        return getInt("fatesoul");
    }

    public int getContribution() {
        return getInt("contribution");
    }

    public int getMoney() {
        return getInt("money");
    }

    public int getGamepoint() {
        return getInt("gamepoint");
    }

    public int getTechpoint() {
        return getInt("techpoint");
    }

    public int getRenownlevel() {
        return getInt("renownlevel");
    }

    public int getRenown() {
        return getInt("renown");
    }

    public int getExp() {
        return getInt("exp");
    }

    public int getNextexp() {
        return getInt("nextexp");
    }

    public int getLevel() {
        return getInt("level");
    }

    public int getYellowvip() {
        return getInt("yellowvip");
    }

    public int getVip() {
        return getInt("vip");
    }

    public String getFunc() {
        return (String) objVal.get("func");
    }

    public int getStamina() {
        return this.getNowstamina();
    }

    public int getStaminarecover() {
        return getInt("staminarecover");
    }

    public int getNowstamina() {
        return getInt("nowstamina");
    }

    public int getLaststaminatime() {
        return getInt("laststaminatime");
    }

    public int getMaxbuystaminatimes() {
        return getInt("maxbuystaminatimes");
    }

    public int getBuystaminatimes() {
        return getInt("buystaminatimes");
    }

    public int getId() {
        if(intVal==null)
            return -1;
        return getInt("id");
    }

    public String getUid() {
        String tmp = (String) objVal.get("uid");
        if (tmp == null) {
            return getInt("uid") + "";
        }
        return tmp;
    }

    public int getRwid() {
        return getInt("rwid");
    }

    public String getHeadurl() {
        return (String) objVal.get("headurl");
    }

    public String getUname() {
        return uname;
    }

    public int getGuildid() {
        return getInt("guildid");
    }

    public int getTrainposnum() {
        return getInt("trainposnum");
    }

    public int getTraincdtime() {
        return getInt("traincdtime");
    }

    public int getTradecdtime() {
        return getInt("tradecdtime");
    }

    public int getSignday() {
        return getInt("signday");
    }

    public int getBuysigntimes() {
        return getInt("buysigntimes");
    }

    public int getCanbuysigntimes() {
        return getInt("canbuysigntimes");
    }

    public int getTotalsigntimes() {
        return getInt("totalsigntimes");
    }

    public int getQliveness() {
        return getInt("qliveness");
    }

    public int getQopentimes() {
        return getInt("qopentimes");
    }

    public int getCanbuyspa() {
        return getInt("canbuyspa");
    }

    public int getOfflineawardtimes() {
        return getInt("offlineawardtimes");
    }

    public int getFinanceid() {
        return getInt("financeid");
    }

    public int getFinancebuytime() {
        return getInt("financebuytime");
    }
//
//    public List<Integer> getFinancegainHash() {
//        return (List<Integer>) objVal.get("financegainHash");
//    }

    public int getFinanceloop() {
        return getInt("financeloop");
    }

    public int getFundid() {
        return getInt("fundid");
    }

    public int getFundbuytime() {
        return getInt("fundbuytime");
    }

//    public List<Integer> getFundgainhash() {
//        return (List<Integer>) objVal.get("fundgainhash");
//    }

    public int getArenanum() {
        return getInt("arenanum");
    }

    public int getMaxarenatimes() {
        return getInt("maxarenatimes");
    }

    public int getArenabufftimes() {
        return getInt("arenabufftimes");
    }

    public int getArenabuffaddtime() {
        return getInt("arenabuffaddtime");
    }

    public int getBuyarenatimes() {
        return getInt("buyarenatimes");
    }

    public int getArenacdtime() {
        return getInt("arenacdtime");
    }

    public int getMatchtimes() {
        return getInt("matchtimes");
    }

    public int getMatchcdtime() {
        return getInt("matchcdtime");
    }

    public int getNowluckystar() {
        return getInt("nowluckystar");
    }

    public int getBlesstimes() {
        return getInt("blesstimes");
    }

    public int getLastblesstime() {
        return getInt("lastblesstime");
    }

    public List<Integer> getBlessrecord() {
        return (List<Integer>) objVal.get("blessrecord");
    }

    public int getLastgaintime() {
        return getInt("lastgaintime");
    }

    public int getBuygaintimes() {
        return getInt("buygaintimes");
    }

    public int getGaintimes() {
        return getInt("gaintimes");
    }

    public int getLastharvesttime() {
        return getInt("lastharvesttime");
    }

    public int getWatertimes() {
        return getInt("watertimes");
    }

    public int getFarmnum() {
        return getInt("farmnum");
    }

    public int getFarmplantnum() {
        return getInt("farmplantnum");
    }

    public int getFarmfield() {
        return getInt("farmfield");
    }

    public int getLuckystarcdtime() {
        return getInt("luckystarcdtime");
    }

    public int getResetedebosstimes() {
        return getInt("resetedebosstimes");
    }

    public int getTodaybuytowertimes() {
        return getInt("todaybuytowertimes");
    }

    public int getTowertimes() {
        return getInt("towertimes");
    }

    public int getRobnum() {
        return getInt("robnum");
    }

    public int getTranscdtime() {
        return getInt("transcdtime");
    }

    public int getRobcdtime() {
        return getInt("robcdtime");
    }

    public int getTransnum() {
        return getInt("transnum");
    }

    public int getGetsertimes() {
        return getInt("getsertimes");
    }

    public int getRescuetimes() {
        return getInt("rescuetimes");
    }

    public int getRevolttimes() {
        return getInt("revolttimes");
    }

    public int getRedeemtimes() {
        return getInt("redeemtimes");
    }

    public int getSercdtime() {
        return getInt("sercdtime");
    }

    public int getSerbuytimes() {
        return getInt("serbuytimes");
    }

    public int getAskforhelptime() {
        return getInt("askforhelptime");
    }

    public int getMaxblesstimes() {
        return getInt("maxblesstimes");
    }

    public int getPeoplegaintimes() {
        return getInt("peoplegaintimes");
    }

    public int getPeoplegaincdtime() {
        return getInt("peoplegaincdtime");
    }

    public int getMaxpeoplegaintimes() {
        return getInt("maxpeoplegaintimes");
    }

    public int getPeoplegainedtimes() {
        return getInt("peoplegainedtimes");
    }

    public int getStovelastgaintime() {
        return getInt("stovelastgaintime");
    }

    public int getStovebuffexpiretime() {
        return getInt("stovebuffexpiretime");
    }

    public int getStoveday() {
        return getInt("stoveday");
    }

    public int getStovetotalexp() {
        return getInt("stovetotalexp");
    }

    public int getStovecangain() {
        return getInt("stovecangain");
    }

    public int getStoveuptimes() {
        return getInt("stoveuptimes");
    }

    public int getStovebufftype() {
        return getInt("stovebufftype");
    }

    public int getStovemaxexp() {
        return getInt("stovemaxexp");
    }

    public int getStovehourexp() {
        return getInt("stovehourexp");
    }

    public int getStoveisinit() {
        return getInt("stoveisinit");
    }

    public int getServerTime() {
        return (int) (System.currentTimeMillis()/1000);
    }

    public boolean isNeedData() {
        return needData;
    }

    public ClientSocket getSocket() {
        return socket;
    }
    
    public void setSocket(ClientSocket cs) {
        socket=cs;
    }

    public List<Warrior> getMonster() {
        return monster;
    }

    public ItemSet getItems() {
        return items;
    }

    public QuestSet getQuests() {
        return quests;
    }
    
    public void setGroup(String g){
    //    StaticInfo.debug("set group: "+g);
        String oldGroup = group;
        try {
            this.group= g;
            List<Warrior> tmp = new ArrayList<>();
            for(Object o: new JsonArray(g).getItems()){
                Integer i = (Integer)o;
                if(i!=-1){
                    for(Warrior w: monster){
                        if(w.getId()==i)
                            tmp.add(w);
                    }
                }
            }
            fighter = tmp;
        } catch (JSONException ex) {
            StaticInfo.debug("set group fail: "+g);
            setGroup(oldGroup);
        }
    }
    

    public void setUname(String uname) {
        this.uname= uname;
    }

    public void setNeedData(boolean b) {
        this.needData = b;
    }

    private double multiplier = 1.0;
    public int getScore() {
        int score = 0;
        for (Warrior w : fighter) {
            score += w.getScore();
        }
        return (int)(score*multiplier);
    }
    
    public void setMul(double add){
    	multiplier+=add;
    }
    
    public void resetMul(){
    	multiplier=1;
    }
    
    public List<Warrior> getFighter(){
        return this.fighter;
    }
    
    public int getWarriorId(int wconfig){
        for(Warrior f: this.monster)
            if(f.getWarriorcfgid()==wconfig){
                return f.getId();
            }
        return -1;
    }

	public HashMap<String, Integer> getIntVal() {
		return intVal;
	}

	public void setIntVal(HashMap<String, Integer> intVal) {
		this.intVal = intVal;
	}

	public HashMap<String, Object> getObjVal() {
		return objVal;
	}

	public void setObjVal(HashMap<String, Object> objVal) {
		this.objVal = objVal;
	}

	public boolean isNeedSocket() {
		return needSocket;
	}

	public void setNeedSocket(boolean needSocket) {
		this.needSocket = needSocket;
	}

	public boolean isSynchronized() {
		return isSynchronized;
	}

	public void setSynchronized(boolean isSynchronized) {
		this.isSynchronized = isSynchronized;
	}

	public ServerInfo getServer() {
		return server;
	}

	public void setServer(ServerInfo server) {
		this.server = server;
	}

	public int getFightCount() {
		return fightCount;
	}

	public void initFight(String fightId, int pkId, int mapId, int fightType,int fightCount){
		this.fightId= fightId;
		this.pkId= pkId;
		this.mapId= mapId;
		this.fightType = fightType;
		this.fightCount = fightCount;
		this.fightNum=fightCount;
		this.isWin=false;
	}
	public void setFightCount(int fightCount) {
		this.fightCount = fightCount;
	}

	public int getFightNum() {
		return fightNum;
	}

	public void setFightNum(int fightNum) {
		this.fightNum = fightNum;
	}

	public Object getFightLock() {
		return fightLock;
	}

	public void setFightLock(Object fightLock) {
		this.fightLock = fightLock;
	}

	public String getFightId() {
		return fightId;
	}

	public void setFightId(String fightId) {
		this.fightId = fightId;
	}

	public int getPkId() {
		return pkId;
	}

	public void setPkId(int pkId) {
		this.pkId = pkId;
	}

	public int getMapId() {
		return mapId;
	}

	public void setMapId(int mapId) {
		this.mapId = mapId;
	}

	public int getFightType() {
		return fightType;
	}

	public void setFightType(int fightType) {
		this.fightType = fightType;
	}

	public boolean isIsboss() {
		return isboss;
	}

	public void setIsboss(boolean isboss) {
		this.isboss = isboss;
	}

	public boolean isRob() {
		return isRob;
	}

	public void setRob(boolean isRob) {
		this.isRob = isRob;
	}

	public int[] getRobIds() {
		return robIds;
	}

	public void setRobIds(int[] robIds) {
		this.robIds = robIds;
	}

	public boolean isWin() {
		return isWin;
	}

	public void setWin(boolean isWin) {
		this.isWin = isWin;
	}

	public boolean isError() {
		return isError;
	}

	public void setError(boolean isError) {
		this.isError = isError;
	}

	public String getGroup() {
		return group;
	}


	@Override
	public int compareTo(User o) {
		return this.getAcc().compareTo(o.getAcc());
	}

    
}
class QuestSort implements Comparator<Integer> {

    /**
     * if both int larger than 150, do smaller task first, else do larger task
     * first.
     */
    @Override
    public int compare(Integer o1, Integer o2) {
        o1.compareTo(o2);
        //if(o1<150||o2<150){
        if (o1 > o2) {
            return -1;
        }
        if (o1 < o2) {
            return +1;
        }
        return 0;
        //} 
	/*	if(o1>o2)
         return +1;
         if(o2>o1)
         return -1;
         return 0;*/
    }

}