package basic;

import java.util.Collections;
import java.util.Scanner;

public class Main1026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c1 = sc.nextInt();
		int c2 = sc.nextInt();
		double d = (c2-c1)/100.0;
		int time = (int) Math.round( (c2 - c1) / 100.0);
		int hour = time / 3600;
		int minute = time / 60 % 60;
		int second = time % 60;

		if (hour < 10)
			System.out.print("0" + hour + ":");
		else
			System.out.print(hour + ":");
		if (minute < 10)
			System.out.print("0" + minute + ":");
		else
			System.out.print(minute + ":");
		if (second < 10)
			System.out.print("0" + second);
		else
			System.out.print(second);
	}

}
