class Solution {
    public int minimumPushes(String word) {
        int c=0;
        int sum=0;
       for(int i=0;i<word.length();i++)
       {
        if(i%8==0)
        {
            c++;
        }
    
            sum=sum+c;
        
       } 
       return sum;
    }
}