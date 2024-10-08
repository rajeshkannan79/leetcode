class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        if(words.length==1)
        return 1;
       HashMap<Character,String> hm=new HashMap<>();
      hm.put('a',".-");
      hm.put('b',"-...");
      hm.put('c',"-.-.");
      hm.put('d',"-..");
      hm.put('e',".");
      hm.put('f',"..-.");
      hm.put('g',"--.");
      hm.put('h',"....");
      hm.put('i',"..");
      hm.put('j',".---");
      hm.put('k',"-.-");
      hm.put('l',".-..");
      hm.put('m',"--");
      hm.put('n',"-.");
      hm.put('o',"---");
      hm.put('p',".--.");
      hm.put('q',"--.-");
      hm.put('r',".-.");
      hm.put('s',"...");
      hm.put('t',"-");
      hm.put('u',"..-");
      hm.put('v',"...-");
      hm.put('w',".--");
      hm.put('x',"-..-");
      hm.put('y',"-.--");
      hm.put('z',"--..");
       int j=0;
       String str[]=new String[words.length];
       ArrayList<String> al=new ArrayList<>();
       for(String s:words)
       {
        String d="";
        for(int i=0;i<s.length();i++)
        {
            d=d+hm.get(s.charAt(i));
        }
       if(!al.contains(d))
       {
        al.add(d);
       }
       }
       
    return al.size();
    }
}