class Solution {
    public boolean isHappy(int n) {
     int  m, result = n;
    while (result != 1 && result != 4) {
        result=happy(result);
    }
    if(result==1)return true;
    else return false;
    }
    public int happy(int num) {
        
        int ans = 0;
        
        while(num > 0) {
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }
        
        return ans;
    }}
        