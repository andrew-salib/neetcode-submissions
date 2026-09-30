class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        
        counter = 0 
        length = len(nums)
        
        for i in range(len(nums)):
            if counter not in nums: 
                return counter 
            
            counter += 1
        
        return length