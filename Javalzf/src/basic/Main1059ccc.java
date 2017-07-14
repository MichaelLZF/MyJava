package basic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main1059ccc {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n1=Integer.parseInt(br.readLine());
        ArrayList<String> rank=new ArrayList<String>(n1);
        for(int i=0;i<n1;i++){
            rank.add(br.readLine());
        }
        int n2=Integer.parseInt(br.readLine());
        int[] flag=new int[n1];
        ArrayList<String> outputs=new ArrayList<String>(n2);
        for(int i=0;i<n2;i++){
            outputs.add("");
        }
        for(int i=0;i<n2;i++){
             String query=br.readLine();
             for(int j=0;j<n1;j++){
                 if(j==0&&query.equals(rank.get(j))&&flag[j]==0){
                     outputs.set(i, query+": Mystery Award");
                     flag[j]++;
                     break;
                 }else if(query.equals(rank.get(j))&&isSuShu(j+1)&&flag[j]==0){
                     outputs.set(i, query+": Minion");
                     flag[j]++;
                     break;
                 }else if(query.equals(rank.get(j))&&flag[j]>0){
                     outputs.set(i, query+": Checked");
                     flag[j]++;
                     break;
                 }else if(query.equals(rank.get(j))&&flag[j]==0){
                     outputs.set(i, query+": Chocolate");
                     flag[j]++;
                     break;
                 }
             }
             if(outputs.get(i).equals("")){
                 outputs.set(i, query+": Are you kidding?");
             }
             
        }
        for(int i=0;i<n2;i++){
            System.out.println(outputs.get(i));
        }
        
    }
    public static boolean isSuShu(int n){
        boolean flag = true;  
        if(n<2){
            return false;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0) 
                {
                    flag=false;
                    break;
                }
            }
        }
        return flag;
    }
}