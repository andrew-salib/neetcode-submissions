class Solution:
    def countElements(self, arr: List[int]) -> int:
        my_map = {}
        for num in arr: 
            if num not in my_map: 
                my_map[num] = 1
            else: 
                my_map[num] += 1 


        res = 0 

        for num in arr:
            if num + 1 in my_map: 
                res += 1
        
        return res
                

            