package data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mingJiang.util.json.Json;

import component.item.ItemInfo;
import component.item.ItemVo;
import component.warrior.MultiProp;
import component.warrior.Prop;
import component.warrior.WarriorCfg;
import component.warrior.WarriorInfo;

public class UserInfo {
	private Map<String, Number> values = new HashMap<>();
	private String name;
	private int fateNum, artiNum;
	private List<EquipInfo> equip;
	private boolean showDetail;
	
	public UserInfo(Json data){
		this(data,false);
	}
	
	public UserInfo(Json data,boolean detail) {
		showDetail = detail;
		for (String key : data.keyset()) {
			Object o = data.get(key);
			if(key.contains("quot")){
				BigDecimal bd = new BigDecimal(o.toString());
				values.put(key, bd);
			}else
				if (o instanceof Integer) {
					if (o instanceof Integer)
						values.put(key, (Integer) o);
					else {
						StaticInfo.log("出错- " + key + "   " + o.getClass());
					}
				}
		}

		name = data.getString("name");
		Json tmp = data.getJson("fateItem");
		for(String key: tmp.keyset()){
			if(tmp.getInt(key)!=0)
				fateNum++;
		}
		tmp = data.getJson("artiItem");
		for(String key: tmp.keyset()){
			if(tmp.getInt(key)!=0)
				artiNum++;
		}
		equip = new ArrayList<>();
		for (Object o : data.getArray("equipedItemInfo").getItems()) {
			equip.add(new EquipInfo((Json) o));
		}
	}

	public Map<String, Number> getValues() {
		return values;
	}

	public String getName() {
		return name;
	}

	public int getFateNum() {
		return fateNum;
	}

	public int getArtiNum() {
		return artiNum;
	}

	public List<EquipInfo> getEquip() {
		return equip;
	}

	private int getInt(String val) {
		return (Integer) values.get(val);
	}

	private BigDecimal getDouble(String val) {
		return (BigDecimal) values.get(val);
	}

	public int getCon() {
		return getInt("con");
	}

	public int getForcestars() {
		return getInt("forcestars");
	}

	public int getScore() {
		return getInt("score");
	}

	public int getInternode() {
		return getInt("internode");
	}

	public int getVigour() {
		return getInt("vigour");
	}

	public int getShiplevel() {
		return getInt("shiplevel");
	}

	public int getAlchemy_force() {
		return getInt("alchemy_force");
	}

	public int getWarriorcfgid() {
		return getInt("warriorcfgid");
	}

	public int getAntisubhp() {
		return getInt("antisubhp");
	}

	public int getAntisubattack() {
		return getInt("antisubattack");
	}

	public BigDecimal getAgiquot() {
		return getDouble("agiquot");
	}
	
	public BigDecimal getConquot() {
		return getDouble("conquot");
	}

	public int getResetnamenum() {
		return getInt("resetnamenum");
	}

	public int getLevel() {
		return getInt("level");
	}

	public BigDecimal getStrquot() {
		return getDouble("strquot");
	}

	public int getStrstars() {
		return getInt("strstars");
	}

	public int getNextexp() {
		return getInt("nextexp");
	}

	public int getFriendship() {
		return getInt("friendship");
	}

	public int getMaxen() {
		return getInt("maxen");
	}

	public int getAlchemy_limit_str() {
		return getInt("alchemy_limit_str");
	}

	public int getCriticaldmg() {
		return getInt("criticaldmg");
	}

	public int getConstars() {
		return getInt("constars");
	}

	public int getLoopintertimes() {
		return getInt("loopintertimes");
	}

	public BigDecimal getCriticalquot() {
		return getDouble("criticalquot");
	}

	public int getAlchemy_con() {
		return getInt("alchemy_con");
	}

	public int getExp() {
		return getInt("exp");
	}

	public int getAlchemy_limit_force() {
		return getInt("alchemy_limit_force");
	}

	public int getStr() {
		return getInt("str");
	}

	public int getQuality() {
		return getInt("quality");
	}

	public int getTalknum() {
		return getInt("talknum");
	}

	public int getAlchemy_str() {
		return getInt("alchemy_str");
	}

	public BigDecimal getForcequot() {
		return getDouble("forcequot");
	}

	public int getConquality() {
		return getInt("conquality");
	}

	public int getSkilldefence() {
		return getInt("skilldefence");
	}

	public int getHp() {
		return getInt("hp");
	}

	public int getReducedmg() {
		return getInt("reducedmg");
	}

	public int getBlock() {
		return getInt("block");
	}

	public int getTotalvigour() {
		return getInt("totalvigour");
	}

	public int getReduceskilldmg() {
		return getInt("reduceskilldmg");
	}

	public int getAntiunskill() {
		return getInt("antiunskill");
	}

	public int getId() {
		return getInt("id");
	}

	public int getStrquality() {
		return getInt("strquality");
	}

	public int getCritical() {
		return getInt("critical");
	}

	public int getAlchemy_agi() {
		return getInt("alchemy_agi");
	}

	public int getDefence() {
		return getInt("defence");
	}

	public int getAlchemy_limit_con() {
		return getInt("alchemy_limit_con");
	}

	public int getLoopinternode() {
		return getInt("loopinternode");
	}

	public int getForcequality() {
		return getInt("forcequality");
	}

	public int getAttackprior() {
		return getInt("attackprior");
	}

	public int getAgiquality() {
		return getInt("agiquality");
	}

	public int getSpeed() {
		return getInt("speed");
	}

	public int getSkinid() {
		return getInt("skinid");
	}

	public int getAddattackdmg() {
		return getInt("addattackdmg");
	}

	public int getAntisubdefence() {
		return getInt("antisubdefence");
	}

	public int getEnSpd() {
		return getInt("enSpd");
	}

	public int getAgistars() {
		return getInt("agistars");
	}

	public int getAlchemy_limit_agi() {
		return getInt("alchemy_limit_agi");
	}

	public int getAddskillattackdmg() {
		return getInt("addskillattackdmg");
	}

	public int getAgi() {
		return getInt("agi");
	}

	public int getSkillattack() {
		return getInt("skillattack");
	}

	public int getMaxhp() {
		return getInt("maxhp");
	}

	public int getEn() {
		return getInt("en");
	}

	public int getForce() {
		return getInt("force");
	}

	public int getAttack() {
		return getInt("attack");
	}

	public int getAccuracy() {
		return getInt("accuracy");
	}
	
	public void analyze(){
		System.out.println("\t神兵数量: "+this.artiNum+"  卦数量: "+this.fateNum);
		for(int i=-17;i<=5;i++)
			analyze(i,60);
	}
	
	public void analyze(int hyp, int renown){
		System.out.println("\t神兵数量: "+this.artiNum+"  卦数量: "+this.fateNum);
		System.out.println("\t共鸣之力+好战者= "+(hyp)+"%属性  声望 "+renown+"级");
		MultiProp p = new MultiProp();
		p.add(parseLevel());
		p.add(parseStone());
		p.add(parseVigour());
		p.add(parseFriend(hyp));
		int type = this.getWarriorcfgid();
		if(type>=32&&type<=37||type>=19&&type<=24||type<=2)
			p.add(parseRenown(renown));
//		
//		for(Prop pp: p.getProp())
//			System.out.println(pp);
		
		int con = this.getCon();
		int str = this.getStr();
		int agi = this.getAgi();
		int force = this.getForce();
		if(showDetail){
			System.out.println("\t\t生命: "+con);
			System.out.println("\t\t力量: "+str);
			System.out.println("\t\t防御: "+agi);
			System.out.println("\t\t内力: "+force);
		
		}
		Map<String,Prop[]> map = p.getMap();

		con/=(1.0+map.get("con")[Prop.PERCENT].getValue()/1000.0);
		str/=(1.0+map.get("str")[Prop.PERCENT].getValue()/1000.0);
		agi/=(1.0+map.get("agi")[Prop.PERCENT].getValue()/1000.0);
		force/=(1.0+map.get("force")[Prop.PERCENT].getValue()/1000.0);
		
		if(showDetail){
		System.out.println("\t减去百分比加成-");
		System.out.println("\t\t生命: "+con);
		System.out.println("\t\t力量: "+str);
		System.out.println("\t\t防御: "+agi);
		System.out.println("\t\t内力: "+force);
		}
//		
		
		con-=(map.get("con")[Prop.VALUE].getValue());
		str-=(map.get("str")[Prop.VALUE].getValue());
		agi-=(map.get("agi")[Prop.VALUE].getValue());
		force-=(map.get("force")[Prop.VALUE].getValue());
		
		
		System.out.println("\t神兵+培养+时装+称号-");
		System.out.println("\t\t生命: "+con);
		System.out.println("\t\t力量: "+str);
		System.out.println("\t\t防御: "+agi);
		System.out.println("\t\t内力: "+force);
	}
	
	public List<Prop> parseFriend(int numFriend){
		List<Prop> tmp = new ArrayList<>();
		tmp.add(new Prop(Prop.PERCENT,10*numFriend,"con"));
		tmp.add(new Prop(Prop.PERCENT,10*numFriend,"str"));
		tmp.add(new Prop(Prop.PERCENT,10*numFriend,"agi"));
		tmp.add(new Prop(Prop.PERCENT,10*numFriend,"force"));
		return tmp;
	}
	
	public List<Prop> parseRenown(int lv){
		int val = 0;
		if(lv>=50){
			val= 3000+(lv-50)*120;
		}else if(lv>=40){
			val= 2000+(lv-40)*100;
		}else if(lv>=30){
			val= 1200+(lv-30)*80;
		}else if(lv>=20){
			val= 600+(lv-20)*60;
		}else if(lv>=10){
			val= 200+(lv-10)*40;
		}else {
			val= (lv)*20;
		}
		List<Prop> tmp = new ArrayList<>();
		tmp.add(new Prop(Prop.VALUE,val,"con"));
		tmp.add(new Prop(Prop.VALUE,val,"str"));
		tmp.add(new Prop(Prop.VALUE,val,"agi"));
		tmp.add(new Prop(Prop.VALUE,val,"force"));
		if(showDetail){
			System.out.println("\t声望加成 等级-"+lv);
			for(Prop p: tmp)
				System.out.println("\t\t"+p);
		}
		return tmp;
	}
	
    // 属性=〖｛基础+丹药+〖成长×（等级-1）〗+内功P2+装备+神兵｝×（1+内功P1+宝石+共鸣之力）〗
	public List<Prop> parseLevel(){

		
		MultiProp pro = new MultiProp();
		pro.add(new Prop(Prop.VALUE,this.getAlchemy_con(),"con"));
		pro.add(new Prop(Prop.VALUE,this.getAlchemy_str(),"str"));
		pro.add(new Prop(Prop.VALUE,this.getAlchemy_agi(),"agi"));
		pro.add(new Prop(Prop.VALUE,this.getAlchemy_force(),"force"));
		
		if(showDetail){
			System.out.println("\t丹药加成: ");
			for(Prop p: pro.getProp())
				System.out.println("\t\t"+p);
		}
		
		//称号+时装
//		pro.add(new Prop(Prop.VALUE,300+550,"con"));
//		pro.add(new Prop(Prop.VALUE,300+550,"str"));
//		pro.add(new Prop(Prop.VALUE,300+550,"agi"));
//		pro.add(new Prop(Prop.VALUE,300+550,"force"));
		WarriorCfg cfg = WarriorInfo.getWarrior(this.getWarriorcfgid());
		int level = this.getLevel()-1;
		pro.add(new Prop(Prop.VALUE,(int)(this.getConquot().doubleValue()*level)+cfg.getCon(),"con"));
		pro.add(new Prop(Prop.VALUE,(int)(this.getStrquot().doubleValue()*level)+cfg.getStr(),"str"));
		pro.add(new Prop(Prop.VALUE,(int)(this.getAgiquot().doubleValue()*level)+cfg.getAgi(),"agi"));
		pro.add(new Prop(Prop.VALUE,(int)(this.getForcequot().doubleValue()*level)+cfg.getForce(),"force"));
		
		if(showDetail){
			System.out.println("\t等级+丹药");
			for(Prop p: pro.getProp())
				System.out.println("\t\t"+p);
		}
		return pro.getProp();
	}
	
	
	public List<Prop> parseStone(){
		EquipInfo tmp = parseWeapon();
		Map<Integer,Integer> stone = new HashMap<>();
		for(int s: tmp.getStone()){
			if(stone.containsKey(s))
				stone.put(s, stone.get(s)+1);
			else
				stone.put(s, 1);
		}
		List<Prop> val = getStones(stone);
		if(showDetail){
			System.out.println("\t宝石加成 ");
			for(Prop p: val)
				System.out.println("\t\t"+p);
		}
		MultiProp mult = new MultiProp();
		for(Prop p: val){
			mult.add(p);
		}
		
		for(Prop p: tmp.getProp())
			mult.add(p);
		
		return mult.getProp();
		
		
	}
	
	
	
	public EquipInfo parseWeapon(){
		EquipInfo raw = new EquipInfo();
		for(EquipInfo info: this.equip)
			raw.add(info);
		if(showDetail){
			System.out.println("\t武器加成 ");
			for(Prop p: raw.getProp())
				System.out.println("\t\t"+p);
		}
		return raw;
	}
	
	public List<Prop> parseVigour(){
		WarriorCfg config = WarriorInfo.getWarrior(this.getWarriorcfgid());

		List<Prop> tmp = config.getProperty(this.getInternode(), this.getQuality(), 
						this.getLoopinternode(), this.getLoopintertimes());
		if(showDetail){
			System.out.println(config.getWname()+" 元气加成");
			for(Prop p:tmp)
				System.out.println("\t\t"+p);
		}
		return tmp;
	}

	
	/**
     * 
     * @param data
     * @param type
     * 		str	agi	con	force
     * @return
     */
    public static int getStone(Map<Integer,Integer> stone, String type){
    	int val = 0;
    	for(int id: stone.keySet()){
    		ItemVo info = ItemInfo.getItem(id);
    		if(info.getEquipproperty().equals(type)){
    			val+= info.getPropertyvalue()*stone.get(id);
    		}
    	}
    	
    	return val;
    }
    
    /**
     * return  int[]=
     * 				con		生命
     * 				str		力量	
     * 				agi		防御
     * 				force	内力
     * @param stone
     * @return
     */
    public static List<Prop> getStones(Map<Integer,Integer> stone){
    	List<Prop> tmp = new ArrayList<>();
    	
    	tmp.add(new Prop(Prop.PERCENT,getStone(stone,"con"),"con"));
    	tmp.add(new Prop(Prop.PERCENT,getStone(stone,"str"),"str"));
    	tmp.add(new Prop(Prop.PERCENT,getStone(stone,"agi"),"agi"));
    	tmp.add(new Prop(Prop.PERCENT,getStone(stone,"force"),"force"));
    	
    	return tmp;
    }
}
