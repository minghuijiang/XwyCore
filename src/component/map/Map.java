package component.map;

import java.util.HashMap;

import message.EtcMsg;

import com.mingJiang.util.json.Json;
import com.mingJiang.util.json.JsonArray;

import component.User;

public class Map {

	private User user;
	private HashMap<Integer,MapObject> maps;
	private int lastMap=0, nextMap=0;
	public boolean isInit  = false;
	public Map(User user) {
		this.user = user;

	}
	
	public void init(Json map){
		isInit = true;
		maps = new HashMap<>();
		//System.out.println(map.toFormatString());
		JsonArray array = map.getJson("data").getArray("rmapList");
		for(int i=0; i<array.size();i++){
			MapObject obj = new MapObject(array.getJson(i));
			int mapid = obj.getMapId();
			if(!maps.containsKey(mapid)){
			//	user.log("map put "+mapid);
				maps.put(mapid, obj);
				if(!obj.isClear()&&obj.isOpen()&&(mapid<50||(mapid>=1000&&mapid<2000))){
					nextMap = obj.getMapId();
				}
					
			}else{
				user.error("重复地图ID "+mapid+"  "+map);
			}
		}

	//	user.setMsg("nextMap "+nextMap);
		if(nextMap==0){//等级不够
			//nextMap = MapInfo.getNextMap(user.getLevel());
			nextMap = EtcMsg.forceGetLastMap(map);
			lastMap = nextMap;
		}else
			lastMap = MapInfo.getSwipeMap(nextMap);
		
	//	user.setMsg("最后扫荡地图 "+lastMap+"  挑战中地图 "+nextMap);
	}

	
	public void parseChange(Json change){
		/*
		 * {
				1018={
					isopen=1,
					_cls=rmapVo,
					iscleared=0,
					cleartimes=0,
					mapcfgid=1018
				},
				1017={
					iscleared=1,
					cleartimes=1
				}
			}
		 */
//		user.log("map change "+change);
		 for (String key : change.keyset()) {
	            try {
	                Json json = change.getJson(key);
	                int id = Integer.parseInt(key);
	                if(!validRange(id))
	                	return ;
	                if(json.contains("isopen")){
	                	user.log("set nextMap "+id);
	                	lastMap=nextMap;
	                	nextMap= id;
	                }
	      //          user.log("get id "+id);
	                if(maps.containsKey(id))
	                	maps.get(id).change(json);
	                else
	                	maps.put(id, new MapObject(json));
	            } catch (Exception e) {
	                user.log("update map fail; "+e.getMessage()+" key= "+ key+" json:"+ change);
	                e.printStackTrace();
	            }
	        }
		}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @return the maps
	 */
	public HashMap<Integer, MapObject> getMaps() {
		return maps;
	}

	/**
	 * @return the lastMap
	 */
	public int getLastMap() {
		return lastMap;
	}

	/**
	 * @return the nextMap
	 */
	public int getNextMap() {
		return nextMap;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @param maps the maps to set
	 */
	public void setMaps(HashMap<Integer, MapObject> maps) {
		this.maps = maps;
	}

	/**
	 * @param lastMap the lastMap to set
	 */
	public void setLastMap(int lastMap) {
		this.lastMap = lastMap;
	}

	/**
	 * @param nextMap the nextMap to set
	 */
	public void setNextMap(int nextMap) {
		this.nextMap = nextMap;
	}
	
	public static boolean validRange(int map){
		return map<50||(map>=1000&&map<2000);
	}
}
