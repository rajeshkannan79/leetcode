class Solution {
    public int countSeniors(String[] details) {
        int c=0;
     for(int i=0;i<details.length;i++)
     {   int s=Integer.parseInt(details[i].substring(11,13));
        if(s>60)
        c++;
     }  
     return c; 
    }
}