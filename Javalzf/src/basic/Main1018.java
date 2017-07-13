package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * java果然不适合写算法，又超时
 * @author zhuofeili
 *
 */
public class Main1018 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		List<String[]> lists = new ArrayList<String[]>();
		String s = "";
		for(int i = 0;i<n;i++){
			s = sc.nextLine();
			lists.add(s.split("\\s+"));
		}
		win(lists);
	}
	public static void win(List<String[]> lists){
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int c = 0;
		int b = 0;
		int j = 0;
		for(int i = 0;i<lists.size();i++){
			if((lists.get(i)[0].equals("C")&&lists.get(i)[1].equals("J"))
					|| (lists.get(i)[0].equals("J")&&lists.get(i)[1].equals("B"))
					|| (lists.get(i)[0].equals("B")&&lists.get(i)[1].equals("C"))){
				count1++;
				if(lists.get(i)[0].equals("C")){
					c++;
				}else if(lists.get(i)[0].equals("B")){
					b++;
				}else{
					j++;
				}
			}else if(lists.get(i)[0].equals(lists.get(i)[1])){
				count2++;
			}else{
				count3++;
			}
		}
		System.out.println(count1+" "+count2+" "+count3);
		System.out.println(count3+" "+count2+" "+count1);
	}
}
