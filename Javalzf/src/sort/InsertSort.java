package sort;

import java.util.Scanner;

public class InsertSort {
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split("\\s+");
		int [] arr = new int[s.length];
		for(int i = 0;i<arr.length;i++){
			arr[i] = Integer.valueOf(s[i]);
		}
		insertSort(arr);
	}
	public static void insertSort(int[] numbers){
		int size = numbers.length;
		int temp = 0;
		int j = 0;
		for(int i = 0;i<size;i++){
			temp = numbers[i];
			for(j = i;j>0&& temp<numbers[j-1];j--){
				numbers[j] = numbers[j-1];
			}
			numbers[j] = temp;
		}
	}
}
