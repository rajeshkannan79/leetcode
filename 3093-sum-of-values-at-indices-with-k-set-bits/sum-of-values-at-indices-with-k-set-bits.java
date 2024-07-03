class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int s=0;
        
      for(int i=0;i<nums.size();i++)
      {
     if(Integer.bitCount(i)==k)
       s=s+nums.get(i);
      } 
      return s; 
    }
}