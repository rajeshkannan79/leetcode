class Solution {
    public int pivotInteger(int n) {
      ArrayList<Integer> al=new ArrayList<>();if(n==1)return 1;
      for(int i=1;i<=n;i++)
      {
        al.add(i);
      }
      for(int i=1;i<al.size()-1;i++)
      {int b=0;
      int sum=0;
       for(int j=0;j<i;j++)
       {
        sum=sum+al.get(j);
       }
       for(int k=i+1;k<al.size();k++)
       {
        b=b+al.get(k);
       }
       if(sum==b)
       {
        return al.get(i);
       }
      }return -1;
    }
}