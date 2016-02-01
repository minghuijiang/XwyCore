package component;

import com.mingJiang.util.EncodeUtil;
import com.mingJiang.util.json.Json;

import component.warrior.WarriorInfo;

public class Warrior {

    //private boolean showVigour;
    private final String name;//name
    private final int id;//id
    //private int[] skill;
    //private long vigour;
    private int level;
    private final int warriorcfgid;
    private int score;

//	public Warrior(Warrior other){
//		showVigour=other.showVigour;
//		level = other.level;
//		name = other.name;
//		id = other.id;
//		vigour = other.vigour;
//		warriorcfgid= other.warriorcfgid;
//                score=  other.score;
//	}
    public Warrior(Json val) {
        warriorcfgid = (val.getInt("warriorcfgid"));
        //	showVigour = (false);
        level = (val.getInt("level"));
        score = val.getInt("score");
        name = EncodeUtil.decode(val.getString("name"));
        id = val.getInt("id");
	//	setVigour(val.getLong("totalvigour"));
/*		skill = new int[4];
         Object[] obj = val.getArray("arrEquipedskill").items.toArray();
         for(int i=0;i<4;i++){
         skill[i]=Integer.parseInt((String) obj[i]);
         }*/

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

//	public int[] getSkill() {
//		return skill;
//	}
//
//	public long getVigour() {
//		return vigour;
//	}
//	public void setVigour(long vigour) {
//		this.vigour = vigour;
//	}
//
//	public boolean isShowVigour() {
//		return showVigour;
//	}
//
//	public void setShowVigour(boolean showVigour) {
//		this.showVigour = showVigour;
//	}
//	
    @Override
    public String toString() {
	//	if(showVigour)
        //		return "Lv."+level+" "+name+"-"+vigour;
        return "Lv." + level + " " + name+"   --"+WarriorInfo.getName(this.warriorcfgid);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getWarriorcfgid() {
        return warriorcfgid;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
