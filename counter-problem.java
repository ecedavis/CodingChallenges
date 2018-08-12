//You are given N counters, initially set to 0, and you have two possible operations on them:
//increase(X) − counter X is increased by 1,
//max counter − all counters are set to the maximum value of any counter
//A non-empty array A of M integers is given. This array represents consecutive operations:
//if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
//if A[K] = N + 1 then operation K is max counter.


class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        
        int max =0;
        int[] counter = new int[N];
        int at;
        
        //iterate through array A
        for (int i=0; i<A.length; i++){
                
            at=A[i];
            if (at>=1 )
            {
                if( at<=N)
                {
                    counter[at-1]++;
                    if (counter[at-1]>max){
                        max++;
                    }
                }
                else
                {
                    for(int j=0; j<N; j++){
                        counter[j]=max;
                    }
                }
            }
        }
        return counter;
    }
}
