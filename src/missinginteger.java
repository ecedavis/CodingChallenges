//Solved by Mark Davis on 08/11/2018

// worst case time complexity: O(N) to O(N * log(N))
// worst-case space complexity is O(N)
public class Solution {
    public static void main(String args[])
    {
        int[] arr = {1, 3, 6, 4, 1, 2};
        //System.out.println("length = " + arr.length);
        
        //System.out.println("output = " + solution(arr));
    }
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        int max = N+1;
        int[] keeps = new int[N];
        
        
        //trivial solution 
        int min = 1;
        
        //nontrivial solution
        if (N> 0)
        {
            int at;
            //iterate through N integers
            for (int i=0; i<N; i++)
            {
                at = A[i];
                
                //System.out.println("at=" + at + ", min=" + min + ", max=" + max);
                //if within bounds, add to array
                if(at<min || at>=max)
                {
                    max--;
                    continue;
                }
                else 
                {
                    keeps[at-1] = at;
                }
                
            }
            
            for (int i=0; i<N; i++)
            {
                //System.out.println("keeps=" + keeps[i] + ", i=" + i);
                if (keeps[i]!=i+1)
                {
                    return i+1;
                }
            }
            return max;
        }
        return min;
    }
}
