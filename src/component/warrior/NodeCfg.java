package component.warrior;

import java.util.ArrayList;
import java.util.List;

import com.mingJiang.util.json.Json;

public class NodeCfg {

	private int nodelangid;
	private int node;
	private String nodename;
	private List<Prop> arrPropertycfg;
	//valuetype,propertyvalue,interproperty
	
	private int arrReqcfg;// need vigour

	
	public NodeCfg(Json data){
		nodelangid = data.getInt("nodelangid");
		node = data.getInt("node");
		nodename= data.getString("nodename");
		arrPropertycfg = new ArrayList<>();
		for(Object o: data.getArray("arrPropertycfg").getItems()){
			Json prop = (Json)o;
			arrPropertycfg.add(
					new Prop(	prop.getInt("valuetype"),
								prop.getInt("propertyvalue"),
								prop.getString("interproperty")));
		}
		arrReqcfg= data.getArray("arrReqcfg").getJson(0).getInt("num");
	}
	public int getNodelangid() {
		return nodelangid;
	}
	public int getNode() {
		return node;
	}
	public String getNodename() {
		return nodename;
	}
	public List<Prop> getArrPropertycfg() {
		return arrPropertycfg;
	}
	public int getArrReqcfg() {
		return arrReqcfg;
	}
	
	
}
