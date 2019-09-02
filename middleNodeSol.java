/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int ctr = 0;
        ListNode curr = head;
        while (curr != null) {
            ctr++;
            curr = curr.next;
        }
        
        curr = head;
        for (int i = 0; i < (ctr / 2); i++) {
             curr = curr.next;
        }
        
        return curr;
           
    }
}