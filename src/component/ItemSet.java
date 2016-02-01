package component;

import com.mingJiang.util.json.JSONException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.mingJiang.util.json.Json;
import com.mingJiang.util.json.JsonArray;

import component.item.FateItem;
import component.item.GeneralItem;
import component.item.Item;
import component.item.ItemInfo;
import component.item.Seed;
import component.item.SeedSorter;
import component.item.SpecialWeapon;
import component.item.Weapon;
import data.StaticInfo;

import java.util.HashMap;
import java.util.List;

public class ItemSet {

    public static void sort(List<Item> is) {
        Collections.sort(is, new ItemIdComparator());
    }

    public static void sortSeedByTime(List<Seed> seeds) {
        Collections.sort(seeds, new SeedTimeComparator());
    }

    /*
     * rbagitemVo1:	武器
     * rbagitemVo2:	礼包?
     * rbagitemVo3:	宝石
     * rbagitemVo4:	种子
     * rbagitemVo5:	神兵
     * rbagitemVo6:	卦
     */
    private HashMap<Integer, Item> items;
    private List<Item> two, three, seven;
    private List<Weapon> one;
    private List<Seed> four;
    private List<SpecialWeapon> five;
    private List<FateItem> six;

    private User user;
    public ItemSet(User user){
        this.user = user;
    }
    
    public ItemSet(User user,JsonArray array) throws JSONException {
        this(user);
        parseArray(array);
    }

    public void parseArray(JsonArray array) {
        items = new HashMap<>(100);
        two = new ArrayList<>();
        three = new ArrayList<>();
        seven = new ArrayList<>();
        one = new ArrayList<>();
        four = new ArrayList<>();
        five = new ArrayList<>();
        six = new ArrayList<>();
        for (int i = 0; i < array.getItems().size(); i++) {
            add(array.getJson(i));
        }

    }

    /*
     sub function remove specified item from list;  call from remove(Item)
     */
    private boolean remove(int id, List<? extends Item> itemSet) {
        for (Item i : itemSet) {
            if (i.getId() == id) {
                return itemSet.remove(i);
            }
        }
        return false;
    }

    /**
     * general mechanic for adding new item into list and map;
     *
     * @param json
     */
    private void add(Json json) {
        try {
      //      System.out.println(json);
            String cls = json.getString("_cls");
            int index = Integer.parseInt(cls.substring(cls.length() - 1));
            int id = json.getInt("id");
            Item tmp = null;
            switch (index) {
                case 1:
                    tmp = new Weapon(json);
                    one.add((Weapon) tmp);
                    break;
                case 2:
                    tmp = (new GeneralItem(json));
                    two.add(tmp);
                    break;
                case 3:
                    tmp = (new GeneralItem(json));
                    three.add(tmp);
                    break;
                case 4:
                    tmp = (new Seed(json));
                    four.add((Seed) tmp);
                    break;
                case 5:
                    tmp = (new SpecialWeapon(json));
                    five.add((SpecialWeapon) tmp);
                    break;
                case 6:
                    tmp = (new FateItem(json));
                    six.add((FateItem) tmp);
                    break;
                case 7:
                    tmp = (new GeneralItem(json));
                    seven.add(tmp);
                    break;
                default:
                    data.StaticInfo.info("add item error: \n" + json.toFormatString());
                    break;
            }
          //  System.out.println("tmp item: "+tmp);
            if (tmp != null) {
                items.put(id, tmp);

            }
        } catch (Exception e) {
            user.log("update item fail  "+e.getMessage()+" " + json);

        }
    }

    /**
     * remove the specified item from map and list;
     *
     * @param item
     */
    private void remove(Item item) {
        if (item == null) {
            return;
        }
        int type = item.getType();
        switch (item.getType()) {
            case 1:
                remove(item.getId(), one);
                break;
            case 2:
                remove(item.getId(), two);
                break;
            case 3:
                remove(item.getId(), three);
                break;
            case 4:
                remove(item.getId(), four);
                break;
            case 5:
                remove(item.getId(), five);
                break;
            case 6:
                remove(item.getId(), six);
                break;
            case 7:
                remove(item.getId(), seven);
                break;
            default:
                StaticInfo.info("unknown type " + type + "  " + item.toString());
                break;

        }
    }

    public void parseChange(Json change) {
        //"3043462":{"_cls":"rbagitemVo4","id":3043462,"itemcfgid":261,"num":1,"arrSellaward":[]},
        //"3032872":{"num":60}
        for (String key : change.keyset()) {
            try {
                Json json = change.getJson(key);
                int id = Integer.parseInt(key);
                if (json == null) {// item removed
                    remove(items.remove(id));
                } else {
                    String cls = json.getString("_cls");
                    if (cls == null) {//update number
                        Item re = items.get(id);
                        re.change(json);
                    } else {// new item
                        add(json);
                    }
                }
            } catch (Exception e) {
                user.log("update item fail; "+e.getMessage()+" key= "+ key+" json:"+ change);
            }
        }
    }

    public List<Weapon> getWeapon() {
        return one;
    }

    public List<List<Weapon>> getWeapons() {
        List<List<Weapon>> ret = new ArrayList<>();
        ret.add(new ArrayList<Weapon>());ret.add(new ArrayList<Weapon>());
        ret.add(new ArrayList<Weapon>());ret.add(new ArrayList<Weapon>());
        for (Weapon w : getWeapon()) {
            ret.get(w.getInfo().getKind()-1).add(w);
        }

        return ret;
    }

    public List<Seed> getSeed() {
        sortSeedByTime(four);
        return four;
    }
    
    public Seed getSeed(int prio, boolean sk5){
        Collections.sort(four, new SeedSorter(prio,sk5));
        return four.get(0);
    }

    public List<SpecialWeapon> getSpecial() {
        return five;
    }

    public List<FateItem> getFate() {
        return six;
    }

    public List<Item> getOpen() {
        List<Item> tmp = new ArrayList<>();
        for (Item item : two) {
            if (item.getInfo().openable()) {
                tmp.add(item);
            }
        }
        sort(tmp);
        return tmp;
    }

    public List<Item> getFire(){
        List<Item> tmp = new ArrayList<>();
        for (Item item : two) {
            if (item.getInfo().mergable()) {
                tmp.add(item);
            }
        }
        return tmp;
    }
    
    
    public List<Item> getMerge() {
        List<Item> tmp = new ArrayList<>();
        for (Item item : two) {
            if (item.getInfo().mergable()) {
                tmp.add(item);
            }
        }
        for (Item item : three) {
            if (item.getInfo().mergable()) {
                tmp.add(item);
            }
        }
        sort(tmp);
        return tmp;
    }

    public int getId(int itemcfg){
        int itemId = 0;
        switch(ItemInfo.getItem(itemcfg).getCategory()){
            case 1: itemId = getIdByCfg(itemcfg,one);break;
            case 2: itemId = getIdByCfg(itemcfg,two);break;    
            case 3: itemId = getIdByCfg(itemcfg,three);break;    
            case 4: itemId = getIdByCfg(itemcfg,four);break;
            case 5: itemId = getIdByCfg(itemcfg,five);    break;
            case 6: itemId = getIdByCfg(itemcfg,six);    break;
            case 7: itemId = getIdByCfg(itemcfg,seven);break;
            default: itemId = -1;break;
                
        }
        return itemId;
    }
    
    public int getNum(int itemcfg){
        int itemId = getId(itemcfg);
        return getNumById(itemId);
        
    }
    
    public int getNumById(int id){
        Item tmp = this.items.get(id);
        
        return tmp==null?0:tmp.getNum();
    }
    
    private int getIdByCfg(int cfgId,List<? extends Item> set){
        for(Item i: set)
            if(i.getInfo().getItemId()==cfgId)
                return i.getId();
        return -1;
    }
    
    
    public List<Item> getEat() {
        List<Item> tmp = new ArrayList<>();
        for (Item item : two) {
            if (item.getInfo().eatable()) {
                tmp.add(item);
            }
        }
        return tmp;
    }

    public List<Item> getPet(){
        List<Item> tmp = new ArrayList<>();
        for (Item item : seven) {
            if (item.getInfo().eatable()) {
                tmp.add(item);
            }
        }
        return tmp;
    }
    public List<Item> getSell() {
        List<Item> tmp = new ArrayList<>();
        for (Item item : two) {
            if (item.getInfo().saleable()) {
                tmp.add(item);
            }
        }
        for (Item item : three) {
            if (item.getInfo().saleable()) {
                tmp.add(item);
            }
        }
        if (four != null) {
            for (Item item : four) {
                //if(item.getInfo().saleable())
                tmp.add(item);
            }
        }
        sort(tmp);
        return tmp;
    }

    public List<Item> getUnfitWeapon() {
        List<Item> tmp = new ArrayList<>();
        for (Item item : getWeapon()) {
            if (item instanceof Weapon) {
                if (!((Weapon) item).isFit()) {
                    tmp.add(item);
                }
            }
        }
        sort(tmp);
        return tmp;
    }
    
    public HashMap<Integer,Item> getItems(){
    	return items;
    }
    
}

class ItemIdComparator implements Comparator<Item> {

    @Override
    public int compare(Item item1, Item item2) {
        int id1 = item1.getItemId();
        int id2 = item2.getItemId();

        if (id1 > id2) {
            return +1;
        }
        if (id1 < id2) {
            return -1;
        } else {
            return 0;
        }
    }
}

class SeedTimeComparator implements Comparator<Seed> {

    @Override
    public int compare(Seed left, Seed right) {
        int le = left.getPlantTime();
        int ri = right.getPlantTime();

        if (le > ri) {
            return +1;
        }
        if (le < ri) {
            return -1;
        }

        if (left.getInfo().getKind() > right.getInfo().getKind()) {
            return 1;
        }
        if (left.getInfo().getKind() < right.getInfo().getKind()) {
            return -1;
        }
        return 0;
    }
}
