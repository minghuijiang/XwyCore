/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component.info;

import com.mingJiang.data.Hide;
import com.mingJiang.util.xml.TagElement;
import com.mingJiang.util.xml.UnclosedTagException;
import data.Util;
import java.io.IOException;
import java.util.HashMap;
import static data.StaticInfo.debug;

/**
 *
 * @author Ming Jiang
 */
public class TransInfo {

    private static final HashMap<String, String> dict = new HashMap<>();

    
    
    static {
        try {
            initDict();
        } catch (UnclosedTagException ex) {
            debug("e.bin 格式错误");
        } catch (RuntimeException e) {
            debug("fatal error: " + e.getMessage());
        } catch (IOException ex) {
            debug("e.bin 错误 " + ex.getMessage());
        }
    }

    private static void initDict() throws UnclosedTagException, IOException {
        TagElement tag = new TagElement(Hide.get(Util.trans));
        for (TagElement sub : tag.getAll("trans")) {
        	String attr = sub.getAttri("id");
        	if(attr.startsWith("name_"))
        		attr= attr.replaceFirst("name_", "");
            dict.put(attr, sub.getValue());
        }
    }
    
    /**
     * 	<trans id="name_equip">装备</trans>
		<trans id="name_exp">经验</trans>
		<trans id="name_con">生命</trans>
		<trans id="name_str">力量</trans>
		<trans id="name_agi">防御</trans>
		<trans id="name_force">内力</trans>
		<trans id="name_antiall">抗性</trans>
		<trans id="name_anti">抗性</trans>		
		<trans id="name_hp">生命值</trans>		
		<trans id="name_attackprior">先攻值</trans>
		<trans id="name_block">格挡率</trans>
		<trans id="name_accuracy">穿透率</trans>
		<trans id="name_attack">普通攻击</trans>
		<trans id="name_defence">普通防御</trans>
		<trans id="name_skillattack">技能攻击</trans>
		<trans id="name_skilldefence">技能防御</trans>
		<trans id="name_en">初始能量</trans>
		<trans id="name_enSpd">能量恢复</trans> 
		<trans id="name_antisubhp">中毒抗性</trans>     		
		<trans id="name_antisubattack">降攻抗性</trans>
		<trans id="name_antisubdefence">降防抗性</trans>
		<trans id="name_antiunskill">点穴抗性</trans>
     */

    public static String get(String val) {
        String result = dict.get(val);
        return result == null ? val : result;
    }
}
