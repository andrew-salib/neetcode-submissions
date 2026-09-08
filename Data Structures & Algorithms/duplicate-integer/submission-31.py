class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        lenArr = len(nums)
        lenSet = len(set(nums))

        return lenArr != lenSet