package data;

import java.util.ArrayList;
import java.util.List;

import com.mingJiang.util.json.Json;
import com.mingJiang.util.json.JsonArray;

import component.item.ItemInfo;
import component.warrior.MultiProp;
import component.warrior.Prop;

public class EquipInfo {
	private int attackprior=0;
	private int soul=0;
	private int score=0;
	private int id=0;
	private int num=0;
	private int level=0;
	private int rwarriorId=0;
	private int effectvalue=0;
	private int itemcfgid=0;
	private List<Integer> stone=new ArrayList<>();

	private int sellPrice=0;
	private MultiProp prop=new MultiProp();

	public EquipInfo(){
		
	}
	
	public EquipInfo(Json data){
	//	System.out.println(data);
		attackprior= data.getInt("attackprior");
		soul= data.getInt("soul");
		score= data.getInt("score");
		id= data.getInt("id");
		num= data.getInt("num");
		level= data.getInt("level");
		rwarriorId= data.getInt("rwarriorId");
		effectvalue= data.getInt("effectvalue");
		itemcfgid= data.getInt("itemcfgid");
		JsonArray arr =data.getArray("arrEquipedstone");
		if(arr!=null)
		for(Object o: arr.getItems())
			stone.add((Integer)o);
		arr =data.getArray("arrSellaward");
		if(arr!=null)
		for(Object o: arr.getItems()){
			Json tmp = (Json)o;
			if(tmp.getString("type").equals("money")){
				sellPrice = tmp.getInt("num");
			}else{
				System.out.println("equipInfo error : "+tmp);
			}
		}
		
		Json tmp = data.getJson("arrAddproperty");
		if(tmp!=null)
			for(String key: tmp.keyset()){
				Json p = tmp.getJson(key);
				prop.add(new Prop(Prop.VALUE,p.getInt("value"),p.getString("property")));
			}
		
		Json soulPro = data.getJson("arrSoulproperty");
		if(soulPro!=null){
			prop.add(new Prop(soulPro.getInt("valuetype"),soulPro.getInt("value"),soulPro.getString("property")));
		}
		
		String type = ItemInfo.getItem(getItemcfgid()).getEquipproperty();
		prop.add(new Prop(Prop.VALUE,this.effectvalue,type));
	}
	
	
	public void add(EquipInfo other){
		this.attackprior+= other.attackprior;
		this.score+= other.score;
		this.sellPrice+= other.sellPrice;
		for(int s: other.stone)
			this.stone.add(s);
		for(Prop p: other.prop.getProp())
			this.prop.add(p);
	}

	public int getAttackprior() {
		return attackprior;
	}

	public int getSoul() {
		return soul;
	}

	public int getScore() {
		return score;
	}

	public int getId() {
		return id;
	}

	public int getNum() {
		return num;
	}

	public int getLevel() {
		return level;
	}

	public int getRwarriorId() {
		return rwarriorId;
	}

	public int getEffectvalue() {
		return effectvalue;
	}

	public int getItemcfgid() {
		return itemcfgid;
	}

	public List<Integer> getStone() {
		return stone;
	}

	public int getSellPrice() {
		return sellPrice;
	}

	public List<Prop> getProp() {
		return prop.getProp();
	}
	
	


}
