package basic;

import java.util.Scanner;

public class Main1051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r1 = sc.nextFloat();
		double p1 = sc.nextFloat();
		double r2 = sc.nextFloat();
		double p2 = sc.nextFloat();
		double r = 0.00;
		double p = 0.00;
		r = r1*Math.cos(p1)*r2*Math.cos(p2)-r1*Math.sin(p1)*r2*Math.sin(p2);
		p = r1*Math.cos(p1)*r2*Math.sin(p2)+r1*Math.sin(p1)*r2*Math.cos(p2);
		
		if(r!=0&&p>0){
			System.out.printf("%.2f+%.2fi",r,p);
		}else if(r!=0&&p==0){
			System.out.printf("%.2f",r);
		}else if(r==0&&p==0){
			System.out.println(0);
		}else if(r==0&&p!=0){
			System.out.printf("%.2fi", p);
		}else if(r!=0&&p<0){
			System.out.printf("%.2f%.2fi", r,p);
		}
		
	}

}
