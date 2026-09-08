class Solution:
    def largestUniqueNumber(self, nums: List[int]) -> int:
        my_hash = {} # key: number, value = frequency 

        for num in nums: 
            if num not in my_hash: 
                my_hash[num] = 1
            else: 
                my_hash[num] += 1
        
        largest = -1
        for num in my_hash:
            if my_hash[num] == 1:
                largest = max(largest, num)

        return largest
        
    