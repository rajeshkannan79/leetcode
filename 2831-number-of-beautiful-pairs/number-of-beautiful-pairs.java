class Solution {
    public int countBeautifulPairs(int[] nums) {
        int c=0;
      for(int i=0;i<nums.length;i++)
      {
        for(int j=i+1;j<nums.length;j++)
        {   if(nums[i]<10&&nums[j]<10){
            if(prime(nums[i],nums[j]))
            {
                c++;
            }
        }
        else
        {
            String s=Integer.toString(nums[i]);
            int cc=s.charAt(0)-'0';
            if(prime(cc,nums[j]%10))
            {
                c++;
            }
        }
        }
      }
      return c; 
    }
    public boolean prime(int a,int b)
    {
        int f=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0&&b%i==0)
            {
                f=i;
            }
        }
        if(f==1)return true;
        return false;
    }
}