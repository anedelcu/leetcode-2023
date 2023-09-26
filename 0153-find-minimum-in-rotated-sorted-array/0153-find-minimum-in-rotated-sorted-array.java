class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            if(nums[left] <= nums[right]) {
                min = Math.min(min, nums[left]);
                return min;
            }
            int mid = (left + right) / 2;
            min = nums[mid];
            if(nums[mid] >= nums[left]) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return min;
    }
}