package netease;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author hasee ���һ��01��������������λ�õ��ַ����ǲ�һ����,���Ǿͽ����01��Ϊ����01��������:
 *         "1","10101","0101010"���ǽ���01����
 *         С��������һ��01��s,С�����ҳ�һ����������Ӵ�,��������Ӵ���һ������01����С����Ҫ����æ�������������Ӵ��ĳ����Ƕ��١�
 *         ��������: ��������ַ���s,s�ĳ���length(1 �� length �� 50),�ַ�����ֻ����'0'��'1'
 * 
 * 
 *         �������: ���һ������,��ʾ�������Ҫ����Ӵ����ȡ�
 * 
 *         ��������1: 111101111
 * 
 *         �������1: 3
 */
public class Main_3 {
	public static void main(String[] args){
		int count = 0;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		List<String> list = new ArrayList<String>();
		List<Integer> counts = new ArrayList<Integer>();
		for(int i = 0;i<str.length();i++){
			list.add(i, str.substring(i, i+1));
		}
		for(int i = 0;i<str.length()-1;i++){
			if(!list.get(i).equals(list.get(i+1))){
				count++;
				counts.add(counts.size(), count);
			}
			else{
				count = 0;
				counts.add(counts.size(), count);
			}
		}
		Collections.sort(counts);
		System.out.println(counts.get(counts.size()-1)+1);
	}
}
//import java.util.Scanner;
//
////���׽���
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//  
//        while (in.hasNext()) {
//            String str = in.next();
//            int maxLen = 1;
//            int len = 1;
//            for (int i = 1; i < str.length(); i++) {
//                if (str.charAt(i - 1) != str.charAt(i)) {
//                    len++;
//                    if (len > maxLen) {
//                        maxLen = len;
//                    }
//                } else {
//                    len = 1;
//                }
//            }
//            System.out.println(maxLen);
//        }
//    }
//}
