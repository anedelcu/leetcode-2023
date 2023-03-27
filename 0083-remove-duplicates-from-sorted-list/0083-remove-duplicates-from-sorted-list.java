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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        while(head != null && head.next != null && head.val == head.next.val) {
            head = head.next;
        }
        ListNode curr = head;
        while(curr != null && curr.next != null) {
            if(curr.val == curr.next.val) {
                ListNode temp = curr.next;
                curr.next = temp.next;
            }
            else {
                curr = curr.next;
            }
        }
        return head;
    }
}