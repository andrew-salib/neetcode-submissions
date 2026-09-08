class Solution:
    def isValid(self, s: str) -> bool:
        stack = [] 
        stackDict = {")" : "(", "}" : "{", "]" : "["}

        for c in s: 
            if c in stackDict: 
                if stack and stack[-1] == stackDict[c]:
                    stack.pop()
                else:
                    return False 
            else:
                stack.append(c)
        
        return True if not stack else False