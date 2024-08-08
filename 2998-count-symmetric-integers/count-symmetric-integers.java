class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int result = 0;
        for (int i = low; i <= high; i++) {
            int value = i;
            List<Integer> list = new ArrayList<>();
            while (value > 0) {
                list.add(value % 10);
                value = value / 10;
            }
            if (list.size() % 2 != 0) {
                continue;
            }
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < list.size() / 2; j++) {
                sum1 = sum1 + list.get(j);
            }
            for (int j = list.size() / 2; j < list.size(); j++) {
                sum2 = sum2 + list.get(j);
            }
            if (sum1 == sum2) {
                result++;
            }
        }
        return result;
    }
}