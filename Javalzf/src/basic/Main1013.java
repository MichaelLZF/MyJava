package basic;

import java.util.Scanner;  
public class Main1013{  
  public static void main(String[] args){  
    Scanner sc = new Scanner(System.in);  
    int left = sc.nextInt();  
    int right = sc.nextInt();  
    int times = 0;  
    for(int i=1 ; ;i++){  
        if(isPrimeNum(i)){  
            times++;  
            if(times>=left&&times<=right){  
                if((times-left+1)%10==0||times-left==right-left){  
                    System.out.println(i);  
                }else{  
                    System.out.printf("%d ", i);  
                }  
            }  
            if(times == right){  
                break;  
            }  
        }  
    }  
       
       
  }  
  public static boolean isPrimeNum(int a){  
      if(a==1){  
          return false;  
      }  
      if(a%2==0&&a!=2){  
        return false;  
      }  
      for(int i=3;i<=Math.sqrt(a);i+=2){  
          if(a%i==0){  
              return false;  
          }   
      }  
    return true;  
  }  
}  