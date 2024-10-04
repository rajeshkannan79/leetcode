class Solution {
    public int minElement(int[] nums) {
     ArrayList<Integer> al=new ArrayList<>();
     for(int i=0;i<nums.length;i++)
     {
        int a=nums[i];
        int sum=0;
        while(a!=0)
        {
            int rem=a%10;
            sum=sum+rem;
            a/=10;
        }
        al.add(sum);
     } 
     Collections.sort(al);
     return al.get(0);  
    }
}