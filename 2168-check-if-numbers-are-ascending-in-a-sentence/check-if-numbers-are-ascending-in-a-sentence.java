class Solution {
    public boolean areNumbersAscending(String s) {
       String []d=s.split(" ");
       ArrayList<Integer> al=new ArrayList<>();
       for(String c:d)
       {
        if(ji(c))
        {
            al.add(Integer.parseInt(c));
        }
       }
       
       for(int i=0;i<al.size();i++)
       {
        System.out.print(al.get(i)+" ");
       }
       for(int i=0;i<al.size()-1;i++)
       {
        if(al.get(i)>=al.get(i+1))
        {
            return false;
        }
       }
       return true;
    }
    public boolean ji(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(!(s.charAt(i)>='0'&&s.charAt(i)<='9'))
            {
                return false;
            }
        }
        return true;
    }
}