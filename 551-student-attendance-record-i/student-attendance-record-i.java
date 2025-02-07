class Solution {
    public boolean checkRecord(String s) {
        if(s.lastIndexOf('A')!=s.indexOf('A'))
        {
            return false;
        }
        for(int i=0;i<=s.length()-3;i++)
        { if(s.charAt(i)=='L'){
            if(s.charAt(i)==s.charAt(i+1)&&s.charAt(i+1)==s.charAt(i+2))
            {
                return false;
            }
        }
        }
        return true;
    }
}