class Solution {
    public int[] searchRange(int[] nums, int target) { 
        int arr[]=new int[2];
        int x=-1;
        int y=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                x=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]==target)
            {
                y=i;
                break;
            }
        }
        arr[0]=x;
        arr[1]=y;
        return arr;
    }
}