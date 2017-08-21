package netease;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Approximately {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1;i<=n;i++){
			sum += F(i);
		}
		System.out.println(sum);
	}
	private static int F(int n){
		List<Integer> lists = new ArrayList<Integer>();
		for(int i = 1;i<=n;i++){
			if(n%i==0){
				lists.add(i);
			}
		}
		int Max=0;
		for(int i = lists.size()-1;i>=0;i--){
			if(lists.get(i)%2!=0){
				Max = lists.get(i);
				break;
			}
		}
		return Max;
	}

}
