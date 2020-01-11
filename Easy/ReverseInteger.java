/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321

Example 2:

Input: -123
Output: -321

Example 3:

Input: 120
Output: 21

Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
*/


class Solution {
    public int reverse(int x) {
        int output = 0;
        int xLen = (x + "").replaceAll("-","").length() - 1;
        
        while (xLen >= 0) {
            double toAdd = (x % 10) * (Math.pow(10,xLen));
            output+=toAdd;
            x/=10;
            xLen--;
        }
        if(output == 2147483647 || output == -2147483648)
            output = 0;
        return output;
    }
}
