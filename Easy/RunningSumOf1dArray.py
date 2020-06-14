class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        retArr = []
        for i in range(len(nums)):
            prevTotal = 0 if i == 0 else retArr[i-1]
            retArr.append(nums[i] + prevTotal)
        return retArr;
