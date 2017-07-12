package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1015 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		int H = sc.nextInt();
//		int count = 0;
		sc.nextLine();
		List<String[]> strs = new ArrayList<String[]>();
		for(int i = 0;i<N;i++){
			String str = sc.nextLine();
			String[] strArr = str.split("\\s+");
			if(Integer.valueOf(strArr[1])>=80
					&& Integer.valueOf(strArr[2])>=80){
				strs.add(strArr);
			}
			else if(Integer.valueOf(strArr[1])<80
					&& Integer.valueOf(strArr[1])>=60
					&& Integer.valueOf(strArr[2])>=80){
				strs.add(strArr);
			}else if(Integer.valueOf(strArr[1])<80
					&& Integer.valueOf(strArr[1])>=60
					&& Integer.valueOf(strArr[2])<80
					&& Integer.valueOf(strArr[2])>=60){
				strs.add(strArr);
			}
//			else{
//				
//			}
		}
		
		
	}
}
