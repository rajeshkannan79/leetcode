class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {int l=0;int arr[]=new int[nums.length];
        for(int i=0;i<queries.length;i++)
        {
           int a=queries[i][0];
           int b=queries[i][1];
           nums[b]=nums[b]+a;int sum=0;
           for(int j=0;j<nums.length;j++)
           {
            if(nums[j]%2==0)
            {
                sum+=nums[j];
            }
           }
            arr[l]=sum;
            l++;
           
        }
        return arr;
    }
}