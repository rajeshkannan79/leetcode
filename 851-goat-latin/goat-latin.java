class Solution {
    public String toGoatLatin(String sentence) {
        String []str=sentence.split(" ");
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(String s:str)
        {
            count++;
        if(s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u'||s.charAt(0)=='A'||s.charAt(0)=='E'||s.charAt(0)=='I'||s.charAt(0)=='O'||s.charAt(0)=='U')
         {
               sb.append(s);
               sb.append("ma");
                 for(int i=0;i<count;i++)
                 {
                    sb.append("a");
                 }
                 sb.append(" ");
         }
        
        else
        {
            sb.append(s.substring(1,s.length()));
            sb.append(s.charAt(0));
            sb.append("ma");
            for(int i=0;i<count;i++)
            {
                sb.append("a");
            }
            sb.append(" ");
        }
    }
      return sb.toString().trim();
    }
}