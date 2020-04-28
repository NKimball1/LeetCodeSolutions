/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if (head.next == null && n == 1) return null;
        
        
        ListNode curr = head;
        ListNode tail = head;
        
        //If only delete last node
        if (n == 1) {
            tail = curr.next;
            while (tail.next != null) {
                curr = tail;
                tail = tail.next;
            }
            curr.next = null;
            return head;
        }
        
        
        //Set tail to be given n nodes ahead
        for (int i = 1; i < n; i++) tail = tail.next;
        
        

        while (tail.next != null) {
            curr = curr.next;
            tail = tail.next;
        }
        
        curr.val = curr.next.val;
        curr.next = curr.next.next;
        
        return head;
        
        
    }
}