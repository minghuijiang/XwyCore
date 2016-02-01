/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package message;

import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;

import component.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ming Jiang
 */
public class RobMsg {
    public static String startTransport(User user) {
        return user.send(
                "ctl=transport&act=starttransport",
                "{}"
        );
    }
    
    public static String finishTransport(User user){
        return user.send(
                "ctl=transport&act=finishtransport",
                "{}"
        );
    }
    
    public static int getTransport(User user){
    	String result ="";
    	while(true)
        try{
            result = startTransport(user);
            user.log(System.currentTimeMillis()+":"+result);
            Json j = new Json(result).getJson("data");
            int num = j.getArray("robinfo").getItems().size();
            String[] ids = j.getJson("transinfo").getString("transallrobids").split(",");
            int[] robId = user.getRobIds();
            for(int i=0; i<ids.length&&i<robId.length;i++)
            	robId[i]= Integer.parseInt(ids[i]);
            user.log("robid： "+robId.length);
            return num;
        } catch (Exception ex) {
           user.log("运镖冷却"+"  : "+result);
	         try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
    
    public static String fight(User user, int minE){
    	
        int pre = getTransport(user);
        user.log("预计劫镖人数 "+pre+"  要求劫镖人数 "+minE);
        if(pre==0|| pre<minE){
            user.log("预计劫镖人数 "+pre+"  要求劫镖人数 "+minE+"  不运镖");
            return "";
        }
        user.setRob(true);
        FightMsg.fight(user,0,10001,3);
        user.setRob(false);
        return finishTransport(user);
    }
    
    public static String getRobList(User user, int num){
        return user.send(
                "ctl=transport&act=getroblist",
                "{\"num\":%d}",num
        );
    }
    
    //Triple<rid,award,power>
    public static List<Triple<Integer,Integer,Integer>> getRobPair(User user){
        List<Triple<Integer,Integer,Integer>> tmp = new ArrayList<>();
        int power = user.getScore();
        try{
            for(Object o: new Json(getRobList(user,16)).getJson("data").getArray("roblist").getItems()){
                try{
                    Json j = (Json)o;
                    if(j.getInt("power")<power)
                    	tmp.add(new Triple<>(j.getInt("id"),j.getInt("award"),j.getInt("power")));
                }catch(Exception e){
                    
                }
            }
        } catch (JSONException ex) {
            Logger.getLogger(RobMsg.class.getName()).log(Level.SEVERE, null, ex);
        }
        Collections.sort(tmp, new Comparator<Triple<Integer,Integer,Integer>>(){

            @Override
            public int compare(Triple<Integer, Integer, Integer> o1, Triple<Integer, Integer, Integer> o2) {
                if(o1.getSubKey()>o2.getSubKey())  // sort award from most to least
                    return -1;
                if(o1.getSubKey()<o2.getSubKey())
                    return +1;
                if(o1.getObj()>o2.getObj())// sort power from least to largest
                    return +1;
                if(o1.getObj()<o2.getObj())
                    return -1;
                return 0;
            }
            
        });
        return tmp;
    }
    
    public static String startRob(User user, int rid){
        return user.send(
                "ctl=transport&act=startrob",
                "{\"robid\":%d}",rid
        );        
    }
    
    public static boolean rob(User user, int rid){
        user.log("start: "+ startRob(user,rid));
        return FightMsg.fight(user, rid, 10026, 5);
    }
    
    
    public static void robRandom(User user){
    	while(true){
    		List<Triple<Integer,Integer,Integer>> list = getRobPair(user);
    		user.log("劫镖 -"+list.size());
	    	if(list.size()>0){
	    		if(rob(user,list.get(0).getKey())){
	    			user.log("打劫成功");
	    			user.resetMul();
	    			break;
	    		}else{
	    			user.log("打劫失败--");
	    			user.resetMul();
	    			break;
	    		}
	    	}
	    	user.getScore();
    	}
    	user.setMul(0.5);
    }
    
}
