class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        l = len(nums)
        my_map = defaultdict(int)

        for num in nums: 
            my_map[num] += 1

            if my_map[num] > l/2:
                return num
        
