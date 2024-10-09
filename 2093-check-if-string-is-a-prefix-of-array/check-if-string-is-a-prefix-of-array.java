class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String b="";
       for(String str:words)
       {
        b=b+str;
        if(sub(b,s))
        {
            return true;
        }
       } 
       return false;
    }
    public boolean sub(String b,String s)
    {
        if(b.equals(s))
        {
            return true;
        }
        return false;
    }
}