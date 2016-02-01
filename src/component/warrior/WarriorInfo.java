package component.warrior;

import static data.StaticInfo.debug;

import java.io.IOException;
import java.util.HashMap;

import com.mingJiang.data.Hide;
import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;

import data.StaticInfo;
import data.Util;

public class WarriorInfo {
	 private final static HashMap<Integer, WarriorCfg> warrior = new HashMap<>();
	    private final static WarriorCfg nullWarrior = new WarriorCfg();

	    static {
	        try {
	            initWarrior();
	        } catch (JSONException e) {
	            debug("e.bin 格式错误");
	        } catch (IOException e) {
	            debug("e.bin 文件读取错误 " + e.getMessage());
	        } catch (RuntimeException e) {
	            debug("fatal error: " + e.getMessage());
	        }
	    }

	    private static void initWarrior() throws JSONException, IOException {
	        Json json = new Json(Hide.get(Util.warrior));

	        for (String key : json.keyset()) {
	        	try{
		        	WarriorCfg tmp =new WarriorCfg(json.getJson(key));
		        	warrior.put(Integer.parseInt(key), tmp);
	        	}catch(Exception e){
	        		e.printStackTrace();
	        	}
	        }

	    }
	    
	    public static WarriorCfg getWarrior(int wid){
	    	WarriorCfg tmp = warrior.get(wid);
	    	if(tmp==null){
	    		StaticInfo.error("未知侠客 请更新 "+wid);
	    		return nullWarrior;
	    	}
	    	return tmp;
	    }
	    
	    public static String getName(int warrior){
	    	return getWarrior(warrior).getWname();
	    }
}
