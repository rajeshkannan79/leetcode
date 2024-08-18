class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++)
        {
            if(st(words[i]))
            {
                c++;
            }
        }
        return c;
    }
    public boolean st(String s)
    {
      
        char c=s.charAt(0);
        char ch=s.charAt(s.length()-1);
        if((c=='a'||c=='e'||c=='i'||c=='o'||c=='u') && (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
        {
            return true;
        }
        
        return false;

    }
}