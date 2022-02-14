// 238. Product of Array Except Self
// https://leetcode.com/problems/product-of-array-except-self/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;  
        int[] output = new int[n];
        
        output[0]=1;
        
        for(int i=0; i<=n-2;i++)
            output[i+1]=output[i]*nums[i];
        
        int product = 1;
        for(int i=n-1; i>=0; i--){
            output[i]=output[i]*product;
            product*=nums[i];
        }
        return output;
    }
}

// O(N)
// O(1)
