class Solution {
    public int maxSubArray(int[] nums) {
        //check boundaries
        if(nums.length == 0) {
            return 0;
        }
        double highestSum = Integer.MIN_VALUE; //Highest sum of a sub array
        double currSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            System.out.println(currSum+ " " + highestSum);
            currSum = Math.max(nums[i], (currSum + nums[i]));
            highestSum = Math.max(currSum, highestSum);
        }
        return (int)highestSum;
    }
    
    //BRUTE FORCE SOLUTION
    public int maxSubArrayBFS(int[] nums) {
        //check boundaries
        if(nums.length == 0) {
            return 0;
        }
        int highest = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length;i++) {
            int sum = 0;
            for(int j = i; j < nums.length; j++) {
                sum += nums[j];
                highest = (sum > highest) ? sum : highest;
            }
        }
        return highest;
    }
}
