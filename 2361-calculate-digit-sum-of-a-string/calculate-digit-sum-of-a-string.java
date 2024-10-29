class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder t = new StringBuilder();
            for (int i = 0; i < s.length(); i += k) {
               
                String sub = s.substring(i, Math.min(i + k, s.length()));
                
                int sum = 0;
                for (char c : sub.toCharArray()) {
                    sum += c - '0';
                }
                t.append(sum); 
            }
            s = t.toString(); 
        }
        return s;
    }
}
