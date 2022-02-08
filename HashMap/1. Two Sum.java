// 1. Two Sum
// https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> dict = new HashMap<>();
        for(int i=0; i<n; i++){
            if(dict.containsKey(nums[i])){
                return new int[] {dict.get(nums[i]), i};
            } else{
                dict.put(target-nums[i], i);
            }
        }
        return null;
    }
}

// O(N)
// O(N)
