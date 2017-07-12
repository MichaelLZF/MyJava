package basic;

import java.util.*;

public class Main1012ccc {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		boolean flag1 = false;
		boolean flag2 = false; // a2不可以直接去判断 有可能总和是0;
		boolean flag3 = false;
		boolean flag4 = false;
		boolean flag5 = false;
		int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0;
		int remainder;
		int sign = 1, count = 0;
		while (N-- > 0) {
			int x = input.nextInt();
			remainder = x % 5;
			switch (remainder) {
			case 0:
				if (x % 2 == 0) {
					a1 += x;
					flag1 = true;
				}
				break;
			case 1:
				a2 += x * sign;
				sign = -sign;
				flag2 = true;

				break;
			case 2:
				a3++;
				flag3 = true;
				break;
			case 3:
				a4 += x;
				count++;
				flag4 = true;
				break;
			case 4:
				if (x > a5) {
					a5 = x;
					flag5 = true;
				}
				break;
			}
		}
		if (flag1)
			System.out.print(a1 + " ");
		else
			System.out.print("N ");
		if (flag2)
			System.out.print(a2 + " ");
		else
			System.out.print("N ");
		if (flag3)
			System.out.print(a3 + " ");
		else
			System.out.print("N ");
		if (flag4)
			System.out.printf("%.1f ", (double) a4 / count);
		else
			System.out.print("N ");
		if (flag5)
			System.out.println(a5);
		else
			System.out.println("N");
		input.close();
	}
}
