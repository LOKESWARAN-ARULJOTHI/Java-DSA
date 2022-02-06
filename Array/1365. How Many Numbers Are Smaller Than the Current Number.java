// 1365. How Many Numbers Are Smaller Than the Current Number
// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int max =0;
        int length = nums.length;
        for(int i: nums){
            if (i>max)
                max = i;
        }
        int[] count = new int[max+1];
        for(int i: nums)
            count[i]+=1;
        for(int i =1; i<max; i++)
            count[i]+=count[i-1];
        for(int i=0; i<length; i++){
            if(nums[i] == 0)
                nums[i] = 0;
            else
                nums[i] = count[nums[i]-1];
        }
        return nums;
    }
}

// O(N)
// O(1)
