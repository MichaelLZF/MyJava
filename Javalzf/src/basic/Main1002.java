package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		System.out.println(out(str));
	}

	public static String out(String string) {

		List<String> list = new ArrayList<String>();
		list.add("ling");
		list.add("yi");
		list.add("er");
		list.add("san");
		list.add("si");
		list.add("wu");
		list.add("liu");
		list.add("qi");
		list.add("ba");
		list.add("jiu");

		int index = 0;
		int sum = 0;
		String str = "";
		StringBuilder temp = new StringBuilder();
		while (index++ < string.length()) {
			sum += Integer.parseInt(string.substring(index - 1, index));//��������Խ�磬������ǰ��index++,Ȼ��ʹ�õ�ʱ�����һ���Ͳ���Ҫindex+1�ˣ������Ͳ���Խ���ˣ�
		}
		str = String.valueOf(sum);
		index = 0;

		while (index++ < str.length()) {
			temp.append(list.get(Integer.parseInt(str.substring(index - 1, index))));
			temp.append(" ");
		}
		return temp.toString().trim();
	}

}
