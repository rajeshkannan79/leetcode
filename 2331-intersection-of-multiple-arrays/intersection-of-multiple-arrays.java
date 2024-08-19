class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int []list:nums)
        {

        for(int num:list){
                if(hm.containsKey(num))
                {
             hm.put(num,hm.get(num)+1);
                }
                else
                {
                    hm.put(num,1);
                }
            }
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int g:hm.keySet())
        {
            if(hm.get(g)==nums.length)
            {
                al.add(g);
            }
        }
        Collections.sort(al);
        return al;
    }
}