class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String [] s=text.split(" ");
        int b=0;
        for(String s1:s){
            int c=1;
          for(char ch:brokenLetters.toCharArray())
           {
        
                if(s1.indexOf(ch)!=-1)
                    {
                        c=0;
                        break;
                    }
           }
                if(c==1)
                {
                    b++;
                }
            }

        
        return b;
    }
}