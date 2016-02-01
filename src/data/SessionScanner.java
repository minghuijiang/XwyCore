package data;

import message.DailyMsg;
import component.User;

public class SessionScanner {

	private String begin,end;
	private Session current;
	
	public SessionScanner(char ch){
		this(ch+"0000000000000000000000000",ch+"zzzzzzzzzzzzzzzzzzzzzzzzz");
	}
	
	public SessionScanner(String begin, String end){
		this.begin = begin;
		this.end = end;
		current = new Session(begin);
	}
	

	public static void main(String[] args){
		SessionScanner scan = new SessionScanner("10000000000000000000000000","1zzzzzzzzzzzzzzzzzzzzzzzzz");
		scan.scan();
	}
	
	public void scan(){
		String val;
		while(!(val = current.next()).equals(end)){

			System.out.println(val);
		}
	}
	
}
