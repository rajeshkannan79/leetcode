class Solution {
    public boolean canConstruct(String m , String r ) {
    int arr[]=new int[26];
    for(int i=0;i<r.length();i++)
    {
        arr[r.charAt(i)-'a']++;
    }
    for(int i=0;i<m.length();i++)
    {
        arr[m.charAt(i)-'a']--;
        if(arr[m.charAt(i)-'a']==-1)
        {
            return false;
        }
    }
    return true;
    }
}