class Solution {
    public int distinctAverages(int[] nums) {
        ArrayList<Double> al=new ArrayList();
        Arrays.sort(nums);int left=0;int right=nums.length-1;
        while(left<right)
        {
          Double mid=(nums[left]+nums[right])/2.0;
          if(!al.contains(mid))
          {System.out.print(mid+" ");
            al.add(mid);
          }
          left++;right--;
        }
        return al.size();
    }
}