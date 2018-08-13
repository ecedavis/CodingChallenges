// Solved by Mark Davis on 08/12/2018

//Given a character string, find smallest value between indices P and Q.
//for each corresponding pair of integers in arrays P and Q

/////////////////////////////////////////////////////////////////////
//Solution 1
//Worst case time complexity is O(N * M)
//Worst-case space complexity is O(N)



/////////////////////////////////////////////////////////////////////
//Solution 2
//Worst case time complexity is O(N * M)
//Worst-case space complexity is O(N)

/* class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        
        int N = P.length;
        int[] solution = new int[N];
        
        //run all N queries 
        for (int i=0; i<N; i++){
            //System.out.println();
            
            // check DNA sequence from item P to Q
            int start = P[i];
            int end = Q[i];
            
            int minImpact = 4;
            int currentImpact=0;
            for (int j=start; j<=end; j++){
                
                switch (S.charAt(j)) {
                    case 'A':  currentImpact=1;
                             break;
                    case 'C':  currentImpact=2;
                             break;
                    case 'G':  currentImpact=3;
                             break;
                    case 'T':  currentImpact=4;
                             break;
                }
                //System.out.println("at=" + S.charAt(j) + ", cur=" + currentImpact + ", min=" + minImpact);
                
                if (currentImpact <minImpact){
                    minImpact=currentImpact;
                }
                if (minImpact==1){
                    solution[i]=1;
                    continue;
                }
            }
            solution[i]=minImpact;
        }
        return solution;
    }
} */
