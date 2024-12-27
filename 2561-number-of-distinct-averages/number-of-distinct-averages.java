class Solution {
    public int distinctAverages(int[] nums) {
       HashSet<Double> al=new HashSet();
        Arrays.sort(nums);int left=0;int right=nums.length-1;
        while(left<right)
        {
          Double mid=(nums[left]+nums[right])/2.0;
        
        
            al.add(mid);
          
          left++;right--;
        }
        return al.size();
    }
}