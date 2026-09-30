class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        
        # constant space but needs to be sorted 
        counter = 0 

        nums.sort()

        for i in range(len(nums)):
            if counter not in nums:
                return counter
            
            counter += 1
        
        return len(nums)
        