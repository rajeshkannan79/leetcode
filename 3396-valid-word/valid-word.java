class Solution {
    public boolean isValid(String word) {
        int c=0;
        int c1=0;
        int c2=0;
        if(word.length()<3)return false;
       for(int i=0;i<word.length();i++)
       {
        if(word.charAt(i)=='$'||word.charAt(i)=='#'||word.charAt(i)=='@') return false;
        if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'||word.charAt(i)=='A'||word.charAt(i)=='E'||word.charAt(i)=='I'||word.charAt(i)=='O'||word.charAt(i)=='U')
        {
            c1++;
        }
        else if(word.charAt(i)>='a'&&word.charAt(i)<='z'||word.charAt(i)>='A'&&word.charAt(i)<='Z')
        {
            c2++;
        }
       }
       if(c1>=1&&c2>=1) return true;
       return false; 

    }
}