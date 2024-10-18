class Solution {
    public int divisorSubstrings(int num, int k) {
        int v=num;
        String s=Integer.toString(num);
        int c=0;
        if(s.length()==1)
        {
            if(sub(s,v))
            {
                c++;
            }
        }
        else
        {
        for(int i=0;i<=s.length()-k;i++)
        {
              if(sub(s.substring(i,i+k),v))
              {
                c++;
              }
        }
        }
        return c;
    }
    public boolean sub(String s,int v)
    {
      int f=Integer.parseInt(s);
      if(f!=0){
      if(v%f==0)
      {
        return true;
      }}
      return false;
    }
}