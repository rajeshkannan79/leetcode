class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int c=0;
       for(int i=0;i<words.length-1;i++)
       {
        for(int j=i+1;j<words.length;j++)
        {
            if(succ(words[i],words[j]))
            {
                c++;
            }
        }
       } 
       return c;
    }
    public boolean succ(String s,String s1)
    {
        if(s.length()>s1.length()) return false;
        String pre=s1.substring(0,s.length());
        String suf=s1.substring(s1.length()-s.length(),s1.length());
        if(s.equals(pre)&&s.equals(suf))
        {
            return true;
        }
        return false;
    }
}