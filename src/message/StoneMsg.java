package message;

import component.User;

import data.StaticInfo;
import data.server.QQServer;

public class StoneMsg {

	public static void main(String[] args){
	     User.setBug();
	        StaticInfo.server = new QQServer(1);
	        int suipian = 279615319;
	        int box =279903230;
	        final User user = new User(//"",""
	        "7vf9mj8v4mo61gal3klhjkgbk0"//g5uavkaligccoreko4svigncp0 h2k0h1c73b76irnjm9ep592pm4
	        );

	        int c =3;//3663304;201034
	        int d =3689916;//3637042   3663307
	        int k =d;
	        d= c;
	        c =k;
	        final int warrior = c;
	        final int warrior2 = d;
	        final int stone =116074435;
	        final int stone2 =284775427;
	        final int weapon = 156775610;
	        final int main =1657511;
	        final int art=35130946;
	        
	        final int tail =288668391;
	        final int tail2 =288668445;
	        boolean sell = true;
	        if(!sell){

	        	System.out.println(WarriorMsg.inherit(user, warrior, warrior2).split("exp")[1]);

	        }
	        else{
	        	for(int i=0;i<4;i++){
	    	        new Thread(){
	    	        	public void run(){
	    	        		while(true){
	    	        			try{
	    	        			System.out.println(
	    	        					//WeaponMsg.equipArti(user, main, art)
	    	        				//	WeaponMsg.equipStone(user, weapon, 0, 0)
	    	        					WarriorMsg.upgradeWarrior(user, warrior, 0, 1)
	    	        				//	WeaponMsg.equipTailman(user, 0, tail, art);
	    	        					//MainMsg.initLogin(user);
	    	        					.split("\"rwarrior\"",2)[1]
	    	        							);
	    	        			}catch(Exception e){
	    	        				System.out.println("c");
	    	        			}
	    	        	
	    	        		}
	    	        	}
	    	        }.start();


	        }
	        	 new Thread(){
	 	        	public void run(){
	 	        		while(true){
	 	        			try {
									Thread.sleep(2000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
	 	        			System.out.println(WarriorMsg.inherit(user, warrior, warrior2).split("exp")[1]);
	 	        			try {
									Thread.sleep(2000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
	 	        			System.exit(0);
	 	        		}
	 	        	}
	 	        }.start();
	
	        }
	    }

}
