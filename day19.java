//Write your code here

class Calculator implements AdvancedArithmetic{
    public void Calculator(){
        
    }
    public int divisorSum(int n){
        int div = 1;
        int sum=0;
        while(div<=n){
            if (n%div==0){
                sum= sum+div;
            }
            
                div++;
        }
        return sum;
    }
}
