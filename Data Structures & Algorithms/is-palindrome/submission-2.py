class Solution:
    def isPalindrome(self, s: str) -> bool:
        pali = []
        for letter in s: 
            if letter.isalnum():
                pali.append(letter.lower())
        
        # need to use 2 pointers to check if its a palindrome 

        l = 0 
        r = len(pali) - 1

        while l <= r:
            if pali[l] == pali[r]:
                l += 1
                r -= 1 
            else:
                return False 
        
        return True 