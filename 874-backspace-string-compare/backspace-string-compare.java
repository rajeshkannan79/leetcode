class Solution {
    public boolean backspaceCompare(String s, String t) {
       Stack<Character> st=new Stack<>();
       String v="";
       String b="";

       for(int i=0;i<s.length();i++)
       {
        if(s.charAt(i)!='#')
        {
            st.push(s.charAt(i));
        }
        else if(!st.isEmpty())
        {
            st.pop();
        }
       } 
        Stack<Character> st1=new Stack<>();
       for(int i=0;i<t.length();i++)
       {
        if(t.charAt(i)!='#')
        {
            st1.push(t.charAt(i));
        }
        else if(!st1.isEmpty())
        {
            st1.pop();
        }
       } 
       while(!st.isEmpty())
       {
        b=b+st.pop();
       }
        while(!st1.isEmpty())
       {
        v=v+st1.pop();
       }
       if(b.equals(v)) return true;
       return false;
    }
}