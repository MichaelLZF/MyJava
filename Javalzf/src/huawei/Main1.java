package huawei;

import java.util.Scanner;
import java.util.Stack; 
public class Main1 { 
    public static void main(String[] args)  { 
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        check(str);
    } 
    public static void check(String str) {  
    	  
        Stack<Character> stack = new Stack<Character>();  
       
            stack = new Stack<Character>();  
  
            for (int i = 0; i < str.length(); i++) {  
                if (stack.isEmpty()) {  
                    stack.push(str.charAt(i));
                } else if ((stack.peek() == '{' && str.charAt(i) == '}')  
                        || (stack.peek() == '[' && str.charAt(i) == ']')  
                        || (stack.peek() == '(' && str.charAt(i) == ')')) {  
                    stack.pop();   
                } else if((str.charAt(i))!='{'&&(str.charAt(i))!='}'
                		&&(str.charAt(i))!='['&&(str.charAt(i))!=']'
                		&&(str.charAt(i))!='('&&(str.charAt(i))!=')'){ 
                	str.replace(str.charAt(i)+"", "");
                } else{
                	stack.push(str.charAt(i));
                }
            }  
            if (stack.isEmpty()) {  
                System.out.println("true");  
            } else { 
                System.out.println("false");  
            }  
    }  
}   
