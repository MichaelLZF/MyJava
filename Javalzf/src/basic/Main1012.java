package basic;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入样例1： 13 1 2 3 4 5 6 7 8 9 10 20 16 18 输出样例1： 30 11 2 9.7 9 输入样例2： 8 1 2 4 5
 * 6 7 9 16 输出样例2： N 11 2 N 9
 * java代码超时
 * @author zhuofeili
 *
 */
public class Main1012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		int[] a = new int[arr.length];

		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.valueOf(arr[i]);
		}
		int n = a[0];
		// for(int i = 1;i<a[0];i++){
		// System.out.println(a[i]);
		// }
		A1(a);
		A2(a);
		A3(a);
		A4(a);
		A5(a);
	}

	public static void A1(int[] a) {
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= a[0]; i++) {
			if (a[i] % 5 == 0 && a[i] % 2 == 0) {
				sum += a[i];
				count++;
			}
		}
		if (count > 0) {
			System.out.print(sum + " ");
		} else {
			System.out.print("N ");
		}
	}

	public static void A2(int[] a) {
		int[] b;
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= a[0]; i++) {
			if (a[i] % 5 == 1) {
				count++;
				if (count % 2 == 1) {
					sum += a[i];
				} else if (count > 0 && count % 2 == 0) {
					sum -= a[i];
				}
			}
		}
		if (count > 0) {
			System.out.print(sum + " ");
		} else {
			System.out.print("N ");
		}
	}

	public static void A3(int[] a) {
		int count = 0;
		for (int i = 1; i <= a[0]; i++) {
			if (a[i] % 5 == 2) {
				count++;
			}
		}
		if (count > 0) {
			System.out.print(count + " ");
		} else {
			System.out.print("N ");
		}
	}

	public static void A4(int[] a) {
		float sum = 0;
		float count = 0;
		float f = 0;
		String result = "";
		for (int i = 1; i <= a[0]; i++) {
			if (a[i] % 5 == 3) {
				sum += a[i];
				count++;
			}
		}
		f = (float) (sum / count);
		DecimalFormat df = new DecimalFormat("0.0");
		result = df.format(f);
		if (count > 0) {
			System.out.print(result + " ");
		} else {
			System.out.print("N ");
		}
	}

	public static void A5(int[] a) {
		int sum = 0;
		int count = 0;
		int[] b = new int[a.length];
		for (int i = 1; i <= a[0]; i++) {
			count++;
			int j = 0;
			if (a[i] % 5 == 4) {
				b[j++] = a[i];
			}
		}
		Arrays.sort(b);
		if (count > 0) {
			System.out.print(b[b.length - 1]);
		} else {
			System.out.print("N");
		}
	}
}