class Solution {
    public String largestGoodInteger(String num) {
       String []d={"000","111","222","333","444","555","666","777","888","999"};
       for(int i=d.length-1;i>=0;i--)
       {
        if(num.contains(d[i]))
        {
            return d[i];
            
        }
       }
       return "";
    }
}