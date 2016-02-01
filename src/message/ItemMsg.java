package message;

import component.User;

public class ItemMsg {

    /**
     * 合成石头
     * @param user
     * @param id  石头id
     * @param num  合成数量
     * @return 
     */
    public static String mergeStone(User user, int id, int num) {
        return user.send(
                "act=mergestone&ctl=item",
                "{\"rbagitemid\":%d,\"num\":%d}", id, num
        );
    }
    
    //hack version
    public static String mergeStone(User user, int id, String num) {
        return user.send(
                "act=mergestone&ctl=item",
                "{\"rbagitemid\":%d,\"num\":%s}", id, num
        );
    }

    /**
     * 开盒子.
     * @param user
     * @param id  盒子id -- openable;
     * @param num
     * @return 
     */
    public static String openBox(User user, int id, int num) {
        return user.send(
                "ctl=item&act=bagopenbox",
                "{\"rbagitemid\":%d,\"num\":%d}", id, num
        );
    }
    
    
    public static String openBoxNoUpdate(User user, int id, int num) {
        return user.sendASyn(
                "ctl=item&act=bagopenbox",
                "{\"rbagitemid\":%d,\"num\":%d}", id, num
        );
    }

    /**
     * 对侠客使用
     * @param user
     * @param id 道具id
     * @param warrior 对象id
     * @param num
     * @return 
     */
    public static String openBox(User user, int id, int warrior, int num) {
        return user.send(
                "ctl=item&act=bagopenbox",
                "{\"rwarriorid\":%d,\"rbagitemid\":%d,\"num\":%d}", warrior, id, num
        );
    }

    /**
     * 合成武器
     * @param user
     * @param id
     * @param num
     * @return 
     */
    public static String combineWeapon(User user, int id, int num) {
        return user.send(
                "act=bagmergefragment&ctl=item",
                "{\"num\":%d,\"rbagitemid\":%d}", num, id
        );
    }
    
    //hack version
    public static String combineWeapon(User user, int id, double num) {
        return user.send(
                "act=bagmergefragment&ctl=item",
                "{\"num\":%f,\"rbagitemid\":%d}", num, id
        );
    }
    public static String combineWeapon(User user, int id, String num) {
        return user.send(
                "act=bagmergefragment&ctl=item",
                "{\"num\":%s,\"rbagitemid\":%d}", num, id
        );
    }
    
    /**
     * 吃丹药
     * @param user
     * @param pillId
     * @param warriorId
     * @param num
     * @return 
     */
    public static String eatPill(User user, int pillId, int warriorId, int num) {
        return user.send(
                "ctl=rwarrior&act=usealchemy",
                "{\"rbagitemid\":%d,\"rwarriorid\":%d,\"num\":%d}", pillId, warriorId, num
        );
    }

    /**
     * 出售物品
     * @param user
     * @param id
     * @param num
     * @return 
     */
    public static String sellItem(User user, int id, int num) {
        return user.send(
                "ctl=item&act=sellitem",
                "{\"num\":%d,\"rbagitemid\":%d}", num, id
        );
    }
    
    /**
     * hack version
     * @param user
     * @param id
     * @param num
     * @return
     */
    public static String sellItem(User user, int id, String num) {
        return user.send(
                "ctl=item&act=sellitem",
                "{\"num\":%s,\"rbagitemid\":%d}", num, id
        );
    }

    /**
     * 武器升级
     * @param user
     * @param weapon
     * @return 
     */
    public static String upgradeWeapon(User user, int weapon) {
        return user.send(
                "ctl=item&act=batchupequip",
                "{\"rbagitemid\":%d}", weapon
        );
    }

    /**
     * 单一升级武器
     * @param user
     * @param weapon
     * @return 
     */
    public static String upgradeWeaponOne(User user, int weapon) {
        return user.send(
                "ctl=item&act=upequip",
                "{\"rbagitemid\":%d}", weapon
        );
    }
}
