class Solution {
    public String restoreString(String s, int[] indices) {
        String output = "";
        char[] outputArr = new char[indices.length];
        for(int i = 0; i < indices.length; i++) {
            outputArr[indices[i]] = s.charAt(i);
        }
        for(int i = 0; i < outputArr.length; i++) {
            output += outputArr[i];
        }
        return output;
    }
}
