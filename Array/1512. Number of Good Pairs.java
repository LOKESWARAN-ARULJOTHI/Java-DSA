// 1512. Number of Good Pairs
// https://leetcode.com/problems/number-of-good-pairs/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        int length = nums.length;
        for(int i=0; i<length; i++){
            for(int j=i+1; j<length; j++){
                if(nums[i] == nums[j])
                    pairs++;
            }
        }
        return pairs;
    }
}

// O(N^2)
// O(1)
