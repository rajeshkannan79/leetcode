class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> al=new ArrayList<>();
      Set<List<Integer>> s=new HashSet<>();
      Arrays.sort(nums);
      int s1=0;
      int t=0;
      for(int i=0;i<nums.length;i++)
      {
       int j=i+1;
        int k=nums.length-1;
        while(j<k)
        {   s1=nums[i]+nums[j]+nums[k];
            if(s1==t)
            {
                s.add(Arrays.asList(nums[i],nums[j],nums[k]));
                j++;
                k--;
            }
            else
               if(s1<t)
                 j++;
                else
                  k--;
        }
      } 
      al.addAll(s);
      return al;
    }
}