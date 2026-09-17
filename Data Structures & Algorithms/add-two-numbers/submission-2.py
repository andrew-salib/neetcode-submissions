# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:

        sum1 = 0 
        sum2 = 0 

        curr1 = l1 

        product = 1 
        while curr1:
            sum1 += product * curr1.val
            product *= 10 
            curr1 = curr1.next 
        
        product = 1 
        curr2 = l2 
        while curr2: 
            sum2 += product * curr2.val
            product *= 10 
            curr2 = curr2.next 
        
        result = sum1 + sum2 
        
        l3 = ListNode()
        dummy = l3 

        while True: 
            dummy.val = (result % 10)
            result = result // 10
            if result > 0: 
                dummy.next = ListNode()
                dummy = dummy.next
            else:
                break

        return l3