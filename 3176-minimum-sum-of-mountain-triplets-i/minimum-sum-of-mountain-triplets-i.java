class Solution {
    public int minimumSum(int[] nums) {
     int max=-1;
     int min=Integer.MAX_VALUE;
     for(int i=0;i<nums.length-2;i++)
     {
        int sum=0;
        for(int j=i+1;j<nums.length-1;j++)
        {
             if(nums[i]<nums[j]){
            for(int k=j+1;k<nums.length;k++)
            {
               if(nums[k]<nums[j])
               {
                sum=nums[i]+nums[k]+nums[j];
                min=Math.min(min,sum);
                max=min;
               }
            }
        }
        }
     }  
     return max; 
    }
}