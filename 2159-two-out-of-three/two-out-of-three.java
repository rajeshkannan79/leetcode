class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
     ArrayList<Integer> al=new ArrayList<>(); ArrayList<Integer> a =new ArrayList<>();
     for(int i=0;i<nums1.length;i++)
     {
        if(!al.contains(nums1[i]))
        {
            al.add(nums1[i]);
        }
     }   
      ArrayList<Integer> al1=new ArrayList<>();
     for(int i=0;i<nums2.length;i++)
     {
        if(!al1.contains(nums2[i]))
        {
            al1.add(nums2[i]);
        }
     }   
      ArrayList<Integer> al2=new ArrayList<>();
     for(int i=0;i<nums3.length;i++)
     {
        if(!al2.contains(nums3[i]))
        {
            al2.add(nums3[i]);
        }
     }
     HashMap<Integer,Integer> hm=new HashMap<>();
     for(int i:al)
     {
        hm.put(i,hm.getOrDefault(i,0)+1);
     }   
     for(int i:al1)
     {
        hm.put(i,hm.getOrDefault(i,0)+1);
     }
     for(int i:al2)
     {
        hm.put(i,hm.getOrDefault(i,0)+1);
     }
     for(int g:hm.keySet())
     {
        if(hm.get(g)>=2)
        {
            a.add(g);
        }
     }
     return a;
    }
}