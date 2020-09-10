public class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        String b = Integer.toBinaryString(N);
        int max = 0;
        
        boolean countFlag = false;
        int count = 0;
        char at;
        
        for (int i = 0; i < b.length(); i++) {
            at = b.charAt(i);
            //System.out.println("at="+at);
            
            //start counting
            if (countFlag == false && at == '1'){
                countFlag = true;
            }
            // keep counting
            else
            {
                //count zeros
                if (at == '0'){
                    count++;
                }
                //restart count, update max
                else{
                    
                    //update max
                    if (count > max){
                        max = count;
                    }
                    
                    //reset 
                    count = 0;
                    //System.out.println();
                    
                }
            }
        }
        return max;
    }
}
