class Solution {
    public boolean isPerfectSquare(int num) {
        int n=(int)Math.pow(num,0.5);
       return n*n==num;
    }
}