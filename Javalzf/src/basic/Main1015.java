package basic;
/**
 * 输入样例：
14 60 80
10000001 64 90
10000002 90 60
10000011 85 80
10000003 85 80
10000004 80 85
10000005 82 77
10000006 83 76
10000007 90 78
10000008 75 79
10000009 59 90
10000010 88 45
10000012 80 100
10000013 90 99
10000014 66 60
输出样例：
12
10000013 90 99
10000012 80 100
10000003 85 80
10000011 85 80
10000004 80 85
10000007 90 78
10000006 83 76
10000005 82 77
10000002 90 60
10000014 66 60
10000008 75 79
10000001 64 90
//error
 */
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main1015 {
	static int n;
	static int l;
	static int h;
	class Student{
		int name;
		int d;
		int c;
		public int getName() {
			return name;
		}
		public void setName(int name) {
			this.name = name;
		}
		public int getD() {
			return d;
		}
		public void setD(int d) {
			this.d = d;
		}
		public int getC() {
			return c;
		}
		public void setC(int c) {
			this.c = c;
		}
		
	}
	public static boolean cmp(Student a,Student b){
		int suma = a.d + a.c;
		int sumb = b.d + b.c;
		if(suma!= sumb){
			return suma>sumb;
		}
		else{
			if(a.d!=b.d){
				return a.d>b.d;
			}
			else{
				return a.name <b.name;
			}
		}
	}
	static Vector<Student> v1 = new Vector<Student>();
	static Vector<Student> v2 = new Vector<Student>();
	static Vector<Student> v3 = new Vector<Student>();
	static Vector<Student> v4 = new Vector<Student>();
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		l = sc.nextInt();
		h = sc.nextInt();
		int count = 0;
		Student temp = null ;
		sc.nextLine();
		String[] str = new String[3];
		for(int i = 0;i<n;i++){
			String s = sc.nextLine();
//			temp.name = Integer.valueOf(s.split(" ")[0]);
//			temp.d = Integer.valueOf(s.split(" ")[1]);
//			temp.c = Integer.valueOf(s.split(" ")[2]);
			if(temp.d>=l&&temp.c>=l){
				count++;
				if(temp.d>=h&&temp.c>=h){
					v1.add(temp);
				}else if(temp.d>=h&&temp.c<h){  
	                v2.add(temp);  
	            }  
	            else if(temp.d<h&&temp.c<h&&temp.d>=temp.c){  
	                v3.add(temp);  
	            }  
	            else{  
	                v4.add(temp);  
	            } 
			}
		}
		System.out.println(count);
//		Collections.sort(v1);
	}
}
