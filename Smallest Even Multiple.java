class Solution {
    public int smallestEvenMultiple(int n) {
        int num = n;
       if(n%2==0 && n%num==0){ 
           return n;
       }
       else{
           return n*2;
       }

    }
}
