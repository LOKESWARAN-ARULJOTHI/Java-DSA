// 75. Sort Colors
// https://leetcode.com/problems/sort-colors/

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low=0, mid=0;
        int high=n-1;
        while(mid<=high){
            if(nums[mid]==2){
             int temp= nums[high];
             nums[high]=nums[mid];
             nums[mid]=temp;
             high--;
            } else if(nums[mid]==0){
                 int temp=nums[low];
                 nums[low]=nums[mid];
                 nums[mid]=temp;
                 low++;
                 mid++;
            } else if(nums[mid]==1){
                mid++;
            }
        }
    }
}

// O(N)
// O(1)
