class Solution {
    public String reverseVowels(String s) {
        String s1="aeiouAEIOU";
        char []c=s.toCharArray();
        int st=0;
        int end=s.length()-1;
      while(st<end){
        while(st<end && s1.indexOf(c[st])==-1)
        {
            st++;
        }
         while(st<end && s1.indexOf(c[end])==-1)
        {
            end--;
        }
        char t=c[st];
        c[st]=c[end];
        c[end]=t;

        st++;
        end--;
        }
    
        return new String(c);
    }
}