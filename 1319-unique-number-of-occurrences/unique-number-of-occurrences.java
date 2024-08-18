class Solution {
    public boolean uniqueOccurrences(int[] arr) {
      Map<Integer,Integer> hm=new HashMap<>();
      for(int i=0;i<arr.length;i++)
      {
        if(hm.containsKey(arr[i]))
        {
            hm.put(arr[i],hm.get(arr[i])+1);        
      }  
      else
      {
        hm.put(arr[i],1);
     }
      }
        Set<Integer> frequencySet = new HashSet<>();
        for (int freq:hm.values()) {
            if (!frequencySet.add(freq)) {
                    return false;
                }
              }
              return true;
    }
}