class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        ArrayList<Integer> al=new ArrayList<>();
        for (int[] range : ranges) {
            for (int i = range[0]; i <= range[1]; i++) {
                al.add(i);
            }
        }
    for(int i=left;i<=right;i++)
    {
        if(!al.contains(i))
        {
            return false;
        }
    }
    return true;
}
}