package component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.mingJiang.util.json.Json;
import com.mingJiang.util.json.JsonArray;

import component.quest.Quest;
import component.quest.QuestNode;
import component.quest.TaskInfo;

public class QuestSet {

	private List<QuestNode> quests;
	private int index;
	private final Object lock= new Object();
	private User user;
	private boolean hasNew;
	public static QuestSorts sort = new QuestSorts();
	public QuestSet(User user){
		this.user = user;
		quests = new ArrayList<QuestNode>();
		index = 0;
		hasNew=false;
	}
	public void init(JsonArray data) {
		if(data!=null){
            for (Object o : data.getItems()) {
                quests.add(new QuestNode((Json) o));
            }
            Collections.sort(quests, sort);
        }
	}
	
	public synchronized void change(Json json){
		if (json == null) {
            return;
        }
		synchronized (lock) {
	        for (String key : json.keyset()) {
	            Json j = json.getJson(key);
	            int questId = Integer.parseInt(key);
	            if (j == null){ // quest done
	            // do not remove. avoid concurrent modification
	            //	user.log("删除任务 "+questId);
	            	remove(questId);
	            } else{// quest add
	                if(j.getInt("questcfgid")!=0){
	                //	user.log("添加任务 "+questId);
	                    add(new QuestNode(j));
	                    if(TaskInfo.getQuest(questId).getType()==Quest.MAIN_QUEST)
	                    	hasNew= true;
	                }else{
	                //	user.log("任务更新 "+questId +" "+j);
//	                	for(QuestNode node: quests){
//	                		user.log("任务更新 "+questId +" "+j);
//	                		if(questId== node.getQuestId()){
//	                			node.update(j);
//	                			break;
//	                		}
//	                	}
	                }
	            }
	        }
		}
	}

	private void add(QuestNode quest){
		quests.add(quest);
	}
	
	public synchronized void remove(int questId){
		for(int i=0;i<quests.size();i++){
			if(questId== quests.get(i).getQuestId()){
				if(i<index)
					index--;
				quests.remove(i);
			}
		}
	}
	
	public synchronized QuestNode next(){
		synchronized (lock) {
			if(index>=quests.size())
				return null;
			return quests.get(index++);
		}
	}
	/**
	 * @return the hasNew
	 */
	public boolean isHasNew() {
		return hasNew;
	}
	/**
	 * @param hasNew the hasNew to set
	 */
	public void setHasNew(boolean hasNew) {
		this.hasNew = hasNew;
	}
	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}
	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}
	
}
class QuestSorts implements Comparator<QuestNode> {

    /**
     * if both int larger than 150, do smaller task first, else do larger task
     * first.
     */
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        //if(o1<150||o2<150){
//        if (o1 > o2) {
//            return -1;
//        }
//        if (o1 < o2) {
//            return +1;
//        }
//        return 0;
//        //} 
//	/*	if(o1>o2)
//         return +1;
//         if(o2>o1)
//         return -1;
//         return 0;*/
//    }

	@Override
	public int compare(QuestNode q1, QuestNode q2) {
		int type1 = TaskInfo.getQuest(q1.getQuestId()).getType();
		int type2 = TaskInfo.getQuest(q2.getQuestId()).getType();
		if(type1==type2){
			int o1 = q1.getQuestId();
			int o2 = q2.getQuestId();
	        if (o1 > o2) {
	            return +1;
	        }
	        if (o1 < o2) {
	            return -1;
	        }
	        return 0;
		}
		if(type1==Quest.MAIN_QUEST)
			return -1;
		else if(type2==Quest.MAIN_QUEST)
			return +1;
		else if(type1==Quest.SECOND_QUEST)
			return -1;
		else if(type2==Quest.SECOND_QUEST)
			return +1;
		return 0;
	}

}
