class Solution {
    public int findSpecialInteger(int[] arr) {
        int a=(arr.length*25)/100;
        int b=0;
        HashMap<Integer,Integer> hm =new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }
        for(int i:hm.keySet())
        {
            if(hm.get(i)>a){
              b=i;
              break;
            }
        }
        return b;
           }
}