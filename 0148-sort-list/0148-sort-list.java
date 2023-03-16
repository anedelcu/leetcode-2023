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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        
        ListNode sorted = new ListNode(0);
        ListNode curr = head;
        int size = 0;
        while(curr != null ) {
            size++;
            curr = curr.next;
        }
        int[] nums = new int[size];
        int i = 0;
        while(head != null) {
            nums[i] = head.val;
            i++;
            head = head.next;
        }
        ListNode result = sorted;
        Arrays.sort(nums);
        for(int n : nums) {
            sorted.next = new ListNode(n);
            sorted = sorted.next;
        }
        return result.next;
        
        
        
    }
}