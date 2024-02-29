class Solution 
{
    public boolean isPalindrome(int x) 
    {
        int dup = x;
        int lastdigit = 0;
        int reverse = 0;
        while(x>0)
        {
            lastdigit = x % 10;
            reverse = (reverse * 10)+ lastdigit;      
            x = x / 10;
        }
        if(dup == reverse){
                return true;
        }
        else{
                return false;
        }
    }
}
