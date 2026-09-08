class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        mySet = set(nums) 
        
        res = [] 
        for num in nums: 
            if num - 1 not in mySet:
                res.append(num)

    
        

        max_length = 0 

        for num in res: 
            increment = 1 
            while num + increment in mySet:
                increment += 1 
            
            max_length = max(max_length, increment)

         
        
        return max_length
        