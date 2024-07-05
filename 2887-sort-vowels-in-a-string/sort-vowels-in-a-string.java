class Solution {
    public String sortVowels(String s) {
        StringBuilder s1=new StringBuilder();
        List<Character> d=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {  char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                d.add(c);
            }
        }
        Collections.sort(d);
        int ind=0;
        for(int i=0;i<s.length();i++)
        {    char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
              s1.append(d.get(ind++));
            else
              s1.append(c);
        }
        return s1.toString();
    }
}