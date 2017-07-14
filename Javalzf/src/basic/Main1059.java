package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1059 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String[] strs = new String[N];
		for (int i = 0; i < N; i++) {
			strs[i] = sc.nextLine();
		}
		int M = sc.nextInt();
		sc.nextLine();
		String[] strsM = new String[M];
		for (int i = 0; i < M; i++) {
			strsM[i] = sc.nextLine();
		}
		checked(strs, strsM);
	}

	public static void checked(String[] str, String[] strM) {
		int count = 0;
		List<String> lists = new ArrayList<String>();
		for (int i = 0; i < str.length; i++) {
			lists.add(str[i]);
		}
		for (int i = 0; i < strM.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if (lists.contains(strM[i])) {
					if (strM[i].equals(str[0])) {
						count++;
						if (count == 1) {
							System.out.println(strM[i] + ": Mystery Award");
						} else {
							System.out.println(strM[i] + ": Checked");
						}
//						count = 0;
						break;
					} else if (isPrimeNum(lists.indexOf(strM[i]) + 1)) {
						count++;
						if (count == 1) {
							System.out.println(strM[i] + ": Minion");
						} else {
							System.out.println(strM[i] + ": Checked");
						}
//						count = 0;
						break;
					} else {
						count++;
						if (count == 1) {
							System.out.println(strM[i] + ": Chocolate");
						} else {
							System.out.println(strM[i] + ": Checked");
						}
//						count = 0;
						break;
					}
				} else {
					System.out.println(strM[i] + ": Are you kidding?");
					break;
				}
			}
		}
	}

	public static boolean isPrimeNum(int a) {
		if (a == 0 || a == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
}
