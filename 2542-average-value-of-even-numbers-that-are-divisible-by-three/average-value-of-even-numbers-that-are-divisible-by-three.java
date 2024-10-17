class Solution {
    public int averageValue(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        int sum=0;
        int c=0;
        int b=1;
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]%3==0&&nums[i]%2==0)
        {
            al.add(nums[i]);
            c++;
            b=0;
        }
      }  
     
      for(int i=0;i<al.size();i++)
      {
         
        sum=sum+al.get(i);
      }
       if(b==1)return 0;
       return sum/c;
       
    }
}