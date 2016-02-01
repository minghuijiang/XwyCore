package message;

import java.util.ArrayList;

import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;
import com.mingJiang.util.json.JsonArray;
import component.User;
import data.StaticInfo;
import java.util.List;

public class PetMsg {
    public static String open(User user) {
        return user.send(
                "act=openpet&ctl=rpet",
                null
        );
    }
    
    public static String openTrain(User user) {
        return user.send(
                "act=opentrain&ctl=rpet",
                null
        );
    }
    public static String openFire(User user) {
        return user.send(
                "act=openfire&ctl=rpet",
                null
        );
    }
    
    /**
     * 喂食
     * @param user
     * @param item
     * @return 
     */
    public static String feed(User user, int item) {
        return user.send(
                "act=usefood&ctl=rpet",
                "{\"rseedid\":%d}", item
        );
    }

    
    
    /**
     * 添火
     * @param user
     * @param item
     * @return 
     */
    public static String addFire(User user, int item) {
        return user.send(
                "act=begfire&ctl=rpet",
                "{\"type\":1,\"rbagitemid\":%d,\"num\":1}", item
        );
    }

    public static String addFireVip(User user) {
        return user.send(
                "act=begfire&ctl=rpet",
                "{\"type\":2}"
        );
    }

    public static String upSkill(User user,int skill) {
        return user.send(
                "act=activateskill&ctl=rpet",
                "{\"skillid\":%d}",skill
        );
    }
    /**
     * 获取灵气
     * @param user
     * @return 
     */
    public static String getNimbus(User user) {
        return user.send(
                "ctl=rpet&act=getnimbus",
                null
        );
    }

    /**
     * 训练
     * @param user
     * @param card
     * @return 
     */
    public static String train(User user, int card) {
        return user.send(
                "ctl=rpet&act=starttrain",
                "{\"cardkey\":%d}", card
        );
    }
    
    public static String changeName(User user,String name){
         return user.send(
                "ctl=rpet&act=resetname",
                "{\"name\":\"%s\"}", name
        );
    }

    /**
     * 好友列表
     * @param user
     * @return 
     */
    public static String getPetFriend(User user) {
        return user.send(
                "ctl=rfriend&act=rfriendlist",
                "{\"path\":\"pet\"}"
        );
    }

    /**
     * 获取能添火的id
     * @param user
     * @return 
     */
    public static List<Integer> getCanFire(User user) {
        List<Integer> friend = new ArrayList<>();
        String friendData = getPetFriend(user);
        try {
            Json json = new Json(friendData);
            JsonArray f = json.getJson("data").getArray("rfriendList");
            for (int i = 0; i < f.getItems().size(); i++) {
                Json item = f.getJson(i);
                if (item.getInt("canfire") == 1) {
                    friend.add(item.getInt("id"));
                }
            }
        } catch (JSONException e) {
            StaticInfo.debug("宠物好友: " + friendData);
        }

        return friend;
    }

}
