class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            ArrayList<Character> al=new ArrayList<>();
            for(int j=i;j<s.length();j++)
            {
            if(!al.contains(s.charAt(j)))
            {
                al.add(s.charAt(j));
            }
            else
            {
                break;
            }
            }
            if(max<al.size())
            {
                max=al.size();
            }

        }
        return max;
    }
}