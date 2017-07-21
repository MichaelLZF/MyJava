package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Main1039 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		char[] sales = sc.nextLine().toCharArray();
		char[] bought = sc.nextLine().toCharArray();
		sc.close();
		Arrays.sort(sales);
		Arrays.sort(bought);
		
		int debt = 0;
		for(int i = 0,j = 0;j<bought.length;){
			if(i!=sales.length){
				if(sales[i]==bought[j]){
					i++;
					j++;
				}else if(sales[i]>bought[j]){
					j++;
					debt++;
				}else{
					i++;
					if(i==sales.length){
						debt += sales.length-i;
					}
				}
			}else{
				debt+=bought.length-j;
				break;
			}
		}
		if(debt ==0){
			System.out.println("Yes "+(sales.length - bought.length));
		}else{
			System.out.println("No "+debt);
		}
	}
}
