class Solution:
    def missingNumber(self, nums: List[int]) -> int:

        length = len(nums)

        my_set = set() 

        for i in range(len(nums)):
            my_set.add(nums[i])

        for i in range(len(nums)):
            if i not in my_set: 
                return i
        
        return len(nums)
        
        