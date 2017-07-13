package basic;

import java.math.BigInteger;
import java.util.Scanner;
/**
 * timeout
 * @author zhuofeili
 * BigInteger几乎可以包括任意大的计算机CPU可以接受的整型数据
 */
public class Main1017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger();
		int B = sc.nextInt();
		System.out.println(A.divide(BigInteger.valueOf(B)) + " "
		+ A.mod(BigInteger.valueOf(B)));
	}
}
