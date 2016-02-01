package message;

import com.mingJiang.util.json.Json;

import component.User;
import component.Warrior;
import data.StaticInfo;
import data.server.QQServer;

public class BugMsg {

	
	public static void mains(String[] args){
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(System.currentTimeMillis());
			}
		};
		
		long startTime = System.currentTimeMillis()+5000;//5秒后
		schedule(run, startTime, 1000);
		schedule(run, startTime, 1000);
		schedule(run, startTime, 1000);
		schedule(run, startTime, 1000);
	}
	
	
	 public static void main(String[] args){
	     	User.setBug();
	        StaticInfo.server = new QQServer(1);
	        final User user = new User(
	        		"lap7q6jh8uf1ncmap4aln8pmg1"
	        );
	        //http://app100645087.qzone.qzoneapp.com/?ctl=index&act=select&openid=6DB4115F712DB36C56BB1AF1CB031A41&openkey=923A7D2A5D6646F95307033D78A10604&pf=qzone&pfkey=ffeecac147ac5e01ce1ce8b9f16e4946&PHPSESSID=lap7q6jh8uf1ncmap4aln8pmg1
	        boolean show = true;
	        if(show){
	        	show(user);
	        }
	     /*
LOG:  : : 36650446
钟灵	1658410	0
木婉清	1659073	0
阿紫	1659153	0
游坦之	1873119	0
鸠摩智	1714783	0
慕容复	1714747	0
乔峰	1886688	412800
郭靖	3899787	412800
天山童姥	2563890	412800
黄药师	2692665	412800
	         */
	        
	        int c =1714747;//3663304;201034
	        int d =1886688;//3637042   3663307
	        int k =d;
	        d= c;
	        c =k;
	        final int warrior = c;
	        final int warrior2 = d;

	        boolean sell = true;
	        if(!sell){
	        	System.out.println(WarriorMsg.inherit(user, warrior, warrior2).split("exp")[1]);
	        }
	        else{
	        	Runnable run = new Runnable() {
					@Override
					public void run() {
						try{
							int c =0;
							while(c++<5){
    	        			System.out.println("==="+
    	        					WarriorMsg.upgradeWarrior(user, warrior, 0, 1)
    	        					.split("skin_exp")[1]
    	        							);
    	        			System.out.println(System.currentTimeMillis()+" run");
							}
    	        			}catch(Exception e){
    	        				System.out.println("c");
    	        			}
					}
				};
				
				Runnable inherit = new Runnable() {
					
					@Override
					public void run() {
						String s = WarriorMsg.inherit(user, warrior, warrior2);
						System.out.println(s);
						System.out.println(
								s
								.split("exp")[1]);
						System.out.println(System.currentTimeMillis()+" inherit");
					}
				};
	        	
	        	long startTime = System.currentTimeMillis()+1000;
	           	schedule(inherit, startTime+100, 100);
	        	schedule(run, startTime, 100);
	 
	        //	schedule(run, startTime+1000, 100);
	        }
	    }
	
	 
	 public static void show(User user){
	    	if(user.getMonster()==null){
	    		user.setNeedData(true);
	    		user.login();
	    	}
	    	user.log(user.getMoney());
	    	int notZero = 0;
	    	for(Warrior w: user.getMonster()){
	    		try{
	    			Json j  = new Json(WarriorMsg.initSkin(user, w.getId())).getJson("data").getJson("info");
	    			int exp = j.getInt("exp");
	    			if(exp!=0||notZero++<6)
	    				System.out.println(w.getName()+"\t"+w.getId()+"\t"+exp);
	    		}catch(Exception e){
	    			
	    		}
	    	}
	    	for(int i=0;i<33;i++){
	    		try{
	    			String result = WarriorMsg.initSkin(user, i);
	    			Json j  = new Json(result).getJson("data").getJson("info");
	    			int exp = j.getInt("exp");
	    			//System.out.println(result);
	    			if(exp!=0)
	    				System.out.println(i+"  "+exp);
	    		}catch(Exception e){
	    			
	    		}
	    	}

	    	System.exit(0);
	    }
	
	public static void schedule(final Runnable run, final long startTime, final long offset){
		new Thread(){
			public void run(){
			//	while(System.currentTimeMillis()<startTime){
					try {
						Thread.sleep(startTime-System.currentTimeMillis());
					} catch (InterruptedException e) {			}
				
				run.run();
			}
		}.start();

	}

}
