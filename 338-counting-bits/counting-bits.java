class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {  int res=binary(i);
            
            
             arr[i]=res;
            
        }
        return arr;
    }
    public int binary(int k)
    {
        String str=Integer.toBinaryString(k);
        int c=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1')
            {
                c++;
            }
        }
        return c;
    }
}