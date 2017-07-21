package basic;

import java.util.Scanner;

public class Main1036 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char c = sc.next().charAt(0);
		sc.close();
		int col = (int)(n/2.0+0.5);
		for(int i = 0;i<col;i++){
			for(int j= 0;j<n;j++){
				if(i==0||j==0||j==n-1||i==col-1){
					System.out.print(c);
				}else{
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}
