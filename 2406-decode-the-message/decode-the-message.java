class Solution {
    public String decodeMessage(String key, String message) {
         ArrayList<Character> al=new ArrayList<>();
        
        for (char c : key.toCharArray()) {
              if (!al.contains(c)&&c!=' ')
                  al.add(c);
        }
        char l='a';
       HashMap<Character,Character> hm=new HashMap<>();
       String d="";
       for(char ch:al)
       {
        hm.put(ch,l++);
       } 
       for(int i=0;i<message.length();i++)
       {
        if(message.charAt(i)==' ')
        {
            d=d+' ';
        }
        else
        {
            d=d+hm.get(message.charAt(i));
        }
       }
       return d;
    }
}