class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int c=0;
        int ans=0;
     for(int i=0;i<nums.length;i++)
     {
        ans=ans+nums[i];
         if(ans==0)
         c++;
     }   
     return c;
    }
}