class Solution {
    public int countGoodSubstrings(String s) {
    int k=3;
    int c=0;
            for(int j=0;j<s.length()-2;j++)
            {
                 if(hello(s.substring(j,k)))
                 {
                    c++;
                 }
                 k++;

            }
            return c;
    }
            public boolean hello(String s)
            {
                for(int i=0;i<s.length();i++)
                {
                    for(int j=i+1;j<s.length();j++)
                    if(s.charAt(i)==s.charAt(j))
                    {
                        return false;
                    }
                }
                return true;
            }
    }
