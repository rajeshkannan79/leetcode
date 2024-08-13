class Solution {
    public int isPrefixOfWord(String s, String searchWord) {
    String[] d=s.split(" ");
    for(int i=0;i<d.length;i++)
    {
        for(int j=0;j<d[i].length();j++)
        {
            String g=d[i].substring(0,j+1);
            if(g.equals(searchWord))
              return i+1;
        }
    }
    return -1;
    }
}