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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1Reversed = reverseList(l1);
        ListNode l2Reversed = reverseList(l2); 
        
        String s1 = ""; 
        while (l1Reversed != null) {
            s1 += String.valueOf(l1Reversed.val);
            l1Reversed = l1Reversed.next;
        }

        ListNode curr2 = l2Reversed; 
        String s2 = "";
        while (curr2 != null) {
            s2 += String.valueOf(curr2.val);
            curr2 = curr2.next;
        }

        int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
        int[] digits = convertIntToArray(sum);
        
        ListNode newList = new ListNode(-1);
        ListNode curr = newList; 
        for (int n : digits) {
            ListNode newNode = new ListNode(n);
            curr.next = newNode; 
            curr = newNode; 
        }

        return reverseList(newList.next);

    }

    public static int[] convertIntToArray(int number) {
        String numStr = String.valueOf(number); // Convert int to String
        int[] digits = new int[numStr.length()]; // Create an array of appropriate size

        for (int i = 0; i < numStr.length(); i++) {
            // Get each character and convert it back to an integer
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }

        return digits;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp; 

        }

        return prev;
    }
}
