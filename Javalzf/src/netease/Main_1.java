package netease;

import java.util.HashSet;
import java.util.Scanner;

/*
 * ²ÊÉ«×©¿é
 */
public class Main_1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		HashSet<String> hashset = new HashSet<>();
		for(int i = 0;i<s.length();i++){
			hashset.add(s.substring(i, i+1));
			if(hashset.size()>2){
				System.out.println(0);
				return;
			}
		}
		System.out.println(hashset.size());
	}
}
