package component.warrior;

import java.util.ArrayList;
import java.util.List;

import com.mingJiang.util.json.Json;

import data.StaticInfo;

public class WarriorCfg {


//	private int forcestars;
//	private int forcequot;
//	private int strquality;
//	private int camp;
//	private int jobtype;
//	private int agiquot;
//	private int level;
//	private int conquality;
//	private int strquot;
//	private int strstars;
//	private int forcequality;
//	private int skincfgid;
//	private int conquot;
//	private int agiquality;
//	private int agistars;
//	private int constars;
//	private int en;
//	private int hp;
//	private int maxen;

	private int con;
	private int str;
	private int agi;
	private int force;

	private int attack;
	private int defence;
	private int skillattack;
	private int skilldefence;
	private int block;
	private int accuracy;

	private int id;
	private int quality;
	private int maxhp;
	private int gender;
	private int enSpd;
	private int speed;
	
	private String wname;
	private String wdesc;
	private List<InterCfg> arrIntercfg;
	private InterCfg arrLoopIntercfg;
	
	public WarriorCfg(){
		con= -1;
		str= -1;
		agi= -1;
		force= -1;
		
		maxhp= -1;
		gender= -1;

		enSpd= -1;
		speed= -1;

		attack= -1;
		defence= -1;
		skillattack= -1;
		skilldefence= -1;
		block= -1;
		accuracy= -1;

		id= -1;
		quality= -1;
		wname="未知";
		wdesc="未知";
	}
	
	public WarriorCfg(Json data){
		
		con= data.getInt("con");
		str= data.getInt("str");
		agi= data.getInt("agi");
		force= data.getInt("force");
		
		maxhp= data.getInt("maxhp");
		gender= data.getInt("gender");

		enSpd= data.getInt("enSpd");
		speed= data.getInt("speed");

		attack= data.getInt("attack");
		defence= data.getInt("defence");
		skillattack= data.getInt("skillattack");
		skilldefence= data.getInt("skilldefence");
		block= data.getInt("block");
		accuracy= data.getInt("accuracy");

		id= data.getInt("id");
		quality= data.getInt("quality");
		wname= data.getString("wname");
		wdesc= data.getString("wdesc");
		
		arrIntercfg= new ArrayList<>();
		Json arr = data.getJson("arrIntercfg");
		if(arr!=null)
			for(String key: arr.keyset()){
				arrIntercfg.add(new InterCfg(arr.getJson(key)));
			}
		arr= data.getJson("arrLoopIntercfg");
		if(arr!=null)
			for(String key: arr.keyset()){
				if(arrLoopIntercfg!=null){
					StaticInfo.error("duplicated loop config");
				}
				arrLoopIntercfg= new InterCfg(arr.getJson(key));
			}
	}

	public int getCon() {
		return con;
	}

	public int getStr() {
		return str;
	}

	public int getAgi() {
		return agi;
	}

	public int getForce() {
		return force;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefence() {
		return defence;
	}

	public int getSkillattack() {
		return skillattack;
	}

	public int getSkilldefence() {
		return skilldefence;
	}

	public int getBlock() {
		return block;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public int getId() {
		return id;
	}

	public int getQuality() {
		return quality;
	}

	public int getMaxhp() {
		return maxhp;
	}

	public int getGender() {
		return gender;
	}

	public int getEnSpd() {
		return enSpd;
	}

	public int getSpeed() {
		return speed;
	}

	public String getWname() {
		return wname;
	}

	public String getWdesc() {
		return wdesc;
	}

	public List<InterCfg> getArrIntercfg() {
		return arrIntercfg;
	}

	public InterCfg getArrLoopIntercfg() {
		return arrLoopIntercfg;
	}
	
	public List<Prop> getProperty(Json data){
		return getProperty(
				data.getInt("internode"),
				data.getInt("quality"),
				data.getInt("loopinternode"),
				data.getInt("loopintertimes"));
	}
	
	public List<Prop> getProperty(int internode, int quality,int loopnode, int loopNum){
		MultiProp prop = new MultiProp();

		for(InterCfg  config: arrIntercfg){
			if(quality>config.getQuality()){
				for(NodeCfg node: config.getNodes())
					for(Prop p: node.getArrPropertycfg())
						prop.add(p);
			}else{
				if(quality==config.getQuality())
					for(NodeCfg node: config.getNodes())
						if(internode>=node.getNode())
							for(Prop p: node.getArrPropertycfg())
								prop.add(p);
			}
		}
		for(NodeCfg node: arrLoopIntercfg.getNodes()){
			for(int i=0;i<loopNum;i++)
				for(Prop p: node.getArrPropertycfg())
					prop.add(p);
			if(loopnode>=node.getNode())
				for(Prop p: node.getArrPropertycfg())
					prop.add(p);
		}
		
		return prop.getProp();
	}
	
}
