// 1920. Build Array from Permutation.java
// https://leetcode.com/problems/build-array-from-permutation/

class Solution {
    public int[] buildArray(int[] nums) {
        int numsLength = nums.length;
        int[] ans = new int[numsLength];
        for(int i=0; i<numsLength; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
