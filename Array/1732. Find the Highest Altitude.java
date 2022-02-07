// 1732. Find the Highest Altitude
// https://leetcode.com/problems/find-the-highest-altitude/

class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int length = gain.length;
        if(gain[0]>max) max=gain[0];
        for(int i=1; i<length; i++){
            gain[i] = gain[i]+gain[i-1];
            if(gain[i]>max)
                max=gain[i];
        }
        return max;
    }
}

// O(N)
// O(1)
