//rotate array elements K times to the right, 
//no algorithm performance requirement

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        
        int len = A.length;
        int[] B = new int[len];
        for (int i=0; i<len; i++){
            B[(i+K)%len]=A[i];
        }
        return B;
    }
}
