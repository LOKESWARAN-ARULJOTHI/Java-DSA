// 34. Find First and Last Position of Element in Sorted Array
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] output = {-1,-1};
        boolean start=true;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>target) return output;
            if(nums[i]==target){
                if (start){
                    output[0]=i;
                    start=false;
                }
                output[1]=i;
            }
        }
        return output;
    }
}

// O(N)
// O(1)
