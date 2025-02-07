class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for(char ch='a';ch<='z';ch++)
        {   
            if(s.indexOf(ch)!=-1)
            {
                int b=s.lastIndexOf(ch)-s.indexOf(ch)-1;
                 if(b!=distance[ch-'a'])
                 {
         return false;
                 }
            }
        }return true;
    }
}