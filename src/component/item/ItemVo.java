package component.item;

import com.mingJiang.util.FileUtil;
import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;
import com.mingJiang.util.json.JsonArray;

import java.io.IOException;
import java.io.Serializable;

public class ItemVo implements Serializable {

    /**
     * kind: 1	头盔 2	武器 3	内甲 4	护符 5	宝石 6	礼物 7	宝石碎片 8	卡片 宝箱 9	盒子 11	碎片 12	元气卡 201
     * 素材 203	rmb道具 204	生命强化 205	力量强化 206	防御强化 207	内力强化 208	葵花宝典 209	丹药 401	种子
     * 402	道具种子 403	特殊种子 601	卦 701	果实 702 饥饿果实
     */

    /*
     * {
     itemcfgid=596,
     itemname=蓝装碎片（70级）,
     itemdesc=5个碎片可以合成一个蓝色装备箱（70级）。,
     category=2,
     kind=11,
     canstack=1,
     icon=assets\/icons\/seeditems\/596.png,
     qualitycfgid=3,
     itemuse=5个碎片可以合成一个蓝色装备箱（70级）。,
     arrSellawardcfg=[],
     _cls=itemCfg2,
     mergecfgInfo={
     _cls=itemmergeCfg,
     id=599,
     arrReqcfg=[
     {
     _cls=showItem,
     type=item,
     cfgid=596,
     num=5,
     sub=1
     }
     ]
     }
     */
    private final int kind;
    private final String itemName, itemDesc;
    private final int itemId;
    private final int category;
    private  int mergeNeed;
    private int mergeTarget;
    private final int levelNeed;
    private final int seedreqtime;
    private final int qualitycfgid;
    private final int rewardType;
    private int propertyvalue;
    private String equipproperty;
    private int valuetype;
    private int changeSoul;
    public static void main(String[] args) throws IOException, JSONException{
        String file = "C:/Users/Ming Jiang/Desktop/init3.json";
        FileUtil.writeTo(file, new Json(FileUtil.readToLine(file)).toFormatString());
    }
    public ItemVo() {
        kind = -1;
        itemName = "未知道具.请更新";
        itemDesc = "未知";
        itemId = -1;
        category = -1;
        levelNeed=-1;
        mergeNeed=-1;
        mergeTarget=0;
        seedreqtime=-1;
        qualitycfgid = -1;
        rewardType= -1;
        propertyvalue=-1;
        equipproperty= null;
        valuetype= -1;
    }

    public ItemVo(Json json) {
        kind = json.getInt("kind");
        itemName = json.getString("itemname");
        itemDesc = json.getString("itemdesc");
        itemId = json.getInt("itemcfgid");
        qualitycfgid = json.getInt("qualitycfgid");
        seedreqtime = json.getInt("seedreqtime");
        category = json.getInt("category");
        levelNeed = json.getInt("reqlevel");
        propertyvalue = json.getInt("propertyvalue");
        equipproperty = json.getString("equipproperty");
        valuetype= json.getInt("valuetype");
        Json mergeInfo = json.getJson("mergecfgInfo");
        if (mergeInfo!=null) {
        	mergeTarget = mergeInfo.getInt("id");
        	for(Object o: mergeInfo.getArray("arrReqcfg").getItems()){
        		Json tmp = (Json)o;
        		if(tmp.getString("type").equals("item")){
        			mergeNeed =tmp.getInt("num");
        			break;
        		}
        	}
        }else{
            mergeNeed= -1;
            mergeTarget = -1;
        }
        if(seedreqtime!=0){
            switch(json.getArray("seedawardcfgList").getJson(0).getString("type")){
                case "item": rewardType = Seed.TYPE_OTHER;break;
                case "techpoint": rewardType = Seed.TYPE_TECH;break;
                case "renown": rewardType = Seed.TYPE_RENOWN;break;
                case "money": rewardType = Seed.TYPE_MONEY;break;
                case "exp": rewardType = Seed.TYPE_EXP;break;
                default: rewardType = Seed.TYPE_NOTYPE;
            }
        }else
            rewardType = Seed.TYPE_NOTYPE;
        JsonArray changeSoulInfo = json.getArray("convertawardList");
        if (changeSoulInfo!=null) 
        	setChangeSoul(changeSoulInfo.getJson(0).getInt("num"));
    }

    public int getKind() {
        return kind;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public int getItemId() {
        return itemId;
    }

    public boolean openable() {
        return kind == 8 || kind == 9;
    }

    public boolean mergable() {
        return kind == 11 || kind == 7 || kind == 5;
    }

    public boolean eatable() {
        return kind == 12 || kind == 209 || kind == 701 || kind == 702;
    }

    public boolean saleable() {
        return kind <= 7;
    }

    public int getCategory() {
        return category;
    }

    public int getMergeNeed() {
        return mergeNeed;
    }

    public int getLevelNeed() {
        return levelNeed;
    }

    public int getSeedreqtime() {
        return seedreqtime;
    }

    /**
     * @param mergeNeed the mergeNeed to set
     */
    public void setMergeNeed(int mergeNeed) {
        this.mergeNeed = mergeNeed;
    }

    /**
     * @return the qualitycfgid
     */
    public int getQualitycfgid() {
        return qualitycfgid;
    }

    /**
     * @return the rewardType
     */
    public int getRewardType() {
        return rewardType;
    }

    /**
     * @return the propertyvalue
     */
    public int getPropertyvalue() {
        return propertyvalue;
    }
	public int getMergeTarget() {
		return mergeTarget;
	}
	public String getEquipproperty() {
		return equipproperty;
	}
	public int getValuetype() {
		return valuetype;
	}
	public int getChangeSoul() {
		return changeSoul;
	}
	public void setChangeSoul(int changeSoul) {
		this.changeSoul = changeSoul;
	}

	
}
