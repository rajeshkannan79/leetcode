class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s="";
       if(word1.length()==word2.length())
       {
        for(int i=0;i<word1.length();i++)
        {
            s=s+word1.charAt(i);
            s=s+word2.charAt(i);
        }
       } 
       else if(word1.length()>word2.length())
       {
        for(int i=0;i<word2.length();i++)
        {
          s=s+word1.charAt(i);
          s=s+word2.charAt(i);

        }
        for(int i=word2.length();i<word1.length();i++)
        {
            s=s+word1.charAt(i);
        }
       }
       else
       {
        for(int i=0;i<word1.length();i++)
        {
          s=s+word1.charAt(i);
          s=s+word2.charAt(i);

        }
        for(int i=word1.length();i<word2.length();i++)
        {
            s=s+word2.charAt(i);
        }
       }return s;
    }
}