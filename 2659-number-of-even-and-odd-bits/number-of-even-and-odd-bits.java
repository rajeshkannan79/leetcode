class Solution {
    public int[] evenOddBit(int n) {
        int arr[]=new int[2];
        int even=0;
        int odd=0;
       
        String s=Integer.toBinaryString(n);
        String d="";
        for(int i=s.length()-1;i>=0;i--)
        {
            d=d+s.charAt(i);
        }
        for(int i=0;i<d.length();i++)
        {
            if(i%2==0&&d.charAt(i)=='1')
            {
                even++;
            
            }
            else if(i%2==1 &&d.charAt(i)=='1')
            {
              odd++;
            }
        }
    
        arr[0]=even;
        arr[1]=odd;
        return arr;
    }
}