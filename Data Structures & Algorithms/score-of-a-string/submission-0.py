class Solution:
    def scoreOfString(self, s: str) -> int:
        result = 0 
        for i in range(len(s) - 1):
            # for i and i+1 index, get the ord of them and subtract their abs 
            diff = abs(ord(s[i]) - ord(s[i+1]))
            result += diff 
        return result