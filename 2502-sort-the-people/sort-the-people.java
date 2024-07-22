class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
       String[] arr=new String[names.length];
       HashMap<Integer,String> hm=new HashMap<>();
       for(int i=0;i<heights.length;i++)
       {
        hm.put(heights[i],names[i]);
       }
       Arrays.sort(heights);
       int j=0;
       for(int i=heights.length-1;i>=0;i--)
       {
        arr[j++]=hm.get(heights[i]);
       }
       return arr;
    }
}