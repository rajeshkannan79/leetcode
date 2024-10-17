class Solution {
    public int sumFourDivisors(int[] nums) {
        int maxNum = 0;
        for (int num : nums) {
            if (num > maxNum) {
                maxNum = num;
            }
        }

        // Array to store the sum of divisors and the count of divisors
        int[] divisorSum = new int[maxNum + 1];
        int[] divisorCount = new int[maxNum + 1];

        // Count divisors and their sums
        for (int i = 1; i <= maxNum; i++) {
            for (int j = i; j <= maxNum; j += i) {
                divisorCount[j]++;
                divisorSum[j] += i;
            }
        }

        int totalSum = 0;

        // Now sum the numbers with exactly four divisors
        for (int num : nums) {
            if (divisorCount[num] == 4) {
                totalSum += divisorSum[num];
            }
        }

        return totalSum;
    }
}
