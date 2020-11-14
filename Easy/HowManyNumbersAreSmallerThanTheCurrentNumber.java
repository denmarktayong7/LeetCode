class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] retArr = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int total = 0;
            for(int j = 0; j < nums.length; j++) {
                if(j == i)
                    continue;
                if(nums[j] < nums[i]) {
                    total++;
                }
            }
            retArr[i] = total;
        }
        return retArr;
    }
}