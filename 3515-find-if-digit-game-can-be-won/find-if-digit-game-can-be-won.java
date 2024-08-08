class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;int um=0;
        for(int i=0;i<nums.length;i++)
        {  
            if(nums[i]>9)
            {
                sum=sum+nums[i];
            }
            else
            {
                um=um+nums[i];
            }
        }
        if(sum==um)  return false;
        return true;
    }
}