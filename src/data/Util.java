package data;

import com.mingJiang.data.Hide;
import com.mingJiang.util.FileUtil;

import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;
import com.mingJiang.util.xml.TagElement;
import com.mingJiang.util.xml.UnclosedTagException;
import java.io.IOException;

public class Util {

    public static void parseItem(String itemFile) throws JSONException, IOException {
        FileUtil.writeTo("item.json", new Json(FileUtil.readToLine(itemFile)).getJson("itemcfgList").toString());
    }
    public static void parseResult(String resultFile) throws UnclosedTagException, IOException{
        TagElement data =  new TagElement(FileUtil.readToLine(resultFile));
        TagElement desire =null;
        for(TagElement subTag: data.getAll("group"))
            if(subTag.getAttri("id").equals("back")||subTag.getAttri("id").equals("common")||
            		subTag.getAttri("id").equals("strength")){
            	if(desire ==null)
            		desire = subTag;
            	else
            		for(TagElement sub: subTag.getSubTag())
            			desire.addTagElement(sub);
            }
        System.out.println(desire.toXMLString());
        FileUtil.writeTo("trans.xml",desire.toString());
    }

    public static void parseWarrior(String file) throws JSONException, IOException{
    	FileUtil.writeTo("warrior.json", new Json(FileUtil.readToLine(file)).getJson("warriorcfgList").toString());
    }
    

    public static String item = "c";
    public static String trans = "d";
    public static String warrior = "e";
    public static String map ="f";
    public static String quest ="g";

    public static void main(String[] args) throws IOException, JSONException {
        parseItem("init3.json");
        parseResult("t.xml");
        parseWarrior("init1.json");
        Hide.hide("item.json", item);
        Hide.hide("trans.xml", trans);
        Hide.hide("warrior.json", warrior);
        Hide.hide("area.json", map);
        Hide.hide("init2.json", quest);
    }
}
