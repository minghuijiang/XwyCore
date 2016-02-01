package component.handler;

import socket.ClientSocket;
import socket.msg.spa.req.EnterGuildSpaReq;
import socket.msg.spa.req.EnterRoomReq;
import socket.msg.spa.req.SearchRoomReq;

import component.User;

public class SpaHandler extends Handler{

	private int max, current;
	private boolean vip;
	public static boolean showEnhancedRoom= false;
	
	public SpaHandler(User user){
		super(user);
	}
	
	public void enterGuildSpa(){
		user.getSocket().sendMessage(new EnterGuildSpaReq());
	}
	
	public void enterSpa(int room){
		user.getSocket().sendMessage(new EnterRoomReq(room));
	}

	public void showEnhanced(){
		ClientSocket socket = user.getSocket();
		user.setMsg("搜索高汤.");
		showEnhancedRoom=true;
		for(int i=1;i<=200;i++){
			socket.sendMessage(new SearchRoomReq(i));
		}
	}
	
	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}
	
	
}
