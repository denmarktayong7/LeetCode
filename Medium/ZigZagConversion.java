/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I
*/
class Solution {
    public String convert(String s, int numRows) {
        if(s == null || s.length() == 0 || numRows == 0) {
            return "";
        }    
        
        String output = "";
        int increment = 1;
        String[] rowStr = new String[numRows];
        for(int i = 0; i < rowStr.length; i++) {
            rowStr[i] = "";
        }
        for(int i = 0, j = 0; i < s.length(); i++, j+=increment)  {
            if (numRows == 1) {
                j = 0;
            }
            else if(j == numRows) { 
                j-=2; 
                increment = -1;
            }
            else if (j == -1) {
                j+=2;
                increment = 1;
            }
            rowStr[j] += s.substring(i,i+1);
        }
        for(int i = 0; i < rowStr.length; i++) {
            output += rowStr[i];
        }
        return output;
    }
}
