// 1380. Lucky Numbers in a Matrix
// https://leetcode.com/problems/lucky-numbers-in-a-matrix/


class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> lucky = new ArrayList<Integer>();
        for(int i=0; i<matrix.length; i++){
            int min=Integer.MAX_VALUE;
            int col=0;
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                    col = j;
                }
            }
            int max = min;
            for(int j=0; j<matrix.length; j++){
                if(matrix[j][col]>max){
                    max = matrix[j][col];
                }
            }
            if(max==min)
                lucky.add(min);
        }
        return lucky;
    }
}

//O(M*N)
//O(1)
