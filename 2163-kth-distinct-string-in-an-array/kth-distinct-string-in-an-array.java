class Solution {
    public String kthDistinct(String[] arr, int k) {
       HashMap<String,Integer> hm=new HashMap<>();
       for(String s:arr)
       {
        if(hm.containsKey(s))
        {
            hm.put(s,hm.get(s)+1);
        }
        else
        {
            hm.put(s,1);
        }
       } 
       ArrayList<String> al=new ArrayList<>();
       for(String s:arr)
       {
        if(hm.get(s)==1)
        {
            al.add(s);
           
        }
       }
       if(al.size()<k)
       {
        return "";
       }
       return al.get(k-1);
    }
}