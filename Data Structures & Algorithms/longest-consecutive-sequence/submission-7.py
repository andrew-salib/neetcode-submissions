class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        length = 0 
        
       
        max_length = 0 
        
        for num in nums: 
            increment = 1
            while num + increment in nums: 
                increment += 1
                length = increment 
                
            max_length = max(max_length, increment)
        
        return max_length