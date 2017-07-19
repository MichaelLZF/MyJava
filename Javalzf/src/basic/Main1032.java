package basic;

import java.util.Scanner;

public class Main1032 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[100001];
		int max = 0;
		for(int i = 0;i<n;i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			a[x] += y;
			if(a[x]>a[max])
				max = x;
		}
		System.out.printf("%d %d",max,a[max]);
	}
}
