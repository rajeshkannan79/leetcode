class Solution {
    public String addSpaces(String s, int[] spaces) {int k=0;StringBuilder d=new StringBuilder();
      for(int i=0;i<s.length();i++)
      {
        if(k<spaces.length&&i==spaces[k])
        {
            d.append(" ");
            k=k+1;
        }
      
        
            d.append(s.charAt(i));
        
      }  
      return d.toString();
    }
}