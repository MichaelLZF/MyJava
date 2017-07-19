package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Main1070 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i =0;i<N;i++){
			arr[i] = sc.nextInt();
//			System.out.print(arr[i]);
		}
		Arrays.sort(arr);
		int sum = 0;
		for(int i = 0;i<N-1;i++){
			
			arr[i+1] = (arr[i]+arr[i+1])/2; ;
		}
		System.out.println(arr[N-1]);
	}

}
