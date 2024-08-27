class Solution {
    public String reverseOnlyLetters(String s) {
       int i=0;
       int j=s.length()-1;
       StringBuilder sb=new StringBuilder(s);
       while(i<j)
       {
        if(isletter(sb.charAt(i))&&isletter(sb.charAt(j)))
        {
           char temp=sb.charAt(i);
           sb.setCharAt(i,s.charAt(j));
           sb.setCharAt(j,temp);
           i++;
           j--;
        }
        else if(!isletter(sb.charAt(i)))
        {
            i++;
        }
        else
        {
            j--;
        }

       } 
       return sb.toString();
    }
    public boolean isletter(char ch)
    {
        if(Character.isLetter(ch))
        {
            return true;
        }
        return false;
    }
}