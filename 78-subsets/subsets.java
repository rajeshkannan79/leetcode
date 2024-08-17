class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        solve(nums.length,nums,0,cur,li);
        return li;
    }
    private void solve(int n,int[]nums,int i,List<Integer> cur,List<List<Integer>> li)
    {
        if(i==nums.length)
        {
            li.add(new ArrayList<>(cur));
        }
        else{
        cur.add(nums[i]);
        solve(n,nums,i+1,cur,li);
        cur.remove(cur.size()-1);
        solve(n,nums,i+1,cur,li);
        }
    }
}