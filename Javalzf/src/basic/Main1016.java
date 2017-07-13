package basic;

import java.util.Scanner;
/**
 * timeout
 * @author zhuofeili
 *
 */
public class Main1016 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String dA = sc.next();
		String B = sc.next();
		String dB = sc.next();
		sum(A,dA,B,dB);
	}
	public static void sum(String A,String dA,
			String B,String dB){
		long sum = 0;
		for(int i = 0;i<A.length();){
			String s = A.substring(i,i+1);
			if(s.equals(dA)){
				i++;
			}else{
				A = A.replace(s,"");
			}
		}
		for(int i = 0;i<B.length();){
			String s = B.substring(i,i+1);
			if(s.equals(dB)){
				i++;
			}else{
				B = B.replace(s,"");
			}
		}
		if(A.equals("") && !B.equals("")){
			sum = Long.valueOf(B);
		}else if(!A.equals("")&&B.equals("")){
			sum = Long.valueOf(A);
		}else if(A.equals("")&&B.equals("")){
			sum = 0;
		}else{
			sum = Long.valueOf(A)+Long.valueOf(B);
		}
		System.out.println(sum);
	}

}
