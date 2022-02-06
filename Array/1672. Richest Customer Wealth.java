// 1672. Richest Customer Wealth
// https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for( int[] account : accounts){        
            int tempWealth = 0;
            for ( int money : account ){
                tempWealth += money;
            }
            if (tempWealth > maxWealth)
                maxWealth = tempWealth;
        }
        return maxWealth;
    }
}

// O(M*N)
// O(1)
