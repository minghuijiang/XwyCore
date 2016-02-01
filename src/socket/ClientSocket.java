package socket;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import socket.msg.basic.Message;
import socket.msg.system.PingReq;
import socket.util.ByteArray;
import socket.util.SocketProtocol;
import socket.util.SocketReader;
import socket.util.SocketReaderR;
import socket.util.SocketWriter;
import component.User;
import data.StaticInfo;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.plaf.PanelUI;

import com.mingJiang.util.PanelUtil;
import com.mingJiang.util.Util;

import socket.msg.system.LoginReq;

public class ClientSocket {
    private static final HashMap<String, SocketProtocol> _c2sProtoDic;
    private static final HashMap<String, SocketProtocol> _s2cProtoDic;
    static {
        _c2sProtoDic = new HashMap<>();
        _s2cProtoDic = new HashMap<>();
        MessageRegistration.regist();
    }

    public static boolean debug = false;
    private boolean isAlive = false;
    private Socket socket;
    private ByteArray byteBuffer;
    private static final int headLen = 13;
    private DataInputStream input;
    private OutputStream output;

    private Message _heart;
    private int _heartInterval;

    private SocketReader _curProto;
    private User user;

    public ClientSocket(User user) {
        this.user = user;
        isAlive= false;
    }

    public void resetSocket(){
        if(!isAlive){
        	user.log(" socket 关闭. 退出");
            return ;
            
        }
        try {
            isAlive= false;
            user.error("重置socket,  等待10秒");
            Thread.sleep(10000);
            user.startSocket();
        } catch (InterruptedException ex) {
            Logger.getLogger(ClientSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void connect(){
    	connect(true);
    }
    public void connect(boolean needLogin) {
        if (this.isAlive) {
            user.log("socket already connected.");
            return;
        }

        try {
            isAlive= true;
            
            boolean connectFail = true;
            while(connectFail){
            	try{
            		if(showSocket){
            			user.log("try to connect to "+user.getServer().socketURL+" "+user.getServer().port);
            		}
            		this.socket = new Socket();
		            this.socket.connect(new InetSocketAddress(
		                    InetAddress.getByName(user.getServer().socketURL), user.getServer().port));
		            connectFail = false;
            	}catch(IOException e){
            		user.log("connect fail- retry "+e.getMessage());
            		try {
						Thread.sleep(System.currentTimeMillis()%15000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            	}
            }
            this.registHeart(new PingReq(), 20000 + (int) (Math.random() * 10000));

            onConnect();

            if(needLogin)
            	sendMessage(new LoginReq(user.getId(), user.getSessionKey()));
        } catch (IOException e) {
           // close();
          //  connect();
            user.log("socket io: "+e.getMessage());
            resetSocket();
        }
        
    }

    protected void onConnect() throws IOException {
        input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        output = socket.getOutputStream();
        this.sendTgw();
        this.startHeart();
        this.startListen();
    }

    private void startListen() {
        new Thread(user.getAcc()+" Listener") {
            @Override
            public void run() {
            	int failcount = 0;
                while (isAlive) {
                    try {
                        read();
                    } catch (EOFException eofe) {
                    	
                    	failcount++;
                    	if(failcount>5){
	                        user.error("异地登陆 "+eofe.getMessage());
	                        isAlive = false;
	                        user.setError(true);
	                        PanelUtil.showInfo("异地登陆");
	                        eofe.printStackTrace();
                    	}else{
                    		
                    		user.error("error read "+failcount);
                    		resetSocket();
                    	}
                    } catch (IOException e) {
                        user.log("读取错误 "+e.getMessage());
                        if(e.getMessage().equalsIgnoreCase("Connection reset"))
                            resetSocket();
                       if(e.getMessage().contains("Software caused connection abort")){
                    	   resetSocket();
                       }
                            //resetSocket();
                    }

                }
//                user.setMsg("Listener terminate in progress");
//                isAlive = false;
//                if (socket != null) {
//                    try {
//                        socket.close();
//                        socket = null;
//                    } catch (IOException ex) {user.log("close socket fail "+ex.getMessage());}
//                }
                user.setMsg("Listener terminate");
            }
        }.start();
    }

    private void sendTgw() {
        if (user.getServer().tgwHeader != null) {
            this.send(user.getServer().tgwHeader.getBytes());
        }
    }

  //  final static int count = 10;
    private void startHeart() {
        new Thread(user.getAcc()+ " HeartBeat") {
            @Override
            public void run() {
                while (isAlive) {
               // 	for(int i=0;i<count&&isAlive;i++)
	                    try {
	                   // 	user.log("send heart");
	                        Thread.sleep(_heartInterval);
	                    } catch (InterruptedException e) {
	                        user.log("start heart interruptedException "+e.getMessage());
	                    }
                	 sendMessage(_heart);
                }
                user.log("send heart stop!!!!");
            }
        }.start();
    }

    public void close() {
        isAlive= false;
        Util.close(input);
        Util.close(output);
        Util.close(socket);
        input = null; output = null; socket = null;
      //  Thread.currentThread().interrupt();
    }

    public void read() throws IOException {
        this._curProto = new SocketReader(user);
        ByteArray _loc_1 = null;
        input.mark(2);
        int first = input.readUnsignedByte();
        int second = input.readUnsignedByte();
        int length = first + (second << 8);
        input.reset();
        byte[] tmp = new byte[length];
        input.read(tmp);
        this.byteBuffer = new ByteArray(tmp);
        if(showSocket&&debug)
        	ClientSocket.printBytes("read", tmp);
        while (true) {
            if (!this._curProto._headReady) {
                if (this.byteBuffer.remaining() >= headLen) {
                    if(!this._curProto.readHead(this.byteBuffer)){
                        user.log("unknown socket protocol");
                        user.log("type: " + this._curProto.type);
                        user.log("subtype: " + this._curProto.subtype);
                        user.log("length: " + this._curProto.length);
                        break;
                    }
                } else {
                    break;
                }
                continue;
            }
            if (this.byteBuffer.remaining() >= this._curProto.length - headLen) {
                if (this._curProto.length - headLen > 0) {
                    byte[] tmp2 = new byte[this._curProto.length - headLen];
                    this.byteBuffer.get(tmp2);
                    _loc_1 = new ByteArray(tmp2);
                } else {
                    _loc_1 = new ByteArray(0);
                }
                this._curProto.readBody(_loc_1);
               // user.log("read: "+this._curProt);
                this._curProto = new SocketReader(user);
                continue;
            }
            break;
        }

    }
//
    public static void read(byte[] readFrom) throws IOException {
        SocketReader _curProto = new SocketReader(null);
        ByteArray _loc_1 = null;
        DataInputStream input = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(readFrom)));
        input.mark(2);
        int first = input.readUnsignedByte();
        int second = input.readUnsignedByte();
        int length = (first) + (second << 8);
        input.reset();
        byte[] tmp = new byte[length];
        input.read(tmp);
        ByteArray byteBuffer = new ByteArray(tmp);
        if(showSocket&&debug)
        	ClientSocket.printBytes("read", tmp);
        while (true) {

            if (!_curProto._headReady) {
                //	System.out.println("readHead remain: "+byteBuffer.remaining());
                if (byteBuffer.remaining() >= headLen) {
                    _curProto.readHead(byteBuffer);
                } else {
                    break;
                }
                continue;
            }
            if (byteBuffer.remaining() >= _curProto.length - headLen) {
                //	System.out.println("readbody");
                if (_curProto.length - headLen > 0) {
                    byte[] tmp2 = new byte[_curProto.length - headLen];
                    byteBuffer.get(tmp2);
                    _loc_1 = new ByteArray(tmp2);
                } else {
                    _loc_1 = new ByteArray(0);
                }
                _curProto.readBody(_loc_1);
                _curProto = new SocketReader(null);
                continue;
            }
            break;
        }

    }

    public static void readR(byte[] readFrom) throws IOException {
        SocketReaderR _curProto = new SocketReaderR(null);
        ByteArray _loc_1 = null;
        DataInputStream input = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(readFrom)));
        input.mark(2);
        int first = input.readUnsignedByte();
        int second = input.readUnsignedByte();
        int length = (first) + (second << 8);
        input.reset();
        byte[] tmp = new byte[length];
        input.read(tmp);
        ByteArray byteBuffer = new ByteArray(tmp);
        if(showSocket&&debug)
        	ClientSocket.printBytes("read", tmp);
        while (true) {

            if (!_curProto._headReady) {
                //	System.out.println("readHead remain: "+byteBuffer.remaining());
                if (byteBuffer.remaining() >= headLen) {
                    _curProto.readHead(byteBuffer);
                } else {
                    break;
                }
                continue;
            }
            if (byteBuffer.remaining() >= _curProto.length - headLen) {
                //	System.out.println("readbody");
                if (_curProto.length - headLen > 0) {
                    byte[] tmp2 = new byte[_curProto.length - headLen];
                    byteBuffer.get(tmp2);
                    _loc_1 = new ByteArray(tmp2);
                } else {
                    _loc_1 = new ByteArray(0);
                }
                _curProto.readBody(_loc_1);
                _curProto = new SocketReaderR(null);
                continue;
            }
            break;
        }

    }

    public static boolean showSocket = !true;
    public void sendMessage(Message param1) {
        if (!isAlive) {
            user.log("socket服务器无法链接，消息发送失败");
            return;
        }
        if(showSocket)
        	user.log("send: "+param1.getClass());
        SocketWriter _loc_2 = new SocketWriter();
        _loc_2.write(param1);
        byte[] val = _loc_2.data();
    //    ClientSocket.printBytes(param1.getClass().toString(), val);
        this.send(val);
    }

    private synchronized boolean send(byte[] param1) {
        try {
            this.output.write(param1);
            this.output.flush();
        } catch (IOException e) {
            user.log("  " + e.getMessage());
            int count = 0;

            while (count++ < 5&&isAlive) {
                try {
                    Thread.sleep(System.currentTimeMillis()%5000);
                    this.output.write(param1);
                    return true;
                } catch (IOException ex) {
                    user.log("  " + e.getMessage());
                   
                } catch (InterruptedException ex) {
                    Logger.getLogger(ClientSocket.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
           // resetSocket();
          //  return user.getSocket().send(param1);
        }catch(Exception e){
        	user.log(e.getMessage());
        	return false;
        }
        return true;
    }

    public static void registS2CProto(String noti, int type, int subtype, Class<?> msgClass) {
        SocketProtocol proto = new SocketProtocol();
        proto.msgClass = msgClass;
        proto.notification = noti;
        proto.type = type;
        proto.subtype = subtype;
        _s2cProtoDic.put(type + "_" + subtype, proto);
    }

    public static void registC2SProto(int type, int subtype, Class<?> msgClass) {
        SocketProtocol proto = new SocketProtocol();
        proto.msgClass = msgClass;
        proto.notification = "";
        proto.type = type;
        proto.subtype = subtype;
        _c2sProtoDic.put(msgClass.getName(), proto);
    }

    public void registHeart(Message param1, int param2) {
    	user.log("register heart, time: "+param2);
        this._heart = param1;
        this._heartInterval = param2;
    }

    public static SocketProtocol getS2CProto(int type, int subtype) {
        SocketProtocol proto = _s2cProtoDic.get(type + "_" + subtype);
        return proto;
    }

    public static SocketProtocol getC2SProto(Message msg) {
        SocketProtocol proto = _c2sProtoDic.get(msg.getClass().getName());
        return proto;
    }

    public static SocketProtocol getC2SProto(int type, int subtype) {
        for(String key: _c2sProtoDic.keySet()){
        	SocketProtocol proto = _c2sProtoDic.get(key);
        	if(proto.type==type&&proto.subtype==subtype)
        		return proto;
        }
        return null;
    }

  

    public static void printProto() {
        System.out.println("Client to Server Protocol");
        for (String key : _c2sProtoDic.keySet()) {
            SocketProtocol proto = _c2sProtoDic.get(key);
            System.out.println(proto.type + "_" + proto.subtype + "  " + proto.msgClass);
        }

        System.out.println("Server to Client Protocol");
        for (String key : _s2cProtoDic.keySet()) {
            SocketProtocol proto = _s2cProtoDic.get(key);
            System.out.println(proto.type + "_" + proto.subtype + "  " + proto.msgClass);
        }
    }

    public static void main(String[] args){
    	printAllProto();
    }
    public static void printAllProto() {
        ArrayList<SocketProtocol> protos = new ArrayList<>();
        
        for (String key : _s2cProtoDic.keySet()) {
            protos.add(_s2cProtoDic.get(key));
        }

        Comparator<SocketProtocol> tmp = new Comparator<SocketProtocol>() {
            @Override
            public int compare(SocketProtocol o1, SocketProtocol o2) {
                if (o1.type > o2.type) {
                    return 1;
                } else if (o1.type < o2.type) {
                    return -1;
                } else if (o1.subtype > o2.subtype) {
                    return 1;
                } else if (o1.subtype < o2.subtype) {
                    return -1;
                }
                return 0;
            }
        };
        Collections.sort(protos, tmp);
        System.out.println("Server to Client: ");

        for (SocketProtocol proto : protos) {
            System.out.println(proto.type + "_" + proto.subtype + " " + proto.msgClass);
        }
        
        protos.clear();
        
        

        for (String key : _c2sProtoDic.keySet()) {
            protos.add(_c2sProtoDic.get(key));
        }
        
        Collections.sort(protos, tmp);
        System.out.println("\nclient to server: ");

        for (SocketProtocol proto : protos) {
            System.out.println(proto.type + "_" + proto.subtype + " " + proto.msgClass);
        }
    }
    
     public static void printBytes(String msg, byte[] arr) {
        if (StaticInfo.debugMode) {
            System.out.println();
            System.out.println("\nlength=" + arr.length + "\n" + msg);
            int counter = 0;
            String val = "";
            for (int i=0;i<arr.length&&i<1024;i++) {
                byte b = arr[i];
                int bv = b & 0xff;
                if (bv < 16) {
                    val += ("0");
                }
                val += (Integer.toHexString(bv) + " ");
                if (++counter % 33 == 0) {
                    System.out.println(val);
                    val = "";
                }
            }

            System.out.println(val + "\n==end");
        }
    }
}
