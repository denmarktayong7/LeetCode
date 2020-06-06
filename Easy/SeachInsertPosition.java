class Solution {
    public int searchInsert(int[] nums, int target) {
        return(getIndex(nums,target));
    }
    public int getIndex(int[] nums, int target) {
        int trgIndex = -1;
        int low = 0;
        int high = nums.length-1;
        //boundary check
        if(target <= nums[0])
            return 0;
        if(target > nums[nums.length - 1])
            return nums.length;
        while (trgIndex == -1 || low == high) {
            int mid = (low + high + 1) / 2;
            System.out.println("low: " + low + " mid: " + mid + " :high: " + high);
            if(nums[mid] == target) {
                trgIndex = mid;
                break;
            }
            if(nums[mid] > target) {
                if(nums[mid - 1] >= target) 
                    high = mid;
                else {
                    trgIndex = mid;
                    break;
                }
            }
            else {
                if(nums[mid + 1] <= target) 
                    low = mid;
                else {
                    trgIndex = mid + 1;
                    break;
                }
            }
        }
        
        return trgIndex;
    }
}
