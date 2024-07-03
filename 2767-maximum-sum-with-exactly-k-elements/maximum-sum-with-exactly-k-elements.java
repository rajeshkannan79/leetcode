class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums[nums.length-1];
        int m=0;
        while(k>0)
        {
         m+=n;
         n++;
         k--;
        }
        return m;
    }
}