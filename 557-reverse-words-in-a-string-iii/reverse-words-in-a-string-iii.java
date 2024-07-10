class Solution {
    public String reverseWords(String s) {
       StringBuilder sb=new StringBuilder();
         String a[]=s.split(" ");
         int n=a.length;
         for(int i=0;i<n;i++)
         {
            StringBuilder x = new StringBuilder(a[i]);
            sb.append(x.reverse().toString());
            if(i==n-1)
            { break;
            }
            else
                sb.append(" ");
            
         }
         return sb.toString();
    }
}