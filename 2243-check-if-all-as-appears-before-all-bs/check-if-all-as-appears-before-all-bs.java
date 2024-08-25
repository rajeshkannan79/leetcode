class Solution {
    public boolean checkString(String s) {
        char[] c=s.toCharArray();
        Arrays.sort(c);
        char[] d=s.toCharArray();
        if(Arrays.equals(c,d))return true;
        return false;
    }
}