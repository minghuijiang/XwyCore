package data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import message.RobMsg;

import com.mingJiang.data.Pair;
import com.mingJiang.util.FileUtil;
import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;

import component.User;
import component.item.ItemInfo;

public class Configure {

	public static void main(String[] args) throws JSONException, IOException{
//		StaticInfo.registerPlatform(Constant.TENCENT, 44);
//		User user = new User("9sbn2bafrj8bsl5dudp716r9r2");
//		
//		user.setNeedSocket(true);
//		user.setNeedData(true);
//		user.login();
//		while(true){
//			user.log(user.getRobcdtime()+" "+user.getServerTime());
//			if(user.getRobcdtime()<user.getServerTime())
//				RobMsg.robRandom(user);
//	
//			if(false)
//				break;
//		}
		Json tmJson = new Json(FileUtil.readToLine("test.txt"));
		System.out.println(tmJson.toFormatString());
//		Json j = tmJson.getJson("itemlevelcfgList");
//		int total = 0;
//		for(int i=71;i<=80;i++){
//			total+=j.getJson(""+i).getArray("arrReqcfg").getJson(0).getInt("num")*4;
//		}
//		System.out.println("71-80 : "+total);
//		total = 0;
//		for(int i=81;i<=90;i++){
//			total+=j.getJson(""+i).getArray("arrReqcfg").getJson(0).getInt("num")*4;
//		}
//		System.out.println("81-90 : "+total);
		System.exit(0);
		String f = ("C:/Users/Ming/Desktop/init1e4cb1c7144.json");
		Json json = new Json(FileUtil.readToLine(f));
	//	FileUtil.writeTo(f+".bak",json.toFormatString());
		parse(json.getJson("changechallengepointcfg"),"changechallengepointcfg");
		parse(json.getJson("changecharactercfg"),"changecharactercfg");
		parse(json.getJson("changekingchipcfg"),"changekingchipcfg");
		parse(json.getJson("fascinationcfg"),"fascinationcfg");
		parse(json.getJson("honourshopcfgInfo"),"honourshopcfgInfo");
		parseShop(json.getJson("goodscfgList"));
	}

	public static void parseShop(Json json){
		System.out.println("goodscfgList");
		List<Pair<Integer, String>> msg = new ArrayList<>(json.getMap().size());
		for(String key: json.getMap().keySet()){
			Json sub = json.getJson(key);
			msg.add(new Pair<Integer, String>(Integer.parseInt(key),
					"\t"+key+"\tgoodsid: "+sub.getInt("goodsid")+
					"\tgoodstype : "+sub.getInt("goodstag")+
					"\tbuytype: "+sub.getInt("buytype")+
					"\taward: "+ItemInfo.getName(sub.getInt("itemid"))));
		}
		
		Collections.sort(msg, new Comparator<Pair<Integer, String>>() {

			@Override
			public int compare(Pair<Integer, String> o1,
					Pair<Integer, String> o2) {
				if(o1.getKey()<o2.getKey())
					return -1;
				if(o1.getKey()>o2.getKey())
					return +1;
				return 0;
			}
		});
		for(Pair<Integer, String> tmp: msg)
			System.out.println(tmp.getObj());
		
		System.out.println("\n");
	}
	
	public static void parse(Json json,String header){
		System.out.println(header);
		List<Pair<Integer, String>> msg = new ArrayList<>(json.getMap().size());
		for(String key: json.getMap().keySet()){
			Json sub = json.getJson(key);
			Json need = sub.getJson("arrReqcfg");
			Json award = sub.getJson("arrAwardcfg");
			msg.add(new Pair<Integer, String>(Integer.parseInt(key),
					"\t"+key+"\treq: "+need.getInt("num")+
					"\taward: "+ItemInfo.getName(award.getInt("cfgid"))+" "+award.getInt("num")));
		}
		
		Collections.sort(msg, new Comparator<Pair<Integer, String>>() {

			@Override
			public int compare(Pair<Integer, String> o1,
					Pair<Integer, String> o2) {
				if(o1.getKey()<o2.getKey())
					return -1;
				if(o1.getKey()>o2.getKey())
					return +1;
				return 0;
			}
		});
		for(Pair<Integer, String> tmp: msg)
			System.out.println(tmp.getObj());
		
		System.out.println("\n");
	}
}
