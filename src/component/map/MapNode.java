package component.map;

import com.mingJiang.util.json.Json;

public class MapNode {

	private String name;
	private int mapId,exp, money,floor, order,reqLv;
	/**
	 * {
					name=集市2,
					mapId=2,
					arrAwardcfg=[
						{sub=0,_cls=showItem,num=30,type=exp,cfgid=0},
						{sub=0,_cls=showItem,num=150,type=money,cfgid=0}
						],
					mapfloor=0,
					maporder=2,
					arrUnlockreqcfg=[
						{sub=0,_cls=showItem,num=1,type=rlevel,cfgid=0}
						]
				}
	 */
	public MapNode(Json data) {
		try{
			name = data.getString("name");
			mapId = data.getInt("mapId");
			floor = data.getInt("mapfloor");
			order = data.getInt("maporder");
			for(Object j: data.getArray("arrAwardcfg").getItems()){
				Json jj = (Json)j;
				if(jj.getString("type").equals("exp"))
					exp = jj.getInt("num");
				else if(jj.getString("type").equals("money"))
					money = jj.getInt("num");
			}
					
			reqLv = data.getArray("arrUnlockreqcfg").getJson(0).getInt("num");
		}catch(Exception e){
			System.out.println(data);
			e.printStackTrace();
		}
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the mapId
	 */
	public int getMapId() {
		return mapId;
	}
	/**
	 * @return the exp
	 */
	public int getExp() {
		return exp;
	}
	/**
	 * @return the money
	 */
	public int getMoney() {
		return money;
	}
	/**
	 * @return the floor
	 */
	public int getFloor() {
		return floor;
	}
	/**
	 * @return the order
	 */
	public int getOrder() {
		return order;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param mapId the mapId to set
	 */
	public void setMapId(int mapId) {
		this.mapId = mapId;
	}
	/**
	 * @return the reqLv
	 */
	public int getReqLv() {
		return reqLv;
	}
	/**
	 * @param reqLv the reqLv to set
	 */
	public void setReqLv(int reqLv) {
		this.reqLv = reqLv;
	}
	/**
	 * @param exp the exp to set
	 */
	public void setExp(int exp) {
		this.exp = exp;
	}
	/**
	 * @param money the money to set
	 */
	public void setMoney(int money) {
		this.money = money;
	}
	/**
	 * @param floor the floor to set
	 */
	public void setFloor(int floor) {
		this.floor = floor;
	}
	/**
	 * @param order the order to set
	 */
	public void setOrder(int order) {
		this.order = order;
	}

	
}
