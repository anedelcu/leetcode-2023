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

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        while(head != null) {
            sb.append(String.valueOf(head.val));
            head = head.next;
        }
        return isPalindrome(sb.toString());
    }
    
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
