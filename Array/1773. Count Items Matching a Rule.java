// 1773. Count Items Matching a Rule
// https://leetcode.com/problems/count-items-matching-a-rule/


class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int output = 0;
        int j = 0;
        if(ruleKey.equals("type")) j=0;
        else if(ruleKey.equals("color") ) j=1;
        else if(ruleKey.equals("name")) j=2;
        for(List<String> item: items){
            if(item.get(j).equals(ruleValue))
                output++;
        }
        return output;
    }
}

// O(M)
// O(1)
