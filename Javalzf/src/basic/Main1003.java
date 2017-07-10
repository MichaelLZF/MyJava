package basic;

/**
 * 1. 字符串中必须仅有P, A, T这三种字符，不可以包含其它字符；
 * 2. 任意形如 xPATx 的字符串都可以获得“答案正确”，其中 x 或者是空字符串，或者是仅由字母 A 组成的字符串；
 * 3. 如果 aPbTc 是正确的，那么 aPbATca 也是正确的，其中 a, b, c 均或者是空字符串，或者是仅由字母 A 组成的字符串。
 */
import java.util.Scanner;

public class Main1003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			String news = s;
			if (news.contains("P") && news.contains("A") && news.contains("T")) {
				news = news.replace("A", "");
				news = news.replace("P", "");
				news = news.replace("T", "");
				news = news.replace("\\s+", "");
				if (news.isEmpty()) {
					int p = s.indexOf("P");
					int t = s.indexOf("T");
					int len = s.length();
					int b = t - p - 1;
					int c = len - t - 1;
					if (p * b == c) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}
				} else {
					System.out.println("NO");
				}
			} else {
				System.out.println("NO");
			}
		}
	}

}
