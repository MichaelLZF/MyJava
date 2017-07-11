package basic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 让我们定义 dn 为：dn = pn+1 - pn，其中 pi 是第i个素数。显然有 d1=1 且对于n>1有 dn
 * 是偶数。“素数对猜想”认为“存在无穷多对相邻且差为2的素数”。
 * 
 * 现给定任意正整数N (< 10^5)，请计算不超过N的满足猜想的素数对的个数。
 * 
 * 输入格式：每个测试输入包含1个测试用例，给出正整数N。
 * 
 * 输出格式：每个测试用例的输出占一行，不超过N的满足猜想的素数对的个数。
 * 
 * 输入样例： 20 输出样例： 4
 */
public class Main1007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		numOfPriPairs(primeArr(sc.nextInt()));

	}
	public static boolean isPrime(int num){
		boolean flag = true;
		if(num<2){
			return flag = false;
		}else{
			for(int i = 2;i<=Math.sqrt(num);i++){
				if(num%i==0){
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
	public static ArrayList<Integer> primeArr(int num2){
		ArrayList<Integer> primeArrList = new ArrayList<>();
		for(int i = 0;i<=num2;i++){
			if(isPrime(i)){
				primeArrList.add(i);
			}
		}
		return primeArrList;
	}
	public static int numOfPriPairs(ArrayList<Integer> ArrList){
		int count = 0;
		for(int i = 0;i<ArrList.size()-1;i++){
			if(ArrList.get(i+1)-ArrList.get(i)==2){
				count++;
			}
		}
		System.out.println(count);
		return count;
	}
	
}
