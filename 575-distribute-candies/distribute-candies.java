class Solution {
    public int distributeCandies(int[] candyType) {
      Set<Integer> s=new HashSet<>();
      for(int i=0;i<candyType.length;i++)
      {
        s.add(candyType[i]);
      }
      if((candyType.length/2)<=s.size())
        return candyType.length/2;
      return s.size();
    }
}