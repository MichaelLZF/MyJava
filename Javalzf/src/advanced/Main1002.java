package advanced;

import java.util.Iterator;  
import java.util.Scanner;  
import java.util.Stack;  
import java.util.TreeMap;  
  
public class Main1002 {  
      
    public static void main(String[] arg){  
       Scanner sc =new Scanner(System.in);    
       String[] line1 =sc.nextLine().split("\\s+");  
       String[] line2 =sc.nextLine().split("\\s+");  
         
       int k1 =Integer.parseInt(line1[0]);  
       int k2 =Integer.parseInt(line2[0]);  
         
       TreeMap<Integer,Double> map =new TreeMap<Integer,Double>();  
         
       for(int i=1;i<k1*2+1;i+=2){  
                int    key  =Integer.valueOf(line1[i]);  
                double value=Double.valueOf(line1[i+1]);  
                map.put(key, value);  
       }  
                      
       for(int i=1;i<k2*2+1;i+=2){  
           int    key   = Integer.valueOf(line2[i]);  
           double value = Double.valueOf(line2[i+1]);  
  
           if(map.containsKey(key)){  
               value += map.get(key);  
               if(Math.abs(value)<=0.00001){   
                   map.remove(key);       
               }  
               else{  
                value= Math.round(value*10)/10.0;  
                map.put(key, value);  
               }  
           }  
           else{  
               value= Math.round(value*10)/10.0;  
               map.put(key, value);  
           }  
       }  
       Iterator<Integer> it =map.keySet().iterator();  
       Stack<Integer> stack =new Stack<Integer>();  
       while(it.hasNext()){  
           stack.push(it.next());  
       }  
       System.out.print(map.size());     
       while(!stack.isEmpty()){  
           System.out.print(" "+stack.peek());  
           System.out.print(" "+map.get(stack.pop()));  
       }  
    }  
}
