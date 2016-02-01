package socket;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.mingJiang.util.FileUtil;
import component.User;

public class DebugUtil {

	public static List<String> CArrayToString(String cArrayFile) throws IOException{
		List<String> tmp = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		boolean isSend= false;
		for(String s: FileUtil.readFrom(cArrayFile)){
			if(s.length()<1){
				continue;
			}
			if(s.contains("{")){
				if(s.contains("peer0"))
					isSend= true;
				else {
					isSend= false;
				}
				sb.append(isSend?"1":"0");
				continue ;
			}
			if(s.contains("};")){
				sb.append(s.replace("};", "").trim());
				tmp.add(sb.toString());
				sb= new StringBuilder();
			}else {
				sb.append(s.trim());
			}
		}
		
		return tmp;
	}
	
	
	public static byte[] StringToSocket(String socketString){

		String[] list = socketString.split(",");
		byte[] tmpList = new byte[list.length];
		for(int i=0;i<list.length;i++){
			int intVal = Integer.valueOf(list[i].replace("0x", "").trim(),16);
			byte b = (byte) intVal;
			tmpList[i]=(byte)b;
		}

		return tmpList;
	}

	
	public static void main(String[] args) throws IOException{
		ClientSocket.showSocket= true;
		User user  = new User("apq3og0m90oobcqej7lmvivu41");
		System.out.println("start");
//		user.setNeedData(true);
//		user.login();
		for(String s: CArrayToString("C:/Users/Ming/Desktop/testC.txt")){
			if(!s.startsWith("1"))
				ClientSocket.read(StringToSocket(s.substring(1)));
			else{
				ClientSocket.readR(StringToSocket(s.substring(1)));
				System.out.println(s.substring(1));
			}
				
		}
			
	}

}
