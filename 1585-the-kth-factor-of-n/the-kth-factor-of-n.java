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
    int arr[]=new int[a.size()];
    for(int i=0;i<a.size();i++)
    {
        arr[i]=a.get(i);
    }
    if(arr.length>=k)
     return arr[k-1];
    return -1;
    }
}