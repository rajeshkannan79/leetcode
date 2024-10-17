class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            String s="";
            int max=0;
            if(nums[i]>9)
            {
                int b=nums[i];
              while(nums[i]!=0)
              {
                if(max<nums[i]%10)
                {
                    max=nums[i]%10;
                }
                nums[i]/=10;
              }
              int v=Integer.toString(b).length();
              for(int j=0;j<v;j++)
              {
                s=s+max;
              }
              sum=sum+Integer.parseInt(s);
            }
            else
            {
                sum=sum+nums[i];
            }
        }
        return sum;
    }
}