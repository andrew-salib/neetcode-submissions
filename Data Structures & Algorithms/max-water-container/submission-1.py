class Solution:
    def maxArea(self, heights: List[int]) -> int:
        answer = 0 
        l = 0
        r = len(heights) - 1 

        while l < r: 
            smaller_height = min(heights[l], heights[r])
            cur_height = (r - l) * smaller_height

            answer = max(answer, cur_height)

            if heights[l] <= heights[r]:
                l += 1
            else:
                r -= 1
        
        return answer

        