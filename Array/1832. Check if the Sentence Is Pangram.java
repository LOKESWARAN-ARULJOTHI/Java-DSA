// 1832. Check if the Sentence Is Pangram
// https://leetcode.com/problems/check-if-the-sentence-is-pangram/

class Solution {
    public boolean checkIfPangram(String sentence) {
        for (int i=97; i<= 122; i++){
            if(sentence.indexOf((char)i) == -1) return false;
        }
        return true;
    }
}

// O(N)
// O(1)
