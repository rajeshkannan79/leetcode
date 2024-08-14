class Solution {
    public String[] findWords(String[] words) {
       String s1="qwertyuiop";
       String s2="asdfghjkl";
       String s3="zxcvbnm";
        List<String> al=new ArrayList<>();
       for(String word:words)
       {
        int row[]=new int[3];
        for(char ch:word.toLowerCase().toCharArray())
        {
            if(s1.indexOf(ch)!=-1)
            {
                row[0]=1;
            }
            else if(s2.indexOf(ch)!=-1)
            {
                row[1]=1;
            }
            else if(s3.indexOf(ch)!=-1)
            {
                row[2]=1;
            }
        }
           
            if((row[0]+row[1]+row[2])==1)
            {
              al.add(word);
            }
        

       }
       String[] j=new String[al.size()];
       int s=0;
       for(String h:al)
       {
           j[s++]=h;
       }
        return j;
    }
}