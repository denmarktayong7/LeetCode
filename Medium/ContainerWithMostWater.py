class Solution:
    def maxArea(self, height: List[int]) -> int:
        bestArea = 0
        pt1 = 0 #left pointer
        pt2 = len(height) - 1 #right pointer
        while(pt1 < pt2):
            bestArea = max(bestArea, min(height[pt1], height[pt2]) * (pt2 - pt1))
            if(height[pt1] > height[pt2]):
                pt2 -= 1
            else:
                pt1 += 1
        return bestArea        
