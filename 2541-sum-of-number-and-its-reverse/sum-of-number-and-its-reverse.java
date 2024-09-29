class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0)return true;
       for(int i=1;i<num;i++)
       {
        if(rev(i,num))
        {
            return true;
        }
       } 
       return false;
    }
    public boolean rev(int n,int num)
    {   int sum=0;
    int g=n;
        while(n!=0)
        {
            sum=sum*10+n%10;
            n/=10;
        }
        if(g+sum==num)
        {
            return true;
        }
        return false;
    }
}