class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int c = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                c++;
                j++;
            } else
                j++;
        }

        if (s.length() == c)
            return true;
        return false;
    }
}