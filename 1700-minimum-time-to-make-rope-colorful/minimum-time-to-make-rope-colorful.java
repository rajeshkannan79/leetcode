class Solution {
    public int minCost(String colors, int[] neededTime) {
        int sum=0;
        int max=0;
       for(int i=1;i<colors.length();i++)
       {
        if(colors.charAt(i-1)==colors.charAt(i))
        {
            max=max+Math.min(neededTime[i],neededTime[i-1]);
            if(neededTime[i]<neededTime[i-1])
            {
                neededTime[i]=neededTime[i-1];
            }
        }
       } 
       return max;
    }
}