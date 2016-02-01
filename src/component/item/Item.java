package component.item;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.mingJiang.util.json.Json;

public abstract class Item {

    protected int type;
    protected int id;
    protected int itemId;
    protected int num;
    protected double offset;
    protected int sellPrice;
    protected ItemVo info;

    public Item(Json json) {
        String tmp = json.getString("_cls");
        type = Integer.parseInt(tmp.substring(tmp.length() - 1));
        id = json.getInt("id");
        itemId = json.getInt("itemcfgid");
        try{
        	num = json.getInt("num");
            String numStr = json.getString("num");
            if(numStr.contains(".")){
            	BigDecimal bi = new BigDecimal(numStr);
            	bi =bi.subtract(new BigDecimal(num));
            	offset = Double.parseDouble(bi.toPlainString());
            }
        	
        }catch(Exception e){
            
        }
        info = ItemInfo.getItem(itemId);
        try {
            sellPrice = json.getArray("arrSellaward").getJson(0).getInt("num");
        } catch (Exception e) {//不可出售
            sellPrice = -1;
        }
        parseItem(json);//parse subclass;
    }

    public ItemVo getInfo() {
        return info;
    }

    public void setInfo(ItemVo info) {
        this.info = info;
    }

    public abstract void parseItem(Json json);

    public int getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public int getItemId() {
        return itemId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getOffset() {
		return offset;
	}

	public int getSellPrice() {
        return sellPrice;
    }

    @Override
    public abstract String toString();
    
    public void change(Json json){
        if(json!=null){
            try{
            	this.setNum(json.getInt("num",this.getNum()));
                String numStr = json.getString("num");
                if(numStr.contains(".")){
                	BigDecimal bi = new BigDecimal(numStr);
                	bi =bi.subtract(new BigDecimal(num));
                	offset = Double.parseDouble(bi.toPlainString());
                	//System.out.println("parse: "+num+" off: "+offset);
                }
            	
            }catch(Exception e){
                
            }
        }
    }
}
