class Solution {
    public int maximum69Number(int num) {
        StringBuilder s = new StringBuilder(String.valueOf(num));

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '6') {
                s.setCharAt(i, '9');
                break;
            }
        }

       String v=s.toString();
       int t=Integer.valueOf(v);
       return t;
    }
}