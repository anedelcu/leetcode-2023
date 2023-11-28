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
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        int totalSum = 0;
        int carry = 0;
        ListNode curr = new ListNode(0);
        ListNode res = curr;
        while(l1 != null && l2 != null) {
            int sum = 0;
            if(l1.val + l2.val + carry >= 10) {
                sum = (l1.val + l2.val + carry) % 10;
                carry = 1;
            }
            else {
                sum = (l1.val + l2.val + carry) % 10;
                carry = 0;
            }
            
            ListNode temp = new ListNode(sum);
            curr.next = temp;
            l1 = l1.next;
            l2 = l2.next;
            curr = curr.next;
        }
        while(l1 != null) {
            int sum = 0;
            if(l1.val + carry >= 10) {
                sum = (l1.val + carry) % 10;
                carry = 1;
            }
            else {
                sum = (l1.val + carry) % 10;
                carry = 0;
            }
            
            ListNode temp = new ListNode(sum);
            curr.next = temp;
            curr = curr.next;
            l1 = l1.next;
        }
        while(l2 != null) {
            int sum = 0;
            if(l2.val + carry >= 10) {
                sum = (l2.val + carry) % 10;
                carry = 1;
            }
            else {
                sum = (l2.val + carry) % 10;
                carry = 0;
            }
            
            ListNode temp = new ListNode(sum);
            curr.next = temp;
            curr = curr.next;
            l2 = l2.next;
        }
        if(carry == 1) {
            ListNode temp = new ListNode(1);
            curr.next = temp;
        }
        
        return res.next;
        
    }
}
