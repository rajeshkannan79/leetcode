import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int current = 0; // This will store the current value in decimal

        for (int num : nums) {
            current = ((current << 1) + num) % 5; // Shift left and add the current bit, then take mod 5
            result.add(current == 0); // Check if current value is divisible by 5
        }

        return result;
    }
}
