package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 设计函数求一元多项式的导数。（注：xn（n为整数）的一阶导数为n*xn-1。）
 * 
 * 输入格式：以指数递降方式输入多项式非零项系数和指数（绝对值均为不超过1000的整数）。数字间以空格分隔。
 * 
 * 输出格式：以与输入相同的格式输出导数多项式非零项的系数和指数。数字间以空格分隔，但结尾不能有多余空格。注意“零多项式”的指数和系数都是0，但是表示为“0
 * 0”。
 * 
 * 输入样例： 3 4 -5 2 6 1 -2 0 输出样例： 12 3 -10 1 6 0
 * 
 */
public class Main1010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String [] newstr = str.split("\\s+");
		ArrayList<Integer> alist = new ArrayList<Integer>();
		for(int i = 0;i<newstr.length;i+=2){
			int j = i+1;
			if(Integer.valueOf(newstr[i])==0){
				alist.add(0);
				alist.add(0);
			}
			if(Integer.valueOf(newstr[i])!=0 && 
					Integer.valueOf(newstr[j])==0){
				
			}
			if(Integer.valueOf(newstr[i])!=0 &&
					Integer.valueOf(newstr[j])!=0){
				alist.add(Integer.valueOf(newstr[i])
						*Integer.valueOf(newstr[j]));
				alist.add(Integer.valueOf(newstr[j])-1);
			}
		}
		if(alist.isEmpty()){
			System.out.println("0 0");
		}else{
			for(int i = 0;i<alist.size();i++){
				System.out.print(alist.get(i));
				if(i!=alist.size()-1){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
//		List<Integer> lists = new ArrayList<>();
//		while (sc.hasNext()) {
//			lists.add(sc.nextInt());
//		}
//		for (int i = 0; i < lists.size(); i++) {
//			System.out.println(lists.get(i));
//		}
	}
}
