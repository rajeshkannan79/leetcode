class Solution {
    public String reformatDate(String date) {
       String []d=date.split(" ");
       String s="";
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<d[0].length();i++)
       {
        if(d[0].charAt(i)>='0'&&d[0].charAt(i)<='9')
          s=s+d[0].charAt(i);
       } 
       HashMap<String,String> hm=new HashMap<>();
       
        hm.put("Jan","01");hm.put("Feb","02");hm.put("Mar","03");hm.put("Apr","04");hm.put("May","05");hm.put("Jun","06");hm.put("Jul","07");hm.put("Aug","08");hm.put("Sep","09");hm.put("Oct","10");hm.put("Nov","11");hm.put("Dec","12");

       
       sb.append(d[2]);
       sb.append("-");
       sb.append(hm.get(d[1]));
       sb.append("-");
       if(s.length()==1)
        { sb.append("0");
        sb.append(s);
           }
                  else

           sb.append(s);
       return sb.toString();
    }
}