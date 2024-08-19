class Solution {
    public String thousandSeparator(int n) {
        StringBuilder sb=new StringBuilder();
        int i=1;
        if(n==0)
          return "0";
        while(n>0)
        {
            sb.append(Integer.toString(n%10));
            n/=10;
            if(i%3==0 &&n>0)
            {
                sb.append(".");
                
            }
            i++;
        }
       
        return String.valueOf(sb.reverse());
    }
}