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
    public ListNode mergeKLists(ListNode[] lists) {
        // intution is to go through the array of lists and merge 2 at a time till we get to the end. 
        if (lists.length == 0) {
            return null;
        }
        
        for (int i = 1; i  < lists.length; i++) {
            lists[i] = merge(lists[i], lists[i-1]);
        }

       return lists[lists.length - 1];


    }

    public ListNode merge(ListNode head1, ListNode head2) {
        
        ListNode newNode = new ListNode(); 
        ListNode dummy = newNode; 

        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                dummy.next = head1;
                head1 = head1.next;
            }
            else {
                dummy.next = head2;
                head2 = head2.next;
            }
            dummy = dummy.next; 

            
        }

        if (head1 != null) {
            dummy.next = head1;
        }

        if (head2 != null) {
            dummy.next = head2;
        }

        return newNode.next;
    }
}
