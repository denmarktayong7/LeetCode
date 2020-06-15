class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        highAmong = 0;
        retArr = []
        for i in range(len(candies)):
            highAmong = max(highAmong, candies[i])
        for i in range(len(candies)):
            if(candies[i] + extraCandies >= highAmong):
                retArr.append(True)
            else:
                retArr.append(False)
        return retArr
