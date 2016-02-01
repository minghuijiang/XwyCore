package component.warrior;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiProp {

	Map<String,Prop[]> propMap = new HashMap<>();
	
	public MultiProp(){
	}
	public void add(List<Prop> prop){
		for(Prop p: prop)
			add(p);
	}
	public void add(Prop prop){
		Prop[] tmp = propMap.get(prop.getProperty());
		if(tmp==null){
			tmp = new Prop[2];
	//		StaticInfo.log("new property "+prop);
			propMap.put(prop.getProperty(), tmp);
		}
		if(tmp[prop.getType()]==null)
			tmp[prop.getType()]= new Prop(prop);
		else
			tmp[prop.getType()].add(prop);
	}
	
	public List<Prop> getProp(){
		List<Prop> tmp = new ArrayList<>();
		for(String key: propMap.keySet()){
			Prop[] p = propMap.get(key);
			if(p[0]!=null)
				tmp.add(p[0]);
			if(p[1]!=null)
				tmp.add(p[1]);
		}
		return tmp;
	}
	

	public Map<String,Prop[]> getMap(){
		return propMap;
	}
}
