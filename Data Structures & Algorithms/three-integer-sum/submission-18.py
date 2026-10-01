class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort() # sort the input first 
        res = []

        # for loop to check different combinations 

        for i in range(len(nums)):
            # sum will be positive if smallest element is already bigger than 0
            if nums[i] > 0:
                break

            if i > 0 and nums[i] == nums[i-1]:
                continue
            
            # do two sum with sorted input, target is going to be the negative of them 
            l = i + 1
            r = len(nums) - 1 

            while l < r:
                target = nums[l] + nums[r] + nums[i]
                if target > 0:
                    r -= 1
                elif target < 0:
                    l += 1
                else:
                    res.append([nums[i], nums[l], nums[r]])
                    l += 1
                    r -= 1 

                    while nums[l] == nums[l-1] and l < r: 
                        l += 1
        
        return res

            
            