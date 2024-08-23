class Solution {
    public int maximumValue(String[] strs) {
        int f=1;
         int max=0;
     for(String word:strs)
     {
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)>='0' && word.charAt(i)<='9')
            {
                f=1;
               continue;
            }
            else
            {
                f=0;
                max=Math.max(max,word.length());
                  break;
            }
        }
        if(f==1){
         int g=Integer.parseInt(word);
         max=Math.max(max,g);
        }
     }
     return max; 
    }
}
