class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        myHash = {}
        # key: index, value: num[i]

        for i in range(len(nums)):
            diff = target - nums[i]
            if diff in myHash:
                return [myHash[diff], i]
            
            myHash[nums[i]] = i
        


        