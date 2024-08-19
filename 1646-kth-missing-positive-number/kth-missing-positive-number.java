class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            al.add(arr[i]);
        }
       int n=al.get(al.size()-1);
       int h=1;
       while(k!=0)
       {
        
            if(!al.contains(h))
               k--;

            h++;
              
        }
       

       
       return h-1;
    }
}