package component.item;

import com.mingJiang.data.Hide;

import java.io.IOException;

import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;

import data.Util;

import java.util.HashMap;

import static data.StaticInfo.debug;

public class ItemInfo {

    private final static HashMap<Integer, ItemVo> items = new HashMap<>();
    private final static ItemVo nullItem = new ItemVo();

    static {
        try {
            initItem();
        } catch (JSONException e) {
            debug("i.bin 格式错误");
        } catch (IOException e) {
            debug("i.bin 文件读取错误 " + e.getMessage());
        } catch (RuntimeException e) {
            debug("fatal error: " + e.getMessage());
        }
    }

    private static void initItem() throws JSONException, IOException {
        Json json = new Json(Hide.get(Util.item));
        for (String key : json.keyset()) {
            items.put(Integer.parseInt(key), new ItemVo(json.getJson(key)));
        }

    }

    public static ItemVo getItem(int itemId) {
        ItemVo tmp = items.get(itemId);
        if(tmp==null){
        	System.out.println("未知道具 "+itemId);
        	return nullItem;
        }
        return tmp;
    }

    public static String getName(int itemId) {
        return getItem(itemId).getItemName();
    }

}
