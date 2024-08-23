class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
            else
            {
                hm.put(s.charAt(i),1);
            }
        }
       String sb="";
       
        while(!hm.isEmpty())
        {
             int max=0;
        char m=' ';

           for(Map.Entry<Character,Integer> e:hm.entrySet())
           {
               int h=e.getValue();
              if(max<h)
              {
                max=h;
                m=e.getKey();
              }
           } 
           for(int i=0;i<max;i++)
           {
            sb=sb+m;
           }
           hm.remove(m);
        }
        return sb;
    }
}