package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Main1030 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int p = sc.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int tmp = arr[N-1] / p;
		int sum = 0;
		for (int i = 0; i < N; i++) {
			if (arr[i] > tmp) {
				sum = N - i;
				break;
			}
		}
		System.out.println(sum);
	}

}
