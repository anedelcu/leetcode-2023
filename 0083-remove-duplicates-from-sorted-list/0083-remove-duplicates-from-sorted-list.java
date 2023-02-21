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
        ListNode newList = head;
        while(newList.next != null) {
            if(newList.val == newList.next.val) {
                ListNode temp = newList.next;
                newList.next = temp.next;
            }
            else {
                newList = newList.next;
            }
            
        }
        return head;
    }
}