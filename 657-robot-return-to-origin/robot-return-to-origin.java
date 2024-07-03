class Solution {
    public boolean judgeCircle(String moves) {
        int c1=0;
        int c2=0;
      for(int i=0;i<moves.length();i++)
      {
        if(moves.charAt(i)=='U') c1++;
         if(moves.charAt(i)=='D') c1--;
          if(moves.charAt(i)=='L') c2--;
           if(moves.charAt(i)=='R') c2++;
      }
if(c1==0&&c2==0) return true;
return false;
    }
}