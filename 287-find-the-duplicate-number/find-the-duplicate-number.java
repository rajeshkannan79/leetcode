class Solution {
    public int findDuplicate(int[] nums) {
      HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
           hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int j=0;
        for(int i:hm.keySet())
        {
            if(hm.get(i)>1)
            {
                j=i;
                break;
            }
        }
        return j;
    }
}