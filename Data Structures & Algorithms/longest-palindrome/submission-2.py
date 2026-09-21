class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        my_map = {}
        res = 0 
        for c in s: 
            if c not in my_map: 
                my_map[c] = 1 
            else:
                my_map[c] += 1
            
            if my_map[c] % 2 == 0: 
                res += 2
        
        print(my_map)





        for cnt in my_map.values():
            if cnt % 2: 
                res += 1 
                break 
        
        return res