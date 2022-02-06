// 1480. Running Sum of 1d Array
// https://leetcode.com/problems/running-sum-of-1d-array/submissions/

class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i =0; i<n; i++){
            if(i == 0)
                ans[0]= nums[0];
            else
                ans[i] = nums[i] + ans[i-1];
        }
        return ans;
    }
}

// O(N)
// O(1)
