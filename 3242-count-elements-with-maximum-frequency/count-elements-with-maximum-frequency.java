class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=0;
        for(int freq:map.values())
        {
            if(freq>max)
            {
                max=freq;

            }
        }
        int count=0;
        for(int freq:map.values())
        {
            if(freq==max)
              count+=freq;
        }

         
             
        
        return count;

        
    }
}