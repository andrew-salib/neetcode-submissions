class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        # 2 pointer + binary search question since we have a sorted input 
        # and O(n) solution O(1) space means we need to traverse the array 
        # a total of one time 

        l = 0 
        r = len(numbers) - 1 

        while l <= r: 

            if numbers[l] + numbers[r] > target: 
                r -= 1 
            elif numbers[l] + numbers[r] < target: 
                l += 1
            else:
                return [l + 1, r + 1]