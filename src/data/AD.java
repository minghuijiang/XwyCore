package data;

import java.util.List;

import socket.msg.chat.req.ChatReq;
import socket.msg.constant.ChatType;
import component.User;

public class AD {

	private List<User> users;
	private List<String> ads;
	private int sec;
	private Object lock = new Object();
	private boolean doAD = true;
	
	public AD(List<User> users, List<String> ads, int delay){
		this.users = users;
		this.ads = ads;
		this.sec = delay;
	}
	
	public void doAD(){
		User.G_showServer= true;
		for(final User user: users){
			new Thread(){
				public void run(){
					while(doAD){
						try{
							if(user.isError()){
								synchronized(lock){
									user.log("重登---");
									StaticInfo.server =user.getServer();
									user.login();
								}
							}
							for(String ad: ads){
								user.sendMessage(new ChatReq(ChatType.SUBWORLD,0 ,ad));
								Thread.sleep(5000);
							}
							
							Thread.sleep(sec);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}.start();
		}
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<String> getAds() {
		return ads;
	}

	public void setAds(List<String> ads) {
		this.ads = ads;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}

	public boolean isDoAD() {
		return doAD;
	}

	public void setDoAD(boolean doAD) {
		this.doAD = doAD;
	}
	
	
	
}
