package component.quest;

import java.util.Comparator;

import com.mingJiang.util.json.Json;

import component.map.MapInfo;

public class Quest {
    public static final int DAILY_QUEST = 1;
    public static final int MAIN_QUEST = 2;
    public static final int SECOND_QUEST = 3;
    public static final int STORY_QUEST = 5;
    public static final int NPC_TASK = 6;
    public static final int TRANSFER_TASK = 7;
    public static final int REQ1_BATTLE = 1;
    
    
    private String desc, openFuc,name;
	private int type, questid;
	
	private int exp,map;
	private String trace,action;
	private int req;
	
	/**		reqdesc=在布阵界面让灵儿出战。,
			arrAwardcfg=[
				{num=620,type=exp,},
				{num=1400,type=money}],
			type=2,
			func=team,
			questcfgid=7,
			name=携手并肩,
			onlystory=0,
			relyfunc=,
		}
     */
	public Quest(Json data) {
		desc = data.getString("reqdesc");
		name = data.getString("name");
		type = data.getInt("type");
		questid = data.getInt("questcfgid");
		if(type==Quest.MAIN_QUEST|| type ==Quest.SECOND_QUEST){
			exp= 0;
			openFuc = data.getString("func");
			req= data.getInt("reqnum");
			trace = data.getString("tracedesc");
			String[] sp = trace.split(":");
			if(sp.length==2){
				action = sp[0];
				map = MapInfo.getMap(sp[1]);
			}
		//	if(action.equals("first"))
		//		System.out.println(questid+" "+trace);
			for(Object o: data.getArray("arrAwardcfg").getItems()){
				Json tmp = (Json)o;
				if(tmp.getString("type").equals("exp")){
					exp = tmp.getInt("num");
					break;
				}
			}
		}
	}

	public String toString(){
		return questid+":"+name+":"+desc+" exp:"+exp+" need stamina: "+req;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @return the openFuc
	 */
	public String getOpenFuc() {
		return openFuc;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @return the questid
	 */
	public int getQuestid() {
		return questid;
	}

	/**
	 * @return the exp
	 */
	public int getExp() {
		return exp;
	}

	/**
	 * @return the map
	 */
	public int getMap() {
		return map;
	}

	/**
	 * @return the trace
	 */
	public String getTrace() {
		return trace;
	}

	/**
	 * @return the action
	 */
	public String getAction() {
		return action;
	}

	/**
	 * @return the req
	 */
	public int getReq() {
		return req;
	}
	

}
