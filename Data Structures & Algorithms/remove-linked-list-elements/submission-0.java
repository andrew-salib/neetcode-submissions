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
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr = head; 
        List<Integer> list = new ArrayList<>(); 

        while (curr != null) {
            list.add(curr.val);
            curr = curr.next; 
        }

        //System.out.println(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == val) {
                list.remove(i);
            }
        }

        if (list.size() == 0) {
            return null;
        }

        ListNode newList = new ListNode(list.get(0));
        ListNode curr2 = newList; 
        for (int i = 1; i < list.size(); i++) {
            ListNode newNode = new ListNode(list.get(i)); 
            curr2.next = newNode; 
            curr2 = curr2.next;

        }
        return newList;
    }
}