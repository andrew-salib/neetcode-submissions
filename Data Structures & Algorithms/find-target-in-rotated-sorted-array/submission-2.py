class Solution:
    def search(self, nums: List[int], target: int) -> int:
        l = 0 
        r = len(nums) - 1 

        while l <= r: 
            m = l + ((r - l) // 2) 
            
            if target == nums[m]: 
                return m 
            
            if nums[l] <= nums[m]:
                # 2 cases: 

                #case 1: the target is in the right sub-half of the array: 
                if target > nums[m] or target < nums[l]:
                    l = m + 1 
                else: 
                    r = m - 1 
            else: 
                # another 2 cases here 

                # case 1: its in the left sub-array: 
                if target < nums[m] or target > nums[r]:
                    r = m - 1 
                else: 
                    l = m + 1 

        
        return -1