class Solution {
    public int findComplement(int num) {
       String s=Integer.toBinaryString(num);
       String d="";
       for(int i=0;i<s.length();i++)
       {
        if(s.charAt(i)=='1')
          d=d+'0';
        else
          d=d+'1';
       } 
      int a=Integer.parseInt(d,2);
      return a;
    }
}