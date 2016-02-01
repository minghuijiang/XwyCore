package data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.ParagraphView;

import com.mingJiang.data.Pair;
import com.mingJiang.util.FileUtil;
import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;
import com.mingJiang.util.json.JsonArray;

import component.item.FateItem;
import component.item.Item;
import component.item.ItemInfo;
import component.item.ItemVo;

public class FateAnalyzer {

	public static void main(String[] args) throws JSONException, IOException{
		Json init1  = new Json(FileUtil.readToLine("init1.json"));
		Json fate = init1.getJson("fatecfgList");
		for(String key: fate.keyset())
			parseByPosition(fate.getJson(key));
	}
	
	public static void parseByPosition(Json pos){
		int posId = pos.getInt("fatecfgid");
		int priceInT = pos.getArray("reqcfgList").getJson(0).getInt("num")/1000;
		List<Pair<ItemVo, Integer>> possible = new ArrayList<Pair<ItemVo,Integer>>();
		
		JsonArray rate = pos.getArray("awardrateList");
		JsonArray item = pos.getArray("awardcfgList");
		int totalRate = 0;
		for(int i=0;i<item.size();i++){
			int tmpRate = rate.getInt(i);
			totalRate+=tmpRate;
			possible.add(new Pair<ItemVo, Integer>(ItemInfo.getItem(item.getJson(i).getInt("cfgid")), tmpRate));
			
		}
		
		
		System.out.println(posId+"  "+totalRate);
		long totalExpect = 0;
		for(Pair<ItemVo, Integer> p: possible){
			ItemVo i = p.getKey();
			int poss = p.getObj();
			totalExpect+=poss*i.getChangeSoul();
			System.out.println(i.getItemName()+  "  "+i.getChangeSoul()+"  "+poss+"/"+totalRate);
		}
	//	System.out.println(posId+":("+priceInT+")  Expect: "+((double)totalExpect/(double)totalRate ) + "魂值/千万铜币");
		System.out.println();
			//System.out.println("\t"+p.getKey().getItemName()+" "+p.getObj() +"Expect: "+((double)p.getObj()/totalRate*((p.getKey()).getChangeSoul())/priceInT));
	}

}
