class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<word1.length();i++)
        {
            hm.put(word1.charAt(i),hm.getOrDefault(word1.charAt(i),0)+1);
               hm .put(word2.charAt(i),hm .getOrDefault(word2.charAt(i),0)-1);
        }
         
       
      
           
       
      for (int count : hm.values()) {
            if (Math.abs(count) > 3||count<-3) {
                return false;
            }
        }
            
        return true;

    }
}