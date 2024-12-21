class Solution {
    public int pivotInteger(int n) {
       int arr[]=new int[n];int o=0;
       for(int i=1;i<=n;i++)
       {
        arr[o++]=i;
       }if(n==1)return 1;
       for(int i=1;i<arr.length;i++)
       {int sum1=0;
       int sum2=0;
        for(int j=0;j<i;j++)
        {
            sum1+=arr[j];
        }
        for(int j1=i+1;j1<arr.length;j1++)
        {
            sum2+=arr[j1];
        }
        if(sum1==sum2)
        {
            return arr[i];
        }
       } return -1;
    }
}