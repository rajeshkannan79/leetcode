class Solution {
    public int countEven(int num) {int c=0;
        for(int i=2;i<=num;i++)
        {
            if(sum(i))
            {
                c++;
            }
        }
        return c;
    }
    public boolean sum(int n)
    { int suum=0;
        while(n!=0)
        {
            suum=suum+n%10;
            n/=10;
        }
        if(suum%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}