package message;

import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;
import component.User;
import data.Constant;
import data.StaticInfo;

public class FarmMsg {
    //static method
    public static void harvestAndPlant(User user, int seedId){
        try{
            
            Json farmMsg = new Json(FarmMsg.getFarm(user)).getJson("data");
            int farmNum = farmMsg.getInt("farmnum");
            
            farmMsg = farmMsg.getJson("rfarmPlantList");
            for(int i=1;i<=farmNum;i++){
                if(farmMsg==null){
                    FarmMsg.plant(user, seedId, i);
                }else{
                    Json tmp = farmMsg.getJson(i+"");
                    if(tmp==null){
                        FarmMsg.plant(user, seedId, i);
                    }else if(tmp.getInt("needtime")==0){
                        FarmMsg.harvestPlant(user, i);
                        FarmMsg.plant(user, seedId, i);
                    }
                }
            }
        }catch(Exception e){
            user.log("种植出错");
            e.printStackTrace();
        }
    }
    
    
    

    /**
     * enter friend's manor
     *
     * @param user
     * @param friend
     * @return
     */
    public static String enterFriend(User user, int friend) {
        return user.send(
                "ctl=rfriend&act=visitmanor",
                "{\"fid\":%d}", friend
        );
    }

    public static String enterFarm(User user) {
        return user.send(
                "ctl=rfriend&act=visitmanor",
                "{}"
        );
    }

    public static String getFarm(User user) {
        return user.send(
                "act=getfarm&ctl=farm",
                "{}"
        );
    }

    /**
     * get friend's farm data
     *
     * @param user
     * @param friend
     * @return
     */
    public static String getFarmData(User user, int friend) {
        return user.send(
                "act=getfarm&ctl=farm",
                "{\"frid\":%d}", friend
        );
    }

    /**
     * initialize friend list
     *
     * @param user
     * @return
     */
    public static String initFriend(User user) {
        return user.send(
                "act=rfriendlist&ctl=rfriend",
                null
        );
    }
    
    
    public static String getGameFriend(User user) {
        return user.send(
                "act=getfriends&ctl=friend",
                null
        );
    }

    /**
     * bless friend
     *
     * @param user
     * @param friend
     * @return
     */
    public static String bless(User user, int friend) {
        return user.send(
                "act=blessfriend&ctl=tree",
                "{\"frid\":%d}", friend
        );
    }

    /**
     * add water to friend's plant
     *
     * @param user
     * @param friend
     * @param index
     * @return
     */
    public static String water(User user, int friend, int index) {
        return user.send(
                "ctl=farm&act=waterplant",
                "{\"field\":%d,\"frid\":%d}", index, friend
        );
    }
    
    public static String batchWater(User user, int friend) {
        return user.send(
                "ctl=farm&act=batchwater",
                "{\"frid\":%d}", friend
        );
    }

    /**
     * harvest bless tree of user
     *
     * @param user
     * @return
     */
    public static String harvestBless(User user) {
        return user.send(
                "act=getblessaward&ctl=tree",
                null
        );
    }

    /**
     * plant seed
     *
     * @param user
     * @param plantId
     * @param index
     * @return
     */
    public static String plant(User user, int plantId, int index) {
        return user.send(
                "act=doplant&ctl=farm",
                "{\"rseedid\":%d,\"field\":%d}", plantId, index
        );
    }

    /**
     * harvest plant
     *
     * @param user
     * @param index
     * @return
     */
    public static String harvestPlant(User user, int index) {
        return user.send(
                "act=pickplant&ctl=farm",
                "{\"field\":%d}", index
        );
    }

    /**
     * 征收, daily gain, cool down 5 mins
     *
     * @param user
     * @return
     */
    public static String collectTree(User user) {
        return user.send(
                "act=getgain&ctl=tree",
                null
        );
    }
    
    public static String forceCollectTree(User user) {
        return user.send(
                "act=addgain&ctl=tree",
                null
        );
    }

    public static String unlock(User user) {
        return user.send(
                "act=unlockfield&ctl=farm",
                "{}"
        );
    }
    
    public static String release(User user, int id) {
        return user.send(
                "ctl=servant&act=servantrelease",
                "{\"otherid\":%d}", id
        );
    }

    public static boolean getServant(User user, int[] ids) {
         if(ids==null){
             
         }
                 return true;
    }

    public static boolean catchServant(User user, int id) {
        if (id == 0) {
            user.log("随机获取奴隶");
            try {
                user.log("尝试获取奴隶 ");
                Json j = new Json(getRandomServant(user));
                for (Object o : j.getJson("data").getArray("list").getItems()) {
                    Json tmp = (Json) o;
                    id = tmp.getInt("id");
                    if (tmp.getInt("serstat") == 0) // free
                    {
                        break;
//                        if (FightMsg.fight(user, 2, id, 10025)) {// fight success
//                            break;
//                        } 
                    }
                  //  id = 0;// fight fail or has master
                }
//                if(id==0){
//                    user.setMsg("无可抓捕对象. 战力太低？");
//                    return false;
//                }

            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            if (!FightMsg.fight(user, 2, id, 10025)) {
                user.log("抓捕 "+id+" 不一定成功. 跳过");
                return false;
            }
        }
        capture(user, id);
        boolean f = (FightMsg.fight(user, id, 10025, 2));
        captureSuc(user, id);
        return f;
    }

    public static void main(String[] args) {
        StaticInfo.registerPlatform(Constant.TENCENT, 2);
        User u = new User("", "",
                "http://app100645087.qzone.qzoneapp.com/?qz_height=1400&openid=6DB4115F712DB36C56BB1AF1CB031A41&openkey=DD6B4DBE0A44B7CC7B05FAECA7F180BA&pf=qzone&pfkey=32b04bcf7c7b27a0cd0821c76892d71a&qz_ver=8&appcanvas=1&qz_style=88&params=&via=QZ.MYAPP&serid=2");

        u.setNeedData(true);
        u.login();
        catchServant(u, 2038871);
    }

    public static String captureSuc(User user, int capId) {
        return user.send(
                "ctl=servant&act=capturesuc",
                "{\"frid\":%d,\"caprid\":%d}", capId, capId
        );
    }

    public static String getRandomServant(User user) {
        return user.send(
                "ctl=servant&act=searchservants",
                null
        );
    }

    public static String capture(User user, int capId) {
        return user.send(
                "act=startcapture&ctl=servant",
                "{\"caprid\":%d}", capId
        );
    }

}
