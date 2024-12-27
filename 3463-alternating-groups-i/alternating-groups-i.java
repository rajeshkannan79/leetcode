class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
      int cur=0;int pre=0;int next=0;int c=0;
      for(int i=0;i<colors.length;i++)
      {
        cur=colors[i];
        pre =colors[(i+1)%colors.length];
        next=colors[(i+2)%colors.length];
        if(pre !=next&&cur!=pre){
            c++;
        }
      }  
      return c;
    }
}