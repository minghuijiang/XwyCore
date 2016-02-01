package component;

import com.mingJiang.util.account.Account;
import com.mingJiang.util.account.Cookies;
import com.mingJiang.util.xml.TagElement;

import data.StaticInfo;

public class XwyInfo {

    /**
     * @return the xmlFormat
     */
    public static String getXmlFormat() {
        return xmlFormat;
    }

    /**
     * @param aXmlFormat the xmlFormat to set
     */
    public static void setXmlFormat(String aXmlFormat) {
        xmlFormat = aXmlFormat;
    }

    private Account acc;
    private String url;
    private String sessionKey;
    private String pfKey;
    private String openKey;
    private String name;

    private XwyInfo() {
        this("","","","","","","","");
    }

    public XwyInfo(String session) {
        this();
        sessionKey = session;
    }

    public XwyInfo(String user, String pass) {
        this(user, pass,"");
    }

    public XwyInfo(String user, String pass, String url) {
        this(user, pass,"",url,"","","","");
    }
    /*
     * <user>
     * 		<account></account>
     * 		<password></password>
     * 		<url></url>
     * 		<p></p><o></o>
     <session></session>
                        
     * </user>
     */

    public XwyInfo(TagElement user) {
//        acc = new Account(user);
//        url = user.getVal("url");
//        if(url.startsWith("http"))
//        	url = StaticInfo.server.parseUrl(url);
//        else
//        	url = "";
//        sessionKey = user.getVal("session");
//        pfKey = user.getVal("p");
//        openKey = user.getVal("o");
//        name = user.getVal("name");
        this(user.getVal("account"),
        		user.getVal("password") ,user.getVal("cookies"),user.getVal("url"),
                user.getVal("session"),user.getVal("p"),user.getVal("o"),user.getVal("name"));
    }
    
    public XwyInfo(String acc, String password,String cookies, String urls, String session,
    						String pf, String open, String name){
    	this.acc = new Account(acc,password, new Cookies(cookies));
    	this.url = urls;
    	if(url.startsWith("http")&&StaticInfo.server!=null)
        	url = StaticInfo.server.parseUrl(url);
        else
        	url = "";
    	this.sessionKey = session;
    	if(url.contains("PHPSESSID")){
    		String[] ssp = url.split("PHPSESSID=");
	        // check serid=
	        if(ssp.length==2){
	            sessionKey = ssp[1].substring(ssp[1].indexOf("&")+1);
	        }
    	}
    	this.pfKey = pf;
    	this.openKey = open;
    	this.name= name;
    }
    
    public XwyInfo(String url, boolean noParse){
    	this();
    	this.setUrl(url);
    }

    public Account getAcc() {
        return acc;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    private static String xmlFormat
            = "\t<user>\n\t\t"
            + "%s<url>\n\t\t"
            + "%s\n\t\t"
            + "</url><p>%s</p><o>%s</o>\n\t\t"
            + "<session>%s</session><name>%s</name>\n\t"
            + "</user>";
    /*
     *  <user>
     <account></account><password></password><cookies></cookies><url>
                
     </url><p></p><o></o>
     <session>9kt8ib8g1vo7vms7te9jtq6oc4</session><name>朱利澄</name>
     </user>
     */

    public String toXML() {
        return String.format(xmlFormat, getAcc().toXML(), getUrl(), getPfKey(), getOpenKey(), getSessionKey(),getName());
    }

    /**
     * @return the pfKey
     */
    public String getPfKey() {
        return pfKey;
    }

    /**
     * @param pfKey the pfKey to set
     */
    public void setPfKey(String pfKey) {
        this.pfKey = pfKey;
    }

    /**
     * @return the openKey
     */
    public String getOpenKey() {
        return openKey;
    }

    /**
     * @param openKey the openKey to set
     */
    public void setOpenKey(String openKey) {
        this.openKey = openKey;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
