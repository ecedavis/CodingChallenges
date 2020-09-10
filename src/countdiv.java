//Solved by Mark Davis on 8/12/2018
//Problem: Compute number of integers divisible by k in range [a..b].

// Worst case time complexity = O(1)
class Solution {
    public int solution(int A, int B, int K) {
        
        int count=0;
        
        //First, lets avoid O(N) time complexity
        if(K==1){
            return B-A+1;
        }
        
        //Second, lets avoid O(N/2) time complexity
        if(K==2){
            if (A%2!=0 && B%2!=0){
                return (B-A)/2;
            }
            return (B-A)/2 +1;
        }
        
        //Time complexity could be further reduced
        //similar to the above two calculations, 
        //but for now, we simply iterate multiples of K for K>3
        for (int i=0; i<=B/K; i++){
            if (K*i>=A && K*i<=B){
                count++;
            }
        }
        return count;
    }
}
