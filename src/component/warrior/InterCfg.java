package component.warrior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.mingJiang.util.json.Json;

public class InterCfg {

	private int intercfgid;
	private int quality;
	private List<NodeCfg> nodes;
	
	
	public InterCfg(Json data){
		intercfgid= data.getInt("intercfgid");
		quality= data.getInt("quality");
		nodes = new ArrayList<>();
		for(Object o: data.getArray("arrNodecfg").getItems()){
			Json node = (Json)o;
			nodes.add(new NodeCfg(node));
		}
		Collections.sort(nodes,new Comparator<NodeCfg>(){

			@Override
			public int compare(NodeCfg o1, NodeCfg o2) {
				if(o1.getNode()<o2.getNode())
					return -1;
				else if(o1.getNode()>o2.getNode())
					return 1;
				return 0;
			}
			
		});
	}


	public int getIntercfgid() {
		return intercfgid;
	}


	public int getQuality() {
		return quality;
	}


	public List<NodeCfg> getNodes() {
		return nodes;
	}
	
	
}
