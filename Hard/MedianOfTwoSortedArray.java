/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0

Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
*/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int counter = 0, i = 0, j = 0, m = nums1.length, n = nums2.length, prev = 0, curr = 0;
        int totalLen = m + n;
        int mid = (totalLen / 2) + 1;
        boolean isOdd = (totalLen % 2 != 0) ? true : false;
        
        while (counter != mid) {
            int val1 = Integer.MAX_VALUE, val2 = Integer.MAX_VALUE;
            if(i != m) {
                val1  = nums1[i];
            }
            if(j != n) {
                val2 = nums2[j];
            }
            
            prev = curr;
            if(val1 < val2) {
                curr = val1;
                i++;
            }
            else {
                curr = val2;
                j++;
            }
            
            counter ++;
        }
        if(!isOdd)
            return (prev + curr) / 2.0;
        return curr;
    }
}
