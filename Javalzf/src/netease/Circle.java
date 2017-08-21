package netease;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		double b = n;
		double r = Math.sqrt(b);
		for(int i = 0;i<r;i++){
			double j = 0;
			j=Math.sqrt(b-i*i);
			if(j==0){
				count += 2;
			}
			else if(j%1==0){
				count += 4;
			}
		}
		System.out.println(count);
	}
}
