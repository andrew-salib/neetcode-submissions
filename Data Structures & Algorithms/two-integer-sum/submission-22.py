class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        myHash = {} # gonna store value -> index 
        
        for i in range(len(nums)):
            diff = target - nums[i]
            if diff in myHash: 
                return [myHash[diff], i]
            myHash[nums[i]] = i
