class Solution {
    public String greatestLetter(String s) {
        int arr[]=new int[26];
        int arr1[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a'&&s.charAt(i)<='z')
            {
                arr[s.charAt(i)-'a']++;
            }
            else
            {  arr1[s.charAt(i)-'A']++;  
            }
        }
        int max=-1;
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0 && arr1[i]!=0)
            {
                max=i;
            }
        }
        if(max==-1)  return "";
        return (char)(max+65)+"";
                                                                                                                                                                                         
    }
}