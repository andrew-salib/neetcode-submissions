class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        length = 0 
        my_set = set() 

        l = 0 
        r = 0

        for i in range(len(s)):
            while s[r] in my_set: 
                
                my_set.remove(s[l])
                l += 1
                
            length = max(length, r - l + 1)
            my_set.add(s[r])
            r += 1
        
        return length
            

