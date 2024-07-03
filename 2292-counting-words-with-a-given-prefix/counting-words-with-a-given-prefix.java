class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
       for(String word:words)
       {
        if(word.length()>=pref.length()&&word.substring(0,pref.length()).equals(pref))
           c++;
       }
        return c;
    }
}