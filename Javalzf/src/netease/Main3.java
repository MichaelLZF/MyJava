package netease;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		getList(n, k,1);
		
	}
//	private static Map<Integer,List<Integer>> getList(int n,int k){
//		Map<Integer,List<Integer>> maps = new HashMap<Integer,List<Integer>>();
//		List<Integer> lists = new ArrayList<Integer>();
//		for(int i = 1;i<=k;i++){
//			for(int j = 1;j<=n;j++){
//				lists.add(i);
//			}
//		}
//		int m = 0;
//		maps.put(m++, lists);
//		
//	}
	private static void getList(int n,int k,int i){
		int count = 0;
		List<Integer> lists = new ArrayList<Integer>();
		lists.add(i);
		for(int j = 1;j<=k;j++){
			lists.add(j);
			if(lists.get(i)<=lists.get(j) || lists.get(i)%lists.get(j)!=0){
				count++;
				break;
			}else{
				count--;
				lists.remove(lists.get(j));
			}
		}
		if(lists.get(1)==lists.get(lists.size()-1)){
			System.out.println(count%1000000007);
		}
		if(i<n){
			getList(n,k,i++);
		}
	}
}
