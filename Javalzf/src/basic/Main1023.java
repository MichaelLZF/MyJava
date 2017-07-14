package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main1023 {
	public static List<Integer> list(String str){
		String[] strs = str.split("\\s+");
		List<Integer> lists = new ArrayList<Integer>();
		for(int i = 0;i<strs.length;i++){
			if(Integer.valueOf(strs[i])!=0){
				for(int j = 0;j<Integer.valueOf(strs[i]);j++){
					lists.add(i);
				}
			}
		}
		return lists;
	}
	public static int[] intArr(List<Integer> lists){
		int[] intarr = new int[lists.size()];
		for(int i = 0;i<lists.size();i++){
			intarr[i] = lists.get(i);
		}
		return intarr;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strs = str.split("\\s+");
		List<Integer> lists = list(str);
		int[] intarr = intArr(lists);
		Arrays.sort(intarr);
		if(!lists.contains(0)){
			Collections.sort(lists);
			for(int i = 0;i<lists.size();i++){
				System.out.print(lists.get(i));
			}
		}else{
			for(int i = 0;i<intarr.length;i++){
				if(intarr[i]!=0){
					int tmp = 0;
					tmp = intarr[i];
					intarr[i] = intarr[0];
					intarr[0] = tmp;
					break;
				}
			}
			for(int i = 0;i<intarr.length;i++){
				System.out.print(intarr[i]);
			}
		}
	}
}
