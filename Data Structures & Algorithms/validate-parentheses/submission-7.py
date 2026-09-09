class Solution:
    def isValid(self, s: str) -> bool:
        my_map = {
            ")" : "(",
            "}" : "{",
            "]" : "["
        }

        stack = [] 

        for c in s: 
            # case 1: see if its an opening or closing 
            if c in my_map: 
                # it is a closing, so we need to see if the top-most elemnt in the stack 
                # is a matching opening bracket 
               
                if stack and stack[-1] == my_map[c]:
                    stack.pop()
                else:
                    return False 
            else: 
                stack.append(c)

        # check if stack is empty at the end of the loop: 
        return True if not stack else False
        

