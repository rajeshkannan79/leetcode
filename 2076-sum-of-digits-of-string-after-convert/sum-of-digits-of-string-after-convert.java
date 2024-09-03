class Solution {
    public int getLucky(String s, int k) {
      
        HashMap<Character, Integer> hm = new HashMap<>();
        char c = 'a';
        for (int i = 1; i <= 26; i++) {
            hm.put(c++, i);
        }
        
        // Use StringBuilder to build the number representation
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(hm.get(s.charAt(i)));
        }
        
        // Convert the concatenated number to a string for processing
        String numberStr = sb.toString();
        
        // Perform the digit sum operation k times
        while (k > 0) {
            long sum = 0;
            for (char ch : numberStr.toCharArray()) {
                sum += ch - '0'; // Convert char digit to its integer value
            }
            numberStr = Long.toString(sum); // Convert the sum back to string for next iteration
            k--;
        }
        
        // Return the final single-digit result
        return Integer.parseInt(numberStr);
    }
}
