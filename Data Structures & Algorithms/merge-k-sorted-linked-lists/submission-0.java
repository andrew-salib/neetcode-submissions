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
        List<Integer> list = new ArrayList<>(); 

        for (ListNode n : lists) {
            ListNode curr = n; 
            while (curr != null) {
                list.add(curr.val);
                curr = curr.next;
            }
        }

        Collections.sort(list);

        ListNode dummy = new ListNode(); 
        ListNode cur = dummy; 
        for (int n : list) {
            ListNode currentNode = new ListNode(n);
            cur.next = currentNode;
            cur = cur.next; 
        }

        return dummy.next;



    }
}
