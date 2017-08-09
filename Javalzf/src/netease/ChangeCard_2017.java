package netease;

/**
 * 通过了
 */
import java.util.Scanner;

public class ChangeCard_2017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] arr = new int[2 * n];
			for (int i = 0; i < 2 * n; i++) {
				arr[i] = sc.nextInt();
			}
			changeCard(arr, n, k);
			for (int i = 0; i < 2 * n-1; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.print(arr[arr.length-1]);
			System.out.println();
		}

	}

	private static void changeCard(int[] arr, int n, int k) {
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = arr[i];
			arr2[i] = arr[i + n];
		}
		if (k >= 1) {
			for (int i = 0; i < 2 * n; i++) {
				if (i % 2 == 0) {
					arr[i] = arr1[i / 2];
				} else {
					arr[i] = arr2[(i - 1) / 2];
				}
			}
			k--;
			changeCard(arr, n, k);
		}
	}
}
