// 1886. Determine Whether Matrix Can Be Obtained By Rotation
// https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/

class Solution {
    
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0; i<4; i++){
            if (checkEqual(mat,target)){
                return true;
            }
            rotate(mat);
        }
        return false;
    }
    boolean checkEqual(int[][] mat, int[][] target){
        int n=mat.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if (mat[i][j] != target[i][j])
                    return false;
            }
        }
        return true;
    }
    int[][] rotate(int[][] mat){
        int n=mat.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                int temp = mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][n-1-j];
                mat[i][n-1-j] =  temp;
            }
        }
        return mat;
        
    }
}

// O(N^2)
// O(1)
