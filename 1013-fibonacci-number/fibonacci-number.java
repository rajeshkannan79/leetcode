class Solution {
    public int fib(int n) {
        int dp[]=new int[n+2];
        dp[0]=0;
        dp[1]=1;
        if(n<=1)
          return n;
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}