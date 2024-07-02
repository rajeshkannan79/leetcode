class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int m=nums1.length;
     int n=nums2.length;
     int arr[]=new int[m+n];
     int i=0;
     int j=0;
     int k=0;
     while(i<m)   
     {
        arr[k++]=nums1[i++];
     }
     while(j<n)
     {
        arr[k++]=nums2[j++];
     }
     Arrays.sort(arr);
     int mid=arr.length/2;
     if(arr.length%2==1)
       return arr[mid];
    else
    {
       return (arr[mid]+arr[mid-1])/2.0;
    }
    }
}