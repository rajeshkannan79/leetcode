class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        Arrays.sort(divisors);int cur=divisors[0];int max=0;
        for(int i=0;i<divisors.length;i++)
        {int c=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]%divisors[i]==0)
                {
                   c++;
                }
            }
            if(max<c)
            {
                max=c;
                cur=divisors[i];
            }
        }return cur;
    }
}