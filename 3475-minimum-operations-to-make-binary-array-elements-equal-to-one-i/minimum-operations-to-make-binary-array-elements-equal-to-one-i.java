class Solution {
    public int minOperations(int[] nums) {
       
     int i=0;
     int c=0;
     for(;i<nums.length-2;i++)
     {int j=i+1;
     int k=i+2;
        if(nums[i]==0)
        {   nums[i]=1;
            nums[j]=nums[j]^1;
            nums[k]=nums[k]^1;
            c++;
        }
     }
     for(i=0;i<nums.length;i++){
     int f=nums[i]^1;   
     if(f!=0)
       return -1;
     }
    return c;
    }
}