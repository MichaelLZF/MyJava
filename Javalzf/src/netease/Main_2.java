package netease;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		HashSet<Integer> hashset = new HashSet<>();
		for(int i = 0;i<arr.length-1;i++){
			hashset.add(arr[i+1]-arr[i]);
		}
		if(hashset.size()==1){
			System.out.println("Possible");
		}
		else{
			System.out.println("Impossible");
		}
	}

}
