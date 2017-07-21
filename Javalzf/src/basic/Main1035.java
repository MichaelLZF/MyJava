package basic;

import java.util.Scanner;
//插入排序，归并排序是主要看的点
public class Main1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] s1 = sc.nextLine().split("\\s+");
		String[] s2 = sc.nextLine().split("\\s+");
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = Integer.valueOf(s1[i]);
			arr2[i] = Integer.valueOf(s2[i]);
		}
		
		insertSort(arr1,arr2);

	}

	public static void insertSort(int[] arr1, int[] arr2) {
		int l = arr1.length;
		int temp = 0;
		
		for(int i = 1;i<l;i++){
			if(arr2[i]<arr2[i-1]){
				temp = i;
				break;
			}
		}
		int flag = 0; 
	    for(int i = temp; i < l; ++i){
	        if(arr2[i] == arr1[i]){
	            flag++;
	        }
	    }
	    if(flag==(l-temp)){
	    	System.out.println("Insert Sort");
	    }else{
	    	System.out.println("Merge Sort");
	    }
		for(int i = 0;i<l-1;i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println(arr2[l-1]);

	}

}
