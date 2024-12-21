class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }int b=-1;int max=0;int min=Integer.MAX_VALUE;
        for(int k:hm.keySet())
        {
            if(k%2==0)
            {
                if(max<hm.get(k)||(max==hm.get(k)&&(k<min)))
                {
                   max=hm.get(k);
                   min=k;
                   b=k;
                    
                }
            }
        }return b;
    }
}