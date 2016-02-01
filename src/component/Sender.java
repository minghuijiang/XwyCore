package component;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

import message.MainMsg;

import com.mingJiang.util.Util;
import com.mingJiang.util.proxy.MyProxy;

import data.StaticInfo;
import data.server.ServerInfo;

public class Sender {

    private String myKey;
    private User user;
    private MyProxy p;
    private String gateway;

    public Sender(User user) {
        this.user = user;
        myKey = user.getServer().seridSuffix + "&PHPSESSID=" + user.getSessionKey();
        gateway = user.getServer().gateway;
        if (StaticInfo.useProxy && StaticInfo.pl != null) {
            p = StaticInfo.pl.getProxy();
        }

    }

    public void setKey() {
    	setKey(user.getServer());
    }
    
    public void setKey(ServerInfo info){
        myKey = info.seridSuffix + "&PHPSESSID=" + user.getSessionKey();
        gateway = info.gateway;
    }
    
    public String send(String type, String data){
    	return send(type,data,true);
    }
    
    public String sendASynchronized(String type, String data) {
        return send(type,data,false);
    }
    
    public String send(String type, String data, boolean doSyn) {
        String addr = gateway + type + myKey + "&rep=json";

        String result = connect(addr, data, true);
        if(User.G_showHttp){
        	user.log(addr);
        	user.log(data);
        	user.log(result);
        }
        if(doSyn){
	        int c = 0;
	        while (result == null || !result.startsWith("{")) {
	        	if(result.contains("Undefined variable")||result.contains("Undefined index:")
	        			)
	        		return result;
	        	if(c==0)
	        		user.log("connect error "+result);
	        	else
	        		user.log("Connect Error.");
//	            StaticInfo.info(user.getAcc() + " addr: " + addr);
//	            StaticInfo.info(user.getAcc() + " data: " +data);
//	            StaticInfo.info(user.getAcc() + " result: "+result);
	
	            result = connect(addr, data, true);
	
	            if (c++ > 3) {
	                try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	                c=0;
	            }
	        }
	        int lockCount = 0;
	        while (result.contains("_gam_err_requestlock")&&lockCount<=20) {
	            
	            try {
	            	int cooldown = (int) (Math.random()*1000)+500;
	            //	user.log( " lock, retry . "+cooldown +" "+type+" : "+result);
	            //	MainMsg.getGiftMsg(user);//
	                Thread.sleep(cooldown);
	                lockCount++;
	            } catch (InterruptedException ex) {
	            }
	            result = connect(addr, data, true);
	            
	        }
	        if(lockCount>20){
	        	user.error("lock forever=========");
	        	return result;
	        }
	        user.updateData(result);// regular send  always update.
        }
//        int lockCount = 0;
//        while (result.contains("_gam_err_requestlock")&&lockCount<=20) {
//            
//            try {
//            	int cooldown = (int) (Math.random()*1000)+500;
//            //	user.log( " lock, retry . "+cooldown +" "+type+" : "+result);
//            //	MainMsg.getGiftMsg(user);//
//                Thread.sleep(cooldown);
//                lockCount++;
//            } catch (InterruptedException ex) {
//            }
//            result = connect(addr, data, true);
//            
//        }
//        if(lockCount>20){
//        	user.error("lock forever=========");
//        	return result;
//        }
        return result;
    }


    public String connect(String urlStr, String data, boolean retryWhenFail) {
    	String result = connect(urlStr, data);
    	while(retryWhenFail&&result ==null){
    		result = connect(urlStr,data);
    	}
    	return result;
//        if (urlStr == null) {
//            StaticInfo.info("null url");
//            return null;
//        }
//        BufferedWriter bw = null;
//        BufferedReader br = null;
//        HttpURLConnection conn;
//
//        try {
//            //initial http connection
//            URL url = new URL(urlStr);
//            conn = (HttpURLConnection) url.openConnection();
//
//            if (data != null) {
//                conn.setRequestMethod("POST");
//                conn.setDoOutput(true);
//            }
//
//            setHeader(conn, data == null ? 0 : data.length());
//
//            if (conn.getDoOutput() && data != null) {
//                bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
//                bw.write(data);
//                bw.flush();
//            }
//            br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF8"));
//
//            //get http page data
//            StringBuilder sb = new StringBuilder();
//            String line;
//            while ((line = br.readLine()) != null) {
//                sb.append(line);
//            }
//
//            if (p != null) {
//                p.success();
//            }
//            return sb.toString();
//        } catch (UnknownHostException e) {
//            StaticInfo.info(e.getMessage()+" url: " + urlStr);
//            if (retryWhenFail) {
//                return connect(urlStr, data, retryWhenFail);
//            }
//        } catch (IOException e) {
//            StaticInfo.info("post error: "+e.getMessage() +"  "+ urlStr);
//            if (retryWhenFail) {
////                while(true){
////                    
////                }
//                return connect(urlStr, data, retryWhenFail);
//            }
//        } finally {
//            close(br);
//            close(bw);
//        }
//        return null;
    }
    
    public String connect(String urlStr, String data) {
        if (urlStr == null) {
            StaticInfo.info("null url");
            return null;
        }
        BufferedWriter bw = null;
        BufferedReader br = null;
        HttpURLConnection conn;

        try {
            //initial http connection
            URL url = new URL(urlStr);
            conn = (HttpURLConnection) url.openConnection();

            if (data != null) {
                conn.setRequestMethod("POST");
                conn.setDoOutput(true);
            }

            setHeader(conn, data == null ? 0 : data.length());

         //   System.out.println(System.currentTimeMillis()+"  start write "+urlStr);
            if (conn.getDoOutput() && data != null) {
                bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
                bw.write(data);
                bw.flush();
            }
//            System.out.println(System.currentTimeMillis()+"  finish write "+urlStr);
//            System.out.println(System.currentTimeMillis()+"  start getInput "+urlStr);
            br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF8"));

            //get http page data
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        //    System.out.println(System.currentTimeMillis()+"  finish input "+urlStr);
            if (p != null) {
                p.success();
            }
            return sb.toString();
        } catch (UnknownHostException e) {
            user.log(e.getMessage()+" url: " + urlStr);
            user.log("可能网络错误. 暂停10秒重试");
            try {
				Thread.sleep(10000);
			} catch (InterruptedException e1) {			}
            return null;
        } catch (IOException e) {
        	user.log("post error: "+e.getMessage() +"  "+ urlStr);
            return null;
        } finally {
            Util.close(br);
            Util.close(bw);
        }
    }

    public void setHeader(HttpURLConnection conn, int len) {
        conn.setReadTimeout(15000);
        conn.setConnectTimeout(15000);
        if (len > 0) {
            conn.setRequestProperty("Content-Length", "" + len);
        }

    }

}
