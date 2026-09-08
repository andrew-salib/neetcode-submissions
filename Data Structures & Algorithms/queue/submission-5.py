class ListNode:
    def __init__(self, val):
        self.val = val
        self.next = None

class Deque:
    
    def __init__(self):
        self.left = self.right = None #pointers to the head and tail of list initally none


    def isEmpty(self) -> bool:
        if not self.left and not self.right:
            return True
        
        return False

    def append(self, value: int) -> None:
        node = ListNode(value)
        
        #check if queue is not empty:
        if self.right:
            self.right.next = node
            self.right = self.right.next
        else:
            self.left = self.right = node
        

    def appendleft(self, value: int) -> None:
        node = ListNode(value)

        if self.left:
            node.next = self.left
            self.left = node
        else:
            self.left = self.right = node

    
    def pop(self) -> int:
        if not self.left:
            return -1

        value = self.right.val
        if self.left == self.right:  # If there's only one element in the deque
            self.left = self.right = None
        else:
            curr = self.left
            while curr.next != self.right:
                curr = curr.next
            self.right = curr
            self.right.next = None
        return value


    def popleft(self) -> int:
        if not self.left:
            return -1
        
        val = self.left.val
        
        self.left = self.left.next
        if not self.left:
            self.right = None
        
        return val
        
