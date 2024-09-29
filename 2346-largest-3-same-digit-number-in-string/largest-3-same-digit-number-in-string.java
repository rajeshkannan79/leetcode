class Solution {
    public String largestGoodInteger(String num) {
        int k=3;
        String s="";
        int max=0;
        int l=0;
       for(int i=0;i<=num.length()-3;i++)
       {
        if(sub(num.substring(i,k)))
        {
           s=""+num.substring(i,k);
           int f=Integer.parseInt(s);
                if(max<=f)
                {
                    max=f;
                    l=1;
                }
        }
        k++;
          
       } 
       if(max==0&&l==1) return "000";
       if(l==0)
       return "";
       return Integer.toString(max);

    }
    public boolean sub(String s)
    {
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)!=s.charAt(i+1))
            {
                return false;
            }
        }
        return true;
    }
}