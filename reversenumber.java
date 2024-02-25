class Solution {
    public static int reverse(int n) {
        boolean istrue = n < 0 ? true : false;
        if(istrue){
            n = n * -1; //makes the number positive if the given number is negative
        }
        int reverse = 0;
        int lastdigit = 0;
        while(n>=1){
            lastdigit = n % 10;// gives the last digit of the number 
            if(reverse > Integer.MAX_VALUE/10||reverse<Integer.MIN_VALUE/10){
                return 0;
            } 
            reverse = (reverse*10) + lastdigit;
            n = n / 10; // removes the last digit of the number  
        }
        return istrue == true? reverse*-1 : reverse;   

    }
}
