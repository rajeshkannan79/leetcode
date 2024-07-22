class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
    int n = grid.length * grid.length;
        int sum1= n * (n + 1) / 2;
        int sum=0;
        int[] a = new int[2];
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(!al.contains(grid[i][j]))
                {
                    al.add(grid[i][j]);
                   sum=sum+grid[i][j];
                }
                else

                {
                    a[0]=grid[i][j];
                }
            }
        }
        int mis=sum1-sum;
        a[1] = mis;
        return a;

    }
}