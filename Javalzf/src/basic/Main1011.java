package basic;

import java.util.Scanner;

/**
 * 给定区间[-2^31, 2^31]内的3个整数A、B和C，请判断A+B是否大于C。
 * 
 * 输入格式：
 * 
 * 输入第1行给出正整数T(<=10)，是测试用例的个数。随后给出T组测试用例，每组占一行，顺序给出A、B和C。整数间以空格分隔。
 * 
 * 输出格式：
 * 
 * 对每组测试用例，在一行中输出“Case #X: true”如果A+B>C，否则输出“Case #X: false”，其中X是测试用例的编号（从1开始）。
 * 
 * 输入样例： 
4 
1 2 3 
2 3 4 
2147483647 0 2147483646 
0 -2147483648 -2147483647 
 * 输出样例：
 * Case #1: false 
 * Case #2: true 
 * Case #3: true 
 * Case #4: false
 */
public class Main1011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[][] strArr = new String[n][3];
		for(int i = 0;i<n;i++){
			String str = sc.nextLine();	
			String[] s = str.split("\\s+");
			strArr[i] = s; 
//			for(int j = 0;j<s.length;j++){
//				System.out.print(s[j]+"");
//			}
		}
		for(int i = 0;i<strArr.length;i++){
			int j = i+1;
			//虽然给出的输入参数是在int范围内，但是相加之后可能会大于int的范围，为了避免溢出，故要使用Long型
			if(Long.valueOf(strArr[i][0])+Long.valueOf(strArr[i][1])>
			Long.valueOf(strArr[i][2])){
				
				System.out.println("Case #"+j+": true");
			}else{
				System.out.println("Case #"+j+": false");
			}
		}
	}
}
