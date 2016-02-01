package message;

import com.mingJiang.data.Pair;
import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;
import com.mingJiang.util.json.JsonArray;
import component.User;
import data.StaticInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MatchMsg {

    /**
     * 天梯
     */

    public static String applyMatch(User user) {
        user.log("报名天梯");
        return user.send(
                "ctl=match&act=applymatch",
                null
        );
    }

    /**
     * 获取天梯列表
     * @param user
     * @return 
     */
    public static String openMatch(User user) {
        String s = user.send(
                "ctl=match&act=openmatch",
                null
        );
        if (s.contains("matchinfo\":null")) {
        	String apply = applyMatch(user);
            if(MethodUtil.grc(apply).equals("成功"))
                return openMatch(user);
            else{
            	user.log("天梯报名错误- "+apply);
                return "";
            }
        }
        return s;
    }
    
    /**
     * 
     * @param user
     * @return 
     *  Triple<rid,award,score>
     */
    public static List<Triple<Integer,Integer,Integer>> getMatchPartner(User user){
        List<Triple<Integer,Integer,Integer>> tmp = new ArrayList<>();
        String info = "";
        try {
        	info = openMatch(user);
            JsonArray j = new Json(info).getJson("data").getArray("matchlist");
            for(Object o: j.getItems()){
                if(o instanceof Json){
                    Json json = (Json)o;
                    int id = json.getInt("rid");
                    int winScore = json.getInt("winscore");
                    int score = 0;
                    for(Object g: json.getArray("groupinfo").getItems()){
                        score+= ((Json)g).getInt("score");
                    }
                    tmp.add(new Triple<>(id,winScore,score));
                }else{
                    StaticInfo.debug("not a json?: "+o.toString());
                }
            }
        } catch (Exception e){
            user.log("天梯对手错误.-"+info);
        }
         Collections.sort(tmp,new TripleSort());
        return tmp;
    }

    public static String startMatch(User user, int pkId) {
        return user.send(
                "ctl=match&act=startmatch",
                "{\"pkroleid\":%d}", pkId
        );
    }


    public static boolean fight(User user, int pkId){
        String val = startMatch(user,pkId);
        if(!MethodUtil.grc(val).equals("成功"))
        {
            user.log(startMatch(user,pkId));
            return false;
        }
        FightMsg.fight(user, pkId, 10002, 4);
        return true;
    }
    
    public static boolean fightRandom(User user){
    	user.log("天梯随机打");
        try{
            return fight(user,getMatchPartner(user).get(0).getKey());
        }catch(Exception e){
            user.log(e.getMessage()+"  fightRandom, likely null partner. ");
            
        }
        return false;
    }
    
    
    
}


class TripleSort implements Comparator<Triple<Integer,Integer,Integer>>{

            @Override
            public int compare(Triple<Integer, Integer, Integer> o1, Triple<Integer, Integer, Integer> o2) {
                if(o1.getObj()>o2.getObj())
                    return +1;
                else if(o1.getObj()< o2.getObj())
                    return -1;
                else if(o1.getSubKey()>o2.getSubKey())
                    return -1;
                else if(o1.getSubKey()<o2.getSubKey())
                    return +1;
                else
                    return 0;
            }

            
}
