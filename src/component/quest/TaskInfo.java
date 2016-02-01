package component.quest;

import static data.StaticInfo.debug;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.mingJiang.data.Hide;
import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;
import com.mingJiang.util.xml.UnclosedTagException;

import data.StaticInfo;
import data.Util;

public class TaskInfo {

    private static final HashMap<Integer,Quest> tasks = new HashMap<>();

    static {
        try {
        	initQuest();
        } catch (JSONException ex) {
            debug("g.bin 格式错误");
        } catch (RuntimeException e) {
            debug("fatal error: " + e.getMessage());
        } catch (IOException ex) {
            debug("g.bin 错误 " + ex.getMessage());
        }
    }

    private static void initQuest() throws IOException, JSONException {
        Json json = new Json(Hide.get(Util.quest)).getJson("questcfgList");
        for(String key: json.keyset()){
        	Json task = json.getJson(key);
        	tasks.put(Integer.parseInt(key), new Quest(task));
        }
    }
  

    public static void main(String[] args){
    	
    	
    	List<Quest> test = new ArrayList<>();
    	for(int key: tasks.keySet()){
    		Quest q = tasks.get(key);
    		if(q.getType()==Quest.SECOND_QUEST||q.getType()==Quest.MAIN_QUEST)
//    			if(q.getAction()!=null&&(q.getAction().equalsIgnoreCase("first")||q.getAction().equalsIgnoreCase("raid")
//    					||q.getAction().equalsIgnoreCase("fight")))
//    				continue;
//    			else
    			if(q.getMap()!=0){
    				test.add(q);
					String a = q.getAction();
					//System.out.println(q.getQuestid()+" "+q.getAction()+" "+q.getDesc());
				}
    	}
    	Collections.sort(test, new Comparator<Quest>() {

			@Override
			public int compare(Quest o1, Quest o2) {
				int q1= o1.getQuestid();
				int q2= o2.getQuestid();
				if(q1<q2)
					return -1;
				if(q1>q2)
					return 1;
				return 0;
			}
		});
    	for(Quest a: test){
    		int id = a.getQuestid();
    		System.out.println("case "+id+": quest"+id+"(); break; //"+a.getAction()+" "+a.getDesc());
    	}
    }
    public static Quest getQuest(int questid) {
    	if(tasks.containsKey(questid))
    		return tasks.get(questid);
    	else {
			StaticInfo.error("未知任务: "+questid+" 更新init2.json");
			return tasks.get(600);// 剧情任务
		}
    }
}
