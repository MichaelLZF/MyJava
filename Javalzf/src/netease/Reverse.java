package netease;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(rev(rev(x)+rev(y)));
		}
	}
	private static int rev(int x){
		String str = String.valueOf(x);
		String s = new StringBuilder(str).reverse().toString();
		return Integer.parseInt(s);
	}
}
