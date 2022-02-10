// 66. Plus One
// https://leetcode.com/problems/plus-one/

class Solution {
    public int[] plusOne(int[] digits) {
        int rem=1;
        for(int n = digits.length-1; n>=0; n--){
            int sum = digits[n]+rem;
            if(sum>9){
                digits[n]=0;
            }else{
                digits[n]++;
                rem=0;
            }
            if(rem == 0) return digits;
        }
        digits = new int[digits.length+1];
        System.out.println(Arrays.toString(digits));
        digits[0] = 1;
        return digits;
    }
}

// O(N)
// O(1)
