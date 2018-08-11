//https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem
import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);  // Reading from System.in
        int finalCase = scan.nextInt()-1;
        
        for (int i=0; i<=finalCase; i++){
            int num= scan.nextInt();
            int div = 1;
            String out = "Prime";
            if (num>1){
                while (div<=(num/2)){
                
                    if (num%div != 0){//not divisible
                        if (div==2){
                            div++;
                        }else{
                            div=div+2;
                        }
                    }
                    else{
                        if (div==1){
                            div++;
                        }else{
                            out="Not prime";
                            break;
                        }
                    }
                }
            }
            else{
                out="Not prime";
            }
            System.out.println(out);
        }
    }
}
