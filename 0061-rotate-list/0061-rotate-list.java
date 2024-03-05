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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) {
            return head;
        }
        int size = 1;
        ListNode curr = head;
        while(curr.next != null) {
            size++;
            curr = curr.next;
        }
        k = k % size;
        k = size - k;
        curr.next = head;
        
        while(k > 0) {
            curr = curr.next;
            k--;
        }
        head = curr.next;
        curr.next = null;
        return head;
    }
}