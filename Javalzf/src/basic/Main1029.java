package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1029 {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        ArrayList<String> alist = new ArrayList<String>();  
        String s1 = sc.next();  
        String s2 = sc.next();  
  
        s1 = s1.toUpperCase();  
        s2 = s2.toUpperCase();  
  
        for (int i = 0; i < s2.length(); i++) {  
            if (s1.contains(s2.charAt(i) + "")) {  
                s1 = s1.replace(s2.charAt(i) + "", "");  
            }  
        }  
        for (int i = 0; i < s1.length(); i++) {  
            if (!alist.contains(s1.charAt(i) + "")) {  
                alist.add(s1.charAt(i) + "");  
            }  
        }  
        for (String k : alist) {  
            System.out.print(k);  
        }  
    }  
}  
