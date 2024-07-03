class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> l1=new ArrayList<>();
   List<Integer> l2=new ArrayList<>();
    Set<Integer> s1=new HashSet<>();
    Set<Integer> s2=new HashSet<>();
     for(int n:nums1)
     {
        s1.add(n);
     }
     for(int n:nums2)
     {
        s2.add(n);
     }
     for(int n:s2)
     {
        if(s1.contains(n)==false)
        {
            l2.add(n);
        }
     }
     for(int n:s1)
     {
        if(s2.contains(n)==false)
        {
            l1.add(n);
        }
     }

    res.add(l1);
    res.add(l2);
    return res;


    }
}  