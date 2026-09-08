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
    public void reorderList(ListNode head) {
        ListNode slow = head; 
        ListNode fast = head; 
        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 
        }

        ListNode l2 = slow.next;
        ListNode prev = null; 
        slow.next = null;  // we just disconnected the 2 halves of the list 


        // need to first reverse the second half 
        while (l2 != null) {
            ListNode temp = l2.next; 
            l2.next = prev; 
            prev = l2; 
            l2 = temp; 
        }

        ListNode second = prev;
        ListNode curr = head; 


        while (second != null) {
            ListNode temp1 = curr.next; 
            ListNode temp2 = second.next; 
            curr.next = second; 
            second.next = temp1; 
            curr = temp1; 
            second = temp2; 
        }
    }
}
