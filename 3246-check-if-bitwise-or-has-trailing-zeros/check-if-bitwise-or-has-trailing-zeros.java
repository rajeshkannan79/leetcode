class Solution {
    public boolean hasTrailingZeros(int[] nums) {
      for(int i=0;i<nums.length;i++)
      {
        for(int j=i+1;j<nums.length;j++)
        {   
            int sum=nums[i]|nums[j];
            String b=Integer.toBinaryString(sum);
            if(b.charAt(b.length()-1)=='0')
            {
                return true;
            }
        }
      }  
      return false;
    }
}