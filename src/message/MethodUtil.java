/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package message;

import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;
import component.info.TransInfo;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ming Jiang
 */
public class MethodUtil {
    public static String grc(String result) {
        try {
            Json j = new Json(result);
            int re = j.getInt("msgident");
            if(re==0){
                return "成功";
            }
            else
                return  TransInfo.get(j.getString("msg"));
        } catch (JSONException ex) {
            Logger.getLogger(MethodUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "失败 未知结果. "+result;
    }
    
   
}
