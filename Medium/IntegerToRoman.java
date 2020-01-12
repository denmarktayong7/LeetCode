/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.

Given an integer, convert it to a roman numeral. Input is guaranteed to be within the range from 1 to 3999.

Example 1:

Input: 3
Output: "III"

Example 2:

Input: 4
Output: "IV"

Example 3:

Input: 9
Output: "IX"

Example 4:

Input: 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.

Example 5:

Input: 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
*/
class Solution {
    String output = "";
    public String intToRoman(int num) {
        
        while (num > 0) {
            num = floorDiv(num);
        }
                    
        return output;
    }
    
    public int floorDiv (int num) {
        String numStr = num + "";
        if(numStr.charAt(0) == '4' || numStr.charAt(0) == '9') {
            //do your magic for 4 and 9 prefix values
            if(num >= 900) {
                num = appendOutput(num, 900, "CM");
            }
            else if(num >= 400) {
                num = appendOutput(num, 400, "CD");
            }
            else if(num >= 90) {
                num = appendOutput(num, 90, "XC");
            }
            else if(num >= 40) {
                num = appendOutput(num, 40, "XL");
            }
            else if(num >= 9) {
                num = appendOutput(num, 9, "IX");
                num = 0;
            }
            else if(num >= 4) {
                num = appendOutput(num, 4, "IV");
                num = 0;
            }
        }
        else {
            //do your basic magic for other prefix values
            if(num >= 1000) {
                num = appendOutput(num, 1000, "M");
            }
            else if (num >= 500) {
                num = appendOutput(num, 500, "D");
            }
            else if (num >= 100) {
                num = appendOutput(num, 100, "C");
            }
            else if (num >= 50) {
                num = appendOutput(num, 50, "L");
            }
            else if (num >= 10) {
                num = appendOutput(num, 10, "X");
            }
            else if (num >= 5) {
                num = appendOutput(num, 5, "V");
            }
            else if (num >= 1) {
                appendOutput(num, 1, "I");
                num = 0;
            }
        }
        return num;
    }
    
    public int appendOutput (int num, int romanValue, String letter) {
        int letterCount = num / romanValue;
        for(int i = 0; i < letterCount; i++) {
            this.output+=letter;
        }
        return num%romanValue;
    }
}
