class Solution {
    public int similarPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                count+=check(words[i],words[j]);
            }
        }
        return count;
    }

    private int check(String a,String b)
    {
        HashSet<Character> aset=new HashSet();
        for(char ch:a.toCharArray())
            aset.add(ch);

        HashSet<Character> bset=new HashSet();
        for(char ch:b.toCharArray())
            bset.add(ch);
        return aset.equals(bset)?1:0;
    }
}