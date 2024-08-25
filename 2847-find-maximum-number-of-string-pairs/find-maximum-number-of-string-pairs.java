class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
       for(int i=0;i<words.length;i++)
       {
        for(int j=i+1;j<words.length;j++)
        {
           char[]a=words[i].toCharArray();
           char[]b=words[j].toCharArray();
           Arrays.sort(a);
           Arrays.sort(b);
           if(Arrays.equals(a,b))
            {
                count++;
            }
        }
       } 
       return count;
    }
}