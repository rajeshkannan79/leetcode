class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
            {
                al.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==pivot)
            {
                al.add(nums[i]);
            }
        }
         for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>pivot)
            {
                al.add(nums[i]);
            }
        }
        int a[]=new int[al.size()];
        for(int i=0;i<al.size();i++)
        {
            a[i]=al.get(i);
                    }
    
    return a;
    }
}