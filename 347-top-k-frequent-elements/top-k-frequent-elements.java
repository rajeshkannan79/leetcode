class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      Arrays.sort(nums);
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

         List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());

       
        list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

       
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = list.get(i).getKey();
        }

        return arr;
    }
}