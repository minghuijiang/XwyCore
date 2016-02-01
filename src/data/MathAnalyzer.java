package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.xml.bind.ValidationEvent;

import message.Triple;

public class MathAnalyzer {

	// msg, remainer, numNeed
	public static List<Triple<String, Integer, Integer>> val  = new ArrayList<>();
	public static void analyze(int sum,int numNeed, String str, int... sub) {
		int size = sub.length;
		int sub0 = sub[size-1];
		int sub1 = 0;
		if(size>=2){
			sub1=sub[size-2];
		}
		//System.out.println("sub0 "+sub0+" sub1 "+sub1);
		
		int max = sum/sub0;
		for(int i=0;i<=max;i++){
			int subSum = sum - i*sub0;
			int subMax = 1;
			if(sub1!=0){
				subMax =subSum/sub1;
			}
			
			for(int j=0;j<=subMax;j++){
				int remain = subSum -j*sub1;
				String tmpStr = str;
				if(i>0){
					tmpStr+=" + "+i+" * "+sub0;
				}if(j>0){
					tmpStr+=" + "+j+" * "+sub1;
				}
				if(sub.length <=2){ 
					tmpStr+=" remain ="+remain;
					val.add(new Triple<>(tmpStr,remain,numNeed+i+j));
				}else{
					int[] trim = new int[size-2];
					System.arraycopy(sub, 0, trim, 0, size-2);
					analyze(remain,numNeed+i+j,tmpStr,trim);
				}
			}
		}
	}

	public static void analyze(int sum, int... subs){
		analyze(sum, 0, "", subs);
		Collections.sort(val,new Comparator<Triple<String, Integer, Integer>>() {

			@Override
			public int compare(Triple<String, Integer, Integer> o1,
					Triple<String, Integer, Integer> o2) {
				if(o1.getSubKey()<o2.getSubKey())
					return -1;
				if(o1.getSubKey()>o2.getSubKey())
					return 1;
				if(o1.getObj()<o2.getObj())
					return -1;
				if(o1.getObj()>o2.getObj())
					return 1;
				return 0;
			}

		});
		
		for(Triple<String, Integer, Integer> tmp : val){
			System.out.println(tmp.getKey());
		}
	}
	 
	//113
	//483
	//1274
	//2648
	//3503
	public static void main(String[] args){
		System.out.println("start");
		analyze(2648,968,600,484); 
	}
}
