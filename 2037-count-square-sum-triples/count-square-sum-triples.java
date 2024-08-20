class Solution {
    public int countTriples(int n) {
        int c=0;
       for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=n;j++)
        {
            int g=i*i+j*j;
            for(int k=1;k<=n;k++)
            {
                if(k*k==g)
                {
                    c++;
                }
            }
        }
       } 
       return c;
    }
}