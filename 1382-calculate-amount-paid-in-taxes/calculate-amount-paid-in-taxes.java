class Solution {
    public double calculateTax(int[][] b , int income) {
  int pre=b[0][0];
        for(int i = 1; i < b.length; i++) {
         int  y=b[i][0];
            b[i][0] = b[i][0] - pre;
            pre=y;
        }
        
        double sum = 0;
        for(int i = 0; i < b.length; i++) {
            if (income > 0) {
                if (b[i][0] <= income) {
                 
                    sum += b[i][0] * (b[i][1] / 100.0);
                    income -= b[i][0];
                } else {
                   
                    sum += income * (b[i][1] / 100.0);
                    income = 0;
                }
            }
        }
        
        return sum;
    }
}
