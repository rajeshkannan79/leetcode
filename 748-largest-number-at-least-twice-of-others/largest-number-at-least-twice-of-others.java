class Solution {
    public int dominantIndex(int[] nums) {
   int max=0;
   for(int i=0;i<nums.length;i++)
   {
    if(max<nums[i])
       max=nums[i];

   }
  int count=0;
  int k=0;
   for(int i=0;i<nums.length;i++)
   {
    if(nums[i]!=max && nums[i]*2<=max)
    {
     count++;
   }
    else
    {
        k=i;
    }
    }
    if(count==nums.length-1)
      return k;
    return -1;
}
}