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
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(0);
        ListNode result = res;
        int carry = 0;
        while(list1 != null && list2 != null) {
            int x = list1.val + list2.val + carry;
            carry = x / 10;
            res.next = new ListNode(x % 10);
            list1 = list1.next;
            list2 = list2.next;
            res = res.next;
        }
        while(list1 != null) {
            int x = list1.val + carry;
            res.next = new ListNode(x % 10);
            carry = x / 10;
            list1 = list1.next;
            res = res.next;
        }
        while(list2 != null) {
            int x = list2.val + carry;
            carry = x / 10;
            res.next = new ListNode(x % 10);
            list2 = list2.next;
            res = res.next;
        }
        if(carry == 1) {
            res.next = new ListNode(1);
        }
        
        return result.next;
    }
    
}