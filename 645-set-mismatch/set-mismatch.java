class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[]=new int[2];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }int sum=0;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!al.contains(nums[i]))
            {
                al.add(nums[i]);
                sum=sum+nums[i];
            }
        }
        for(int i:hm.keySet())
        {
            if(hm.get(i)>1)
            {
                arr[0]=i;
            }
          
        }
        int b=nums.length*(nums.length+1);
        b=b/2;
        int c=b-sum;
        arr[1]=c;
return arr;
    }
}