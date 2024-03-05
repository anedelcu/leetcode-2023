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
        int size = 0;
        ListNode curr = head;
        while(curr != null) {
            size++;
            curr= curr.next;
        }
        int[] arr = new int[size];
        curr = head;
        int i = 0;
        while(curr != null) {
            arr[i++] = curr.val;
            curr= curr.next;
        }
        rotate(arr, k);
        ListNode res = new ListNode();
        curr = res;
        for(int n : arr) {
            curr.next = new ListNode(n);
            curr = curr.next;
        }
        return res.next;
        
        
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length;
        rotate(nums,0, n -1);
        rotate(nums, 0, k -1);
        rotate(nums, k, n- 1);
    }
    
    private void rotate(int[] nums, int left, int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}