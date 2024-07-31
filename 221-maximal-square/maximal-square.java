class Solution {
    public int maximalSquare(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int sol[][]=new int[n][m];
        int max=0;
       for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '0') {
                    sol[i][j] = 0;
                } else {
                    if (i == 0 || j == 0) {
                        sol[i][j] = matrix[i][j] - '0';
                    } else {
                        sol[i][j] = Math.min(Math.min(sol[i - 1][j], sol[i][j - 1]), sol[i - 1][j - 1]) + 1;
                    }
                    max = Math.max(sol[i][j], max);
                }
            }
        }

        return max * max;
    }}