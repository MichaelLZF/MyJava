package netease;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i = 0;i<n;i++){
			x[i] = sc.nextInt();
		}
		for(int i = 0;i<n;i++){
			y[i] = sc.nextInt();
		}
		List<Long> lists = new ArrayList<Long>();
		long dis = 0;
//		for(int i = 0;i<n;i++){
//			dis = x[i]*x[i]+y[i]*y[i]-
//		}
	}

}
class Vertex{
	long dis = 0;
	int x = 0;
	int y = 0;
	public Vertex(long dis,int x,int y){
		this.dis = dis;
		this.x = x;
		this.y = y;
	}
}
