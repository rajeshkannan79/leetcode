class Solution {
    public boolean squareIsWhite(String coordinates) {
        int a=coordinates.charAt(0)-'a';
        int b=coordinates.charAt(1)-48;
         if(a%2 ==0 && b%2==0)
           return true;
        else if(a%2==1 &&b%2==1)
            return true;
        else
           return false;
    }
}