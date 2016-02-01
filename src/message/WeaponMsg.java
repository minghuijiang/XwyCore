/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package message;

import component.User;

import java.util.List;

/**
 *
 * @author Ming Jiang
 */
public class WeaponMsg {

    /**
     * 下石头
     * @param user
     * @param item
     * @param pos
     * @return 
     */
    public static String UnequipStone(User user, String item, int pos) {
        return user.send("act=setequipstone&ctl=item", "{\"rbagequipid\":%s,\"arrstone\":{\"%d\":0}}", item, pos);
    }

    /**
     * 上装备
     * @param user
     * @param warrior
     * @param itemStr
     * @return 
     */
    public static String equip(User user, int warrior, String itemStr) {
        return user.send("ctl=rwarrior&act=setequip", 
        		"{\"rwarriorid\":%d,\"arrequip\":%s}", warrior, itemStr
        		);
    }
    public static String equip(User user, int warrior, int item, int pos){
        return equip(user,warrior,String.format("{\"%d\":%d}",pos,item));
    }
    
    public static String equip(User user, List<Integer> weapon, int warrior){
        if(weapon == null)
            throw new IllegalArgumentException("weapon is null cannot equip");
        while(weapon.size()<4)//":{"2":3145093,"3":3145095,"4":3145094},"
            weapon.add(0);
        return equip(user,warrior, String.format("{\"1\":%d,\"2\":%d,\"3\":%d,\"4\":%d}", weapon.get(0),weapon.get(1),
                        weapon.get(2),weapon.get(3)));
    }

    /**
     * 下装备
     * @param user
     * @param warrior
     * @param pos
     * @return 
     */
    public static String Unequip(User user, int warrior, int pos) {
        return user.send("ctl=rwarrior&act=setequip", "{\"rwarriorid\":%d,\"arrequip\":{\"%d\":0}}", warrior, pos);
    }
    
    
    public static String UnequipAllStone(User user, int item) {
    	return user.send("act=setequipstone&ctl=item", 
                "{\"rbagequipid\":%d,\"arrstone\":{\"0\":0,\"1\":0,\"2\":0,\"3\":0}}", item
        );}
    

    /**
     * 装石头
     * @param user
     * @param item
     * @param stoneStr
     * @param pos  位置
     * @return 
     */
    public static String equipStone(User user, int item, int stoneStr,int pos) {
        return user.send("act=setequipstone&ctl=item", 
                "{\"rbagequipid\":%d,\"arrstone\":{\"%d\":%d}}", item,pos,stoneStr
        );
    }
    
    public static String equipStone(User user, int item, String stoneStr) {
        return user.send("act=setequipstone&ctl=item", 
                "{\"rbagequipid\":%d,\"arrstone\":%s}", item,stoneStr
        );
    }
    
    
    
    /**
     * 神兵升级
     *
     * @param user
     * @param id
     * @return
     */
    public static String upgradeArti(User user, int id) {
        return user.send(
                "act=upgradearti&ctl=arti",
                "{\"rbagitemId\":%d}", id
        );
    }
    public static String equipArti(User user,int warrior, int id) {
        return user.send(
                "act=equiparti&ctl=arti",
                "{\"rwarriorid\":%d,\"rbagitemId\":%d}",warrior, id
        );
    }
    
    public static String equipTailman(User user,int pos, int tail, int arti) {
        return user.send(
                "ctl=arti&act=settalisman",
                "{\"arrTalisman\":{\"%d\":%d},\"rbagitemId\":%d}",pos,tail, arti
        );
    }
}
