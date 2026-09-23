class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        # lets try sorting first 

        nums.sort() 
        
        # this works because after we sort, the index at len(nums) // 2 will be the first occurance
        # of the majority element 
        return nums[len(nums) // 2]