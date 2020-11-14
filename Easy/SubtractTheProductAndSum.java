class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        
        String nStr = Integer.toString(n);
        for (int i = 0; i < nStr.length(); i++) {
            product *= Integer.parseInt(Character.toString(nStr.charAt(i)));
            sum += Integer.parseInt(Character.toString(nStr.charAt(i)));
        }
        
        return product - sum;
    }
}
