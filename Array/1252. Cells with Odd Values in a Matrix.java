// 1252. Cells with Odd Values in a Matrix
// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        for(int[] arr : indices){
            int row = arr[0];
            int col = arr[1];
            for(int j=0; j<n; j++){
                mat[row][j]++;
            }
            for(int i=0; i<m; i++){
                mat[i][col]++;
            }
        }
        int odd = 0;
        for(int[] row:mat){
            for(int i =0; i<n;i++){
                if (row[i]%2!=0)
                    odd++;
            }
        }
        return odd;
    }
}

// O(M*N)
// O(M*N)
