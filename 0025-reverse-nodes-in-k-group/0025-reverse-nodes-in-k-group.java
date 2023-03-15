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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k == 1) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        int count = 0;
        while(curr != null) {
            count++;
            if(count % k == 0) {
                prev = reverse(prev, curr.next);
                curr = prev.next;
            }
            else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }
    
    private ListNode reverse(ListNode prev, ListNode end) {
        ListNode head = prev.next;
        ListNode curr = head.next;
        while(curr != end) {
            head.next = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = head.next;
        }
        return head;
    }
}