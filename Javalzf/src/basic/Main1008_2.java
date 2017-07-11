package basic;

/**
 * 位移算法版；
 */
import java.util.Scanner;

public class Main1008_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		reverse(a, n - m, n - 1);
		reverse(a, 0, n - m - 1);
		reverse(a, 0, n - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void reverse(int[] a, int from, int to) {
		for (int i = 0; i < (to - from + 1) / 2; i++) {
			int x;
			x = a[to - i];
			a[to - i] = a[from + i];
			a[from + i] = x;
		}
	}

}
