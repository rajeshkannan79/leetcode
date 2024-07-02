class Solution {

     public boolean isprime(int num)
{
    if(num<=1)
       return false;
    if(num==2)
       return true;
    if(num%2==0)
      return false;
    for(int i=3;i<num/2;i+=2)
    {   if(num%i==0)
          return false;
    }
    return true;
}





    public int maximumPrimeDifference(int[] nums) {
        int min=-1;
        int max=-1;
        for(int i=0;i<nums.length;i++)
        {  
        if(isprime(nums[i]))
         {min=i;
        break;
        }}
        for(int i=nums.length-1;i>=0;i--)
        {
            if(isprime(nums[i]))
            {
                max=i;
                break;
            }
        }

      if(min==-1||max==-1)
         return 0;
      else
        return max-min;

    }
}