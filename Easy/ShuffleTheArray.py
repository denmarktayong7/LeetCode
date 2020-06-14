class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        retArr = []
        for i in range(n):
            retArr.append(nums[i])
            retArr.append(nums[i + n])
        return retArr
        
