class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int arr[]=new int[2];
        int c=0;
       for(int i=0;i<nums.length;i++)
       {
        for(int j=0;j<nums.length;j++)
        {   int s=Math.abs(i-j);
            int t=Math.abs(nums[i]-nums[j]);
            if( s>=indexDifference && t>=valueDifference)
            {
              arr[0]=i;
              arr[1]=j;
              c++;
            }
        }
       } 
       if(c==0)
         return new int[]{-1,-1};
        return arr;

    }
}