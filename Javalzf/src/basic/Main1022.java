package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//又超时！！！
public class Main1022 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		int c = sc.nextInt();
		long sum = a + b;
//		String s = ""+sum;
		long y = 0;
		List<Long> lists = new ArrayList<Long>();
		do{
			y = sum%c;
			sum = sum/c;
			lists.add(y);
//			System.out.print(y);
		}while(sum!=0);
		for(int i = 0;i<lists.size();i++){
			System.out.print(lists.get(lists.size()-1-i));
		}
		
	}
}
