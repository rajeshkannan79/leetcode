class Solution {
    public int buyChoco(int[] prices, int money) {
    Arrays.sort(prices);int sum=0;int c=0;int b=money;
    for(int i=0;i<prices.length;i++)
    {
        sum=(money-prices[i]);
       if(sum<0)break;
       if(sum>=0)
       {
        c++;
       }
        money-=prices[i];if(c>=2)break;
    }   
    if(c<2)
    {
        return b;
    } 
  return money;
    }
}