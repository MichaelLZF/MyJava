package basic;

import java.util.Scanner;

/**
 * 让我们用字母B来表示“百”、字母S表示“十”，用“12...n”来表示个位数字n（<10），换个格式来输出任一个不超过3位的正整数。例如234应该被输出为BBSSS1234，因为它有2个“百”、3个“十”、以及个位的4。
 * 
 * 输入格式：每个测试输入包含1个测试用例，给出正整数n（<1000）。
 * 
 * 输出格式：每个测试用例的输出占一行，用规定的格式输出n。
 * 
 * 输入样例1： 234 输出样例1： BBSSS1234 输入样例2： 23 输出样例2： SS123
 * 
 */
public class Main1006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			// int c = 0;
			int n = sc.nextInt();
		int m = 0;
		int s = 0;
			if (n < 1000) {
				if (n > 99) {
					// a = n / 100;
					// b = n %100 / 10 ;
					// c = n%100%10;
					// while()
					m = n % 100;
					n = n / 100;
					for (int i = 0; i < n; i++) {
						System.out.print("B");
					}
					s = m % 10;
					m = m / 10;
					for (int i = 0; i < m; i++) {
						System.out.print("S");
					}
					System.out.println("1" + n + m + s);
				} else if (n > 9) {
					m = n % 10;
					n = n / 10;
					for (int i = 0; i < n; i++) {
						System.out.print("S");
					}
					System.out.println("1" + n + m);
				} else {
					System.out.println("1" + n);
				}
			}
		}

	}
}
