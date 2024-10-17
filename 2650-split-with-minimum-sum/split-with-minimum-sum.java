class Solution {
    public int splitNum(int num) {
        int n=num;
        int c=0;
     while(num!=0)
     {
        c++;
        num/=10;
     }     
     int arr[]=new int[c];
     int i=0;
     while(n!=0)
     {
        arr[i]=n%10;
        n/=10;
        i++;
     }
     Arrays.sort(arr);
     String s="";
     String s1="";
     for(int i1=0;i1<arr.length;i1++)
     {
        if(i1%2==0)
        {
            s=s+arr[i1];
        }
        else
        {
            s1=s1+arr[i1];
        }
     }
     int b=Integer.parseInt(s)+Integer.parseInt(s1);
     return b;
    }
}