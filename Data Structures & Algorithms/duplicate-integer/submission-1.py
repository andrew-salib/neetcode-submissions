class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        for i in range(len(nums)):
            print("I number is: ", nums[i])
            for j in range(i + 1, len(nums)):
                print("J number is: ", nums[j])
                if nums[i] == nums[j]:
                    return True 
        
        return False 