class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        String c="";
        String d="";
        for(int i=0;i<s.length();i++)
        {
            if(st.isEmpty()||st.peek()!=s.charAt(i))
            {
                st.push(s.charAt(i));
            }
            else
            {
                st.pop();
            }
        }
        while(!st.isEmpty())
        {
            c=c+st.pop();
        }
        for(int i=c.length()-1;i>=0;i--)
        {
            d=d+c.charAt(i);
        }
        return d;
    }
}