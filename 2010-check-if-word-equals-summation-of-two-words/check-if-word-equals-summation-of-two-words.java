class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
       HashMap<Character,Integer> hm=new HashMap<>();char ch='a';
       for(int i=0;i<=25;i++)
       {
        hm.put(ch++,i);
       } 
       String s="";
       for(int i=0;i<firstWord.length();i++)
       {
        s=s+hm.get(firstWord.charAt(i));
       }
        String s1="";
       for(int i=0;i<secondWord.length();i++)
       {
        s1=s1+hm.get(secondWord.charAt(i));
       }
        String s2="";
       for(int i=0;i<targetWord.length();i++)
       {
        s2=s2+hm.get(targetWord.charAt(i));
       }
       if(Integer.parseInt(s)+Integer.parseInt(s1)==Integer.parseInt(s2))
       {
        return true;
       }
       return false;
    }
}