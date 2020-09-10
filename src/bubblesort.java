import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        for (int i=0; i<n; i++){
            x[i]=scan.nextInt();
        }
        boolean flag = true;
        int swaps = 0;
        while(flag){
            flag=false;
            for(int i=0; i<x.length-1; i++){
                if(x[i]>x[i+1]){
                    int tmp = x[i];
                    x[i]=x[i+1];
                    x[i+1] = tmp;
                    flag = true;
                    swaps++;
                }
            }
        }
        System.out.println("Array is sorted in "+swaps+" swaps.");
        System.out.println("First Element: "+x[0]);
        System.out.println("Last Element: "+x[x.length-1]);
    }
}
