class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int arr3[]=new int[arr1.length];
        int k=0;
        ArrayList<Integer> al=new ArrayList<>();
    for(int i=0;i<arr2.length;i++)
    {
     for(int j=0;j<arr1.length;j++)
      { 
        if(arr2[i]==arr1[j])
        {
          al.add(arr1[j]);
          arr1[j]=-1;  
        }

     }
    }
    ArrayList<Integer> m=new ArrayList<>();
    for(int i=0;i<arr1.length;i++)
    {
        if(arr1[i]>-1)
        {
            m.add(arr1[i]);
        }
    }
   
   Collections.sort(m);
   al.addAll(m);
   int arr[]=new int[arr1.length];
  for(int i=0;i<arr1.length;i++)
  {
    arr[i]=al.get(i);
  }
  return arr;
    }
}