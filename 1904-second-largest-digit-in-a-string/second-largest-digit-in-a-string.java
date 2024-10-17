class Solution {
    public int secondHighest(String s) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9')
            { int c=s.charAt(i)-'0';
                if(!al.contains(c))
                {
                    al.add(s.charAt(i)-'0');
                }
            }
        }
        Collections.sort(al);
        if(al.size()<=1)return -1;
        return al.get(al.size()-2);
    }
}