class Solution {
    public int countPrimes(int n) {
        if(n==0||n==1)
        {
            return 0;
        }
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 1;
        }

        int count = 0;
        arr[0] = 0;
            arr[1] = 0;
        

        for (int i = 2; i < n; i++) {    
            if (arr[i] == 1) {
                for (int j = i * 2; j < n; j += i) {
                    arr[j] = 0;
                }
            }
        }

        for (int j = 0; j < n; j++) {
            if (arr[j] == 1) {
                count++;
            }
        }
        
        return count;
        
    }
}