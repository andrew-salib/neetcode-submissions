class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        myHash = {}

        for i in range(len(nums)):
            myHash[nums[i]] = i

        for i in range(len(nums)):
            diff = target - nums[i]
            if diff in myHash and myHash[diff] != i:
                return [i, myHash[diff]]