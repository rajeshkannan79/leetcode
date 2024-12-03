class Solution {
    public boolean isBalanced(String num) {int sum=0;int sum1=0;
        for(int i=0;i<num.length();i++)
        {
            if(i%2==0)
            {
                sum=sum+num.charAt(i)-'0';
            }
            else
            {
                sum1=sum1+num.charAt(i)-'0';
            }
        }
        if(sum==sum1)return true;
        return false;
    }
}