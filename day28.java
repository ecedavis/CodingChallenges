//
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String name;
        String email;
        String list[]= new String[n];
        int at=0;
        for(int i=0;i<n;i++){
            name=scan.next();
            email = scan.next();
            if (email.contains("@gmail.com")){
                list[at]=name;
                at++;
            }
        }
        boolean flag = true;
        while(flag){
            flag=false;
            for (int j=0; j<list.length-1; j++){
                if (list[j]!=null && list[j+1]!= null){
                    if (list[j].compareTo(list[j+1])>0){
                        String tmp=list[j];
                        list[j]=list[j+1];
                        list[j+1]=tmp;
                        //t("after swap: "+list[j]+" "+list[j+1]);
                        flag = true;     
                    }
                }
            }
        }
        
        for (int i=0; i<list.length; i++){
            if(list[i]!=null){
                t(list[i]);
            }
        }
    }
    public static void t(String x){
        System.out.println(x);
    }
}
