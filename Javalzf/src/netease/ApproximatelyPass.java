package netease;

import java.util.Scanner;


public class ApproximatelyPass{
     
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long num=s.nextInt();
        long sum=0;
        for(long i=num;i>0;i=i/2){
            long temp=(i+1)/2;
            sum+=temp*temp;
        }
        System.out.println(sum);
    }
}
