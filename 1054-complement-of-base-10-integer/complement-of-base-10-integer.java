class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);String f="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                f=f+'1';
            }
            else
            {
                f=f+'0';
            }
        }
        int b=Integer.parseInt(f,2);
        return b;
    }
}