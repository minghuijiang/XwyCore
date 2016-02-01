package component.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.mingJiang.util.json.Json;
import com.mingJiang.util.json.JsonArray;

public class MapArea {

	private static Comparator<MapNode> comp = new MapSort();
	private String areaName;
	private int id, type, max, min, minMap, maxMap;
	List<MapNode> maps = new ArrayList<>(10);
	
	public MapArea(Json data) {
		areaName = data.getString("areaname");
		id = data.getInt("id");
		type = data.getInt("type");
		parseMap(data.getArray("zones"));
	}

	
	private void parseMap(JsonArray data){
		for(Object o: data.getItems()){
			maps.add(new MapNode((Json)o));
		}
		Collections.sort(maps, comp);
		min = maps.get(0).getReqLv();
		minMap = maps.get(0).getMapId();
		max = maps.get(maps.size()-1).getReqLv();
		maxMap = maps.get(maps.size()-1).getMapId();
	}
	
	public boolean inBetween(int level){
		return level>=min&&level<=max;
	}
	
	public boolean inMap(int mapId){
		return mapId>=minMap&&mapId<=maxMap;
	}

	/**
	 * @return the areaName
	 */
	public String getAreaName() {
		return areaName;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}


	/**
	 * @return the max
	 */
	public int getMax() {
		return max;
	}


	/**
	 * @return the min
	 */
	public int getMin() {
		return min;
	}


	/**
	 * @return the maps
	 */
	public List<MapNode> getMaps() {
		return maps;
	}



	/**
	 * @param areaName the areaName to set
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}


	/**
	 * @param max the max to set
	 */
	public void setMax(int max) {
		this.max = max;
	}


	/**
	 * @param min the min to set
	 */
	public void setMin(int min) {
		this.min = min;
	}


	/**
	 * @param maps the maps to set
	 */
	public void setMaps(List<MapNode> maps) {
		this.maps = maps;
	}


	/**
	 * @return the minMap
	 */
	public int getMinMap() {
		return minMap;
	}


	/**
	 * @return the maxMap
	 */
	public int getMaxMap() {
		return maxMap;
	}


	/**
	 * @param minMap the minMap to set
	 */
	public void setMinMap(int minMap) {
		this.minMap = minMap;
	}


	/**
	 * @param maxMap the maxMap to set
	 */
	public void setMaxMap(int maxMap) {
		this.maxMap = maxMap;
	}
	
	
}

class MapSort implements Comparator<MapNode> {

	@Override
	public int compare(MapNode o1, MapNode o2) {
		int m1 = o1.getOrder();
		int m2 = o2.getOrder();
		if(m1<m2)
			return -1;
		if(m2<m1)
			return +1;
		return 0;
	}
}
