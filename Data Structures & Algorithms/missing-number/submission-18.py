class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        counter = 0 

        nums.sort()

        for i in range(len(nums)):
            if counter != nums[i]:
                return counter
            
            counter += 1
        
        return len(nums)