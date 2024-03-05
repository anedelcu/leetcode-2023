class Solution {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length;
        int[] lastpart = new int[n - k];
        for (int i = 0; i < n - k; i++) {
            lastpart[i] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = nums[n - k + i];
        }
        for (int i = k; i < n; i++) {
            nums[i] = lastpart[i - k];
        }
    }
}
