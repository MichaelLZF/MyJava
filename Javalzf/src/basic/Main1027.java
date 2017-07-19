package basic;

import java.util.Scanner;

public class Main1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s1 = sc.nextLine();
		String s = s1.replaceAll(" ", "");
		int sum = 0;
		int count = 0;
		if (n == 0) {
			System.out.print(n);
		} else {
			for (int i = 3; i <= (n - 1) / 2; i = i + 2) {
				sum = sum + i;
				if (sum > (n - 1) / 2) {
					sum = sum - i;
					break;
				}
				count++;
			}
			for (int i = count; i > 0; i--) {
				for (int k = i; k < count; k++) {
					System.out.print(" ");
				}
				for (int j = 0; j <= 2 * i; j++) {
					System.out.print(s);
				}
				System.out.println();
			}

			for (int i = 0; i <= count; i++) {
				for (int k = i; k < count; k++) {
					System.out.print(" ");
				}
				for (int j = 0; j <= 2 * i; j++) {
					System.out.print(s);
				}
				System.out.println();
			}
			int remain = n - 2 * sum - 1;
			System.out.print(remain);
		}
	}
}
