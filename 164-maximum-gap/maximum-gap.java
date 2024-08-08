class Solution {
    public int maximumGap(int[] nums) {
       Arrays.sort(nums);
       if(nums.length<2) return 0;
       int max=0;
       for(int i=0;i<nums.length-1;i++)
       {
        int s=Math.abs(nums[i]-nums[i+1]);
        if(max<s)
        {
         max=s;
        }
       } 
       return max;
    }
}