//https://www.hackerrank.com/challenges/s10-weighted-mean/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = readArr(scan, n);
        int[] w = readArr(scan, n);
        
        System.out.printf("%.1f\n", weightedMean(x,w));
        
    }
    public static int[] readArr(Scanner scan, int n){
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        return arr;
    }
    public static float weightedMean(int[]x,int[]w){
        float weightedMean = 0;
        int sum = 0;
        for (int i=0;i<x.length; i++){
            sum+= x[i]*w[i];
        }
        weightedMean = (float)sum/(float)sum(w);
        
        return weightedMean;
    }
    public static int sum(int[]x){
        return Arrays.stream(x).sum();
    }
    public static void out(float s){
        out(""+s);
    }
    public static void out(int s){
        out(""+s);
    }
    public static void out(String s){
        System.out.println(s);
    }
}
