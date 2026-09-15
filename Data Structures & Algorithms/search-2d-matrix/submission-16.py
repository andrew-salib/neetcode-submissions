class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        arr = [] 

        for i in range(len(matrix)):
            for j in range(len(matrix[i])):
                arr.append(matrix[i][j])
        
        l = 0 
        r = len(arr) - 1

        while l <= r: 
            m = l + ((r - l) // 2)
            
            if arr[m] == target:
                return True
            elif arr[m] > target: 
                    r = m - 1 
            elif arr[m] < target: 
                l = m + 1
        
        return False 

        