class Solution {
    public int findMiddleIndex(int[] nums) {
     for(int i=0;i<nums.length;i++)
     {
        int b1=0;int b2=0;    
        for(int j=0;j<i;j++)
            {
                b1+=nums[j];
            }
             for(int l=i+1;l<nums.length;l++)
            {
                b2+=nums[l];
            }
            if(b1==b2)
            {
                return i;
            }
        
     }return -1;
    }
}