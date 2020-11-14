class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int total = 0;
        for(int i = 0; i < arr.length; i++) {
            int j = 1;
            while(i + j <= arr.length) {
                if(isOdd(j)) {
                    total += totalSubArray(i,j,arr);
                }
                j++;
            }
        }
        return total;
    }
    
    public int sumArr(int[] arr) {
        int total = 0;
        for(int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
    
    public boolean isOdd(int num) {
        return num % 2 != 0;
    }
    
    public int totalSubArray(int index, int length, int[] arr) {
        int total = 0;
        for(int i = index; i < index + length; i++) {
            total += arr[i];
        }
        return total;
    }
}
