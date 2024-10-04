class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
      
        while(k--!=0)
        {
            int max=nums[0];
            int idx=0;
        for(int i=0;i<nums.length;i++)
        {
          
          if(max>nums[i])
          {
            max=nums[i];
            idx=i;
          }
        }
        nums[idx]*=multiplier;
        
    }
    return nums;
    }
}