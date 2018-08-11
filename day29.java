//https://www.hackerrank.com/challenges/30-bitwise-and/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i=0; i<N; i++){
            int n = scan.nextInt();
            int k = scan.nextInt();
            int max = 0;
            
            for(int a=0; a<=n-1; a++){
                for(int b=a+1; b<=n; b++){
                    //t("("+a+", "+b + "): " +(a&b) );
                    int current = a&b;
                    if (current < k && current > max){
                        //t("("+ a +", "+ b + ")");
                        //t("newMax = " + current);
                        //t("");
                        max = current;
                    }
                }
            }
            t("" + max);
        }
    }
    public static void t(String s){
        System.out.println(s);
    }
}
