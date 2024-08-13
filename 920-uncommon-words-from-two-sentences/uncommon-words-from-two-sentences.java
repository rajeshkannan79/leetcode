class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
         String[] a=s1.split(" ");
         String[]b=s2.split(" ");
        HashMap<String,Integer> hm=new HashMap<>();
     
        for(int i=0;i<a.length;i++)
        {
            if(hm.containsKey(a[i]))
            {
                hm.put(a[i],hm.get(a[i])+1);
            }
            else
            {
                hm.put(a[i],1);
            }
        }
        for(int i=0;i<b.length;i++)
        {
            if(hm.containsKey(b[i]))
            {
                hm.put(b[i],hm.get(b[i])+1);
            }
            else
            {
                hm.put(b[i],1);
            }
        }
     List<String> al=new ArrayList<>();
        for(Map.Entry<String,Integer> me:hm.entrySet())
        {
            if(me.getValue()==1)
            {
                al.add(me.getKey());
            }
        }
        String []h=new String[al.size()];
        int l=0;
        for(String i:al)
        {
            h[l++]=i;
        }
      return h;
    }
}