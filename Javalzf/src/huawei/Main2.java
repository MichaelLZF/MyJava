package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	String[] strs = str.split(", ");
    	int [] intarr = new int[strs.length];
    	for(int i = 0;i<strs.length;i++){
    		intarr[i] = Integer.valueOf(strs[i]);
    	}
    	printOrder(intarr,intarr.length,intarr);
    }
    public static void printOrder(int input[],int len,int output[]){
    	List<Integer> lists = new ArrayList<Integer>();
    	len = input.length;
    	for(int i = 0;i<len;i++){
    		lists.add(input[i]);
    	}
    	int count = 0;
    	int count2 = 0;
    	for(int i = 0;i<lists.size();){
    		for(int j = 1;j<lists.size();j++){
    			if(lists.get(i)<lists.get(j)){
    				lists.add(lists.get(i));
    				lists.remove(i);
    				count++;
    			}else{
    				if(i!=lists.size()-1){
    					System.out.print(count+", ");
    				}else{
    					System.out.println(count);
    				}
    				count++;
    				i++;
    			}
    		}
    		count2++;
    	}
    }
}
