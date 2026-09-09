class Solution:
    def isPalindrome(self, s: str) -> bool:
        new_string = s.lower()
        alpha_num = self.isAlphaNum(new_string)

        l = 0 
        r = len(alpha_num) - 1 
        while l < r: 
            if alpha_num[l] != alpha_num[r]:
                return False 
            
            l += 1
            r -= 1

        return True


    def isAlphaNum(self, s: str) -> bool: 
        res = ''

        for c in s: 
            if c.isalnum():
                res += c
        
        return res 