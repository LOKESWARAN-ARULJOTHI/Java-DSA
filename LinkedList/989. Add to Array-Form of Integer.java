// 989. Add to Array-Form of Integer
// https://leetcode.com/problems/add-to-array-form-of-integer/

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        LinkedList<Integer> list = new LinkedList();
        int i = n;
        while(--i>=0 || k>0){
            if(i>=0)
                k+= num[i];
            list.addFirst(k%10);
            k/=10;
        }

        return list;
    }
}

// O(max(N, log K)
// O(max(N, log K)
