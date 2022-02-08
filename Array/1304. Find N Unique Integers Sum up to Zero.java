// 1304. Find N Unique Integers Sum up to Zero
// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

class Solution {
    public int[] sumZero(int n) {
        int[] array = new int[n];
        int num = 1;
        for(int i=0; i<n/2; i++){
            array[i] = num;
            array[n-i-1] = -num;
            num++;
        }
        return array;
    }
}

// O(N/2)
// O(1)
