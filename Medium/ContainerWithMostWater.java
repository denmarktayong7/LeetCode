public class Solution {
    public int maxArea(int[] height) {
        int bestArea = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            bestArea = Math.max(bestArea, Math.min(height[l],height[r]) * (r - l));
            if(height[r] > height[l])
                l++;
            else
                r--;
        }
        return bestArea;
    }
}
