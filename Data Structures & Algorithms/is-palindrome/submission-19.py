class Solution:
    def isPalindrome(self, s: str) -> bool:
        lowercase = s.lower()
        alphaNum = self.isAlphaNum(lowercase)

        l = 0 
        r = len(alphaNum) - 1

        while l < r: 
            if alphaNum[l] != alphaNum[r]:
                return False
            
            l += 1
            r -= 1
        
        return True
    

    def isAlphaNum(self, s: str) -> str: 
        clean = ''.join(filter(str.isalnum, s))
        return clean 