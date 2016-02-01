package data;

public class Session {

	public static Long L10 = Long.parseLong("zzzzzzzzzz", 36)+1;
	public static Long L6 =Long.parseLong("zzzzzz",36)+1;
	
	private String first, next, last;
	private long f,n,l;
	
	public Session(String begin){
		first = begin.substring(0,10);
		next = begin.substring(10,20);
		last = begin.substring(20);
		
		f = Long.parseLong(first, 36);
		n = Long.parseLong(next,36);
		l = Long.parseLong(last, 36);
	}
	
	public String next(){
		String val = first+next+last;
		l++;
		if(l==L6){
			l = 0;
			n++;
			if(n==L10){
				n=0;
				f++;
				first = Long.toString(f, 36);
			}
			next = Long.toString(n,36);
		}
		last = Long.toString(l, 36);
		return val;
	}
}
