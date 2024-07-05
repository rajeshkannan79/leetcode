class Solution {
    public int countKeyChanges(String s) {
        int c=0;
     String k=s.toLowerCase(); 
     for(int i=0;i<k.length()-1;i++)
     {
        
            if(k.charAt(i)==k.charAt(i+1))
              continue;
            else
              c++;
        
     }
     return c; 
    }
}