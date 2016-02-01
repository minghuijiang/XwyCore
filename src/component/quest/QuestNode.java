package component.quest;

import com.mingJiang.util.json.Json;

public class QuestNode {

	private int questId, reqNum;
	public QuestNode(Json json) {
		questId = json.getInt("id");
		reqNum = json.getInt("gotnum");
	}

	public void update(Json json){
		reqNum = json.getInt("gotnum",reqNum);
	}

	/**
	 * @return the questId
	 */
	public int getQuestId() {
		return questId;
	}

	/**
	 * @return the reqNum
	 */
	public int getReqNum() {
		return reqNum;
	}
	
}
