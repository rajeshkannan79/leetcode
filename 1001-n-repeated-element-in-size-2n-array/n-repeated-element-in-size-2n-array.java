class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        int max=0;
        int res=0;
      
        for(Map.Entry<Integer,Integer> j:hm.entrySet())
        {
        if(max<j.getValue()){
           max=j.getValue();
           res=j.getKey();;

        }
        }
        return res;
      
    }
}