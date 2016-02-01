package message;

import com.mingJiang.data.Pair;

import static com.mingJiang.util.Util.debug;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;

import component.User;
import data.StaticInfo;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArenaMsg {

	public static double threadhold = 1.10;

	/**
	 * 
	 * @param user
	 * @param item
	 *            3- 5级铜币 4- 3级阅历 5- 生命 6- 力量 7- 防御 8- 内力
	 * @param num
	 *            数量
	 * @return
	 */
	public static String change(User user, int item, int num) {
		return user.send("act=exchange&ctl=challengepoint",
				"{\"num\":%d,\"type\":3,\"changeid\":%d}", num, item
				);
	}

	public static String getGroup(User user, int id) {
		return user.send("act=viewgroup&ctl=plusrank", "{\"rid\":%d}", id);
	}

	/**
	 * 擂台每日奖励
	 * 
	 * @param user
	 * @return
	 */
	public static String getDaily(User user) {
		return user.send("act=getaward&ctl=rarenanew", null);
	}

	/**
	 * 膜拜
	 * 
	 * @param user
	 * @param type
	 *            1 = 铜币 2 = 20令牌 3 = 100令牌
	 * @param rank
	 * @return
	 */
	public static String worship(User user, int type, int rank) {
		return user.send("ctl=rarenanew&act=arenaworship",
				"{\"type\":%d,\"rank\":%d}", type, rank);
	}

	/**
	 * 获取前十名单
	 * 
	 * @param user
	 * @return
	 */
	public static String getTop10(User user) {
		return user.send("act=gettop10&ctl=rarenanew", null);
	}

	/**
	 * 获取前3名字
	 * 
	 * @param user
	 * @return
	 */
	public static String[] getTop3(User user) {
		String data = getTop10(user);
		String[] d = new String[3];
		try {
			Json j = new Json(data);
			for (Object o : j.getJson("data").getArray("list").getItems()) {
				Json jj = (Json) o;
				int rank = jj.getInt("rank");
				if (rank <= 3) {
					String name = jj.getString("uname");
					d[rank - 1] = rank + " :"
							+ (name.length() > 3 ? name.substring(0, 3) : name);
				}

			}
		} catch (JSONException e) {
			debug(data);
		}
		return d;
	}

	/**
	 * Triple<rank, id, score>;
	 * 
	 * @param user
	 * @param dat
	 */
	public static int fight(User user, Triple<Integer, Integer, Integer> dat) {
		// System.out.println(dat);
		String re;
		int fail = 0;
		while (!(re = startArena(user, dat.getKey()))
				.contains("gam_suc_startarenaok")) {
			if (re.contains("gam_err_selffighting")) {
				user.log("被挑战中 ");
				// FightMsg.fight(user, dat.getSubKey(), 10000, 10);
				// if(fail++>5)
				return -2;
				// try {
				// Thread.sleep(10000);
				// } catch (InterruptedException ex) {
				// Logger.getLogger(ArenaMsg.class.getName()).log(Level.SEVERE,
				// null, ex);
				// }
			} else if (re.contains("gam_err_targetfighting")) {
				user.log("对象被挑战中");
				return -1;
			}

			else {
				user.log(re);
				return -1;
			}
		}
	//	System.out.println(re);
		return FightMsg.fight(user, dat.getSubKey(), 10000, 10) ? 1 : 0;
	}

	public static boolean fight(User user) {
		List<Triple<Integer, Integer, Integer>> fightList = getFight(user);
		for (Triple<Integer, Integer, Integer> tmp : fightList) {
			int result = fight(user,tmp);
			user.log("arena result : "+result);
			if (result == -2)
				return false ;
			if(result == 0|| result==1)
				return true;
		}
		user.log("全部对手都在挑战中");
		return false;
	}


	/**
	 * 可对战列表
	 * 
	 * @param user
	 * @return
	 */
	public static String getList(User user) {
		return user.send("act=getarena&ctl=rarenanew", null);
	}

	/**
	 * 获取当前可战斗对象. Triple<rank, id, score>;
	 * 
	 * @param user
	 * @return
	 */
	public static List<Triple<Integer, Integer, Integer>> getFight(User user) {
		List<Triple<Integer, Integer, Integer>> tmp = new ArrayList<>();
		String list = getList(user);
		boolean fail = true;
		while(fail)
		try {
			for (Object o : new Json(list).getJson("data")
					.getArray("arenausers").getItems()) {
				Json group = (Json) o;
				tmp.add(new Triple<>(group.getInt("rank"), group.getInt("id"),
						group.getInt("power")));
			}
			fail = false;
		} catch (Exception e) {
			fail = true;
		}
		Collections.sort(tmp, new Comparator<Triple<Integer, Integer, Integer>>() {

			@Override
			public int compare(Triple<Integer, Integer, Integer> o1,
					Triple<Integer, Integer, Integer> o2) {
				if(o1.getObj()<o2.getObj())
					return -1;
				if(o2.getObj()<o1.getObj())
					return +1;
				if(o1.getKey()>o2.getKey())
					return -1;
				if(o2.getKey()>o1.getKey())
					return +1;
				return 0;
			}
		});
		return tmp;
	}

	/**
	 * 开始战斗
	 * 
	 * @param user
	 * @param rank
	 * @return
	 */
	public static String startArena(User user, int rank) {
		return user.send("act=startarena&ctl=rarenanew", "{\"rank\":%d}", rank);
	}
}
