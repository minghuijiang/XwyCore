package component.handler;

import message.ArenaMsg;
import message.FightMsg;
import socket.msg.combat.req.AIReq;
import socket.msg.combat.req.EnterDungeonReq;
import socket.msg.combat.req.StartCombatReq;

import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;
import component.User;

public class CombatHandler extends Handler{
	/**
	 * type constant
	 */
	public static final int COMMON_BATTLE = 0;
    public static final int CHALLENGE_BATTLE = 1;
    public static final int CHALLENGE_BATTLEV2 = 10;
    public static final int WORKER_BATTLE = 2;
    public static final int TRANSPORT_BATTLE = 3;
    public static final int RANK_BATTLE = 4;
    public static final int GROB_BATTLE = 5;
    public static final int EVENT_BATTLE = 6;
    public static final int EVENT_GIANT = 7;
    public static final int AV = 8;
    public static final int RUSH_BATTLE = 9;
    public static final int GUILD_WAR = 11;
    
    /**
     * map id constant
     * @param user
     */
    public static final int CHALLENGE_MAP_ID = 10000;
    
    
	public CombatHandler(User user) {
		super(user);
		// TODO Auto-generated final intructor stub
	}
	
	public void arena(String pkid){

	}
	
	public static void main(String[] args){
		User user = new User(
				//"http://app100645087.qzone.qzoneapp.com/?qz_height=1400&openid=6DB4115F712DB36C56BB1AF1CB031A41&openkey=7F6A3B7C1AC997FC4456AE91F93927AD&pf=qzone&pfkey=cb1ba4aea32dbe5a7f4458f3be068dba&qz_ver=6&appcanvas=1&params="
				//"http://app100645087.qzone.qzoneapp.com/?qz_height=1400&openid=6DB4115F712DB36C56BB1AF1CB031A41&openkey=EBB62A8C14B60A095ABFD7943140EB1C&pf=qzone&pfkey=b4558c87a512ad689bc409400518070f&qz_ver=6&appcanvas=1&params="
				"http://app100645087.qzone.qzoneapp.com/?qz_height=1400&openid=6DB4115F712DB36C56BB1AF1CB031A41&openkey=C42311F838130D292EB880AE8BDC8E73&pf=qzone&pfkey=475ea388101a7e409c8eeca7d1d0ce70&qz_ver=6&appcanvas=1&params="
				
			//	"http://app100645087.qzone.qzoneapp.com/?qz_height=1400&openid=FE4553372711F3CB89A318426249148A&openkey=F1275006685F375B09B6AE0B85921BD4&pf=qzone&pfkey=3088e1329014732f932bb19998687928&qz_ver=6&appcanvas=1&params="
				,true);
		user.login();
		//System.out.println("finish");
		int fightId =0;//ArenaMsg.getFightID(user);
		System.out.println("fightid= "+fightId);
	//	user.getCombat().startBattle(10000, CombatHandler.CHALLENGE_BATTLEV2, fightId);
	}
	
/*	static{
		 System.setProperty("http.proxyHost", "127.0.0.1");
		    System.setProperty("https.proxyHost", "127.0.0.1");
		    System.setProperty("http.proxyPort", "8888");
		    System.setProperty("https.proxyPort", "8888");
	}*/
	public static void mains(String[] args){
		User u = new User("1621066431","1972/*/silei");
		u.login();
	}
	

	public void startBattle(int map, int type, int pkid){
		/*try {
			String result = FightMsg.fight(user, pkid, map, type);
			System.out.println(result);
			Json json = new Json(result).getJson("data");
			System.out.println(json.toFormatString());
			String fightid = json.getString("fightid");
			for(String i: json.getJson("mapcfgInfo").getJson("arrGroups").map.keySet()){
				startFight(fightid, map, type, pkid, Integer.parseInt(i));
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
	public void startFight(String fightId, int map, int type, int pkid, int groupId){
		user.sendMessage(new EnterDungeonReq(fightId, map, type));
		user.sendMessage(new AIReq(true));
		user.sendMessage(new AIReq(true));
//		user.sendMessage(new StartCombatReq(fightId, map, groupId, type, pkid));
	}
	
}
