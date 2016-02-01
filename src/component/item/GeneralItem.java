package component.item;

import com.mingJiang.util.json.Json;

public class GeneralItem extends Item {

    public GeneralItem(Json json) {
        super(json);
    }

    @Override
    public void parseItem(Json json) {
    }

    @Override
    public String toString() {
        return info.getItemId() + " : " + info.getItemName();
    }


}
