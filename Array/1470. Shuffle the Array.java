// 1470. Shuffle the Array
// https://leetcode.com/problems/shuffle-the-array/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int length = nums.length;
        int[] ans = new int[nums.length];
        for(int i=0, j=n, index=0; index<length; i++, j++){
            ans[index++] = nums[i];
            ans[index++] = nums[j];
        }
        return ans;
    }
}

// O(N)
// O(1)
