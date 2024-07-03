class Solution {
    public int[] sortEvenOdd(int[] nums) {
      int n = nums.length;
        int evenCount = (n + 1) / 2;
        int oddCount = n / 2;
        
        Integer[] even = new Integer[evenCount];
        Integer[] odd = new Integer[oddCount];
        
        for (int i = 0, e = 0, o = 0; i < n; i++) {
            if (i % 2 == 0) {
                even[e++] = nums[i];
            } else {
                odd[o++] = nums[i];
            }
        }
        
        
        Arrays.sort(even);
        
        
        Arrays.sort(odd, Collections.reverseOrder());
        
       
        for (int i = 0, e = 0, o = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = even[e++];
            } else {
                nums[i] = odd[o++];
            }
        }
        
        return nums;
    }
}