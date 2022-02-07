// 1389. Create Target Array in the Given Order
// https://leetcode.com/problems/create-target-array-in-the-given-order/

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int length = index.length;
        int[] list = new int[length];
        ArrayList<Integer> ans = new ArrayList<Integer>(length);
        for (int i=0; i<length; i++){
            ans.add(index[i], nums[i]);
        }
        for(int i=0; i<length; i++){
            list[i] = ans.get(i);
        }  
        return list;    
    }
}

// O(N^2)
// O(1)
