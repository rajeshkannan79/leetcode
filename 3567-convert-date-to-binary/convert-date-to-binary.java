class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb=new StringBuilder();
   String s1=date.substring(0,4);
   String s2=date.substring(5,7);
   String s3=date.substring(8,10);
   Integer d1=Integer.parseInt(s1);
  Integer d2=Integer.parseInt(s2);
     Integer d3=Integer.parseInt(s3);
     sb.append(Integer.toBinaryString(d1));
     sb.append("-");
      sb.append(Integer.toBinaryString(d2));
      sb.append("-");
       sb.append(Integer.toBinaryString(d3));
       return sb.toString();
    }
}