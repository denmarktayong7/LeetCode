/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true

Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Follow up:

Coud you solve it without converting the integer to a string?
*/
class Solution {
    public boolean isPalindrome(int x) {
        int xVal = x;
        int rev = 0;
        
        boolean stop = false;
        do {
            if (x <= 9 && -9 <= x)
                stop = true;
            //pop logic
            int popVal = x % 10;
            x/=10;
            
            //push logic
            rev = rev * 10 + popVal;
            
            
        }while (!stop);
        
        if(rev == xVal && xVal >= 0)
            return true;
        return false;
    }
}
