class Solution {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] newArray = new int[nums.length];
        for (int i = 0; i < k; i++) {
            newArray[i] = nums[nums.length - k + i];
        }
        int j = 0;
        for (int i = k; i < nums.length; i++) {
            newArray[i] = nums[j++];
        }
        System.arraycopy(newArray, 0, nums, 0, nums.length);
    }
}
