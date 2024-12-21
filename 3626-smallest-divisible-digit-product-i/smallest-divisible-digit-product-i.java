class Solution {
    public int smallestNumber(int n, int t) {int g=0;int f=1;
int n1=n;int b=0;
        while(f==1)
        {
            int sum=1;b=n1;
            while(n1!=0)
            {   
                sum=sum*(n1%10);
                n1/=10;
            }
            if(sum%t==0)
            {
                g=b;
                f=0;
            }
           n++;
           n1=n;
        }
        return g;
    }
}