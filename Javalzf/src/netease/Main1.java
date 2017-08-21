package netease;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
			long f = sc.nextInt();
			int d = sc.nextInt();
			int p = sc.nextInt();
			long own = f * p +d;
			int output = x+p;
			if(f < d/x){
				System.out.println(own/output);
			}else{
				System.out.println(d/x);
			}
        }
	}
}
