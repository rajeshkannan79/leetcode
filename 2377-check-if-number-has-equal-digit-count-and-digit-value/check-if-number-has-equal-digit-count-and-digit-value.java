class Solution {
    public boolean digitCount(String num) {
    HashMap<Integer,Integer> hm=new HashMap<>();
    for(int i=0;i<num.length();i++)
    {   int b=num.charAt(i)-'0';
        hm.put(b,hm.getOrDefault(b,0)+1);
    }    
    for (int i = 0; i < num.length(); i++) {
            
            
         
            if (hm.getOrDefault(i, 0) !=num.charAt(i)-'0') {
                return false;
            }
        }
    return true;
    }
}