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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head; 
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next; 
        }

        // now slow is at the middle of our array, so we can reverse this second half. 

        ListNode prev = null;
        while (slow != null) {
            ListNode temp = slow.next;
            slow.next = prev; 
            prev = slow; 
            slow = temp; 
        }


        // reversed the second half, we  now need to compare the first and 2nd halves 

        ListNode left = head, right = prev; 
        // check if right != null because it will reach the end first
        while (right != null) {
            if (left.val != right.val) {
                return false; 
            }

            left = left.next;
            right = right.next; 
        }

        return true; 


    }
}