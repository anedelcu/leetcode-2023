class Solution {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int p = nums.length - k;
        reverse(nums, 0, p - 1);
        reverse(nums, p, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    public void reverse(int[] nums, int left, int right) {
        if (nums == null || nums.length == 1) {
            return;
        }
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
