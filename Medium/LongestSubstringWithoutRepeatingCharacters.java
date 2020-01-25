/*
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 

Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0)
            return 0;
        
        int out = 0;
        int startIdx = 0;
        ArrayList<String> strArr = new ArrayList<String>();
        for(int i = 0; i < s.length(); i++) {
            String letter = s.substring(i, i+1);
            int letterIdx = strArr.indexOf(letter);
            if(letterIdx != -1) {
                strArr = new ArrayList<String>();
                startIdx += letterIdx + 1;
                i = startIdx - 1;
            }
            else {
                strArr.add(letter);
                if (strArr.size() > out) {
                    out = strArr.size();
                }
            }
        }
        
        return out;
    }
}
