class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        if len(nums) <= 1:
            return False
        
        newSet = set(nums)

        if len(newSet) != len(nums):
            return True
        else:
            return False