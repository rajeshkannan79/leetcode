class Solution {
    public String getSmallestString(String s) {
        char[]c=s.toCharArray();
        for(int i=0;i<s.length()-1;i++)
        {

            int a=Integer.parseInt(String.valueOf(s.charAt(i)));
            int b=Integer.parseInt(String.valueOf(s.charAt(i+1)));
            
            if(a%2==0&&b%2==0||a%2==1&&b%2==1)
            {
                if(a>b){
                char temp=c[i];
                c[i]=c[i+1];
                c[i+1]=temp;
                break;
            }
            }
        }
        return new String(c);
    }
}