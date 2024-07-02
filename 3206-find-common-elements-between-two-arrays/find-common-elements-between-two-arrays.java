class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int c=0;
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
        {
            if(nums1[i]==nums2[j])
            {
              c++;
              break;
            }
        }
    }
    int c1=0;
     for(int i=0;i<nums2.length;i++)
        {
            for(int j=0;j<nums1.length;j++)
        {
            if(nums2[i]==nums1[j])
            {
              c1++;
              break;
            }
        }
    }
    return new int[]{c,c1};
    }

}