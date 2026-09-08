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
        if (lists.length == 0) return null; 

        for (int i = 1; i < lists.length; i++) {
            lists[i] = merge(lists[i], lists[i-1]);
        }

        return lists[lists.length - 1];
    }


    public ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(); 
        ListNode curr = dummy; 

        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                curr.next = head1;
                head1 = head1.next;
            }
            else {
                curr.next = head2;
                head2  = head2.next;

            }

            curr = curr.next;
        }

        if (head1 == null) {
            curr.next = head2;
        }

        if (head2 == null) {
            curr.next = head1;
        }

        return dummy.next;
    }
}
