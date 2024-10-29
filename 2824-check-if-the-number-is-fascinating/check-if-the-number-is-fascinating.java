class Solution {
    public boolean isFascinating(int n) {
      ArrayList<Integer> al=new ArrayList<>();
      int a=n*2;
      int b=n*3;
      while(n!=0)
      {
        al.add(n%10);
        n/=10;
      } 
       while(a!=0)
      {
        al.add(a%10);
        a/=10;
      }  
       while(b!=0)
      {
        al.add(b%10);
        b/=10;
      }  
      Collections.sort(al);
      if(al.size()>9)return false;
      for(int i=1;i<=9;i++)
      {
        if(!al.contains(i))
        {
            return false;
        }
      } 
      return true;

    }
}