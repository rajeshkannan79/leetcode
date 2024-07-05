class Solution {
    public int minimumPushes(String word) {
      

         Map<Character, Integer> m = new HashMap<>();
        for (char i : word.toCharArray())
            m.put(i, m.getOrDefault(i, 0) + 1);
        List<Integer> v = new ArrayList<>(m.values());
        Collections.sort(v, Collections.reverseOrder());
        int ans = 0;
        for (int i = 0; i < v.size(); i++) {
            if (i < 8)
                ans = ans + v.get(i );
            if (i >=8 && i < 16)
                ans = ans + v.get(i ) * 2;
            if (i >= 16 && i < 24)
                ans = ans + v.get(i ) * 3;
            if (i >=24)
                ans = ans + v.get(i ) * 4;
        }
        return ans;
    }
}