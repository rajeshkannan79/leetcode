class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int max=-1;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            al.add(nums[i]);
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            int n=nums[i];
        int b=-n;
            if(al.contains(b))
            {
                max=-nums[i];
            }
        }
        return max;
    }
}