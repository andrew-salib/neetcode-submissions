/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = findListSize(head);
        if (size == 1)
        {
            return null;
        }
        
       
        
        if (size - n == 0)
        {
            return head.next;
        }

        int counter = 0; 
        ListNode curr = head; 
        while (counter < size - n - 1)
        {
            counter++;  
            
            curr = curr.next;
          
        }  
        curr.next = curr.next.next; // remove it; 
        return head; 
    }

    public int findListSize(ListNode head)
    {
        int size = 0;
        while (head != null)
        {
            size++;
            head = head.next;
        }

        return size;
    }
}
