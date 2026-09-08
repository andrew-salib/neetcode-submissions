class ListNode:
    def __init__(self, val, next_node=None):
        self.val = val
        self.next = next_node

class LinkedList:
    
    def __init__(self):
        #head 
        self.head = ListNode(-1)
        self.tail = self.head
      
    
    def get(self, index: int) -> int:
        curr = self.head.next
        i = 0
        #need to get length of the list first:
        while curr:
            if i == index:
                return curr.val
            i += 1
            curr = curr.next
        return -1
        
        
            
        
    def insertHead(self, val: int) -> None:
        # first make new node:
        new_node = ListNode(val)
        new_node.next = self.head.next
        self.head.next = new_node

        #check if the list was empty:
        if new_node.next == None:
            self.tail = new_node # if list is empty, new node becomes both head and tail

    def insertTail(self, val: int) -> None:
        new_node = ListNode(val)
        self.tail.next = new_node
        self.tail = self.tail.next
        

    def remove(self, index: int) -> bool:
        cur = self.head
        i = 0

        while i < index and cur:
            i += 1
            cur = cur.next
        
        #remove the node ahead of cur:
        #check if they are not none
        if cur and cur.next:
            # check if cur.next is tail (we are at the end of the list)
            # so we will need to also update the tail

            if cur.next == self.tail:
                self.tail = cur
            
            cur.next = cur.next.next
            return True
        return False
        

    def getValues(self) -> List[int]:
        arr = []
        curr = self.head.next
        while (curr != None):
            arr.append(curr.val)
            curr = curr.next
        return arr
