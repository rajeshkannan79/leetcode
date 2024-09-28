class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int []m:matrix)
        {
            for(int i:m)
            {
                al.add(i);
            }
        }
        Collections.sort(al);
        return al.get(k-1);
    }
}