class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int arr[]=new int[2];
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
        int u=0;
        for(int i:hm.keySet())
        {
            if(hm.get(i)>=2)
            {
                arr[u++]=i;
            }
        }
        return arr;
    }
}