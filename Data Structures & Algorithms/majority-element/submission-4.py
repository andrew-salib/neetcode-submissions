import random

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        
        # since the probability of choosing greater element is > 50%, 
        # a randomly chosen element results in a constant number of while loop counters 
        # makes it O(1) in a while loop rather than the usual O(n)
        # o(n) comes from checking the count of the element 

        l = len(nums)
        while True: 
            num = random.choice(nums)
            if nums.count(num) > l // 2:
                return num