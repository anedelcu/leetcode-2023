class Solution {

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
