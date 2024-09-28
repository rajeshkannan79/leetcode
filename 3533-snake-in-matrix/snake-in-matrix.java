class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
    HashMap<String,Integer> hm=new HashMap<>();
    int ans=0;
    hm.put("RIGHT",1);
    hm.put("LEFT",-1);
    hm.put("UP",-n);
    hm.put("DOWN",n);
    for(int i=0;i<commands.size();i++)
    {

        ans+=hm.get(commands.get(i));
    }    
    return ans;
    }
}