class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String d=s+s;
        String h=d.substring(1,d.length()-1);
        if(h.contains(s))
         return true; 
          return false;
    }
}