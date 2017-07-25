package data.structure;

import java.util.Scanner;

public class Hanoi {
	
	static int i = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		while(sc.hasNextInt()){
			hanoi(sc.nextInt(),'a','b','c');
//			i = 0;
//		}
	}
	public static void move(int n,char from,char to){
		System.out.printf("第%d步：将%d号盘子%c--->%c\n",i++,n,from,to);
	}
	public static void hanoi(int n,char from, char depend,char to){
		if(n==1){
			move(1,from,to);
		}
		else{
			hanoi(n-1,from,to,depend);
			move(n,from,to);
			hanoi(n-1,depend,from,to);
		}
	}
}
