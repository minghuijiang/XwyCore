package data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.mingJiang.util.FileUtil;
import com.mingJiang.util.HttpUtil;
import com.mingJiang.util.json.JSONException;
import com.mingJiang.util.json.Json;

import component.User;

public class Tester {

	public static List<String> appList;
	public static String parse;
	public static void initApp(File f) throws IOException{
		appList= new ArrayList<>();
		for(String s: FileUtil.readFrom(f.getAbsolutePath()))
			if(s.contains("PHPConsts."))
				appList.add(s);
	}
	
	public static synchronized List<String> getInclude(String keyword){
		List<String> tmp = new ArrayList<>();
		for(int i=0;i<appList.size();i++){
			if(appList.get(i).contains("PHPConsts."+keyword+")")||
					appList.get(i).contains("PHPConsts."+keyword+",")||
						appList.get(i).contains("PHPConsts."+keyword+" ")){
				tmp.add(appList.remove(i));
				i--;
			}
		}
		return tmp;
	}
	
	public static void main(String[] args) throws IOException, JSONException{
		File f = new File("C://Users/Ming/Desktop/ttt.as");
		File fs = new File("C://Users/Ming/Desktop/ttt.txt");
		initApp(fs);
		parse = "http://app100645087.qzone.qzoneapp.com/gateway.php?PHPSESSID=kprbllid9qb2j5a2nc2prhadf0&serid=1&rep=json";
		
		for(String s: FileUtil.readFrom(f.getAbsolutePath())){
			if(s.contains("{ctl:")){
				Json json = new Json(s);
				String addon = "";
				for(String key: json.getMap().keySet())
					addon+="&"+key+"="+json.getString(key);
				//public static const GET_GAME_POINT:Object = {ctl:"sina", act:"getgamepoint"};
				String method = s.split("const ")[1].split(":")[0];
				parseFunction(s.trim(), method, addon);
			}
		}
		System.out.println("left");
		for(String s: appList)
			System.out.println(s);
	}
	
	public static String getCamel(String str){
		str = str.toLowerCase();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='_'&&i+1<str.length()){
				String[] sp= str.split("_",2);
				str = sp[0]+sp[1].substring(0,1).toUpperCase()+sp[1].substring(1);
				i--;
			}
		}
		return (str);
	}
	
	public static void parseFunction(String comment,String method, String addOn){
		/*
		 * public static String dailySign(User user) {
		        return user.send(
		                "act=getsignaward&ctl=operator",
		                null
		        );
		    }
		 */
		System.out.println();
		System.out.println("\t\t//"+comment);
		for(String s: getInclude(method))
			System.out.println("\t\t//"+s.trim());
		System.out.println("\t\t//"+getPostResult(parse+addOn));
		System.out.println();
		
		System.out.println("\t\tpublic static String "+getCamel(method)+"(User user) {");
		System.out.println("\t\t\treturn user.send(");
		System.out.println("\t\t\t\t\""+addOn+"\",");
		System.out.println("\t\t\t\tnull");
		System.out.println("\t\t\t);");
		System.out.println("\t\t}");
		System.out.println();
		
	}
	
	public static String getPostResult(String url){
		List<String> result = HttpUtil.sendGet(url, null,null,false);
		if(result!=null)
			if(result.size()==0)
				return "\t0= "+result;
			else {
				return result.get(result.size()-1);
			}
		else
			return "\tnull-====";
	}

}
