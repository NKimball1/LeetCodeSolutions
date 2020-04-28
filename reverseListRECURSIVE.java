/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if (head == null) return null;
        
        return reverse(head);
    }
    
    ListNode reverse(ListNode head) {
        
        if (head.next == null) return head;
        
        ListNode newHead;
        
        //Case of 2 nodes, reverse them
        if (head.next.next == null) {
            newHead = head.next;
            newHead.next = head;
            head.next = null;
            return newHead;
        }
      
        //Recurse
        newHead = reverse(head.next);
        head.next = null;
        ListNode curr = newHead;
        while (curr.next != null) curr = curr.next;
        curr.next = head;
        return newHead;
      
    }
}