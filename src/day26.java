//https://www.hackerrank.com/challenges/30-nested-logic/problem
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        int month =scan.nextInt();
        int year = scan.nextInt();
        int d = scan.nextInt();
        int m = scan.nextInt();
        int y = scan.nextInt();
        int fee = 0;
        if (year>y){
            fee=10000;
        }
        else if (year==y)
        {
            if (month>m){
                fee = (month-m)*500;
            }
            else if(month==m){
                if(day>d){
                    fee = (day-d)*15;
                }
            }
        }
        out(fee);
    }   
        
    public void print(int x){
        System.out.println(x);
    }
    
    public static void out(int x){
        System.out.println(x);
    }
}
