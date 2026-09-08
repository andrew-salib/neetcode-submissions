class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        length = 0 
        maxLength = 0 
        for i in range(len(nums)):
            if nums[i] == 1:
                length += 1
                maxLength = max(maxLength, length)
            else:
                length = 0 
        
        return maxLength
