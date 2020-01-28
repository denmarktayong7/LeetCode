/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
*/
class Solution {
    
    public String longestPalindrome(String s) {
        if(s.length() > 1000 || s.length() == 0 || s == null)
            return "";
        
        int currId = 0;
        String output = s.substring(0,1);
        
        while (currId < s.length() - (output.length() / 2)) {
            String temp = returnPalindrome(s, currId);
            if(temp.length() > output.length())
                output = temp;
            currId++;
        }
        
        return output;
    }
    
    public String returnPalindrome(String s, int currId) {
        char mid = s.charAt(currId);
        int i = currId - 1, j = currId + 1;
        while(j < s.length() && mid == s.charAt(j)) {
            j++;
        }
        String output = s.substring(currId, j);
        while (true) {
            if(i < 0 || j >= s.length())
                break;
            String sub = "";
            char left = s.charAt(i);
            char right = s.charAt(j);
            if(left != right)
                break;
            output = s.substring(i, j+1);
            i--;
            j++;
            
        }
        return output;
    }
}
