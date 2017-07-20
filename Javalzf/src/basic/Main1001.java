package basic;

import java.util.Scanner;

public class Main1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int count = 0;
		while (i != 1) {
			if (i % 2 == 0) {
				i = i / 2;
			} else {
				i = (3 * i + 1) / 2;
			}
			count++;
		}
		System.out.println(count);

	}

}
