class Solution {
    public List<String> stringMatching(String[] words) {
      ArrayList<String> al=new ArrayList<>();
      for(int i=0;i<words.length;i++)
      {
        for(int j=i+1;j<words.length;j++)
        {
            if(words[i].contains(words[j]))
            {  if(!al.contains(words[j]))
                al.add(words[j]);
            }
            else if(words[j].contains(words[i]))
            {  if(!al.contains(words[i]))
                al.add(words[i]);
            }
        }
      } 
       return al;
    }
}