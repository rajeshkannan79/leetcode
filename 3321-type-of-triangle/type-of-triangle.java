class Solution {
    public String triangleType(int[] nums) {
        int c=0;
        int m=0;
            for(int j=0;j<nums.length;j++)
            {
                int d=0;
              
             for(int k=0;k<nums.length;k++)
             {  if(j!=k)
                  d=d+nums[k];
             }
             if(nums[j]<d) 
             {
                m++;
             }
            }
            if(m!=3)
              return "none";
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        if(hm.size()==1)
        {
            return "equilateral";
        }
        else if(hm.size()==3)
        {  
           
              return "scalene";
        }
        else
        {
            return "isosceles";
        }
    }
}