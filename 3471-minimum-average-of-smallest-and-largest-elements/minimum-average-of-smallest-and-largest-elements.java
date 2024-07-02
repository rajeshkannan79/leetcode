class Solution {
    public double minimumAverage(int[] nums) {
        double m=0;
        double m1=Double.MAX_VALUE;
        Arrays.sort(nums);
       for(int i=0;i<nums.length/2;i++)
       {
        m=(nums[i]+nums[nums.length-1-i])/2.0;
       
       m1=Math.min(m1,m);
    }
    return m1;
    }
}