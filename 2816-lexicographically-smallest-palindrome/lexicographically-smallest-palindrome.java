class Solution {
    public String makeSmallestPalindrome(String s) {
      for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i)==s.charAt(s.length()-i-1))
        {
            continue;
        }
        else
        {
           char c=(char)Math.min((int)s.charAt(i),(int)s.charAt(s.length()-i-1));
            s = s.substring(0,i) + c + s.substring(i+1,s.length()-i-1) + c + s.substring(s.length()-i);
        }
      }  
      return s;
    }
}