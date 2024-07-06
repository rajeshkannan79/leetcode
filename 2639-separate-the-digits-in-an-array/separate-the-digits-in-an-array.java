class Solution {
    public int[] separateDigits(int[] nums) {
    
    ArrayList<Integer> b=new ArrayList<>();
   for(int num:nums){
    ArrayList<Integer> a=new ArrayList<>();
      while(num>0)
      {
        a.add(num%10);
        num=num/10;
      }  
       for (int j = a.size() - 1; j >= 0; j--) {
                b.add(a.get(j));
            }
    }
    int arr[]=new int[b.size()];
    for(int i=0;i<b.size();i++)
    {   
        arr[i]=b.get(i);
    }
           
           return arr;

    }
}