class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        arr = []
        l = 0
        
        while l < len(nums):
            product = 1
            for i in range(len(nums)):
                if i == l: 
                    continue
                
                product = product * nums[i]
            arr.append(product)
            l += 1
        
        return arr

