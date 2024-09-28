import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        String s="";
        for(int i=0;i<num.length;i++)
        {
            s=s+num[i];
        }
        BigInteger v=new BigInteger(s);
        BigInteger res=v.add(BigInteger.valueOf(k));
        
        ArrayList<Integer> al2=new ArrayList<>();
       String b=res.toString();
       for(char c:b.toCharArray())
       {
        al2.add(c-'0');
       }
       return al2;
    }
}