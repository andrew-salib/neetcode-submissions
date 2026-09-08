class Solution:
    def isPalindrome(self, s: str) -> bool:
        new = ""
        for c in s:
            if c.isalnum():
                new += c.lower()

        ## I understood how the algorithm worked, just did not know how to ensure its alphanum 
        # we can either use the .alnum() function but that requires building a new string
       
        left, right = 0, len(new) - 1
       
        while left < right:
            if new[left] != new[right]:
                print(new[left])
                print(new[right])
                return False
            
            left += 1
            right -= 1
        
        return True