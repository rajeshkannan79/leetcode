class Solution {
    public int subtractProductAndSum(int n) {
     int h=n;int sum=1;
     int g=0;
     while(n!=0)
     {
        sum=sum*(n%10);
        n/=10;
     }   
     while(h!=0)
     {
        g=g+(h%10);
        h/=10;
     }  
     return sum-g; 
    }
}