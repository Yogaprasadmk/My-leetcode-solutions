class Solution {
    public int differenceOfSums(int n, int m) {
            int num1 = 0;// initializing num1
            int num2 = 0;// initializing num2

            for(int i=0;i<=n;i++){
                // number is not divisible                
                if(i % m == 0){
                    num1 += i;
                }
                // number is divisble 
                else{
                    num2 += i;
                }
                
            }
            
        return  num2 - num1;     
    }
}
