package basic;

import java.util.Scanner;

public class Main1006ccc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        changeApproach(s);
    }
    public static void changeApproach(String s){
        int n = Integer.parseInt(s);
        int a = 0, b = 0 ,c = 0;
        StringBuilder sb = new StringBuilder();
        if ( n < 1000) {
             a = n / 100;
             b = n % 100 / 10;
             c = n % 100 % 10;
        }
        while (a > 0) {

            sb.append("B");
            a--;
        }
        while (b > 0) {
            sb.append("S");
            b--;

        }
        int i = 0;
        while (c > 0) {
            sb.append( ++i);
            c--;
        }
        System.out.println(sb.toString());
    }
}