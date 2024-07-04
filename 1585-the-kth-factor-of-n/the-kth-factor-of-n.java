class Solution {
    public int kthFactor(int n, int k) {
        int j=0;
        ArrayList<Integer> a=new ArrayList<>(); 
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            a.add(i);
        }
    }
    if(a.size()>=k)
    {
        return a.get(k-1);
    }    
    return -1;
    }
}