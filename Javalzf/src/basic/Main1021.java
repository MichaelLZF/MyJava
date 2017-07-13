package basic;

import java.util.Scanner;

public class Main1021 {
	
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int length = 0;
		while(s.length()>0){
			String str = String.valueOf(s.charAt(0));
			String newString = s.replaceAll(str, "");
			length = s.length() - newString.length();
			s = newString;
			System.out.println(str+":"+length);
		}
	}
}
