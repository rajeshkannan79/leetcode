class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        
        for(int i:hm.keySet())
        {
            if(hm.get(i)==1)
            {
                sum+=i;
            }
        }
        return sum;
    }
}