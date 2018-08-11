//https://www.hackerrank.com/challenges/30-testing/problem
import java.io.*;
import java.util.*;

public class Solution {
/*The first line of input contains , the number of lectures.

The information for each lecture spans two lines. The first line has two space-separated integers,  (the number of students in the class) and  (the cancelation threshold). The second line contains  space-separated integers describing the array of students' arrival times (). 

Note: Non-positive arrival times () indicate the student arrived early or on time; positive arrival times () indicate the student arrived  minutes late. If a student arrives exactly on time , the student is considered to have entered before the class started.*/
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        out("5");
        out("4 3");
        out("-1 0 4 2");
        out("5 2");
        out("0 -1 2 1 8");
        out("6 4");
        out("0 -1 -5 10 10 18");
        out("15 10");
        out("0 -1 -5 0 0 -8 -9 -5 -2 -3 -4 5 6");
        out("8 3");
        out("0 -1 2 5 5 5 5 5");
        
        
        
    }
    public static void out(String x){
        System.out.println(x);
    }
}
