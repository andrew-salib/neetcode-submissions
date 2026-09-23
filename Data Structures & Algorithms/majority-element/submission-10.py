class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        # lets try sorting first 

        nums.sort() 
        
        # this works because after we sort, the index at len(nums) // 2 will be the majority element
        # of the majority element and does not go out of list range (happens by adding 1)
        return nums[(len(nums) // 2)]