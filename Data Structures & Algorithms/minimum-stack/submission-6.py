class MinStack:

    def __init__(self):
        self.stack = [] 
        self.minStack = [] 

    def push(self, val: int) -> None:
        self.stack.append(val)

        # check whether the val is smaller than minStack[-1]
        # or larger than it, check if minStack aint null
        # then decide what gets "stacked" onto what 

        if self.minStack: 
            if val <= self.minStack[-1]:
                self.minStack.append(val)
            else:
                self.minStack.append(self.minStack[-1])
        else:
            self.minStack.append(val)

    def pop(self) -> None:
        if not self.stack or  not self.minStack: 
            return None 
        
        self.stack.pop()
        self.minStack.pop()
        

    def top(self) -> int:
        if self.stack: 
            return self.stack[-1]
        else:
            return -1 

    def getMin(self) -> int:
        return self.minStack[-1]
        
