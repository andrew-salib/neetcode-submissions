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

        while (fast != null && fast.next != null)
        {
            slow = slow.next; 
            fast = fast.next.next;
        } 

        // slow is at the midpoint
        ListNode l2 = slow.next; // start from after the midpoint
        ListNode prev = slow.next = null; 

        // reverse the 2nd half; 
        while (l2 != null)
        {
            ListNode temp = l2.next; 
            l2.next = prev; 
            prev = l2; 
            l2 = temp;
        }

        // 2nd half is now reversed, sort through both lists and merge them in one by one 
        ListNode first = head; 
        ListNode second = prev; 

        while (second != null)
        {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1; 
            second = temp2; 
        }
    }
}
