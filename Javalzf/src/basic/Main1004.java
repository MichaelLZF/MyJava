package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * 读入n名学生的姓名、学号、成绩，分别输出成绩最高和成绩最低学生的姓名和学号。
 * 
 * 输入格式：每个测试输入包含1个测试用例，格式为
 * 
 * 第1行：正整数n 第2行：第1个学生的姓名 学号 成绩 第3行：第2个学生的姓名 学号 成绩 ... ... ... 第n+1行：第n个学生的姓名 学号
 * 成绩 其中姓名和学号均为不超过10个字符的字符串，成绩为0到100之间的一个整数，这里保证在一组测试用例中没有两个学生的成绩是相同的。
 * 输出格式：对每个测试用例输出2行，第1行是成绩最高学生的姓名和学号，第2行是成绩最低学生的姓名和学号，字符串间有1空格。 输入样例： 3 Joe
 * Math990112 89 Mike CS991301 100 Mary EE990830 95 输出样例： Mike CS991301 Joe
 * Math990112
 */
public class Main1004 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Map<Integer, List<String>> scoreMap = new HashMap<>();

		int m = scan.nextInt();
		int i = m;
		int[] intArr = new int[i];

		scan.nextLine();
		String str[] = new String[i];

		for (int j = 0; j < i; j++) {
			str[j] = scan.nextLine();
		}

		for (String strin : str) {
			String[] strArray = strin.split(" ");
			List<String> strArr = new ArrayList<>();
			strArr.add(strArray[0]);
			strArr.add(strArray[1]);
			scoreMap.put(Integer.valueOf(strArray[2]), strArr);
			intArr[--i] = Integer.valueOf(strArray[2]);
		}

		Arrays.sort(intArr);
		System.out.println(scoreMap.get(intArr[m - 1]).get(0) + " " + scoreMap.get(intArr[m - 1]).get(1));
		System.out.println(scoreMap.get(intArr[0]).get(0) + " " + scoreMap.get(intArr[0]).get(1));
	}
}
