package basic;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main1024 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextBigDecimal()) {
			BigDecimal bd = sc.nextBigDecimal();
			System.out.println(bd.toPlainString());
		}
	}
}
