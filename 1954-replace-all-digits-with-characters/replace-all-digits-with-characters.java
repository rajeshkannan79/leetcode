class Solution {
    public String replaceDigits(String s) {
        String h="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9')
            {
                int b=s.charAt(i)-48;
                int f=(int)(s.charAt(i-1));
                int k=f+b;
             char ch=(char)k;
             h=h+ch;
            }
            else
            {
                h=h+s.charAt(i);
            }
        }return h;
    }
}