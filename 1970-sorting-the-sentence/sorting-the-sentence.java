class Solution {
    public String sortSentence(String s) {
        String []d=s.split(" ");
        String m[]=new String[d.length];
        for(String h:d)
        {
            StringBuilder n=new StringBuilder(h);
            for(int i=0;i<n.length();i++)
            {
                if(n.charAt(i)>='0' && n.charAt(i)<='9')
                {
                    int v=n.charAt(i)-'0';
                    n.deleteCharAt(i);
                    
                    m[v-1]=n.toString();

                }
            }
        }
        String l="";
        for(int i=0;i<m.length;i++)
        {
            l=l+m[i]+" ";
            
        }
        
        return l.trim();

    }
}