// 59. Spiral Matrix II
// https://leetcode.com/problems/spiral-matrix-ii/

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int num = 1;
        int rowBegin = 0;
        int rowEnd = n-1;
        int colBegin = 0;
        int colEnd = n-1;
        while(num<=n*n){
            for(int i=colBegin; i<=colEnd; i++)
                res[rowBegin][i]=num++;
            rowBegin++;
            for(int i=rowBegin; i<=rowEnd; i++)
                res[i][colEnd]=num++;
            colEnd--;
            for(int i=colEnd; i>=colBegin; i--)
                res[rowEnd][i]=num++;
            rowEnd--;
            for(int i=rowEnd; i>=rowBegin; i--)
                res[i][colBegin]=num++;
            colBegin++;
        }
        return res;
    }
}

// O(N^2)
// O(1)
