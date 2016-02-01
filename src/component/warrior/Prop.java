package component.warrior;

import component.info.TransInfo;

public class Prop {
	public static final int PERCENT=1;
	public static final int VALUE = 0;
	
	
	
	private int type,value;
	private String property;
	
	public Prop(int type, int value, String target){
		this.type = type;
		this.value = value;
		this.property= target;
	}
	public Prop(Prop copy){
		this.type= copy.type;
		this.value= copy.value;
		this.property= copy.property;
	}

	public int getType() {
		return type;
	}

	public int getValue() {
		return value;
	}

	public String getProperty() {
		return property;
	}
	
	public void add(Prop other){
		if(this.type == other.type && this.property.equalsIgnoreCase(other.property))
			value+=other.value;
	}
	
	public String toString(){
		if(type==PERCENT)
			return TransInfo.get(property)+" +"+(value/10.0)+"%";
		return  TransInfo.get(property)+" +"+value; 
	}
	
}
