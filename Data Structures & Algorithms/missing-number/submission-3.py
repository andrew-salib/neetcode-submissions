class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        # have a counter starting from 0 being incremented by 1 to n
        # iterate through the list and check that each element starting from the beginning (shoiuld be 0 )
        # is equal to the counter, otherwise, return the counter because that is the number that is missing


        for i in range(len(nums)):
            if i not in nums:
                return i

        return len(nums)