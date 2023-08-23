class Solution {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix = 1;
        int postfix = 1;
        int[] result = new int[n];
        Arrays.fill(result, 1);
        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix = prefix * nums[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            result[i] = postfix * result[i];
            postfix = postfix * nums[i];
        }
        return result;
    }
}
