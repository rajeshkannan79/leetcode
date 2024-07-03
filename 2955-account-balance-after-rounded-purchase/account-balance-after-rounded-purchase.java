class Solution {
    public int accountBalanceAfterPurchase(int n) {
        int min=100;
        while(n>0)
        {  if(n%10==0){
              min=min-n;
              break;
        }
            else
              if(n%10>=5)
                 n++;
              else
                n--;
        }
        return min;
    }
}