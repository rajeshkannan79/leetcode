class Solution {
    public boolean wordPattern(String pattern, String s) {
       String []v=s.split(" ");
       if(v.length!=pattern.length())
       {
        return false;
       } 
       int i=0;
       HashMap<Character,String> hm=new HashMap<>();
       for(char c:pattern.toCharArray())
       {
        if(hm.containsKey(c))
        {
            if(!Objects.equals(hm.get(c),v[i]))
            {
                return false;
            }
        }
        else
        {
            if(hm.containsValue(v[i]))
            {
                return false;
            }
            hm.put(c,v[i]);
        }
        i++;
       }
       return true;
    }
}