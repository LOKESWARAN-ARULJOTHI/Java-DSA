// 1295. Find Numbers with Even Number of Digits
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

class Solution {
    public int findNumbers(int[] nums) {
        int even = 0;
        for(int num : nums){
            if (noOfDigits(num) == 0)
                even++;
        }
        return even;
    }
    int noOfDigits(int num){
        return ((int)Math.log10(num)+1) %2;
    }
}

// O(N)
// O(1)
