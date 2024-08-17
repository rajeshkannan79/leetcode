class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        
    for (int i = 0; i < n; i++) {
            result[i] = -1;
        }
        
 
        for (int i = 0; i < 2 * n; i++) {
            int index = i % n;

            while (!stack.isEmpty() && nums[stack.peek()] < nums[index]) {
                result[stack.pop()] = nums[index];
            }
           
            stack.push(index);
        }
        
        return result;
    }
}
