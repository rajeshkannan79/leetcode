class Solution {
    public int numberOfSteps(int num) {
        int cp=0;
       while(num>0)
       {
        if(num%2==0){
          num=num/2;
          cp++;}
        else{
         num=num-1;
         cp++;}
       } 
       return cp;
    }
}