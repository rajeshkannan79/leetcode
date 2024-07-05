class Solution {
    public int numberOfSpecialChars(String word) {
     int a[]=new int[26];
     int b[]=new int[26];
     
      for(char p: word.toCharArray())
      {
        if(p>='a'&&p<='z')
        {
            a[p-'a']++;
        }
        else
        {
            b[p-'A']++;
        }
      }  
      int c=0;
      for(int i=0;i<26;i++)
      {
        if(a[i]>0&&b[i]>0)
          c++;
      }
      return c;

    }
}