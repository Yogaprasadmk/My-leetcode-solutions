class Solution {
    public boolean isSameAfterReversals(int num) 
    {
        int n=num,ans=0;
        while(n!=0)
        {
            int l=n%10;
            ans=(ans*10)+l;
            n=n/10;
        } 
        String s1=Integer.toString(num);
        String s2=Integer.toString(ans);
        if(s1.length()==s2.length())  return true;
        return false;
    }
}
