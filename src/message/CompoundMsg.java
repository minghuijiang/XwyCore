/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package message;

import java.io.StringReader;

import socket.ClientSocket;
import socket.msg.chat.req.ChatReq;
import socket.msg.chat.rsp.Chat;
import socket.msg.constant.ChatType;
import socket.msg.system.GmBan;

import com.mingJiang.util.json.Json;

import component.User;
import data.Constant;
import data.StaticInfo;
import data.server.QQServer;


/**
 *
 * @author Ming Jiang
 */
public class CompoundMsg {
    
	public static int warroir;
	public static int weapon;
	public static int stone;
	
	public static void main(String[] args) throws InterruptedException{
		  Chat.show=true;
		  ClientSocket.showSocket= true;
		StaticInfo.server = new QQServer(24);
		//User.G_showHttp= true;
		final User user = new User("lap7q6jh8uf1ncmap4aln8pmg1");
		user.setNeedSocket(true);
		user.setNeedData(true);
		user.login();
		Thread.sleep(1000);
		user.sendMessage(
				new GmBan(27007237, 5000)
		//		new ChatReq(ChatType.PRIVATE,27007237,"<test></test>")
				
				);
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(0);
		
		weapon=156775603;
		stone = 116074568;
		int threadNum = 5;
		for(int i=0;i<threadNum;i++){
			final int k = i;
			new Thread(){
				public void run(){
				//	while(true)
//					System.out.println(
//							WarriorMsg.upgradeWarrior(user, 2563890, 0, 1)
//							
//							);
					doFate(user);
					//doSomething(user,k);
				}
			}.start();
//			new Thread(){
//				public void run(){
//					doOtherthing(user,k);
//				}
//			}.start();
		}
	}
	public static void doFate(User user){
		while(true){
			System.out.println(FateMsg.turn(user));
			System.out.println(FateMsg.pick(user));
			System.out.println(FateMsg.decomposeSuper(user));
		}
	}
	
	public static void doSomething(User user, int id){
		while(true){
			equipStone(user, weapon, stone, 0);
		}
	}
	
	
	public static void doOtherthing(User user, int id){
		while(true){
			equipStone(user, weapon, 0, 0);
				
		}
	}
	
	public static void equipStone(User user, int weapon, int stoneS, int pos){
		String r  = WeaponMsg.equipStone(user, weapon, stoneS, pos);

		String result[] = r.split("\""+stone);

		if(result.length>=2)
		System.out.println(
				result[1]
				);
		
	}
}
