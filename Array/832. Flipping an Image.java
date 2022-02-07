// 832. Flipping an Image
// https://leetcode.com/problems/flipping-an-image/

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int h = (n+1)/2;
        for(int[] row: image){
            for(int i =0; i<h; i++){
                int temp = row[i]^1;
                row[i] = row[n-1-i]^1;
                row[n-1-i] = temp;
            }
        }
        return image;
    }
}

// O(M*N)
// O(1)
