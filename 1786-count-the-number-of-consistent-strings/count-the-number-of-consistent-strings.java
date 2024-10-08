class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;
        for(String s:words)
        {
            if(sub(s,allowed))
            {
                c++;
            }
        }
        return c;
    }
    public boolean sub(String s,String allowed)
    {
      for(char ch:s.toCharArray())
      {
        if(allowed.indexOf(ch)==-1)
        {
            return false;
        }
      }
      return true;
    }
}