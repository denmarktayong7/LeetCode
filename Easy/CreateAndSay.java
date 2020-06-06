class Solution {
    public String countAndSay(int n) {
        String outString = "1";
        for(int i = 1; i < n; i ++) {
            outString = say(outString);
        }
        return outString;
    }
    public String say (String nStr) {
        String str = "";
        int index = 0;
        int count = 0;
        char prevNum = nStr.charAt(index);
        while(index != nStr.length()) {
            char currNum = nStr.charAt(index);
            if(prevNum != currNum) {
                str += "" + count + prevNum;
                count = 1;
                prevNum = currNum;
            }
            else {
                count++;
            }
            index ++;
            if (index == nStr.length()) {
                str += "" + count + currNum;
            }
        }
        return str;
    }
}

