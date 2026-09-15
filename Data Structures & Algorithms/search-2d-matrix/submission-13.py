class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
 

        # first find which sub-array the target is likely to be in: 

        l = 0 
        r = len(matrix) - 1
        middle_array = 0

        while l <= r: 
            middle_array = l + ((r - l) // 2)
            # then we check the ends of that middle array since its non-decreasing
            if matrix[middle_array][0] > target: 
                r = middle_array - 1
            elif matrix[middle_array][-1] < target: 
                l = middle_array + 1 
            elif matrix[middle_array][0] == target or matrix[middle_array][-1] == target: 
                return True
            else: 
                # we have found the sub-array that would contain the target
                # brak the while loop 
                break 
        
        
        # now do binary search again but inside this array 
        l = 0 
        r = len(matrix[middle_array]) - 1
        arr = matrix[middle_array]

        while l < r: 
            m = l + (( r - l) // 2)
            if arr[m] == target:
                return True
            elif arr[m] > target: 
                r = m - 1 
            elif arr[m] < target: 
                l = m + 1
        
        return False