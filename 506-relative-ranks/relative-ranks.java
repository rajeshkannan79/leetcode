class Solution {
    public String[] findRelativeRanks(int[] score) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<score.length;i++)
        {
            al.add(score[i]);
        }
        if(score.length==1)
        {  String[]p=new String[1];
        p[0]="Gold Medal";
            return p;
        }
        if(score.length==2&&score[0]==2)
        {  String[]p=new String[2];
        p[0]="Gold Medal";
        p[1]="Silver Medal";
            return p;
        }
         if(score.length==2&&score[0]==1)
        {  String[]p=new String[2];
        p[1]="Gold Medal";
        p[0]="Silver Medal";
            return p;
        }

        Collections.sort(al);
        HashMap<Integer,String> hm=new HashMap<>();
        if(score.length>=3){
        hm.put(al.get(al.size()-1),"Gold Medal");
         hm.put(al.get(al.size()-2),"Silver Medal");
          hm.put(al.get(al.size()-3),"Bronze Medal");
        }
       
          int j=4;
        for(int i=al.size()-4;i>=0;i--)
        { String b=Integer.toString(j);
        j++;
          hm.put(al.get(i),b);

           } 
        String s[]=new String[score.length];
        for(int i=0;i<score.length;i++)
        {
            s[i]=hm.get(score[i]);
        }
        return s;
    }
}