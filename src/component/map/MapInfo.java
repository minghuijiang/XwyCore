package component.map;

import static data.StaticInfo.debug;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.mingJiang.data.Hide;
import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;
import com.mingJiang.util.json.JsonArray;

import data.Util;

public class MapInfo {
	
	public static List<MapArea> areas = new ArrayList<>();
	public static HashMap<Integer, MapNode> maps = new HashMap<>();
	static {
        try {
            initMap();
        } catch (JSONException e) {
            debug("f.bin 格式错误");
        } catch (IOException e) {
            debug("f.bin 文件读取错误 " + e.getMessage());
        } catch (RuntimeException e) {
            debug("fatal error: " + e.getMessage());
            e.printStackTrace();
        }
    }

	
	public static void initMap() throws JSONException, IOException{
		  Json json = new Json(Hide.get(Util.map));
	      JsonArray areaList = json.getArray("areacfgList");
	      for(Object o: areaList.getItems()){
	    	  Json map = (Json)o;
	    	  areas.add(new MapArea(map));
	    //	  System.out.println(map.getInt("id"));
	      }
	      for(MapArea area: areas){
	    	  for(MapNode node: area.getMaps())
	    		  maps.put(node.getMapId(), node);
	      }
	    
	}
	
	public static int getNextMap(int level){
		for(MapArea area: areas){
			if(area.getType()>20)
				break;
			if(area.inBetween(level)){
				List<MapNode> nodes = area.getMaps();
				for(int i= 0;i<nodes.size();i++)
					if(nodes.get(i).getReqLv()>level)
						return nodes.get(i-1).getMapId();
				return nodes.get(nodes.size()-1).getMapId();
			}
		}
		System.out.println("error: req level "+level);
		return 1139;// return last map;
	}
	
	public static int getSwipeMap(int nextMap){
		try{
	
		if(nextMap==1139)
			return 1139;
		for(int j = 0; j<areas.size();j++){
			MapArea area= areas.get(j);
			if(area.getType()>20)
				break;
			if(area.inMap(nextMap)){
				if(area.getMinMap()==nextMap){
					return areas.get(j-1).getMaxMap();
				}
				return nextMap -1;
			}
		}
		}catch (Exception e){
			
		}
		System.out.println("error: swipe map "+nextMap);
		return 0;
	}
	
	public static int getMap(String format){
		try{
			String[] sp = format.split("-");
			int area=0; int index = 0;
			for(int i=0;i<sp.length;i++){
				// raid:page-16-index-8-quest-443
				if(sp[i].equals("page")){
					area = Integer.parseInt(sp[i+1]);
					index = Integer.parseInt(sp[i+3]);
					return areas.get(area-1).getMinMap()+index;
				}
			}
		}catch(Exception e){
			System.out.println(format);
			e.printStackTrace();
		}
		return 0;
	}
	
	public static MapNode getMap(int mapId){
		if(maps.containsKey(mapId))
			return maps.get(mapId);
		System.out.println("地图配置错误 请更新- mapid "+mapId);
		return null;
	}
	
	public static void main(String[] args){
		for(int i=1;i<=80;i++)
			System.out.println(i+" "+getNextMap(i)+" "+getSwipeMap(getNextMap(i)));
	}

}
