class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       for(char ch:letters)
       {
        int b=ch-'a';
        int g=target-'a';
        if(b>g)
          return ch;
       } 
       return letters[0];
    }
}