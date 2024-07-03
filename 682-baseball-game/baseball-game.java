class Solution {
    public int calPoints(String[] operations) {
      
        int output = 0;

        int[] list = new int[operations.length];

        for (int i = 0 , j = -1; i < operations.length ; i++)
        {
            if (operations[i].equals("C"))
            {
                list[j] = 0;
                j--;
            }else if (operations[i].equals("D")){
                j++;
                list[j] = 2 * (list[j-1]) ;
            }else if (operations[i].equals("+")){
                j++;
                list[j] = (list[j-1] + list[j-2] );
            }else {
                j++;
                list[j] = (Integer.parseInt(operations[i]));
            }

        }

        for (int n : list){
            output += n;
        }


        return output;
    }
}