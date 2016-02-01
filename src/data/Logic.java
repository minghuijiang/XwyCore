package data;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.xml.soap.Node;

import message.ArenaMsg;
import message.EtcMsg;
import message.FarmMsg;
import message.FightMsg;
import message.ItemMsg;
import message.MainMsg;
import message.MatchMsg;
import message.MethodUtil;
import message.PetMsg;
import message.RobMsg;
import message.TradeMsg;
import message.WarriorMsg;
import message.WeaponMsg;

import com.mingJiang.util.json.Json;

import component.QuestSet;
import component.User;
import component.Warrior;
import component.item.ItemInfo;
import component.item.Seed;
import component.item.SpecialWeapon;
import component.item.Weapon;
import component.map.Map;
import component.map.MapInfo;
import component.quest.Quest;
import component.quest.QuestNode;
import component.quest.TaskInfo;

public class Logic {

    private static List<Integer> intList = new ArrayList<>();
    static{
        intList.add(0);intList.add(0);intList.add(0);intList.add(0);
    }

    List<Weapon> one = new ArrayList<>();
    List<Weapon> two = new ArrayList<>();
    List<Weapon> three = new ArrayList<>();
    List<Weapon> four = new ArrayList<>();
    private final List<Integer> weapon = new ArrayList<>(intList);
    

    
    public String warriorStr = "[\"%s\",\"-1\",\"%s\",\"%s\",\"-1\",\"-1\"]";
    public int linger = -1;//灵儿
    public int mu = -1;//木婉清
 

    private User user;
    private boolean doQuest = true;
    private boolean quick = false;
    private boolean advance = false;
    private boolean hasTech = false;
    private int techSeedId = 0;
    private boolean mainDone = true,doSwipe = false;;

    private long startTime;
    
    public static void main(String[] args){
    	StaticInfo.registerPlatform(Constant.TENCENT, 51);
    	User.G_showHttp=true;
    	User user  = new User("08lj0vp78n136lo482pm328lf1");
    	user.setNeedData(true);
    	user.login();
    	Logic logic = new Logic(user, false,true);
    	logic.start();
    }
    
    
    
    
    
    public Logic(User user, boolean quickMode){
        this(user,quickMode,false);
    }
    
    public Logic(User u,boolean quickMode,boolean ad) {
        user = u;
        user.log("体力--- " + user.getStamina());
        this.quick = quickMode;
        this.advance= ad;
    }

    public void start(){
    	startTime = System.currentTimeMillis();
    	start(0);
    }
    
    public void start(int deep) {
        if(quick){
            if(user.getLevel()>=10){
                user.log("快速模式。 等级超过10级 不进行小号任务 "+user.getLevel());
                user.getSocket().close();
                user.setNeedData(false);
                return;
            }
        }

        /**
         * initialize all data
         */
        if (user.getLevel()<=1) {
        	if(Math.random()>0.5)
        		EtcMsg.selectGender(user, 0); // 女性
        	else
        		EtcMsg.selectGender(user, 1);//男性
            EtcMsg.saveGuide(user, 1);

        } else {
            //grab warrior wid
            linger = -1;
            mu = -1;
            for (Warrior war : user.getMonster()) {
                if (war.getWarriorcfgid() == 3) {
                    linger = war.getId();
                }
                if (war.getWarriorcfgid() == 4) {
                    mu =war.getId();
                }
            }

        //    installWeapon();
            
            EtcMsg.arrGroup(user, String.format(warriorStr, user.getRwid(), mu, linger));
        }
        QuestSet quest = user.getQuests();
        quest.setIndex(0);
        QuestNode node = quest.next();
        while(node!=null) {
        	selectMethod(node.getQuestId());
            node = quest.next();
            if(quest.isHasNew()){
            	quest.setHasNew(false);
            	if(doSwipe)
            		doSwipe= false;
            }
        }
        
      //  EtcMsg.swipeMap(user, EtcMsg.getLastMap(user), user.getStamina());
        if(user.getStamina()>0&&deep<5){
        	if(mainDone&&upLevel()){
        		user.log("继续进行任务");
                doSwipe= false;
        		start(deep+1);
        	}else if(!doSwipe){
                doSwipe= true;
                mainDone = true;
        		start(deep+1);
        	}
        }
        
        doQuest = false;
        user.getSocket().close();
        user.setNeedData(false);
        user.setMsg("结束全部任务--- "+user.getLevel()+" "+user.getStamina()+" "+user.getArenanum()+" "+user.getMatchtimes());
        if(deep==0){
        	user.setMsg("开始时间 "+startTime+" 结束时间 "+System.currentTimeMillis()+"  用时 "+(System.currentTimeMillis()-startTime));
        }
        //UnionPanel
    }
 
    public void selectMethod(int questNum) {
        selectMethod(questNum,0);
    }
    
    private void removeQuest(int id){
    	user.getQuests().remove(id);
    }

    private void selectMethod(int questId, int failCount) {
        if (user.isError() || !doQuest) {
            user.getSocket().close();
            user.setNeedData(false);

            return;//没体力了。
        }

        Quest quest = TaskInfo.getQuest(questId);
        boolean submit = false;
        switch(quest.getType()){
        case Quest.MAIN_QUEST:
        case Quest.SECOND_QUEST:
            user.log("开始任务-"+questId+" 次数-"+failCount);
        	submit= doQuest(quest);

        	break;
        case Quest.STORY_QUEST:
        	EtcMsg.getTaskAward(user, questId);
        	user.log("提交剧情任务:"+quest.getQuestid());
        	break;
        default: 
        	user.log(quest.getQuestid()+" 不是主要任务  跳过");
        	removeQuest(questId);
        	break;
        };
        user.log("结束任务-"+questId+" 次数-"+failCount);
        if(submit)
        	getNext(quest,failCount);
    }
    
    private boolean doQuest(Quest quest){
    	if(quest.getMap()==0){
    		return doSpecificTask(quest);
    	}
    	else
	    	switch(quest.getAction()){
		    	case "first":
		    	case "fight":
		    		fightQuest(quest);
		    		return true;
		    	case "raid":
		    		return raidQuest(quest);

		    	default: user.error("未知任务- "+quest.getQuestid()+"  "+quest.getAction());
		    	return false;
	    	}
    }
    
    private boolean  doSpecificTask(Quest quest){
    	switch(quest.getQuestid()){
	    	case 3: quest3(); break; //first 在“侠客”界面装备段唯情赠送的装备。
	    	case 6: quest6(); break; //first 进入酒馆，和灵儿博弈并招募灵儿。
	    	case 7: quest7(); break; //first 在布阵界面让灵儿出战。
	    	case 11: quest11(); break; //first 进行8次装备强化。
	    	case 17: quest17(); break; //first 进入训练场，对一名侠客进行训练。
	    	case 24: quest24(); break; //first 和其他玩家进行1场擂台较量。
//	    	case 25: quest25(); break; //work 抓捕一名家丁，并给他分配工作。
	    	case 26: quest26(); break; //first 在内功心法界面修炼1次内功。
	    	case 125: quest125(); break; //trade 进入商会，派遣1次商队，并收获商品。
	    	case 126: quest126(); break; //tavern 进入客栈，送给任意侠客1份礼物。
//	    	case 127: quest127(); break; //merge 进入铁匠铺，对任意装备进行宝石镶嵌。
	    	case 155: quest155(); break; //null 进行10次装备强化。
//	    	case 157: quest157(); break; //null 邀请5个好友加入《侠物语》。
//	    	case 158: quest158(); break; //null 邀请10个好友加入《侠物语》。
//	    	case 159: quest159(); break; //null 邀请15个好友加入《侠物语》。
	    	case 184: quest184(); break; //null 利用共鸣之力进行转职。
	    	case 186: quest186(); break; //trans 进行1次运镖。
//	    	case 196: quest196(); break; //null 进行5次装备强化。
//	    	case 197: quest197(); break; //null 进行5次装备强化。
	    	case 198: quest198(); break; //null 和其他玩家进行5场擂台较量。
//	    	case 200: quest200(); break; //null 和其他玩家进行5场擂台较量。
//	    	case 201: quest201(); break; //null 和其他玩家进行10场擂台较量。
//	    	case 202: quest202(); break; //null 和其他玩家进行10场擂台较量。
//	    	case 203: quest203(); break; //null 抓捕一名家丁，并给他分配工作。
//	    	case 204: quest204(); break; //null 抓捕一名家丁，并给他分配工作。
//	    	case 205: quest205(); break; //null 抓捕一名家丁，并给他分配工作。
//	    	case 206: quest206(); break; //null 抓捕一名家丁，并给他分配工作。
//	    	case 207: quest207(); break; //null 抓捕一名家丁，并给他分配工作。
	    	case 245: quest245(); break; //farm 在农田进行1次种植。
	    	case 246: quest246(); break; //first 在昆仑木进行1次征收。
	    	case 247: quest247(); break; //null 进入酒馆，招募任意1名侠客。
	    	case 249: quest249(); break; //worker 在“群侠”中抓捕1名家丁，让他在煤窑工作。
//	    	case 252: quest252(); break; //null 进入神兵阁，装备任意神兵。
//	    	case 254: quest254(); break; //null 进入神兵阁，升级任意神兵1次。
	    	case 256: quest256(); break; //tree 在昆仑木收获1次祝福。
	    	case 257: quest257(); break; //tech 进入藏经阁，进行1次科技升级。
	    	case 263: quest263(); break; //rob 进行1次劫镖。
//	    	case 264: quest264(); break; //null 进入神兵阁，升级任意神兵3次。
	    	case 265: quest265(); break; //match 进行1次天梯赛战斗。
//	    	case 267: quest267(); break; //null 进入藏经阁，进行3次科技升级。
//	    	case 269: quest269(); break; //null 抓捕1名家丁，让他在煤窑工作。
	    	case 270: quest270(); break; //tower 通关1次枯木塔1F。
//	    	case 271: quest271(); break; //null 通关1次枯木塔5F。
	    	case 272: quest272(); break; //null 通关1次枯木塔10F。
	    	case 273: quest273(); break; //null 在内功心法界面修炼2次内功。
//	    	case 276: quest276(); break; //null 击败“精英关卡1”中的敌人。
	    	case 279: quest279(); break; //null 在天梯赛中晋升到青铜组。
	    	case 280: quest280(); break; //null 在天梯赛中晋升到白银组。
//	    	case 284: quest284(); break; //null 进入酒馆，招募任意1名侠客。
	    	case 289: quest289(); break; //null 进入训练场，对一名侠客进行训练。
	    	case 299: quest299(); break; //null 通关1次黑石塔1F。
//	    	case 300: quest300(); break; //null 通关1次黑石塔5F。
	    	case 301: quest301(); break; //null 通关1次黑石塔10F。
//	    	case 302: quest302(); break; //null 和其他玩家进行5场擂台较量。
//	    	case 303: quest303(); break; //inter 在内功心法界面修炼3次内功。
//	    	case 309: quest309(); break; //null 和其他玩家进行5场擂台较量。
//	    	case 310: quest310(); break; //null 和其他玩家进行5场擂台较量。
//	    	case 316: quest316(); break; //null 抓捕2名家丁，让他在煤窑工作。
//	    	case 319: quest319(); break; //null 进入训练场，对一名侠客进行训练。
//	    	case 320: quest320(); break; //null 进入训练场，对一名侠客进行训练。
//	    	case 324: quest324(); break; //trans 进行1次运镖
	    	case 521: quest521(); break; //null 通关1次青铜塔1F。
//	    	case 522: quest522(); break; //null 通关1次青铜塔5F。
//	    	case 523: quest523(); break; //null 通关1次青铜塔10F。
//	    	case 524: quest524(); break; //null 通关1次白银塔1F。
//	    	case 525: quest525(); break; //null 通关1次白银塔5F。
//	    	case 526: quest526(); break; //null 通关1次白银塔10F。
//	    	case 527: quest527(); break; //null 通关1次黄金塔1F。
//	    	case 528: quest528(); break; //null 通关1次黄金塔5F。
//	    	case 529: quest529(); break; //null 通关1次黄金塔10F。
	    	case 531: quest531(); break; //artifact 进入神兵阁，装备任意神兵。
	    	case 532: quest532(); break; //boss 进入冒险，挑战任意精英关卡。
	    	case 533: quest533(); break; //artifact 进入神兵阁，升阶任意神兵。
//	    	case 541: quest541(); break; //destiny 进入卦炉，问卦1次。
//	    	case 542: quest542(); break; //null 进入挂炉，装备任意卦象。
	  //TODO  	case 543: quest543(); break; //guild 创建公会或者加入一个公会
//	    	case 577: quest577(); break; //null 通关1次钻石塔10F。
//	    	case 578: quest578(); break; //null 通关1次天晶塔10F。
//	    	case 579: quest579(); break; //null 利用共鸣之力进行职业进阶。
//	    	case 580: quest580(); break; //null 在布阵界面让任意侠客出战。
	    	case 612: quest612(); break; //pet_train 进入宠物界面训练一次宠物
	    	case 613: quest613(); break; //pet_feed 进入宠物界面喂养宠物一次
	    	case 614: quest614(); break; //pet_begfire 进入宠物界面祈火一次
	    	case 615: quest615(); break; //pet_learnSkill 给宠物解锁一次技能
	    	case 616: quest616(); break; //null 进行一场擂台赛
	  //TODO  	case 617: quest617(); break; //groupBattle 击败“终南山下”中的敌人
//	    	case 618: quest618(); break; //groupBattle 击败“世外桃源”中的敌人
//	    	case 619: quest619(); break; //groupBattle 击败“无底深渊”中的敌人
//	    	case 620: quest620(); break; //groupBattle 击败“黑暗沼泽”中的敌人
//	    	case 621: quest621(); break; //null 在布阵界面让任意侠客出战。
//	    	case 622: quest622(); break; //null 通关1次太虚塔10F。
//	    	case 623: quest623(); break; //null 击败“绛帐”中的敌人。
//	    	case 624: quest624(); break; //null 击败“幽州”中的敌人。
//	    	case 625: quest625(); break; //null 击败“鬼镇”中的敌人。
//	    	case 626: quest626(); break; //null 击败“蝮蛇”中的敌人。
//	    	case 627: quest627(); break; //null 击败“刘家庄小楼”中的敌人。
//	    	case 628: quest628(); break; //null 击败“翠屏山洞穴”中的敌人。
//	    	case 629: quest629(); break; //null 击败“东峡石谷”中的敌人。
//	    	case 630: quest630(); break; //null 击败“崇州城外”中的敌人。
//	    	case 631: quest631(); break; //null 击败“大杨山小庙”中的敌人。
//	    	case 632: quest632(); break; //null 击败“寒光寺”中的敌人。
//	    	case 634: quest634(); break; //null 通关1次太虚塔(困难)10F。

			default: 
				user.log("任务-"+quest.getQuestid()+" 未配置");
				return false;
    	}
    	return true;
    }

  
    private boolean fightQuest(Quest quest){
    	int map = quest.getMap();
    	int result = fight(map);
    	while(result==-2||map!=quest.getMap()){
    		if(result == -2)
    			map--;
    		else if(result==1)
    			map++;
    		result = fight(map);
    	}
    	return result ==1;
    }
    
    private boolean raidQuest(Quest quest){
    	// check if worth.
    	if(doSwipe){
	    	int gain = MapInfo.getMap(quest.getMap()).getExp()*quest.getReq()+quest.getExp();
	    	int current = MapInfo.getMap(EtcMsg.getLastMap(user)).getExp()*quest.getReq();
	    	if(gain>=current){
	    		user.log("提交任务获得 "+gain+"经验, 扫荡最后地图能获得"+current+"经验");
	    		EtcMsg.swipeMap(user, quest.getMap(), quest.getReq());
	    		return true;
	    	}else{
	    		user.log("提交任务获得 "+gain+"经验, 扫荡最后地图能获得"+current+"经验, 不进行任务");
	    		user.getQuests().remove(quest.getQuestid());
	    		return false;
	    	}
    	}else{
    		mainDone= false;
    		return false;
    	}
    }
    
    
    private void getNext(Quest currentQuest,int failCount) {

        String json = EtcMsg.getTaskAward(user, currentQuest.getQuestid());// send method do all the retry steps.
 
        try {
            Json jj = new Json(json);
            Json j = jj.getJson("change");
            if (j == null) {
                
                user.log("quest-" + currentQuest.getQuestid() + " "+failCount+"  "+
                		jj.getString("msg").equalsIgnoreCase("_gam_err_questnotfinished")
                        +"  " + json);
                if(jj.getString("msg").equalsIgnoreCase("_gam_err_questnotfinished")&&failCount<1){
                	installWeapon();
                }
                else{
                    user.log("else? "+json);
                    if(jj.getString("msg").equalsIgnoreCase("_gam_err_questnotfinished")
                    		&&(currentQuest.getType()==Quest.MAIN_QUEST||currentQuest.getType()==Quest.SECOND_QUEST))
                    	mainDone = false;
                }
                return;
            }
            Json bag = j.getJson("rbagitem");
            if (bag != null) {
                for (String key : bag.keyset()) {
                    Json weapon = bag.getJson(key);
                    if (weapon.get("_cls") != null && weapon.getString("_cls").equals("rbagitemVo1")) {
                    	 installWeapon();
                    	 break;
                    }
                }
            }

            user.log("成功完成任务 --"+currentQuest.getQuestid()+"  次数--"+failCount);
        } catch (Exception e) {
            e.printStackTrace();
            StaticInfo.debug("fatal error: " + json);
            this.doQuest = false;
        }
        
        if(currentQuest.getQuestid()==129&&!advance){
	            user.setMsg("完成全部任务.--不进行高等任务");
	            doQuest = false;
	            user.getSocket().close();
	            user.setNeedData(false);
	    }
    }

    private static int retryThreadHold=3;
    public static int ALREADY_FIGHTED= 1;
    public static int NO_STAMINA= -1;
    public static int PREV_NOT_FIGHT= -2;
    private int fight(int map){
    	if(user.getStamina()==0)
    		return NO_STAMINA;
    	if(EtcMsg.getNextMap(user)!=map&&Map.validRange(map)){
    		if(EtcMsg.getNextMap(user)>map)
    			return 1;
    		EtcMsg.resetMap(user);
    		if(EtcMsg.getNextMap(user)!=map){
	    		user.log(EtcMsg.getNextMap(user)+"  "+map+" fail ");
	    		return -2;
    		}
    	}
        int fail = 0;
        boolean suc = FightMsg.fight(user, 0, map, 0);
        boolean forceBoss = false;
        while(!suc){
            user.log("挑战 "+map+ "失败 "+ ++fail);
            if(fail>retryThreadHold-2)
                forceBoss = true;
            suc = FightMsg.fight(user, 0, map, 0,forceBoss);
            if(fail>retryThreadHold&&!suc){
                return 0;
            }
        }
        
        return 1;
    }
    

    private void quest3() { //4 73
        this.installWeapon();
    }
    
    private void quest6() {//7
        String hire = WarriorMsg.getWarrior(user, 3, 1);
        try {
            Json j = new Json(hire).getJson("change").getJson("rwarrior");
            if (j != null) {
                for (String k : j.keyset()) {
                    linger = Integer.parseInt(k);
                }
            }
        } catch (Exception e) {
            user.log("招募侠客出错: "+hire);

        }
    }

    private void quest7() {//8
        EtcMsg.arrGroup(user, String.format(warriorStr, user.getRwid(), -1, linger));
    }


    private void quest17() {//9
        WarriorMsg.train(user, linger, 1, 1);
    }

    
    private void quest11() {
        for (int i = 0; i < 2; i++) {
            ItemMsg.upgradeWeaponOne(user, one.get(0).getId());
            ItemMsg.upgradeWeaponOne(user, two.get(0).getId());
            ItemMsg.upgradeWeaponOne(user, three.get(0).getId());
            ItemMsg.upgradeWeaponOne(user, four.get(0).getId());
        }
    }//  56  13

    private void quest246() {
    	FarmMsg.collectTree(user);

    }//14 155

    private void quest155() {
        for (int i = 0; i < 3; i++) {
            ItemMsg.upgradeWeaponOne(user, one.get(0).getId());
            ItemMsg.upgradeWeaponOne(user, two.get(0).getId());
            ItemMsg.upgradeWeaponOne(user, three.get(0).getId());
            ItemMsg.upgradeWeaponOne(user, four.get(0).getId());
        }
    }

    private void quest247() {
        String hire = WarriorMsg.getWarrior(user, 4, 3);
        try {
            Json j = new Json(hire).getJson("change").getJson("rwarrior");
            if (j != null) {
                for (String k : j.keyset()) {
                    mu = Integer.parseInt(k);
                    user.getFighter().add(new Warrior(j.getJson(k)));
                }
            }
        } catch (Exception e) {
        	user.log("招募侠客出错: "+hire);
        }
    }//289

    private void quest289() {
        for(int i = 0; i<10;i++)
            EtcMsg.upTech(user, 1);
        EtcMsg.arrGroup(user, String.format(warriorStr, user.getRwid(), mu, linger));
        WarriorMsg.train(user, mu, 1, 2);
   
    }

    private void quest184() {
        MainMsg.setCamp(user, 20);
        MainMsg.setCamp(user, 23);
        TradeMsg.begin(user, 1, 1);
        // try get level 10 gift
       if(quick){
            user.setMsg("简略模式 结束");
            doQuest = false;
            user.getSocket().close();
            user.setNeedData(false);
        }
        getAllGift(user);
    }//18

    
    
    
   

    private void quest24() {
        ArenaMsg.fight(user);

    }//26

    private void quest26() {
    	for(int i = 0;i<2;i++)
    		ArenaMsg.fight(user);
        WarriorMsg.openNext(user, user.getRwid());
        WarriorMsg.openNext(user, linger);
        WarriorMsg.openNext(user, mu);
    }//198 29 

    private void quest198() {
        for (int i = 0; i < 9&&user.getArenanum()>0; i++) {
            ArenaMsg.fight(user);
        }

    }//273

    private void quest273() {
        for (int i = 0; i < 9; i++) {
            WarriorMsg.openNext(user, user.getRwid());
            WarriorMsg.openNext(user, linger);
            WarriorMsg.openNext(user, mu);
        }

    }

    private void quest245() {
        int seedId= -1;
        for (Seed s : user.getItems().getSeed()) {
                seedId = s.getId();
                break;
            }
        if (seedId==-1) {
           StaticInfo.debug(user.getAcc()+"没种子id");
           //should not happen
           user.resetItem();
         //  user.resetItem();
        } else {
            FarmMsg.harvestPlant(user, 1);
            FarmMsg.plant(user, seedId, 1);
            FarmMsg.plant(user, seedId, 2);
        }
    }//250

    private void quest270() {
        fight(90);
    }// 249 272 53 54 74

    private void quest272() {
        if(advance){
             for(int i=90+EtcMsg.getTower(user, 999);i<=99;i++)
            if(fight(i)!=1)
                break;
        }
    }
    

    private void quest249() {
        FarmMsg.catchServant(user, 0);
    }//28


    
    private void quest543(){
        //加入公会
    }

    private void quest256() {
        FarmMsg.harvestBless(user);
    }//257

    private void quest257() {
        EtcMsg.upTech(user, 1);
    }

    private void quest125() {
        try {
            TradeMsg.getBack(user);
            
        }catch(Exception e){
        }
        TradeMsg.begin(user, 1, 0);
    }   // 126

    private void quest126(){
        WarriorMsg.sendGiftAll(user, linger);
    }
   
    private void quest265() {
        if(!MatchMsg.fightRandom(user)){
            user.log("天梯错误.");

        }
    }//153 279 299
 
    private void quest279() {
        //青铜
    }
    private void quest280() {
        //白银
    }
    private void quest299() {
        fight(100);//黑石塔
    }//301
    private void quest301() {
        for(int i=100+EtcMsg.getTower(user, 1000);i<=109;i++)
            if(fight(i)!=1)
                break;
    }
    
    private void quest186() {
        RobMsg.fight(user, 0);
    }//139

    private void quest263() {
        RobMsg.robRandom(user);
    }//296

    private void quest531() {
        try{
        int id = user.getItems().getSpecial().get(0).getId();
        WeaponMsg.equipArti(user, user.getRwid(),id);
        }catch(Exception e){
            user.log("安装神兵错误 "+e.toString());
        }
        // 安装神兵
    }//532
    
    private void quest532(){
        fight(5000);
    }//533
    private void quest533(){
    	WeaponMsg.upgradeArti(user, user.getItems().getSpecial().get(0).getId());
    }// 534
    


    private void quest521(){
        
    }

    private void quest612() {
        PetMsg.open(user);
        PetMsg.openFire(user);
        PetMsg.openTrain(user);
        PetMsg.train(user, 1);
    }//613
    private void quest613() {
        PetMsg.feed(user, user.getItems().getPet().get(0).getId());
    }// 614
    private void quest614() {
        PetMsg.addFire(user, user.getItems().getFire().get(0).getId());
    }// 起火  615
    private void quest615() {
        PetMsg.upSkill(user, 21);
    }//616
    private void quest616() {
        
    }//带宠物打擂台
    private void quest617() {
        
    }
    
    
    public boolean upLevel(){

    	int exp = user.getExp();
    	int next = user.getNextexp();
    	int map = EtcMsg.getLastMap(user);
    	EtcMsg.swipeMap(user, map, 1);
    	int now = user.getExp();
    	if(now==exp)
    		return false;
    	int need = ((int)((next-now)/(now-exp))+1);
    	int sta = user.getStamina();
    	user.log("进行升级 需要"+need+" 体力 有 " +sta);
    	EtcMsg.swipeMap(user, map, sta>=need?need:sta);
    	if(sta>need)
    		return true;
    	return false;
    }

    public void installWeapon() {
        List<List<Weapon>> tmp = user.getItems().getWeapons();
        one = tmp.get(0);
        two =  tmp.get(1);
        three =  tmp.get(2);
        four =  tmp.get(3);
        Collections.sort(one, new WeaponScore());
        Collections.sort(two, new WeaponScore());
        Collections.sort(three, new WeaponScore());
        Collections.sort(four, new WeaponScore());

        List<Warrior> fighter = user.getFighter();
        Collections.sort(fighter, new Comparator<Warrior>(){
            @Override
            public int compare(Warrior o1, Warrior o2) {
                if(o1.getLevel()>o2.getLevel())
                    return -1;
                if(o1.getLevel()<o2.getLevel())
                    return +1;
                if(o1.getWarriorcfgid()>o2.getWarriorcfgid())
                    return -1;
                if(o1.getWarriorcfgid()<o2.getWarriorcfgid())
                    return +1;
                return 0;
            }
        });
        for(Warrior wa: fighter){//unequip all;
            WeaponMsg.equip(user, intList,wa.getId());
        }
        for(Warrior wa: fighter){
            for(Weapon w: one)
                if(!w.isFit()){
                    weapon.set(0, w.getId());
                    break;
                }
            for(Weapon w: two)
                if(!w.isFit()){
                    weapon.set(1, w.getId());
                    break;
                }
            for(Weapon w: three)
                if(!w.isFit()){
                    weapon.set(2, w.getId());
                    break;
                }
            for(Weapon w: four)
                if(!w.isFit()){
                    weapon.set(3, w.getId());
                    break;
                }
            WeaponMsg.equip(user, weapon,wa.getId());

        }       
        sellWeapon(one,two,three,four); // sell redundent weapon to opimize.
        
        try{
            for(SpecialWeapon w : user.getItems().getSpecial()){
                if(!w.isFit()){
                   WeaponMsg.equipArti(user, user.getRwid(),w.getId());
                }
                while(MethodUtil.grc(WeaponMsg.upgradeArti(user, w.getId())).equals("成功"));
            }
        }catch(Exception e){
            user.log("安装神兵错误 "+e.toString());
        }
        
        gainMoney();
        upgradeWeapon(one,two,three,four);
        updateTech();
        updateArena();
        
    }
    public void gainMoney(){

    	if(user.getFunc().contains(",rob,")){
    		FarmMsg.collectTree(user);
    		int r = user.getRobnum();
    		for(int i = 0;i<r&&user.getRobcdtime()<user.getServerTime();i++){
    			user.log("before rob "+user.getRobnum()+"  "+user.getRobcdtime());
    			RobMsg.robRandom(user);
    			user.log("after rob "+user.getRobnum()+"  "+user.getRobcdtime());
    		}
    	}
//    	if(user.getFunc().contains(",trans,")){
//    		int r= user.getTransnum();
//    		user.log("transport : "+r);
//    		for(int i = 0;i<r&&user.getTranscdtime()<user.getServerTime();i++){
//    			user.log("before transport "+user.getTransnum()+"  "+user.getTranscdtime());
//    			user.log("Transport finish "+RobMsg.fight(user,0));
//    			user.log("after transport "+user.getTransnum()+"  "+user.getTranscdtime());
//    		}
//    	}
    	
    }
    
    public void sellWeapon(List<Weapon>... args){
        for(List<Weapon> list: args){
            for(int i=list.size()-1;i>=3;i--){
                Weapon f = list.get(i);
                if(!f.isFit()){
                    user.log("出售 "+f+" ");
                    ItemMsg.sellItem(user, f.getId(), 1);
                    list.remove(i);
                }
            }
        }
    }
    private void updateTech(){
    	if(hasTech)
    		return ;
    	hasTech = true;
        plantTech();
        boolean t = true;
        user.log("update tech");
        while(t){
            EtcMsg.upTech(user, 5);
            EtcMsg.upTech(user, 6);
            EtcMsg.upTech(user, 7);
            EtcMsg.upTech(user, 8);
            t = MethodUtil.grc(EtcMsg.upTech(user, 9)).equalsIgnoreCase("成功");
        }

    }
    
    private void plantTech(){
        user.log("种植阅历");
        if(user.getFarmnum()<6)
            while(MethodUtil.grc(FarmMsg.unlock(user)).equals("成功"))
                ;
        if(techSeedId ==0){
            techSeedId = user.getItems().getId(272);
        }
        int numSeed = user.getItems().getNumById(techSeedId);
        int farmNum = user.getFarmnum();
        user.log("num seed: "+numSeed+"  farmNum: "+farmNum +"   techid "+techSeedId);
        if(numSeed<=farmNum){
            ArenaMsg.change(user, 4, farmNum+1 -numSeed);
        }
        if(techSeedId ==0){//第一次换取
            techSeedId = user.getItems().getId(272);
        }
        if(techSeedId <=0){//没科技种植
        	user.log("种植普通种子");
        	try{
        		techSeedId = user.getItems().getSeed().get(0).getId();
        	}catch(Exception e){}
        }
        if(techSeedId!=0){
            FarmMsg.harvestAndPlant(user, techSeedId);
          //  MultiInfo.registerWater(user);
        }
    }
    
    private void updateArena(){
    	user.log("update arena ");
    	int num = user.getArenanum();

    	if(user.getLevel()>15&&num>0){
        	boolean suc= true;
	    	for(int i=0;i<num&&suc;i++)
	    		suc = ArenaMsg.fight(user);
	        for (int i = 0; i < 2; i++) {
	            WarriorMsg.openNext(user, user.getRwid());
	            WarriorMsg.openNext(user, linger);
	            WarriorMsg.openNext(user, mu);
	        }
    	}

    	int m = user.getMatchtimes();
    	user.log("before match : "+user.getMatchtimes()+"  "+user.getMatchcdtime()+"  "+user.getServerTime());
    	if(user.getLevel()>=25)
	        while(user.getMatchtimes()>0&&user.getMatchcdtime()<=user.getServerTime()&& m-->0)
	        	MatchMsg.fightRandom(user);
    }
    
    boolean hasWeapon = false;
    @SafeVarargs
	public final void upgradeWeapon(List<Weapon>... args){
    	if(hasWeapon)
    		return ;

        user.log("强化武器");
        int level = user.getLevel()-5;
        if(user.getMoney()<200000||level<10){
            user.log("铜币不足 不强化");
            return ;
        }
    	hasWeapon = true;
        if(level>40)
            level =  40;
        for(List<Weapon> list: args){
            for(Weapon w: list)
                if(w.isFit()){
                    boolean up = true;
                    while(w.getLevel()<level&&up){
                        if(!MethodUtil.grc(ItemMsg.upgradeWeaponOne(user, w.getId())).equals("成功"))
                            up = false;
                        else{
                         //   user.log("加强武器 ");
                        }
                    }
                }
        }
    }
   
    public void getAllGift(User user) {
        String data = "";
        Json giftInfo = null;
        try {
            data = MainMsg.getGiftMsg(user);
            giftInfo = new Json(data);
            //开始收获礼包
            for (Object item : giftInfo.getJson("data").getArray("giftlist").getItems()) {
                Json gift = (Json) item;
                int id = gift.getInt("giftcfgid");
                String val = MainMsg.getGiftStr(user, id);
                Json bag = new Json(val).getJson("rbagitem");
                if (bag != null) {
                    for (String key : bag.keyset()) {
                        Json weapon = bag.getJson(key);
                        if (weapon.get("_cls") != null && weapon.getString("_cls").equals("rbagitemVo1")) {
                        	installWeapon();
                        	break;
                        }
                    }
                }
            }
        } catch (Exception e) {
            StaticInfo.debug("get all gift fail: "+e.getMessage()+" " + data);

        }
    }
    
}

class QuestSort implements Comparator<Integer> {

    /**
     * if both int larger than 150, do smaller task first, else do larger task
     * first.
     */
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return -1;
        }
        if (o1 < o2) {
            return +1;
        }
        return 0;

    }

}

class WeaponScore implements Comparator<Weapon> {

    @Override
    public int compare(Weapon o1, Weapon o2) {
        int s1 = o1.getRawStat();
        int s2 = o2.getRawStat();
        if (s1 > s2) {
            return -1;
        }
        if (s1 < s2) {
            return +1;
        }
        // same?  compare level, largest in front;
        if(o1.getLevel()>o2.getLevel())
            return -1;
        if(o1.getLevel()<o2.getLevel())
            return +1;
        // compare score;
        if(o1.getScore()>o2.getScore())
            return -1;
        if(o1.getScore()<o2.getScore())
            return +1;
        return 0;
    }

}
