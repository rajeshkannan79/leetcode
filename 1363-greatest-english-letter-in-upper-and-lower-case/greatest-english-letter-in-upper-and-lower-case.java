class Solution {
    public String greatestLetter(String s) {
            for(char c='Z';c>='A';c--)
            {
                String s1=Character.toString(c);
                String c1=Character.toString(c+32);
                if(s.contains(s1)&&s.contains(c1))
                {
                    return s1;
                }
            }
            return "";
    }
             
}