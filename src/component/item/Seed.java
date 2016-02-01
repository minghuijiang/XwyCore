package component.item;

import com.mingJiang.util.json.Json;

public class Seed extends Item {

    public static final int TYPE_NOTYPE = -1;
    public static final int TYPE_MONEY = 0;
    public static final int TYPE_TECH = 1;
    public static final int TYPE_RENOWN = 2;
    public static final int TYPE_EXP = 3;
    public static final int TYPE_OTHER = 4;
    
    
    private int plantTime;

    public Seed(Json json) {
        super(json);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void parseItem(Json json) {
        plantTime = info.getSeedreqtime();
    }

    @Override
    public String toString() {
        int min = plantTime / 60;
        String time = min % 60 + "分钟";
        if (min > 60) {
            time = (min / 60) + "小时 " + time;
        }
        return this.info.getItemName() + "--" + time;
    }

    public int getPlantTime() {
        return plantTime;
    }


}
