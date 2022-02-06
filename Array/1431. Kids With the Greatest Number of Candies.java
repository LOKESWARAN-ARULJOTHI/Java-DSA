// 1431. Kids With the Greatest Number of Candies
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int highestCandies = candies[0];
        int length = candies.length;
        ArrayList<Boolean> ans = new ArrayList<Boolean>();
        for(int i=1; i<length; i++)
            highestCandies = candies[i]> highestCandies? candies[i]: highestCandies;
        for (int i=0; i<length; i++ )
            ans.add( (candies[i]+extraCandies) >= highestCandies );
        return ans;
    }
}

// O(2N) = O(N)
// O(1)
