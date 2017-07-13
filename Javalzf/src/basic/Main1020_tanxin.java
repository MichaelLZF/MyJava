package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 贪心算法之找零钱
 * @author zhuofeili
 *
 */
public class Main1020_tanxin {

	public static int MAX = 10;
//	public static double Value[] = { 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10 };
	// public static double
	public static double Value[]={100,50,20,10,5,2,1,0.5,0.2,0.1};//如果改成这行，结果就会出错
	public static double num[] = new double[MAX];

	public static void main(String[] args) {
		List ag = new ArrayList();
		for (int i = 0; i < Value.length; i++) {
			ag.add(Value[i]);
		}

		System.out.println("请输入要换的数值");
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
//		conver(a * 100);
		conver(a);
		System.out.println("找零");
		for (int i = 0; i < MAX; i++) {
			if (num[i] > 0) {
				System.out.println("面值" + Value[i] + "一共需要 " + num[i] + "张");
			}

		}
	}

	private static void conver(double a) {
		// TODO Auto-generated method stub
		int i, j;
		for (i = 0; i < MAX; i++)
			if (a > Value[i])
				break;

		while (a > 0 && i < MAX) {
			if (a >= Value[i]) {
				a -= Value[i];
				num[i]++;
			} else if (a < 10 && a >= 5) {
				num[MAX - 1]++;
				break;
			} else
				i++;
		}
	}
}
