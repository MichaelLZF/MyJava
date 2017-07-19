package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main1031 {

	public static void main(String[] args) {
		int[] Z = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
//		String[] M = {"1","0","X","9","8","7","6","5","4","3","2"};
//		String[] Z1 = {"0","1","2","3","4","5","6","7","8","9","10"};
		Map<String,String> maps = new HashMap<String,String>();
		maps.put("0", "1");
		maps.put("1", "0");
		maps.put("2", "X");
		maps.put("3", "9");
		maps.put("4", "8");
		maps.put("5", "7");
		maps.put("6", "6");
		maps.put("7", "5");
		maps.put("8", "4");
		maps.put("9", "3");
		maps.put("10", "2");
		int z = 0;
		for(int i = 0;i<Z.length;i++){
			z += Z[i];
		}
		Scanner sc = new Scanner(System.in);
		List<String> lists = new ArrayList<String>();
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0;i<n;i++){
			String s = sc.nextLine();
			lists.add(s);
		}
		int sum = 0;
		for(int i = 0;i<lists.size();i++){
			for(int j = 0;j<lists.get(i).length()-1;j++){
				sum += Integer.valueOf(lists.get(i).substring(j,j+1)) * Z[j];
			}
		}
		String mod = ""+ sum%11;
		String M = maps.get(mod);
		
		for(int i = 0;i<lists.size();i++){
			for(int j = 0;j<lists.get(i).length()-1;j++){
				if(lists.get(i).contains("X")){
					System.out.println(lists.get(i));
				}else if(M.equals(lists.get(i).substring(lists.get(i).length()-1))){
					
				}
			}
		}
	}

}
