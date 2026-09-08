class Solution:
    def isPalindrome(self, s: str) -> bool:
        copyS = s.replace(" ", "").lower()
        copyS2 = re.sub(r'[^a-zA-Z0-9]', "", copyS)

        print(copyS2)
        r = len(copyS2) - 1
        for i in range(len(copyS2)):
            if copyS2[i] != copyS2[r]:
              return False 
            
            r -= 1 
        
        return True