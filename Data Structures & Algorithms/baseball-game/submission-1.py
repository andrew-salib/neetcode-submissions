class Solution:
    def calPoints(self, operations: List[str]) -> int:
        stack = []
        n = 0 # record the length of the stack

        for op in operations: 
            if op not in ['+', 'D', 'C']:
                stack.append(int(op))
                n += 1
            elif op == 'D':
                stack.append(2 * stack[n-1])
                n += 1
            elif op == '+':
                stack.append(stack[n-2] + stack[n-1])
                n += 1
            elif op == 'C':
                stack.pop()
                n -= 1
        
        
        res = 0 
        for x in stack: 
            res += x

        return res