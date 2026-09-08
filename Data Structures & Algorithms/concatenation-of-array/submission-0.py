class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
     
        n = len(nums)
        # make ans twice the length of nums 
        ans = [0] * (2*n)

        # use enumerate looping here since we want the index and the value 
        for i, num in enumerate(nums):
            ans[i] = ans[i + n] = num
    
        return ans 